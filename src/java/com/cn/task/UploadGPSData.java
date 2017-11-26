/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.task;

import com.cn.bean.CcwlGPS;
import com.cn.client.CcwlGpsImplService;
import com.cn.util.DatabaseOpt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author LFeng
 */
public class UploadGPSData implements Runnable {

    private static final Logger LOG = Logger.getLogger(UploadGPSData.class);

    @Override
    public void run() {
        LOG.info("开始上传.....!");
        DatabaseOpt opt = new DatabaseOpt();
        Connection conn = null;
        CallableStatement statement = null;
        try {
            conn = opt.getConnect();
            ArrayList<CcwlGPS> result = new ArrayList<>();
            statement = conn.prepareCall("select * from viewCcwlGpsData");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                CcwlGPS cgps = new CcwlGPS();
                cgps.setSupplierno("42-DLST");
                cgps.setPwd(escape("123456"));
                cgps.setCarno(set.getString("VehNoF"));
                cgps.setGpsno(set.getString("SystemNo"));
                cgps.setLongitude(set.getString("Longitude"));
                cgps.setLatitude(set.getString("Latitude"));
                cgps.setStime(set.getString("Time").substring(0, 19));
                cgps.setDirection(set.getString("Angle"));
                cgps.setSpeed(set.getString("Velocity"));
                cgps.setAddress("address");
                //cgps.setAddress(Units.getAddress("wgs84ll", cgps.getLatitude() + "," + cgps.getLongitude()));
                
                //LOG.info(cgps.getCarno() + "上传数据:" + JSONObject.toJSONString(cgps));
                String uploadRes = new CcwlGpsImplService().getCcwlGpsImplPort().addGpsImpl(cgps.getSupplierno(), cgps.getPwd(), cgps.getCarno()
                        , cgps.getGpsno(), cgps.getLongitude(), cgps.getLatitude(), cgps.getStime().substring(0, 19)
                        , cgps.getAddress(), cgps.getSpeed(), cgps.getDirection());
                LOG.info(cgps.getCarno() + "上传结果:" + uploadRes);
                
                //result.add(cgps);
            }
            //LOG.info("上传数据:" + JSONObject.toJSONString(result));
            //String uploadRes = new CcwlGpsImplService().getCcwlGpsImplPort().addGpssImpl(JSONObject.toJSONString(result));
            //LOG.info("上传完成, 上传结果:" + uploadRes);
            
        } catch (SQLException e) {
            LOG.error("数据库操作失败!", e);
        } catch (NoSuchAlgorithmException ex) {
            LOG.error("加密失败!", ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException e) {
                LOG.error("数据库关闭失败!", e);
            }
        }
    }

    public static String escape(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] b = md.digest();
        StringBuffer buf = new StringBuffer("");
        for (int offset = 0; offset < b.length; ++offset) {
            int m = b[offset];
            if (m < 0) {
                m += 256;
            }
            if (m < 16) {
                buf.append("0");
            }
            buf.append(Integer.toHexString(m));
        }
        return buf.toString();
    }

}

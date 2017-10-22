/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.task;

import com.alibaba.fastjson.JSONObject;
import com.cn.bean.CcwlGPS;
import com.cn.controller.CcwlGpsController;
import com.cn.util.DatabaseOpt;
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
                cgps.setPwd("123456");
                cgps.setCarno(set.getString("VehNoF"));
                cgps.setGpsno(set.getString("SystemNo"));
                cgps.setLongitude(set.getString("Longitude"));
                cgps.setLatitude(set.getString("Latitude"));
                cgps.setStime(set.getString("Time"));
                cgps.setDirection(set.getString("Angle"));
                cgps.setSpeed(set.getString("Velocity"));
                
                result.add(cgps);
            }
            
            String uploadRes = new CcwlGpsController().addGpssImpl(JSONObject.toJSONString(result));
            LOG.info("上传完成, 上传结果:" + uploadRes);
        } catch (SQLException e) {
            LOG.error("数据库操作失败!", e);
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (conn != null)
                    conn.close();
                
            } catch (SQLException e) {
                LOG.error("数据库关闭失败!", e);
            }
        }
    }
    
}

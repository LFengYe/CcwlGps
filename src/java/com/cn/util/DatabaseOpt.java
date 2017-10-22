/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author LFeng
 */
public class DatabaseOpt {

    public static final String BASE = "base";
    public static final String DATA = "data";
    public static final String HIS = "isHis";
    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(DatabaseOpt.class);

    /**
     * 连接数据库
     *
     * @return
     */
    public Connection getConnect() {

        try {
            Properties prop = new Properties();
            prop.load(DatabaseOpt.class.getClassLoader().getResourceAsStream("./config.properties"));
            Class.forName(prop.getProperty("driverName"));
            Connection connect = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
            return connect;
        } catch (ClassNotFoundException ex) {
            LOG.error("找不类名错误", ex);
        } catch (IOException ex) {
            LOG.error("IO错误", ex);
        } catch (SQLException ex) {
            LOG.error("SQL错误", ex);
        } finally {
        }

        /*
        //普通连接池
        Context ctx;
        try {
            ctx = new InitialContext();
            Context envctx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envctx.lookup("jdbc/zcdb");
            Connection conn = ds.getConnection();
            return conn;
        } catch (NamingException e) {
            logger.error("NamingException", e);
        } catch (SQLException e) {
            logger.error("SQL错误", e);
        } finally {
            
        }
         */
        //Tomcat jdbc pool连接池
        /*
        Context ctx;
        try {
            ctx = new InitialContext();
            Context envctx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envctx.lookup("jdbc/TestDB");
            Future<Connection> futrue = ds.getConnectionAsync();
            while (!futrue.isDone()) {
                logger.error("Connection is not yet available. Do some background work");
                try {
                    Thread.sleep(100); //simulate work       
                } catch (InterruptedException x) {
                    Thread.currentThread().interrupted();
                }
            }
            Connection conn = futrue.get();
            return conn;
        } catch (NamingException e) {
            logger.error("NamingException", e);
        } catch (SQLException e) {
            logger.error("SQL错误", e);
        } catch (InterruptedException ex) {
            logger.error("InterruptedException", ex);
        } catch (ExecutionException ex) {
            logger.error("ExecutionException", ex);
        } finally {

        }
         */
        return null;
    }
}

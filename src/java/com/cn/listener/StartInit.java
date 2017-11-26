/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.listener;

import com.cn.task.UploadGPSData;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author LFeng
 */
public class StartInit implements ServletContextListener {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(UploadGPSData.class);

    private ScheduledFuture future;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            /*
            //向定时任务线程池提交一个固定时间间隔执行的任务
            public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
            //向定时任务线程池提交一个固定延时间隔执行的任务
            public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
             */
            //30秒执行一次
            ScheduledExecutorService timeOutScheduler = Executors.newSingleThreadScheduledExecutor();
            future = timeOutScheduler.scheduleAtFixedRate(new UploadGPSData(), 0, 30, TimeUnit.SECONDS);
            LOG.info("启动定时任务成功!");
        } catch (Exception ex) {
            LOG.error("启动定时任务失败!", ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.info("定时任务结束");
        if (future != null) {
            future.cancel(true);
        }
    }

}

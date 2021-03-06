package com.example.task.service.impl;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.task.service.DemoTaskService;
/**
 * Created by Administrator on 2016/12/13.
 */
@Service
public class DemoTaskServiceImpl implements  DemoTaskService{
    private Logger logger= Logger.getLogger(DemoTaskServiceImpl.class);

    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void getTask1(){
        System.out.println("任务1，当前时间："+dateFormat.format((new Date())));
    }
    @Scheduled(cron="0/5 * *  * * ? ")
    public void getTask2() {
        System.out.println("任务2，当前时间：" + dateFormat.format(new Date()));
    }

}

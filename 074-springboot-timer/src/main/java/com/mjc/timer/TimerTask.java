package com.mjc.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ClassName:TimerTask
 * Package:com.mjc.timer
 * Description: 描述信息
 *
 * @date:2022/5/3 15:29
 * @author:白白白
 */
@Component
public class TimerTask {




    @Scheduled(cron = "0/5 * * * * ?")
    public void timerTask(){
        System.out.println("任务开始============");
        System.out.println("任务结束================");
    }


}

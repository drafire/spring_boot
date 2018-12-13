package com.drafire.spring_boot.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务demo
 */
@Component
public class TaskDemo {
    private final static Logger logger = LoggerFactory.getLogger(TaskDemo.class);

//    @Async   //表示可以异步执行
//    @Scheduled(cron = "0/1 * * * * *")   //每1s执行一次，但是需要等待这次任务执行完
    public void sayHelloTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);    //如果上面加上了@Async ，那么这个sleep 将没有意义
        System.out.println("hello,now time is :" + LocalDateTime.now().toString());
    }

    //@Scheduled(fixedRate = 1000)   //每1s执行一次，无视任务的执行时长
    public void sayGoodTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("good day," + LocalDateTime.now().toString());
    }

    @Scheduled(fixedDelay = 3000)    //执行完该次任务后，延时3000ms再执行
    public void sayWellTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("well done " + LocalDateTime.now().toString());
    }
}

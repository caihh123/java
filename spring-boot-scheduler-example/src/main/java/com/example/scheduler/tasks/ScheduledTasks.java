package com.example.scheduler.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    // 每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("Current Time: " + dateTimeFormatter.format(LocalDateTime.now()));
    }

    // 每天中午12点执行
    @Scheduled(cron = "0 0 12 * * ?")
    public void executeTaskUsingCron() {
        System.out.println("Cron Task :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now()));
    }

    // 应用启动1秒后，且之后每2秒执行一次
    @Scheduled(initialDelay = 1000, fixedDelay = 2000)
    public void scheduleTaskWithInitialDelay() {
        System.out.println("Fixed Delay Task :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now()));
    }
}

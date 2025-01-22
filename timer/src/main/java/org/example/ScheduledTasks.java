package org.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 5000)
    public void performTask() {
        System.out.println("Task performed at: " + System.currentTimeMillis());
    }

    @Scheduled(cron="*/10 * * * * *")
    public void performCronTask() {
        System.out.println("Cron task performed at: " + System.currentTimeMillis());
    }

}

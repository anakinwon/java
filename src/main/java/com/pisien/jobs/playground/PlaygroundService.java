package com.pisien.jobs.playground;

import com.pisien.jobs.info.TimerInfo;
import com.pisien.jobs.HelloWorldJob;
import com.pisien.jobs.timerservice.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaygroundService {
    private final SchedulerService scheduler;

    @Autowired
    public PlaygroundService(SchedulerService scheduler) {
        this.scheduler = scheduler;
    }

    public void runHelloWorldJob() {
        final TimerInfo info = new TimerInfo();
        info.setTotalFireCount(5);
        info.setRepeatIntervalMs(2000);
        info.setInitialOffsetMs(1000);
        info.setCallbackData("My callback Data");

        scheduler.schedule(HelloWorldJob.class, info);
    }
}

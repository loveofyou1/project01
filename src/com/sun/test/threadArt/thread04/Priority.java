package com.sun.test.threadArt.thread04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 线程优先级
 * Created by sunleic on 2017/9/26.
 * Version by ${VERSION}
 */
public class Priority {
    private static volatile boolean notState = true;
    private static volatile boolean notEnd = true;

    public static void main(String[] args) throws Exception {
        List<Job> jobslist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobslist.add(job);
            Thread thread = new Thread(job, "Thread:" + i);
            thread.setPriority(priority);
            thread.start();
        }

        notState = false;
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;

        for (Job job : jobslist) {
            System.out.println("Job Priority : " + job.priority + ",Count:" + job.jobCount);
        }

    }

    static class Job implements Runnable {

        private int priority;
        private long jobCount;

        public Job(int priority) {
            this.priority = priority;
        }

        @Override
        public void run() {
            while (notState) {
                Thread.yield();
            }
            while (notEnd) {
                Thread.yield();
                jobCount++;
            }
        }
    }
}

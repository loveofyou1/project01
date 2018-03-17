package com.sun.test.threadArt.thread04;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunleic on 2017/9/26.
 * Version by ${VERSION}
 */
public class ShutDown {
    public static void main(String[] args) throws InterruptedException {

        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        countThread.start();
        //睡眠1秒，main线程对CountThread进行中断，使CountThread能够感知中断而结束
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        countThread.start();
        //睡眠1秒，main线程对Runner two进行取消，使CountThread能够感知on为false而结束
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }

    private static class Runner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on & !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i= " + i);
        }

        public void cancel() {
            on = false;
        }
    }
}

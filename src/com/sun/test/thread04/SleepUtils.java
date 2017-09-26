package com.sun.test.thread04;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunleic on 2017/9/26.
 * Version by ${VERSION}
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }
}

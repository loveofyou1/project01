package com.sun.test.threadArt.thread03;

/**
 * Created by sunleic on 2017/9/25.
 * Version by ${VERSION}
 */
public class SafeDoubleCheckedLocking {
    private volatile static Instance instance;

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }
}

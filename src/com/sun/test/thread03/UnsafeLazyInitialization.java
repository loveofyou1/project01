package com.sun.test.thread03;

/**
 * Created by sunleic on 2017/9/25.
 * Version by ${VERSION}
 */
public class UnsafeLazyInitialization {
    private static Instance instance;

    public synchronized static Instance getInstance() {
        if (instance == null) {
            instance = new Instance();
        }
        return instance;
    }
}

package com.sun.test.thread03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sunleic on 2017/9/22.
 * Version by ${VERSION}
 */
public class ReenTrantLockExample {
    int a = 0;

    ReentrantLock lock = new ReentrantLock();

    public void writer() {
        lock.lock();                //获取锁
        try {
            a++;
        } finally {
            lock.unlock();          //释放锁
        }
    }

    public void reader() {
        lock.lock();                //获取锁
        try {
            int i = a;
            //

        } finally {
            lock.unlock();           //释放锁
        }
    }
}

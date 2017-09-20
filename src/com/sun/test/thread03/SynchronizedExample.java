package com.sun.test.thread03;

public class SynchronizedExample {
    int a = 0;
    boolean flag = false;

    public synchronized void writer() {//加锁
        a = 1;
        flag = true;
    }//释放锁

    public synchronized void reader() {//加锁
        if (flag) {
            int i = a;
            System.out.println(i);
        }
    }//释放锁
}

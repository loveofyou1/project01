package com.sun.test.threadArt.thread04;

/**
 * Created by sunleic on 2017/9/26.
 * Version by ${VERSION}
 */
public class Synchronized {
    public static void main(String[] args) {
        //对Synchronized Class对象进行加锁
        synchronized (Synchronized.class) {

        }
        //静态同步方法，对Synchronized Class 对象进行加锁
        m();
    }

    public static synchronized void m() {

    }
}

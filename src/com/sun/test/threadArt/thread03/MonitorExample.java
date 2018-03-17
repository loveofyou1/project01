package com.sun.test.threadArt.thread03;

/**
 * 锁的内存语义,和volatile的语义相同
 * Created by sunleic on 2017/9/22.
 * Version by ${VERSION}
 */
public class MonitorExample {
    int a = 0;

    public synchronized  void writer(){//1
        a++;                           //2
    }                                  //3

    public synchronized void reader(){//4
        int i = a;                    //5
        //
    }                                 //
}

package com.sun.test.threadArt.thread03;

/**
 * 在早期的JVM中，synchronized（甚至是无竞争的synchronized）存在巨大的性能开销。因此，
 * 人们想出了一个“聪明”的技巧：双重检查锁定（Double-Checked Locking）。人们想通过双重检查
 * 锁定来降低同步的开销。
 * Created by sunleic on 2017/9/25.
 * Version by ${VERSION}
 */
public class DoubleCheckedLocking {                         // 1
    private static Instance instance;                       // 2

    public static Instance getInstance() {                  // 3
        if (instance == null) {                             //4:第一次检查
            synchronized (DoubleCheckedLocking.class) {     //5:加锁
                if (instance == null) {                     //6:第二次检查
                    instance = new Instance();              //7:问题的根源出在这里
                }                                           //8
            }                                               //9
        }                                                   //10
        return instance;                                    //11
    }                                                       //12
}                                                           //13

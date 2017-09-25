package com.sun.test.thread03;

/**
 * Created by sunleic on 2017/9/22.
 * Version by ${VERSION}
 */
public class FinalExample {
    int i = 0;
    final int j;

    static FinalExample obj;

    public FinalExample() {
        i = 2;
        j = 2;
    }

    public static void writer() {
        obj = new FinalExample();
    }

    public static void reader() {
        FinalExample object = obj;
        int a = object.i;
        int b = object.j;
    }
}

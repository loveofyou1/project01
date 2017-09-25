package com.sun.test.thread03;

/**
 * Created by sunleic on 2017/9/25.
 * Version by ${VERSION}
 */
public class FinalReferenceEscapeExample {
    final int i;
    static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample() {
        i = 1;                      // 1写final域
        obj = this;                 // 2 this引用在此"逸出"
    }

    public static void writer() {
        new FinalReferenceEscapeExample();
    }

    public static void reader() {
        if (obj != null) {           // 3
            int temp = obj.i;        // 4
        }
    }
}

package com.sun.test.concurrencyInPractice.chapter3;

public class TestVolatile {
    private volatile boolean asleep = false;

    public void testVolatile() {
        while (!asleep) {
            System.out.println("hello!");
        }
    }

}



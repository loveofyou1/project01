package com.sun.test.concurrencyInPractice.chapter2;

public class LazyInitRace {
    private String str = null;


    public String getStr() {
        if (str == null) {
            str = new String();
        }
        return str;
    }


}

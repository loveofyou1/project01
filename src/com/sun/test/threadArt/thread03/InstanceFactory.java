package com.sun.test.threadArt.thread03;

public class InstanceFactory {
    private static class IntanceHolder {
        public static Instance instance = new Instance();
    }


    public static Instance getInstance() {
        return IntanceHolder.instance;//这里将导致IntanceHolder类被初始化
    }
}

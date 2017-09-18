package com.sun.test.io_01;

import java.io.File;
import java.io.IOException;

public class hello {
    public static void main(String[] args){
        //创建新文件
        File file = new File("/Users/sunlei/java/file.txt");
        try{
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

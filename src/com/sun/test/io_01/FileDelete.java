package com.sun.test.io_01;

import java.io.File;

public class FileDelete {
    public static void main(String[] args){
        String filename = "/Users/sunlei/java/file.txt";
        File file = new File(filename);
        if (file.exists()) {
            file.delete();//删除文件
        }else {
            System.out.println("file is not exist");
        }
    }
}

package com.sun.test.io_01;

import java.io.File;

public class FileListOut {
    public static void main(String[] args){
        String fliename = "/Users/sunlei/java";
        File file = new File(fliename);
        String[] list = file.list();
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}

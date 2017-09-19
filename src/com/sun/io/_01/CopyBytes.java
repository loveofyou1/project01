package com.sun.io._01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by sunleic on 2017/9/18.
 * Version by ${VERSION}
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("E:" + File.separator + "files" + File.separator + "xanda.txt");
            fileOutputStream = new FileOutputStream("E:" + File.separator + "files" + File.separator + "outagain.txt");
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

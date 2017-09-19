package com.sun.io._01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by sunleic on 2017/9/18.
 * Version by ${VERSION}
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("E:" + File.separator + "files" + File.separator + "xanda.txt");
            outputStream = new FileWriter("E:" + File.separator + "files" + File.separator + "outagain.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

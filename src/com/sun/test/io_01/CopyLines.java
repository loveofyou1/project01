package com.sun.test.io_01;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(""));
            outputStream = new PrintWriter(new FileWriter(""));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println();
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

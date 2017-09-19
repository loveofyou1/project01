package com.sun.io._01;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sunleic on 2017/9/19.
 * Version by ${VERSION}
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("E:" + File.separator + "files" + File.separator + "xanda.txt")));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

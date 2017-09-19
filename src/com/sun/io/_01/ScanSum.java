package com.sun.io._01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sunleic on 2017/9/19.
 * Version by ${VERSION}
 */
public class ScanSum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        double sum = 0;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("E:" + File.separator + "files" + File.separator + "scanner.txt")));

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                } else {
                    scanner.next();
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println(sum);
    }
}

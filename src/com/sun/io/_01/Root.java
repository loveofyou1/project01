package com.sun.io._01;

/**
 * Created by sunleic on 2017/9/19.
 * Version by ${VERSION}
 */
public class Root {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.print(".");

        i = 5;
        r = Math.sqrt(i);
        System.out.println();
        System.out.println("The square root of " + i + " is " + r + ".");
    }
}

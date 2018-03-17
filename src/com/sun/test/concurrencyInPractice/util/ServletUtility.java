package com.sun.test.concurrencyInPractice.util;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

public class ServletUtility {

    public static void encodeIntoResponse(ServletResponse response, BigInteger[] factors) {
    }

    public static BigInteger[] factor(BigInteger i) {
        return new BigInteger[]{i};
    }

    public static BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("10");
    }

}

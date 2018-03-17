package com.sun.test.concurrencyInPractice.chapter2;

import com.sun.test.concurrencyInPractice.util.ServletUtility;
import net.jcip.annotations.NotThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

@NotThreadSafe
public class UnsafeCachingFactorizer implements Servlet {

    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();

    private final AtomicReference<BigInteger[]> lastFactors = new AtomicReference<>();

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger i = ServletUtility.extractFromRequest(req);
        if (i.equals(lastNumber.get())) {
            ServletUtility.encodeIntoResponse(res, lastFactors.get());
        } else {
            BigInteger[] factors = ServletUtility.factor(i);
            lastNumber.set(i);
            lastFactors.set(factors);
            ServletUtility.encodeIntoResponse(res, factors);
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

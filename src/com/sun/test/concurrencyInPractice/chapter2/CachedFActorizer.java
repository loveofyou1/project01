package com.sun.test.concurrencyInPractice.chapter2;

import com.sun.test.concurrencyInPractice.util.ServletUtility;
import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

@ThreadSafe
public class CachedFActorizer implements Servlet {

    @GuardedBy("this")
    private BigInteger lastNumber;
    @GuardedBy("this")
    private BigInteger[] lastFactors;
    @GuardedBy("this")
    private long hits;
    @GuardedBy("this")
    private long cacheHits;

    public synchronized long getHits() {
        return hits;
    }

    public synchronized double getCachedHitRatio() {
        return (double) cacheHits / (double) hits;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger i = ServletUtility.extractFromRequest(req);
        BigInteger[] factors = null;
        //加锁
        synchronized (this) {
            ++hits;
            if (i.equals(lastNumber)) {
                factors = lastFactors.clone();
            }
        }

        if (factors == null) {
            //复杂的因子解析方法时释放了锁
            factors = ServletUtility.factor(i);
            //重新加锁
            synchronized (this) {
                lastNumber = i;
                lastFactors = factors.clone();
            }
        }
        ServletUtility.encodeIntoResponse(res, factors);
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

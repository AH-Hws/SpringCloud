package com.javabase.timeunit;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeUnits {

    @Test
    public void test1() throws InterruptedException {
//        long currentTimeMillis = System.currentTimeMillis();
//        Thread.sleep(60000);
//        long currentTimeMillis1 = System.currentTimeMillis();
//        long v = currentTimeMillis1 - currentTimeMillis;
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(257212));
        System.out.println();
    }

    @Test
    public void test2() {
        long value = 257212;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(simpleDateFormat.format(new Date(value)));
        // 00:04:17
    }
}

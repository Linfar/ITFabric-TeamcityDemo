package com.example.extremelySlow;

import org.testng.annotations.Test;

/**
 * Created by linfar on 27.10.16.
 */
@Test
public class LongTest {
    public void test() throws InterruptedException {
        Thread.sleep(10000);
    }
}

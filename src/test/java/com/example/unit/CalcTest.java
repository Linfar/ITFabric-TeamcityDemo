package com.example.unit;

import org.assertj.core.api.BDDAssertions;
import org.testng.annotations.Test;

/**
 * Created by linfar on 26.10.16.
 */
public class CalcTest {
    @Test
    public void testSum() throws Exception {
        final Calc calc = new Calc();

        BDDAssertions.then(calc.sum(1, 1)).isEqualTo(2);
//        BDDAssertions.then(calc.sum(Long.MAX_VALUE - 1, Long.MAX_VALUE - 1)).isPositive();
    }

}
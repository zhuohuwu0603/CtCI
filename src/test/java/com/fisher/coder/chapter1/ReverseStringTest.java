package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class ReverseStringTest {

    @Test
    public void test1() {
        String str = "abcda";
        String reverseStr = new StringBuilder(str).reverse().toString();
        Assert.assertEquals(ReverseString.reverse(str), reverseStr);
    }
}

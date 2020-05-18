package com.task.unittestdemo.exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NegativeNumberValidatorTest {

    public NegativeNumberValidator SUB;

    @Before
    public void setup(){
        SUB = new NegativeNumberValidator();
    }

    @Test
    public void test1(){
        boolean result = SUB.isNegative(-1);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void test2(){
        boolean result = SUB.isNegative(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void Test3(){
        boolean result = SUB.isNegative(1);
        Assert.assertThat(result, is(false));
    }
}
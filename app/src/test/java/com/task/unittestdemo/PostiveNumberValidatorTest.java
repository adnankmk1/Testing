package com.task.unittestdemo;

import com.task.unittestdemo.example1.PostiveNumberValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PostiveNumberValidatorTest {

    PostiveNumberValidator SUB;

    @Before
    public void setup(){
        SUB = new PostiveNumberValidator();
    }

    @Test
    public void test1(){
        boolean result = SUB.isPositive(-1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test2(){
        boolean result = SUB.isPositive(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test3(){
        boolean result = SUB.isPositive(1);
        Assert.assertThat(result, is(true));
    }
}
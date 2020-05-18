package com.task.unittestdemo.example2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseStringTest {

    public ReverseString SUB;

    @Before
    public void setUp() throws Exception {
        SUB = new ReverseString();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned(){
        String result = SUB.reverse("");
        assertThat(result, is(""));
    }

    @Test
    public void reverse_singleString_singleStringReturned() {
        String result = SUB.reverse("a");
        assertThat(result, is("a"));
    }

    @Test
    public void reverse_longString_longStringReturned() {
        String result = SUB.reverse("Adnan Ali");
        assertThat(result, is("ilA nandA"));
    }
}
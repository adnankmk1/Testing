package com.task.unittestdemo.exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicateCharacterTest {

    public RemoveDuplicateCharacter SUB;

    @Before
    public void setUp() throws Exception {
        SUB = new RemoveDuplicateCharacter();
    }

    @Test
    public void remove_emptyString_emptyStringReturned() {
        String result = SUB.removeDuplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void remove_singleString_singleStringReturned() {
        String result = SUB.removeDuplicate("a");
        assertThat(result, is("a"));
    }

    @Test
    public void remove_longSting_removeDuplicateLongString() {
        String result = SUB.removeDuplicate("Adnan Ali");
        assertThat(result, is("Adna li"));
    }
}
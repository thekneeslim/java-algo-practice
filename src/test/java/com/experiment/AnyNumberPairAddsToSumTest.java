package com.experiment;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AnyNumberPairAddsToSumTest {

    private AnyNumberPairAddsToSum anyNumberPairAddsToSum;

    @Before
    public void setUp() throws Exception {
        anyNumberPairAddsToSum = new AnyNumberPairAddsToSum();
    }

    @Test
    public void shouldReturnTrueIfAnyPairInArrayAddsUpToGivenNumber() {
        assertTrue(anyNumberPairAddsToSum.executeFor(Arrays.asList(10, 15, 3, 7), 17));
        assertTrue(anyNumberPairAddsToSum.executeFor(Arrays.asList(10, 15, 3, 7), 22));
    }

    @Test
    public void shouldReturnFalseIfNoPairAddsUpToGivenSummation() {
        assertFalse(anyNumberPairAddsToSum.executeFor(Arrays.asList(10, 15, 3, 8), 10));
        assertFalse(anyNumberPairAddsToSum.executeFor(Arrays.asList(10, 15, 3, 7), 12));
    }
}
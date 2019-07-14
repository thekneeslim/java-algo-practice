package com.experiment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void shouldReturnTotalNumberOfPermutationsToClimbAFlightOfStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.getNumberOfPermutations(2));
        assertEquals(5, climbingStairs.getNumberOfPermutations(4));
    }
}
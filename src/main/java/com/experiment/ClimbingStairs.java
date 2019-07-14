package com.experiment;

public class ClimbingStairs {

    /*
    There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that
    returns the number of unique ways you can climb the staircase. The order of the steps matters.
    For example, if N is 4, then there are 5 unique ways:
            1, 1, 1, 1
            2, 1, 1
            1, 2, 1
            1, 1, 2
            2, 2
    */

    public int getNumberOfPermutations(int numberOfSteps) {
        if(numberOfSteps <= 1) {
            return 1;
        }
        return getNumberOfPermutations(numberOfSteps - 1) + getNumberOfPermutations(numberOfSteps - 2);
    }
}

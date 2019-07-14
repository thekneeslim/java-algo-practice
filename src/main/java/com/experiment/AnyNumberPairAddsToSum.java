package com.experiment;

import java.util.HashSet;
import java.util.List;

public class AnyNumberPairAddsToSum {

//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    public boolean executeFor(List<Integer> list, int summation) {
        HashSet<Integer> requiredNumbers = new HashSet<>();
        for (Integer i : list) {
                if (requiredNumbers.contains(i)) {
                return true;
            }
            int requiredNumber = summation - i;
            requiredNumbers.add(requiredNumber);
        }
        return false;
    }
}

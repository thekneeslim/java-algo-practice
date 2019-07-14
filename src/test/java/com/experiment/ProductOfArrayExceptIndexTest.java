package com.experiment;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ProductOfArrayExceptIndexTest {

    @Test
    public void shouldReturnArrayOfProductsExcludingElementWithGivenIndex() {
        ProductOfArrayExceptIndex productOfArrayExceptIndex = new ProductOfArrayExceptIndex();
        assertEquals(Arrays.asList(120, 60, 40, 30, 24), productOfArrayExceptIndex.execute(Arrays.asList(1,2,3,4,5)));
        assertEquals(Arrays.asList(6, 3, 2), productOfArrayExceptIndex.execute(Arrays.asList(1,2,3)));
    }
}
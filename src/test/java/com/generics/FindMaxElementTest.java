package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxElementTest {

    @Test
    public void GivenThreeIntegers_ShouldReturnMaxInteger() {
        FindMaxElement findMaxElement = new FindMaxElement();
        findMaxElement.setIntegers( 1, 7 , 5);
        Integer max = findMaxElement.findMaxInt();
        Assert.assertEquals("7", max.toString());
    }


}

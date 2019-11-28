package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxElementTest {

    @Test
    public void GivenThreeIntegers_ShouldReturnMaxInteger() {
        FindMaxElement findMaxElement = new FindMaxElement(1, 7 , 5);
        Integer max = findMaxElement.findMaxInt();
        Assert.assertEquals("7", max.toString());
    }

    @Test
    public void GivenThreeFloats_ShouldReturnMaxFloat() {
        FindMaxElement findMaxElement = new FindMaxElement(1.1f, 7.23f, 5.6f);
        Float max = (Float)findMaxElement.findMaxFloat();
        Assert.assertEquals((Float)7.23f, max);
    }

    @Test
    public void GivenThreeStrings_ShouldReturnMaxString() {
        FindMaxElement findMaxElement = new FindMaxElement("boo", "joo", "zoo");
        String max = findMaxElement.findMaxString();
        Assert.assertEquals("zoo", max);
    }


    @Test
    public <T> void GivenAnyThreeInputsOfSameDatatype_InThisCaseFloat_ShouldReturnMaxFromThem(){
        FindMaxElement findMaxElement = new FindMaxElement(2.13f, 5.12f, 1.743f);
        T max = (T) findMaxElement.findMaxFloat();
        Assert.assertEquals((Float)5.12f, max );
    }
}

package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxElementTest {

    @Test
    public void GivenThreeIntegers_ShouldReturnMaxInteger() {
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(1, 7 , 5);
        Integer max = (Integer)findMaxElement.testMax();
        Assert.assertEquals((Integer)7, max);
    }

    @Test
    public void GivenThreeFloats_ShouldReturnMaxFloat() {
        FindMaxElement findMaxElement = new FindMaxElement<Float>(1.23f, 7.12f , 5.756f);
        Float max = (Float)findMaxElement.testMax();
        Assert.assertEquals((Float)7.12f, max);
    }

    @Test
    public void GivenThreeStrings_ShouldReturnMaxString() {
        FindMaxElement findMaxElement = new FindMaxElement<String>("boo", "joo", "zoo");
        String max = (String)findMaxElement.testMax();
        Assert.assertEquals("zoo", max);
    }


    @Test
    public <T> void GivenAnyThreeInputsOfSameDatatype_InThisCaseInteger_ShouldReturnMaxFromThem(){
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(1, 7 , 5);
        Integer max = (Integer)findMaxElement.testMax();
        Assert.assertEquals((Integer)7, max);
    }

    @Test
    public <T> void GivenAnyThreeInputsOfSameDatatypeToGenericVariables_InThisCaseString_ShouldReturnMaxFromThem(){
        FindMaxElement findMaxElement = new FindMaxElement<String>("boo", "joo", "zoo");
        String max = (String) findMaxElement.testMax();
        Assert.assertEquals("zoo", max );
    }

    @Test
    public void FromTheGivenInputsOfSameDatatype_ShouldPrintAndReturnMaxElement() {
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(5, 7, 3);
        findMaxElement.testMax();
    }
}

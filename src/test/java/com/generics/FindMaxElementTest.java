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
    public void GivenMaxElementOnFirstPosition_ShouldWorkReturnIt(){
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(9, 7 , 5);
        Integer max = (Integer)findMaxElement.testMax();
        Assert.assertEquals((Integer)9, max);
    }

    @Test
    public void GivenMaxElementOnSecondPosition_ShouldWorkReturnIt(){
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(1, 7 , 5);
        Integer max = (Integer)findMaxElement.testMax();
        Assert.assertEquals((Integer)7, max);
    }

    @Test
    public void GivenMaxElementOnThirdPosition_ShouldWorkReturnIt(){
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(9, 7 , 10);
        Integer max = (Integer)findMaxElement.testMax();
        Assert.assertEquals((Integer)10, max);
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
    public void GivenAnyThreeInputsOfSameDatatype_InThisCaseInteger_ShouldReturnMaxFromThem(){
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(1, 7 , 5);
        Object max = findMaxElement.testMax();
        Assert.assertEquals((Integer)7, max);
    }

    @Test
    public void GivenAnyThreeInputsOfSameDatatypeToGenericVariables_InThisCaseString_ShouldReturnMaxFromThem(){
        FindMaxElement findMaxElement = new FindMaxElement<String>("boo", "joo", "zoo");
        Object max = findMaxElement.testMax();
        Assert.assertEquals("zoo", max );
    }

    @Test
    public void FromTheGivenInputsOfSameDatatype_ShouldPrintAndReturnMaxElement() {
        FindMaxElement findMaxElement = new FindMaxElement<Integer>(5, 7, 3);
        Object max = findMaxElement.testMax();
        Assert.assertEquals((Integer)7,max);
    }

    @Test
    public void FromTheGivenNnumberOfIntegerElements_FindMaximumElement() {
        FindMaxElement findMaximumElement = new FindMaxElement<Integer>(1,4,3,2,6,2,3);
        Assert.assertEquals((Integer) 6, findMaximumElement.testMax());
    }

    @Test
    public void FromTheGivenNnumberOfStringElements_FindMaximumElement() {
        FindMaxElement findMaximumElement = new FindMaxElement<String>("boo", "joo", "zoo", "poo", "1");
        Assert.assertEquals((String)"zoo" , findMaximumElement.testMax());
    }

    @Test
    public void FromTheGivenNnumberOfFloatElements_FindMaximumElement() {
        FindMaxElement findMaximumElement = new FindMaxElement<Float>(1.23f, 7.12f , 5.756f, 2.78241f);
        Assert.assertEquals((Float) 7.12f , findMaximumElement.testMax());
    }
}

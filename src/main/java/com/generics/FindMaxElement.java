package com.generics;

import java.util.Comparator;

public class FindMaxElement {
    private Integer num1;
    private Integer num2;
    private Integer num3;

    public void setIntegers(Integer i, Integer j, Integer k) {
        num1 = i;
        num2 = j;
        num3 = k;
    }

    public Integer findMaxInt() {
        Integer max = num1;
        if ( num2.compareTo(max) > 0 ){
            max = num2;
        }
        if (num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }


}

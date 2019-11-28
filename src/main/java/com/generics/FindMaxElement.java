package com.generics;

import java.util.Comparator;

public class FindMaxElement {
    private Integer num1;
    private Integer num2;
    private Integer num3;

    private Float fnum1;
    private Float fnum2;
    private Float fnum3;

    private String str1;
    private String str2;
    private String str3;

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

    public void setFloats(float num1, float num2, float num3) {
        this.fnum1 = (Float)num1;
        this.fnum2 = (Float) num2;
        this.fnum3 = (Float) num3;
    }

    public Float findMaxFloat() {
        Float fmax = fnum1;
        if ( fnum2.compareTo(fmax) > 0 ){
            fmax = fnum2;
        }
        if (fnum3.compareTo(fmax) > 0){
            fmax = fnum3;
        }
        return fmax;
    }

    public void setStrings(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }


    public String findMaxString() {
        String smax = str1;
        if ( str2.compareTo(smax) > 0 ){
            smax = str2;
        }
        if (str3.compareTo(smax) > 0){
            smax = str3;
        }
        return smax;
    }
}

package com.generics;

public class FindMaxElement<T> {
    private Integer num1;
    private Integer num2;
    private Integer num3;

    private Float fnum1;
    private Float fnum2;
    private Float fnum3;

    private String str1;
    private String str2;
    private String str3;

    public FindMaxElement(Integer num1, Integer num2, Integer num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public FindMaxElement(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public FindMaxElement(Float fnum1, Float fnum2, Float fnum3) {
        this.fnum1 = fnum1;
        this.fnum2 = fnum2;
        this.fnum3 = fnum3;
    }

    public Integer findMaxInt() {
        return findMax(num1, num2, num3);
    }

    public Float findMaxFloat() {
        return findMax(fnum1, fnum2,fnum3);
    }

    public String findMaxString() {
        return findMax(str1, str2, str3);
    }

    public <T extends Comparable> T findMax(T elem1, T elem2, T elem3) {
        T max = elem1;
        if ( elem2.compareTo(max) > 0 ){
            max = elem2;
        }
        if (elem3.compareTo(max) > 0){
            max = elem3;
        }
        return max;
    }
}

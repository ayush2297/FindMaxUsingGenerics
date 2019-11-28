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
        Integer max = num1;
        if ( num2.compareTo(max) > 0 ){
            max = num2;
        }
        if (num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
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

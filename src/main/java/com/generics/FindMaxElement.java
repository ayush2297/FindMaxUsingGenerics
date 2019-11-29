package com.generics;

import java.util.Arrays;

public class FindMaxElement<T extends  Comparable> {
    T[] valueArr;

    public FindMaxElement(T... values) {
        System.out.println();
        T[] array=(T[]) new Comparable[values.length];
        int i=0;
        for(T value : values){
            array[i++]=value;
        }
        this.valueArr = array;
    }

    public T testMax(){
        Arrays.sort(valueArr);
        return valueArr[valueArr.length-1];
    }
}

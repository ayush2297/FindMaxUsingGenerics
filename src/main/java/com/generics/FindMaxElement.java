package com.generics;

public class FindMaxElement<T extends  Comparable> {

    private T elem1;
    private T elem2;
    private T elem3;

    public FindMaxElement(T elem1, T elem2, T elem3) {
        this.elem1 = elem1;
        this.elem2 = elem2;
        this.elem3 = elem3;
    }

    public <T> T testMax() {
        return (T) testMax(elem1,elem2,elem3);
    }

    public <T extends Comparable> T testMax(T elem1, T elem2, T elem3) {
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

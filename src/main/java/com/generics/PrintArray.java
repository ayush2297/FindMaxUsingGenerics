package com.generics;

public class PrintArray <X, Y, Z> {

    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }


    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e'};
        new PrintArray<Integer, Double, Character>(intArray,doubleArray,charArray).toPrint();
    }

    private void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private  static <T> void toPrint(T[] inputArray){
        for ( T element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

}

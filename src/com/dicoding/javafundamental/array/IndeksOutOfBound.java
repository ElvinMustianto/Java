package com.dicoding.javafundamental.array;

public class IndeksOutOfBound {
    public static void main(String[] agrs) {
        int[] arrA = {1,2,3,4,5};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        System.out.println(arrA[3]);
        System.out.println(arrA[5]);
    }
}

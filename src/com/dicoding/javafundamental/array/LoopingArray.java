package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] agrs) {
        int[] arrInt = new int[100000];

        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }

    }
}

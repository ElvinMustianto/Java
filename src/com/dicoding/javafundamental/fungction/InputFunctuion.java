package com.dicoding.javafundamental.fungction;

public class InputFunctuion {
    public static void main(String[] agrs) {
        //memanggil fungsi
        hitungLuas(15, 7);
    }
    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}

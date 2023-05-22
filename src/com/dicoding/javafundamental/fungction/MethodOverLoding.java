package com.dicoding.javafundamental.fungction;

public class MethodOverLoding {
    public static void main(String[] agrs) {
        double p = 8;
        double l = 9.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " +hasil);

        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);

    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return (luas);

    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return (luas);
    }
}

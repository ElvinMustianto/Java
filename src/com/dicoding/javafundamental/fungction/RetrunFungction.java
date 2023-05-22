package com.dicoding.javafundamental.fungction;

public class RetrunFungction {
    public static void main(String[] agrs) {

        double p = 15;
        double l = 7;
        double hasil = hitungLuas(p, l); //Memanggil fungsi
        System.out.println("Hasilnya adalah = " +hasil);
    }

    //fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}

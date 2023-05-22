package com.dicoding.javafundamental.accsessmodifier.package3;

public class Main {
    public static void main(String[] agrs) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0; x < 5; x++) {
            new Perhitungan();
        }

        System.out.println("Samapi " + Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}

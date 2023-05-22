package com.dicoding.javafundamental.propertimetode;

public class Hewan {

    //Properti atau fields
    //Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    //Inisiasi melalui konstruktir
    int umur;

    //Konstruksi dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan denagn pelan..");
    }

    void makan() {
        System.out.println("Makan dengan mulut..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    double getUmur() {
        return umur;
    }


}

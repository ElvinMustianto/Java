package com.dicoding.javafundamental.accsessmodifier.package4;

public class NoAccsessmodiferFinal {
    static int nilai = 5;

    void ubahNilai() {
        //Kode dibawah akan menampilkan error
        nilai = 10;
    }
}

package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] agrs) {
        try {
            // Mencoba membaca berkas latihan .txt
            File file = new File("D:/latihan.txt");
            FileReader fr = new FileReader(file);
            // JIka berhasil maka tampilan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }

       // String location = "D://namafile.txt";
        //File file = new File(location);
        //FileReader fr = new FileReader(file);

    }
}

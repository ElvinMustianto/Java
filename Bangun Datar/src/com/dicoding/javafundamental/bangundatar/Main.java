package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        /*kamus*/
        PersegiPanjang opersegi;
        SegitigaSikuSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSikuSiku();
        olingkaran = new Lingkaran();

        /*program*/
        // panggil method
        mainMenu();

        // kondisional untuk pilihan menu yang di masukan
        switch (pilihan) {
            case '1':{
                System.out.print("Masukan panjang pesegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan luas persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga siku: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga sikuz; " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("Tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        // Pilihan menu
        System.out.println("==============");
        System.out.println("Hitung Luas dan Keliling : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga siku");
        System.out.println("3. Lingkaran");
        System.out.print("Main menu : ");
        pilihan = scanner.next().charAt(0);
    }
}

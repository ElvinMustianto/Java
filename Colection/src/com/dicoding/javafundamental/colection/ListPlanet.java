package com.dicoding.javafundamental.colection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] agrs) {
        //Deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus" //error ArrayIndeksOutOfBoundsException karena ukuran Array tetap

        //Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury");//method add untuk menambahkan objek ke list
        planets.add("venus");
        planets.add("mars");
        planets.add("earth");//objek lainya masih bisa terus di tambahkan ke list

        System.out.println("List pelanet awal:");
        for (int i = 0; i < planets.size(); i++) { //method size() untuk mendapatkan ukuran List
            //method get() untuk melihat isi list pada indeks i
            System.out.println("/t indeks-" + i +" = " +planets.get(i));
        }

        planets.remove("venus");//method remove untuk megeluarkan objek dari list

        System.out.println("List planet akhir:");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("/t indeks-" + i + " = " + planets.get(i));


        }

    }

}

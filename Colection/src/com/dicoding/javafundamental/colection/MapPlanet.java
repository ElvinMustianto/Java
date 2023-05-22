package com.dicoding.javafundamental.colection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] agrs)  {
        //Menggunakan HashMap
        Map<String,Planet> planets = new HashMap<>();
        planets.put("Key-1", new Planet("Mercury", 0.06));//methode put() untuk menambahkan objek ke map
        planets.put("Key-2", new Planet("Venus", 0.82));
        planets.put("Key-3", new Planet("Earth", 1.00));
        planets.put("Key-4", new Planet("Mars", 0.11));
        planets.put("Key-4", new Planet("Mars-X", 0.11));//Menambahkan ke map dengan key yang sama

        //method size() untuk mendapatkan ukuran set
        System.out.println("Map planets awal: (size = " + planets.size() +")");
        System.out.println("____________________");
        for (String key : planets.keySet()) { // looping key dari map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("/t " + key + " : " + planets.get(key));
            System.out.println("__________________");

        }

        planets.remove("Key-2"); //Method untuk megeluarkan objek dari map

        System.out.println("Map planets akhir: (size = " + planets.size() + ")");
        System.out.println("__________________");
        for (Planet planet : planets.values())  { // looping value dari map
            System.out.println("/t " + planet);
            System.out.println("__________________");

        }

    }
}

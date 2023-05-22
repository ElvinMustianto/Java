package com.dicoding.javafundamental.colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {

    public static void main(String[] agrs) {

        //Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");//method add() untuk menambahkan objek ke set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");//menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars");//objek bisa ditambah terus ke set

        //methode size() untuk menambahkan ukuran set
        System.out.println("Set planet awal: (size =" + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("/t " + planet);
        }

        planets.remove("venus");//method remove() untuk mengeluarkan objek dari set

        System.out.println("Set planet akhir : (size = " + planets.size() +")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            //looping menggunakan iterator
            System.out.println("/t " + iterator.next());
        }
    }
}

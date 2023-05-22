package com.dicoding.javafundamental.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] agrs) {
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String 1 "); // lo menampung objek String
        lo.add(new Planet("Mercury", 0.06)); //lo menanpung objek planet

        for (Object o : lo) {
            Planet p = (Planet) o; // perlu Type-casting dari Object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList<>(); // list dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp menanpumg objek Planet
        //lp.add("lp - String 1"); // baris ini compile-error , lp tidak di ijinkan menampung  objek string
       lp.add(new Planet("Venus", 0.02));

       for (Planet p : lp){
           p.print();
       }
    }
}

package com.dicoding.javafundamental.bangundatar;

import static java.lang.Math.PI;

public class Lingkaran implements BangunDatar{


    Lingkaran() {
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas (int r) { // Method overload
        return (PI * Math.pow(r, 2));
    }
    public double keliling(int r) { // Method overload
        return (2 * PI * r);
    }
}

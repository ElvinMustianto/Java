package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] agrs) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adlah " + calendar.getTime());
    }
}

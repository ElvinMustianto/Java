package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] agrs) {
        // Menanpilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // Menampilkan spesifik waktu yang di inginkan
        System.out.println("Jam " + calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println("Tanggal " + calendar.get(Calendar.DATE));
        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
    }
}

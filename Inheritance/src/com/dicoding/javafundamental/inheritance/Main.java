package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] agrs) {
        Hewan hewan = new Hewan();//memanggil constructor
        System.out.println("Apakah hewan IS-A object -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A kucing -> " + (hewan instanceof Kucing));

        System.out.println("__________________");

        Kucing kucing = new Kucing();//Memanggil constructor
        System.out.println("Apakah hewan IS-A object -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A kucing -> " + (kucing instanceof Kucing));

        System.out.println("_________________");

        hewan.makan();//Kucing mewarisi methode makan() dari parent class hewan
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("________________");

        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "Subtropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("________________");

        Object o = new Kucing();//Kucing adalah object
        Hewan h = new Kucing();//Kucing adalah hewan
        Kucing k = new Kucing();//Kucing adalah kucing , pastinya:)

        //o.makan(); ->error, kareana method makan() tidak ada di kelas object
        h.makan();
        k.makan();

        Object object = k;//Bisa langsung diassigin
        Hewan hewanK = k;//Bisa langsung diassigin

        //object.makan(): -> error, karean method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h;//tidak bisa langsung dissigin, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;


    }
}

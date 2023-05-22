package Praktikum;
import java.util.Scanner;

// Elvin Mustianto
// 2242025

public class Praktikum1 {
    public static void main(String[] args) {
        karyawan Karyawan = new karyawan();
        System.out.println("Data Karyawan");
        Karyawan.ID = 1;
        Karyawan.firstname = "Agus Ramdhan";
        Karyawan.divisi = "Keuangan";
        Karyawan.gaji = 1850000;
        Karyawan.cetakData();
        System.out.println("Sumbangn Zakat\t: Rp." + Karyawan.sumbanganZakat());
        System.out.println("==========================================");

        Karyawan.isiData();
        Karyawan.cetakData();
        System.out.println("Sumbangn Zakat\t: Rp." + Karyawan.sumbanganZakat());
    }
}


class karyawan {
    static Scanner scanner = new Scanner(System.in);
    String firstname, lastname;
    String divisi;
    Integer ID;
    Integer gaji;

//    void isiData( Integer Kode, String Nama, String Divisi, double Gaji) {
//        ID = Kode;
//        name = Nama;
//        divisi = Divisi;
//        gaji = Gaji;
//
//    }
    void isiData() {
        System.out.print("ID \t: ");
        ID = scanner.nextInt();
        firstname = scanner.next();
        lastname = scanner.next();
        divisi = scanner.next();
        gaji = scanner.nextInt();

    }

    void cetakData() {
        System.out.println("ID  \t: " + ID);
        System.out.println("Nama\t: " + firstname + " "+ lastname);
        System.out.println("Divisi\t: " + divisi);
        System.out.println("Gaji\t: Rp." + gaji);
    }
    double sumbanganZakat() {
        return gaji * 0.025;
    }
}

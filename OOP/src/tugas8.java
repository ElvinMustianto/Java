import static java.lang.Math.PI;
import static java.lang.Math.decrementExact;

import java.util.Scanner;
public class tugas8 {

    private static char pilihan;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        lingkaran oLingkaran;
        segitiga oSegitiga;
        persegiPanjang oPersigiPanjang;

        oLingkaran = new lingkaran();
        oSegitiga = new segitiga();
        oPersigiPanjang = new persegiPanjang();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukan Panjang : ");
                oPersigiPanjang.panjang = scanner.nextInt();
                System.out.print("Masukan Lebar : ");
                oPersigiPanjang.lebar = scanner.nextInt();
                System.out.print("Luas Persegi Panjang : " + oPersigiPanjang.lPersegiPanjang(oPersigiPanjang.panjang,oPersigiPanjang.lebar ));
                break;
            }
            case '2': {
                System.out.print("Masukan Alas : ");
                oSegitiga.alas = scanner.nextInt();
                System.out.print("Masukan Tinggi : ");
                oSegitiga.tinggi = scanner.nextInt();
                System.out.print("Luas Segitiga : " + oSegitiga.lSegitiga(oSegitiga.alas, oSegitiga.tinggi));
                break;

            }
            case '3': {
                System.out.println("Luas dengan diameter");
                System.out.print("Masukan diameter : ");
                oLingkaran.diameter = scanner.nextInt();
                System.out.println("Luas Lingkaran : " + oLingkaran.llUseDiameter(oLingkaran.diameter));
                System.out.println("******************************");
                System.out.println("Luas dengan jari-jari");
                System.out.print("Masukan jari-jari : ");
                oLingkaran.r = scanner.nextInt();
                System.out.print("Luas Lingkaran : " + oLingkaran.llUseR(oLingkaran.r));
                break;
            }
            default: {
                System.out.println("Pilihan tidak ada");
                break;
            }
        }

    }
    private static void mainMenu() {
        // Pilihan menu
        System.out.println("Hitung Luas : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Main menu : ");
        pilihan = scanner.next().charAt(0);
        System.out.println("====================");

    }
}

class bangunDatar {
    public int panjang,r, diameter, tinggi, lebar,alas;
}

class lingkaran extends bangunDatar {
    public double llUseR(int r) {
        return (PI * Math.pow(r, 2));
    }
    public double llUseDiameter(int diameter) {
        return (0.25 * PI * Math.pow(diameter,2));
    }
}

class segitiga extends bangunDatar {
    public double lSegitiga(int alas , int tinggi) {
        return (0.5 * alas * tinggi);
    }
}

class persegiPanjang extends bangunDatar {
    public double lPersegiPanjang(int panjang, int lebar) {
        return (panjang * lebar);
    }
}
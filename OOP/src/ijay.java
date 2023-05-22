public class ijay {
    public static void main(String[] args) {
        Lingkaran luasLingkaran = new Lingkaran();
        Segitiga luasSegitiga = new Segitiga();
        PersegiPanjang luasPersegiPanjang = new PersegiPanjang();

        bDatar.text();
        System.out.println("Luas Lingakaran : " + luasLingkaran.lLingkaran(2));
        System.out.println("Luas Lingkaran menggunakan Diameter : " + luasLingkaran.lLingakaranDiameter(4));
        System.out.println("Luas Segitiga : " + luasSegitiga.lSegitiga(5, 8));
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang.lPersegiPanjang(12, 6));

    }
}

class bDatar {
   static void text() {
       System.out.println("Luas Bangun Datar" +
               "\n====================");
   }
}

class Lingkaran extends bDatar {
    double PI = 3.14;
    public double lLingkaran (int r) {
        return PI * Math.pow(r, 2);
    }
    public double lLingakaranDiameter(int diameter) {
        return 0.25 * PI * Math.pow(diameter, 2);
    }
}

class Segitiga extends bDatar {
    public double lSegitiga (int alas, int tinggi) {
        return (0.5 * alas * tinggi);
    }
}

class PersegiPanjang extends bDatar {
    public double lPersegiPanjang(int panjang , int lebar) {
        return panjang * lebar;
    }
}

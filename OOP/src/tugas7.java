public class tugas7 {
    public static void main(String[] args) {
            persia Persia = new persia();
            Persia.nama = "Bobo";
            Persia.ras = "Persia";
            Persia.berat = 5;
            Persia.umur = 3;
            System.out.println("Nama \t: " + Persia.nama);
            System.out.println("Ras \t: " + Persia.ras);
            System.out.println("Berat \t: " + Persia.berat + " Kg");
            System.out.println("Umur \t: " + Persia.umur + " Tahun");
            Persia.bulu();
            Persia.warnaBulu();
            Persia.minum();
            System.out.println("======================================");
            hutan Hutan = new hutan();
            Hutan.nama = "Oren";
            Hutan.ras = "Hutan";
            Hutan.berat = 7;
            Hutan.panjang = 80;
            Hutan.umur = 4;
            System.out.println("Nama \t: " + Hutan.nama);
            System.out.println("Ras \t: " + Hutan.ras);
            System.out.println("Berat \t: " + Hutan.berat + " Kg");
            System.out.println("Umur \t: " + Hutan.umur + " Tahun");
            System.out.println("panjang : " + Hutan.panjang + " cm");
            Hutan.makan();
            Hutan.warnaBulu();
    }
}

class Cat {
    String ras,nama;
    double berat, panjang;
    int umur;

    void makan() {
        System.out.println("Makan \t: Ikan");
    }
    void minum() {
        System.out.println("Minum \t: Air");
    }
}

class persia extends Cat {

    void warnaBulu () {
        System.out.println("Warna \t: Putih");
    }
    void bulu() {
        System.out.println("Bulu \t: Panjang");
    }
}

class bengal extends Cat {
    void warnaBulu () {
        System.out.println("Warna \t: Hitam");
    }
    void bulu() {
        System.out.println("Bulu \t: Sedang");
    }

}

class hutan extends Cat {
    void warnaBulu () {
        System.out.println("Warna \t: Oren");
    }
    void bulu() {
        System.out.println("Bulu \t: Pendek");
    }

}



package Praktikum;

public class main {
    public static void main(String[] args) {
        // MPemanggilan metode printData ().
        printData();

    }
    // Deklarasi metode printData () yang statis dan tidak mengembalikan nilai.
    static void printData() {
        // Membuat objek baru dari kelas Cars dengan menggunakan konstruktor yang ada.
        Cars cars1 = new Cars("Sports", "Toyota", "Supra-MK4", 1500000000);
        // Mencetak nama mobil dengan memanggil metode getName () dari objek mobil.
        System.out.println("Name\t: " + cars1.getName());
        // Mencetak jenis mobil dengan memanggil metode getType () dari objek mobil.
        System.out.println("Type\t: " + cars1.getType());
        // Mencetak merek mobil dengan memanggil metode getBrand () dari objek mobil.
        System.out.println("Brand\t: " + cars1.getBrand());
        // Mencetak harga mobil dengan memanggil metode getPrice () dari objek mobil dan
        // menambahkan prefix "Rp." untuk menyatakan bahwa harga dalam rupiah.
        System.out.println("Price\t: Rp." + cars1.getPrice());
    }
}
// Ini adalah kelas Cars yang menunjukkan entitas mobil dengan properti seperti jenis, merek, nama, dan harga.
class Cars{
   // Ini adalah variabel instance yang menyimpan nilai jenis, merek, nama, dan harga mobil.
    String type, brand,name;
    double price;
    // Ini adalah konstruktor untuk kelas Cars yang menerima empat parameter dan menetapkan nilai untuk variabel instance.
    public Cars(String type, String brand, String name,double price) {
        // Ini adalah pernyataan yang menetapkan nilai parameter ke variabel instance dalam konstruktor.
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    // Ini adalah metode getter untuk variabel instance nama.
    public String getName() {
        return name;
    }
    // Ini adalah metode getter untuk variabel instance jenis.
    public String getType() {
        return type;
    }
    // Ini adalah metode getter untuk variabel instance merek. Pada metode ini, nilai merek diubah menjadi huruf besar menggunakan metode toUpperCase().
    public String getBrand() {
        return brand.toUpperCase();
    }
    // Ini adalah metode getter untuk variabel instance harga.
    public double getPrice() {
        return price;
    }
}

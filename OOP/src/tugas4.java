

// 1
public class tugas4 {
    public static void main(String[] args) {
        // Memanggil method void
        printData();
        Person person1 = new Person();
        person1.cetakData();
    }
    // Method void tanpa parameter
    static void printData() {
        System.out.println("Luas Persegi : " + squareArea(5 ,5) );
    }
    // Method non-void dengan parameter
     static int squareArea(int a, int b) {
        return a * b;
    }
}


// 2. Manfaat Constractor
//      * menginisialisasi variabel- variabel instans yang akan dimiliki oleh objek
//      * memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain.
//
// 3.     Method
//          * Method merupakan suatu oprasi berupa fungsi-fungsi yang dapat di
//            kerjakan oleh suatu objek ,
//          * Method didefinisikan pada kelas akan tetapi di panggil melalui objek.
//          * Method menentukan perilaku objek, yakni apa yang terjadi ketika objek itu
//            dibuat serta sebagai oprasi yang dapat dilakukan objek sepanjang program
//            itu berjalan. Method memiliki 4 bagian dasar :
//            a. Nama method.
//            b. Tipe objek atau tipe primitive yang di kembalikan method.
//            c. Daftar parameter.
//            d. Badan atau isi method.
//
//        Construktor.
//          * Satu kelas boleh memiliki lebih dari 1 konstruktor.
//          * Construktor harus memiliki nama yang sama dengan nama class dan tidak
//            memiliki nilai balik ( return ).
//          * Construktor di jalankan pada saat sebuah objek diinisialisasi ( menggunkan kata new ).
//
//    4. 	"this" adalah kata kunci yang digunakan dalam bahasa
//            pemrograman untuk mengacu pada objek saat ini dari kelas tersebut.
//          "this" digunakan untuk menghindari ambiguitas antara variabel instance dengan parameter
//            atau variabel lokal yang memiliki nama yang sama.
//          "this" digunakan untuk merujuk pada variabel instance untuk menghindari ambiguitas
//          dengan parameter constructor yang memiliki nama yang sama.
//          Selain itu, "this" juga digunakan dalam method untuk mengakses variabel instance dari objek saat ini.

class Person {
    String name, address;
    int age;

   public Person(){
       this.name = "Elvin Mustianto";
       this.address = "Jl.Cibaligo Timur RT.003/RW.029 No.125";
       this.age = 20;
   }
    void cetakData(){
        System.out.println("Nama \t : " + this.name);
        System.out.println("Alamat \t : " + this.address);
        System.out.println("Umur \t : " + this.age + " Tahun");

    }
}

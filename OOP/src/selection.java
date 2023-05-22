import java.util.Scanner;
public class selection {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program Kategori Umur Manusia");
        umurManusia();
        System.out.println("====================================================");
        System.out.println("Program Kategori kendaraan");
        kendaraan();
        System.out.println("====================================================");
        System.out.println("Program Menu Makanan");
        menu();
    }
    private static void umurManusia() {
        System.out.print("Masukan umur \t: ");
        int umur = scanner.nextInt();

        if (umur <= 5) {
            System.out.println("Balita");
        } else if (umur <= 12) {
            System.out.println("Anak-anak");
        } else if (umur <= 18) {
            System.out.println("Remaja");
        } else if (umur <= 40) {
            System.out.println("Dewasa");
        } else if (umur <= 60) {
            System.out.println("Paruhbaya");
        } else {
            System.out.println("Lanjut Usia");
        }
    }

    private static void kendaraan() {
        System.out.println("JENIS KENDARAAN\n"+
                "1.Naik Pesawat Terbang\n"+
                "2.Naik Kereta Api\n"+
                "3.Naik Bus\n"+
                "4.Naik Taksi\n"+
                "5.Naik Mobil Pribadi\n"+
                "6.Naik Motor");
        System.out.print("Pilih angka \t: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Naik Pesawat Terbang");
                break;
            case 2:
                System.out.println("Naik Kereta Api");
                break;
            case 3:
                System.out.println("Naik Bus");
                break;
            case 4:
                System.out.println("Naik Taksi");
                break;
            case 5:
                System.out.println("Naik Mobil Pribadi");
                break;
            case 6:
                System.out.println("Naik Motor");
                break;
            default:
                System.out.println("Anda Salah Memilih");
        }
    }

    private static void menu() {
        System.out.println("Menu\n"+
                "___________________________\n"+
                "Makanan \t   Minuman\n"+
                "Nasi Goreng\t   Red Velvet\n"+
                "Mie Kuah\t   Coffee Cappucino\n"+
                "Cireng Bumbu   Coffee Americano\n"+
                "kentang Goreng Milk tea\n"+
                "Mie Goreng\t   Coffee Gula Aren\n"+
                "Seblak\t       Lemon tea\n"+
                "-----------------------------");

        System.out.print("Pilih Makanan\t : ");
        int food = scanner.nextInt();

        System.out.print("Pilih Minuman\t : ");
        int drink = scanner.nextInt();

        System.out.println("------------------------------------");

        switch (food){
            case 1:
                System.out.println("Nasi Goreng");
                break;
            case 2:
                System.out.println("Mie Kuah");
                break;
            case 3:
                System.out.println("Cireng Bumbu");
                break;
            case 4:
                System.out.println("Kentang Goreng");
                break;
            case 5:
                System.out.println("Mie Goreng");
                break;
            case 6:
                System.out.println("Seblak");
                break;
            default:
                System.out.println("Menu tidak ada");
        }
        switch (drink){
            case 1:
                System.out.println("Red Velvet");
                break;
            case 2:
                System.out.println("Coffee Cappucino");
                break;
            case 3:
                System.out.println("Coffee Americano");
                break;
            case 4:
                System.out.println("Milk Tea");
                break;
            case 5:
                System.out.println("Coffee Gula Aren");
                break;
            case 6:
                System.out.println("Lemon Tea");
                break;
            default:
                System.out.println("Menu tidak ada");
        }
    }

}

import java.util.Scanner;
public class looping {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        genap();
        ganjil();
        System.out.println("========================");
        piramid();
    }
    private static void genap() {
        System.out.print("Masukan Angka : ");
        int jlmNumber = scanner.nextInt();
        for (int i = 1; i <= jlmNumber; i++){
            if (i % 2 ==0){
                System.out.print(i + " ");
            }
        }
    }

    private static void ganjil() {
        System.out.print("\nMasukan Angka : ");
        int jlmNumber = scanner.nextInt();
        for (int i = 1; i <= jlmNumber; i++){
            if (i % 2 !=0){
                System.out.println(i + " ");
            }
        }
    }

    private static void piramid() {
        System.out.println("Segitiga");
        int jmlRows = 6, k = 0;

        for (int i = 1; i <= jmlRows; ++i, k = 0) {
            for (int space = 1; space <= jmlRows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

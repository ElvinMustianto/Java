package tugas8;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList about = new ArrayList();
        about.add("Elvin Mustianto");
        about.add(2242025);
        about.add("Cimahi");
        about.add("Tugas = 90");
        about.add("UTS = 80");
        about.add("UAS = 80");
        System.out.println(about);
        about.remove(3);
        System.out.println(about);
        about.remove(2);
        System.out.println(about);
        about.add("Gibran Al fatih");
        about.add(22005);
        System.out.println(about);
        about.removeAll(about);
        System.out.println("Hapus Data" + about);
        System.out.println("===========================================================");
//        ArrayList about2 = new ArrayList();
//        about2.add("Elvin Mustianto");
//        about2.add(2242025);
//        about2.add("UTS = 80");
//        about2.add("UAS = 80");
//        about2.add("Gibran Al Fatih");
//        about2.add(22005);
//        System.out.println(about2);
    }
}

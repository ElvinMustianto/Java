package antrianBank;

import java.util.Scanner;

public class bank {
    int id;
    String name,perlu;
    bank next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukan id       :");
        id = in.nextInt();
        System.out.print("Masukan name     :");
        name = str.nextLine();
        System.out.print("Masukan Keperluan:");
        perlu = str.nextLine();
        next = null;
    }

    public void read() {
        System.out.println("|| "+id+" \t|| "+name+" \t|| "+perlu+" \t||");
    }
    public static void main(String[] args) {
        int menu = 0;
        linked que = new linked();
        while (menu != 4){
            System.out.print("1.Ambil antrian\n" +
                    "2.Panggil Antrian\n" +
                    "3.View\n" +
                    "4.Exit\n :");

            menu = in.nextInt();
            if (menu == 1){
                que.antrian();
            }else if (menu == 2){
                que.panggil();
            }else if (menu == 3){
                que.view();
            }else if (menu == 4){
                System.out.println("_Keluar_");
            }else {
                System.out.println("_Salah_");
            }
            System.out.println("");
        }
    }
}

class linked{
    bank head, tail;
    public linked(){
        head = null;
        tail = null;
    }
    public void antrian(){
        bank baru = new bank();
        baru.input();
       if (head == null) {
           head = baru;
       } else if (tail.next == baru){
           tail = baru;
       }
    }

    public void panggil() {
        if (head == null){
            System.out.println("_Kosong_");
        } else {
            System.out.println("Keluar data dengan Id :" + head.id);
            head = head.next;
        }
    }

    public void view() {
        if (head == null){
            System.out.println("_Kosong_");
        }else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for (bank a = head; a != null; a = a.next){
                a.read();
            }
        }
    }
}

package com.dicoding.javafundamental.accsessmodifier.package1;

public class KelasA {
    private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;


    private int fuctionA() {
        return memberA;
    }

    int fuctionB(){
        //Pemanggilan  private member dan private function
        int hasil = fuctionA() + memberA;
        return hasil;
    }

    protected void methodC() {
        System.out.println("Percobaan accsess modifer!!!");
    }
}

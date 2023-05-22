package com.dicoding.javafundamental.accsessmodifier.package2;

import com.dicoding.javafundamental.accsessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] agrs) {

        //Kode ini pasti akan mengalami kompiler error

        KelasA KelasA = new KelasA();

        //System.out.println(KelasA.functionB());

        //System.out.println(KelasA.memberB);
        //System.out.println(KelasA.memberC);

        KelasB KelasB = new KelasB();
        KelasB.methodC();
    }
}

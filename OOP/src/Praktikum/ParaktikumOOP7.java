package Praktikum;

public class ParaktikumOOP7 {
    public static void main(String[] args) {
        child1 child1 = new child1();
        child2 child2 = new child2();

        child1.name = "Yuli";
        child1.age = 35;
        child1.weight = 45;
        System.out.println("Nama anak pertama : " + child1.name);
        System.out.println("Berat badan : " + child1.weight + " Kg");
        child1.eat();
        child1.swim();
        System.out.println("=============================");
        child2.name = "Yuni";
        child2.age = 19;
        child2.weight = 80;
        System.out.println("Nama anak pertama : " + child2.name);
        System.out.println("Berat badan : " + child2.weight + " Kg");
        child2.walk();
        child2.singing();
    }
}

class parent {
    String name;
    int age, weight;

    void eat() {
        System.out.println("Makan Sate");
    }
    void sleep() {
        System.out.println("Tidur ngorok");
    }
    void walk() {
        System.out.println("Jalan-jalan");
    }
}

class child1 extends parent {
    void swim() {
        System.out.println("Reang gaya Batu");
    }
}

class child2 extends parent {
    void singing() {
        System.out.println("Bernyanyi dangdut");
    }
}

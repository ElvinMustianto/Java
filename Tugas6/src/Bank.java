import java.util.LinkedList;
import java.util.Queue;

public class Bank {
    public void antrianBank() {
        Queue<String> queue;
        queue = new LinkedList<>();
        queue.add("1.Ijay Alamsyah");
        queue.add("2.Thoriq");
        queue.add("3.Galih");
        queue.add("4.Abdul");
        queue.add("5.Ahmad");
        queue.add("6.Dicky");
        queue.add("7.Adit");
        queue.add("8.Deni");
        queue.add("9.Alwan");
        queue.add("10.Evraldi");
        System.out.println(queue);
        System.out.println("Poll :" + queue.poll());
        System.out.println("Peek :" + queue.peek());
        System.out.println(queue);
    }
    public static void main(String[] args) {
        new Bank().antrianBank();
    }
}


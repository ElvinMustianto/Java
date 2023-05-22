public class insertion {
    public static void insertion(int array[]) {
        int number = array.length;
        for (int j = 1; j < number; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    public static void main(String[] args) {
        int [] array = {25,23,18,10,7,21};
        System.out.println("Before Insertion Sort");
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        insertion(array);
        System.out.println("After Insertion Sort");
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}

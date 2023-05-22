public class selectionSort {
   static void sortSelection(int [] array){
       int number = array.length;
       for (int i = 0; i < number - 1; i++){
           int minIndex = i;
           for (int j = i + 1;j < number;j++ ){
               if (array[j] < array[minIndex]){
                   minIndex = j;
               }
           }
           int temp = array[minIndex];
           array[minIndex] = array[i];
           array[i] = temp;
       }
   }
   static void printArray(int [] array){
       int data = array.length;
       for (int i = 0; i < data; i++){
           System.out.print(array[i]+" ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        int [] array = {25,23,18,10,7,21};

        System.out.println("Before Selection Sort");
        printArray(array);

        System.out.println("After Selection Sort");
        sortSelection(array);
        printArray(array);

    }
}

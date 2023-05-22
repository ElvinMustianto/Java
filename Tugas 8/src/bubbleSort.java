import java.util.*;
class bubbleSort {
    public static void bubbleSort(int [] sort_arr, int len){

        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }

    public static void main( String args[] ) {
        int [] array = {25,23,18,10,7,21};
        int len = array.length;

        System.out.println("Before bubble sort");
        for(int i = 0; i<len; ++i){
            System.out.print(array[i]+ " ");
        }
        bubbleSort(array,len);
        System.out.println();
        System.out.println("After bubble sort");
        for(int i = 0; i<len; ++i){
            System.out.print(array[i]+ " ");
        }
    }
}



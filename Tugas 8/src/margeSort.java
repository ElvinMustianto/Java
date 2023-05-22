class margeSort {
    void merge(int[] arr, int a, int b, int c) {
        int n1 = b - a + 1;
        int n2 = c - b;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++){
            L[i] = arr[a + i];
        }

        for (int j = 0; j < n2; j++){
            M[j] = arr[b + 1 + j];
        }


        int i, j, k;
        i = 0;
        j = 0;
        k = a;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    void sortMarge(int[] arr, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            sortMarge(arr, l, m);
            sortMarge(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] array = {25,23,18,10,7,21};

        System.out.println("Before marge");
        printArray(array);

        margeSort data = new margeSort();
        data.sortMarge(array, 0, array.length - 1);

        System.out.println("After marge");
        printArray(array);

    }
}


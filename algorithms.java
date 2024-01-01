public class algorithms {
    static long bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        long baslangicZamani = System.currentTimeMillis();

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        long bitisZamani = System.currentTimeMillis();
        long gecenSure = bitisZamani - baslangicZamani;
        printArray(arr);
        System.out.println("Program " + gecenSure + " milisaniye sürdü.");
        return gecenSure;
    }

    static long InsertionSort(int[] arr) {
        int n = arr.length;
        long baslangicZamani = System.currentTimeMillis();
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long bitisZamani = System.currentTimeMillis();
        long gecenSure = bitisZamani - baslangicZamani;
        printArray(arr);
        return gecenSure;
    }

    static long SelectionSort(int[] arr) {
        int n = arr.length;
        long baslangicZamani = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        long bitisZamani = System.currentTimeMillis();
        long gecenSure = bitisZamani - baslangicZamani;
        printArray(arr);
        return gecenSure;
    }

    public static long QuickSort(int[] array) {
        if (array == null || array.length == 0) {
            return 1;
        }
        long baslangicZamani = System.currentTimeMillis();

        quickSort(array, 0, array.length - 1);
        long bitisZamani = System.currentTimeMillis();
        long gecenSure = bitisZamani - baslangicZamani;
        return gecenSure;

    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

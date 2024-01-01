import java.util.Random;

public class sortArray {
    void bubSort() {

        long[] times = new long[3];
        int[] bin = new int[1000];
        int[] onBin = new int[10000];
        int[] yuzBin = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            bin[i] = random.nextInt(1000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000; i++) {
            System.out.print(bin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[0] = algorithms.bubbleSort(bin);


        for (int i = 0; i < 10000; i++) {
            onBin[i] = random.nextInt(10000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 10000; i++) {
            System.out.print(onBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[1] = algorithms.bubbleSort(onBin);


        for (int i = 0; i < 1000000; i++) {
            yuzBin[i] = random.nextInt(1000000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000000; i++) {
            System.out.print(yuzBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[2] = algorithms.bubbleSort(yuzBin);
        System.out.println("\n----Bubble Sort----\nBin elemanlı : " + times[0] + " ms" + "\nOn bin elemanlı : " + times[1] + " ms" + "  \nYüz bin elemanlı : " + times[2] + " ms");

    }

    void inserSort() {
        long[] times = new long[3];
        int[] bin = new int[1000];
        int[] onBin = new int[10000];
        int[] yuzBin = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            bin[i] = random.nextInt(1000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000; i++) {
            System.out.print(bin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[0] = algorithms.InsertionSort(bin);


        for (int i = 0; i < 10000; i++) {
            onBin[i] = random.nextInt(10000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 10000; i++) {
            System.out.print(onBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[1] = algorithms.InsertionSort(onBin);


        for (int i = 0; i < 1000000; i++) {
            yuzBin[i] = random.nextInt(1000000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000000; i++) {
            System.out.print(yuzBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[2] = algorithms.InsertionSort(yuzBin);
        System.out.println("\n----Insertion Sort----\nBin elemanlı : " + times[0] + " ms" + "\nOn bin elemanlı : " + times[1] + " ms" + "  \nYüz bin elemanlı : " + times[2] + " ms");
    }

    void selcSort() {
        long[] times = new long[3];
        int[] bin = new int[1000];
        int[] onBin = new int[10000];
        int[] yuzBin = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            bin[i] = random.nextInt(1000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000; i++) {
            System.out.print(bin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[0] = algorithms.SelectionSort(bin);


        for (int i = 0; i < 10000; i++) {
            onBin[i] = random.nextInt(10000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 10000; i++) {
            System.out.print(onBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[1] = algorithms.SelectionSort(onBin);


        for (int i = 0; i < 1000000; i++) {
            yuzBin[i] = random.nextInt(1000000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000000; i++) {
            System.out.print(yuzBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[2] = algorithms.SelectionSort(yuzBin);
        System.out.println("\n----Selection Sort----\nBin elemanlı : " + times[0] + " ms" + "\nOn bin elemanlı : " + times[1] + " ms" + "  \nYüz bin elemanlı : " + times[2] + " ms");

    }

    void quickSort(){
        long[] times = new long[3];
        int[] bin = new int[1000];
        int[] onBin = new int[10000];
        int[] yuzBin = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            bin[i] = random.nextInt(1000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000; i++) {
            System.out.print(bin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[0] = algorithms.QuickSort(bin);


        for (int i = 0; i < 10000; i++) {
            onBin[i] = random.nextInt(10000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 10000; i++) {
            System.out.print(onBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[1] = algorithms.QuickSort(onBin);


        for (int i = 0; i < 1000000; i++) {
            yuzBin[i] = random.nextInt(1000000);
        }
        System.out.println("""


                -------------------------------------

                Sıralanmamış dizi:""");
        for (int i = 0; i < 1000000; i++) {
            System.out.print(yuzBin[i] + " ");

        }
        System.out.println("""


                -------------------------------------

                Sıralanmış dizi:""");
        times[2] = algorithms.QuickSort(yuzBin);
        System.out.println("\n----Quick Sort----\nBin elemanlı : " + times[0] + " ms" + "\nOn bin elemanlı : " + times[1] + " ms" + "  \nYüz bin elemanlı : " + times[2] + " ms");


    }


}

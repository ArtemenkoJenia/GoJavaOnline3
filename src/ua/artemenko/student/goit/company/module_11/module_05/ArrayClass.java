package ua.artemenko.student.goit.company.module_11.module_05;

import java.util.Arrays;
import java.util.Random;

public class ArrayClass {

    public int[] array;

    public ArrayClass(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).nextInt(2000) - 1000;
        }
    }

    public static void showArray(int[] ob) {
        System.out.println(Arrays.toString(ob));
    }

    public static void searchMinMax(int[] ob) {
        int countCycle = 2;
        int max;
        int min;

        if (ob[0] < ob[1]) {
            max = ob[1];
            min = ob[0];
        } else {
            min = ob[1];
            max = ob[0];
        }

        while (countCycle <= (ob.length - 1)) {
            if (ob[countCycle] > max) {
                max = ob[countCycle];
            } else if (ob[countCycle] < min) {
                min = ob[countCycle];
            }
            countCycle++;
        }

        System.out.println("MIN in array: " + min);
        System.out.println("MAX in array: " + max);
    }

    public static void bubbleSort(int[] ob) {
        int help = ob.length - 1;
        int count = 0;
        while (count < help) {
            for (int i = count; i < help - count; i++) {
                if (ob[i] > ob[i + 1]) {
                    int tmp = ob[i];
                    ob[i] = ob[i + 1];
                    ob[i + 1] = tmp;
                }
            }
            count++;
            for (int j = help - count; j >= count; j--) {
                if (ob[j] < ob[j - 1]) {
                    int tmp = ob[j];
                    ob[j] = ob[j - 1];
                    ob[j - 1] = tmp;
                }
            }
        }

    }

    public static void selectionSort(int[] ob) {
        for (int oneFor = 0; oneFor < ob.length - 1; oneFor++) {
            int indexMinElement = oneFor;
            for (int twoFor = oneFor; twoFor < ob.length; twoFor++) {
                if (ob[indexMinElement] > ob[twoFor]) {
                    indexMinElement = twoFor;
                }
            }
            int tmp = ob[indexMinElement];
            ob[indexMinElement] = ob[oneFor];
            ob[oneFor] = tmp;
        }
    }

    public static void insertSort(int[] ob) {
        for (int oneFor = 1; oneFor < ob.length; oneFor++) {
            int newElement = ob[oneFor];
            int help = oneFor - 1;
            while (help >= 0 && ob[help] > newElement) {
                ob[help + 1] = ob[help];
                help--;
            }
            ob[help + 1] = newElement;
        }
    }

    public static void quickSort(int[] ob, int start, int end) {

        int i = start;
        int j = end;
        int middle = ob[(end + start) / 2];
        do {
            while (ob[i] < middle) {
                i++;
            }
            while (middle < ob[j]) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    int tmp = ob[i];
                    ob[i] = ob[j];
                    ob[j] = tmp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (start < j)
            quickSort(ob, start, j);
        if (i < end)
            quickSort(ob, i, end);

    }

    public static void veryQuickSort(int[] ob) {

        Arrays.sort(ob);
    }
}

package ua.artemenko.student.goit.company.additionalTasks;

import java.util.Arrays;
import java.util.Random;

public class SearchValues {

    public static void findPairs(int[] ob, int target) {
        try {
            if (ob.length <= 1) {
                throw new IllegalArgumentException();
            }
            Arrays.sort(ob);
            for (int i = 0; i < ob.length; i++) {
                int help = target - ob[i];
                preSearch(ob, i + 1, ob.length, help,ob[i]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("to search the array length should be greater than one");
        }

    }

    private static void preSearch(int[] ob, int start, int end, int key,int pair) {
        int low = start;
        int high = end - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = ob[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else if (midVal == key) {
                search(ob, low, high, key,pair);
                return;
            }
        }
    }

    private static void search(int[] ob, int start, int end, int key,int pair) {
        int countCoincides = 0;
        for (int i = start; i <= end; i++) {
            if (ob[i] == key){
                System.out.printf("%d --- %d%n", pair,key);
            }else if (countCoincides != 0) {
                break;
            }
        }
    }

    public static int secondLargest(int[] ob) {
        int result = 0;
        try {
            if (ob.length <= 1) {
                throw new IllegalArgumentException();
            }
            for (int oneFor = 0; oneFor < 2; oneFor++) {
                int indexMinElement = oneFor;
                for (int twoFor = oneFor; twoFor < ob.length; twoFor++) {
                    if (ob[indexMinElement] < ob[twoFor]) {
                        indexMinElement = twoFor;
                    }
                }
                int tmp = ob[indexMinElement];
                ob[indexMinElement] = ob[oneFor];
                ob[oneFor] = tmp;
                result = ob[oneFor];
            }
        } catch (IllegalArgumentException e) {
            System.out.println("to search the array length should be greater than one");
        }
        return result;
    }
}

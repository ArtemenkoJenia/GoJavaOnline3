package ua.artemenko.student.goit.company.additionalTasks;

import java.util.Arrays;

public class SearchValues {

    public static void findPairs(int[] ob, int target) {
        try {
            if (ob.length <= 1) {
                throw new IllegalArgumentException();
            }
            Arrays.sort(ob);
            for (int i = 0; i < ob.length; i++) {
                int help = target - ob[i];
                int start = i + 1;
                int end = ob.length - 1;
                while (start <= end) {
                    int mid = (start + end) >>> 1;
                    int midVal = ob[mid];

                    if (midVal < help) {
                        start = mid + 1;
                    } else if (midVal > help) {
                        end = mid - 1;
                    } else if (midVal == help) {
                        search(ob, start, end, help,ob[i]);
                        break;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("to search the array length should be greater than one");
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

package ua.artemenko.student.goit.company.additionalTasks;

import ua.artemenko.student.goit.company.module_05.ArrayClass;

import java.lang.reflect.Array;

public class MainAdditionalTasks {
    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass(20);
        ArrayClass.showArray(arrayClass.array);

        System.out.println(SearchValues.secondLargest(arrayClass.array));

        int[] helpArray0 = arrayClass.array.clone();
        ArrayClass.bubbleSort(helpArray0);
        ArrayClass.showArray(helpArray0);


        int[] ar = {-5,-24,-15,-8,0,5,4,5,-7,9};
        ArrayClass.showArray(ar);
        ArrayClass.bubbleSort(ar);
        ArrayClass.showArray(ar);
        SearchValues.findPairs(ar,9);

    }
}

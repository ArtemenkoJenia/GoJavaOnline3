package ua.artemenko.student.goit.company.module_06.item_1.mod5;


public class Main {
    public static void main(String[] args) {
        int sizeArray = 0;
        try {
            ArrayClass arrayClass = new ArrayClass(sizeArray);
            ArrayClass.showArray(arrayClass.array);
            ArrayClass.searchMinMax(arrayClass.array);

            int[] helpArray0 = arrayClass.array.clone();
            ArrayClass.bubbleSort(helpArray0);
            ArrayClass.showArray(helpArray0);

            int[] helpArray1 = arrayClass.array.clone();
            ArrayClass.insertSort(helpArray1);
            ArrayClass.showArray(helpArray1);

            int[] helpArray2 = arrayClass.array.clone();
            ArrayClass.selectionSort(helpArray2);
            ArrayClass.showArray(helpArray2);

            int[] helpArray3 = arrayClass.array.clone();
            ArrayClass.quickSort(helpArray3, 0, helpArray3.length - 1);
            ArrayClass.showArray(helpArray3);

            int[] helpArray4 = arrayClass.array.clone();
            ArrayClass.veryQuickSort(helpArray4);
            ArrayClass.showArray(helpArray4);

            System.out.println();
            ArrayClass.showArray(arrayClass.array);
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Размер массива равен 0");
    }
    }
}

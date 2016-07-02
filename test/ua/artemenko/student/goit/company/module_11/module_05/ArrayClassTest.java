package ua.artemenko.student.goit.company.module_11.module_05;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ArrayClassTest {
    private int[] array;

    public ArrayClassTest(int[] array){
        this.array = array;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-100,-5,4,400,45,87,-57,-89,56,67,-32,40}},
                {new int[]{100,5,-4,-400,-45,-87,57,89,-56,-67,32,-40}},
                {new int[]{-170,-53,45,40,405,-87,57,9,6,-67,32,-40}},
                {new int[]{0,-5,-4,80,35,-87,57,49,-7,15,-32,40}},
                {new int[]{6,-5,4,90,-45,-87,-57,99,-33,67,-32,-40}}
        });

    }


    @Test
    public void searchMinMax() throws Exception {

    }

    @Test
    public void bubbleSort() throws Exception {
        ArrayClass.bubbleSort(this.array);
        Assert.assertTrue(inspectionArray());
    }

    @Test
    public void selectionSort() throws Exception {
        ArrayClass.selectionSort(this.array);
        Assert.assertTrue(inspectionArray());
    }

    @Test
    public void insertSort() throws Exception {
        ArrayClass.insertSort(this.array);
        Assert.assertTrue(inspectionArray());
    }

    @Test
    public void quickSort() throws Exception {
        ArrayClass.quickSort(this.array,0,array.length - 1);
        Assert.assertTrue(inspectionArray());
    }

    @Test
    public void veryQuickSort() throws Exception {
        ArrayClass.veryQuickSort(this.array);
        Assert.assertTrue(inspectionArray());
    }

    private boolean inspectionArray(){
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] >= array[i + 1]){
                return false;
            }
        }
        return true;
    }

}
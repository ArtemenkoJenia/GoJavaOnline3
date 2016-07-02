package ua.artemenko.student.goit.company.module_11.module_09.flower;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.AudioFile;

import static org.junit.Assert.*;

public class FlowerTest {

    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private  String strCheck1 = "|Aster|   WHITE|Large|";
    private  String strCheck2 = "|Aster|NotColor|Large|";

    @Before
    public void setUp() throws Exception {
        flower1 = new Aster("WHITE",SizeFlower.Large);
        flower2 = new Aster(null,SizeFlower.Large);
        flower3 = new Aster("WHITE",SizeFlower.Large);
    }

    @Test
    public void getSizeFlower() throws Exception {
        Assert.assertTrue(flower1.sizeFlower == SizeFlower.Large);
    }

    @Test
    public void setSizeFlower() throws Exception {
        flower1.setSizeFlower(SizeFlower.Medium);
        Assert.assertTrue(flower1.getSizeFlower()== SizeFlower.Medium);
    }

    @Test
    public void setSizeFlowerNull() throws Exception {
        flower1.setSizeFlower(null);
        Assert.assertTrue(flower1.getSizeFlower()== SizeFlower.Small);
    }

    @Test
    public void getColorFlower() throws Exception {
        Assert.assertTrue(flower1.getColorFlower().equals("WHITE"));
        Assert.assertTrue(flower2.getColorFlower().equals("NotColor"));
    }

    @Test
    public void setColorFlower() throws Exception {
        flower1.setColorFlower("PURPLE");
        Assert.assertTrue(flower1.getColorFlower().equals("PURPLE"));
    }
    @Test
    public void setColorFlowerNull() throws Exception {
        flower1.setColorFlower(null);
        Assert.assertTrue(flower1.getColorFlower().equals("NotColor"));
    }

    @Test
    public void getNameFlower() throws Exception {
        Assert.assertTrue(flower1.getNameFlower().equals("Aster"));
    }

    @Test
    public void setNameFlower() throws Exception {
        flower1.setNameFlower("Rose");
        Assert.assertTrue(flower1.getNameFlower().equals("Rose"));
    }

    @Test
    public void setNameFlowerNull() throws Exception {
        flower1.setNameFlower(null);
        Assert.assertTrue(flower1.getNameFlower().equals("NotName"));
    }

    @Test
    public void objectToStringBuilder() throws Exception {
        Assert.assertTrue(flower1.toString().equals(strCheck1));
        Assert.assertTrue(flower2.toString().equals(strCheck2));
    }
    @Test
    public void equalsTrue() throws Exception {
        Assert.assertTrue(flower1.equals(flower3));

    }
    @Test
    public void equalsFalse() throws Exception {
        Assert.assertFalse(flower1.equals(flower2));
    }

    @Test
    public void hashCodeTestFalse() throws Exception {
        Assert.assertFalse(flower1.hashCode()== flower2.hashCode());
    }
    @Test
    public void hashCodeTestTrue() throws Exception {
        Assert.assertTrue(flower1.hashCode()== flower3.hashCode());
    }
}
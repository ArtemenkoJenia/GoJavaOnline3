package ua.artemenko.student.goit.company.module_11.module_09.fileSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyFileTest {

    private MyFile myFile1;
    private MyFile myFile2;
    private MyFile myFile3;
    private  String strCheck1 = "|AudioFile|         Name|           999KB|fgnf|";
    private  String strCheck2 = "|AudioFile|New AudioFile|           999KB|    |";


    @Before
    public void setUp() throws Exception {
        myFile1 = new AudioFile("Name",999,"fgnf");
        myFile2 = new AudioFile(null,999,null);
        myFile3 = new AudioFile("Name",999,"fgnf");
    }

    @Test
    public void getNameClass() throws Exception {
        Assert.assertTrue(myFile1.getNAME_CLASS().equals("AudioFile"));
    }

    @Test
    public void getName() throws Exception {
        Assert.assertTrue(myFile1.getName().equals("Name"));
        Assert.assertTrue(myFile2.getName().equals("New AudioFile"));
    }

    @Test
    public void setName() throws Exception {
        myFile1.setName("newName");
        Assert.assertTrue(myFile1.getName().equals("newName"));
    }
    @Test
    public void setNameNull() throws Exception {
        myFile1.setName(null);
        Assert.assertTrue(myFile2.getName().equals("New AudioFile"));
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertTrue(myFile1.getSize()== 999);
    }


    @Test
    public void setSize() throws Exception {
        myFile1.setSize(2000);
        Assert.assertTrue(myFile1.getSize()== 2000);
    }

    @Test
    public void setSizeNigative() throws Exception {
        myFile1.setSize(-2000);
        Assert.assertTrue(myFile1.getSize()== 0);
    }

    @Test
    public void getSpecification() throws Exception {
        Assert.assertTrue(myFile1.getSpecification().equals("fgnf"));
        Assert.assertTrue(myFile2.getSpecification().equals(" "));
    }

    @Test
    public void setSpecification() throws Exception {
        myFile1.setSpecification(".mp3");
        Assert.assertTrue(myFile1.getSpecification().equals(".mp3"));

    }
    @Test
    public void setSpecificationNull() throws Exception {
        myFile1.setSpecification(null);
        Assert.assertTrue(myFile1.getSpecification().equals(" "));

    }

    @Test
    public void objectToStringBuilder() throws Exception {

        Assert.assertTrue(myFile1.toString().equals(strCheck1));
        Assert.assertTrue(myFile2.toString().equals(strCheck2));
    }

    @Test
    public void equalsTrue() throws Exception {
        Assert.assertTrue(myFile1.equals(myFile3));

    }
    @Test
    public void equalsFalse() throws Exception {
        Assert.assertFalse(myFile1.equals(myFile2));

    }

    @Test
    public void hashCodeTestFalse() throws Exception {
        Assert.assertFalse(myFile1.hashCode()== myFile2.hashCode());
    }
    @Test
    public void hashCodeTestTrue() throws Exception {
        Assert.assertTrue(myFile1.hashCode()== myFile3.hashCode());
    }

}
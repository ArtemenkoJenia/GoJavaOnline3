package ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator;

import org.junit.Assert;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;

import static org.junit.Assert.*;

public class ComparatorClassNameTest {
    @Test
    public void compare() throws Exception {
        MyFile myFile1 = new AudioFile("Name",999,"fgnf");
        MyFile myFile2 = new AudioFile(null,999,null);
        ComparatorClassName comparatorClassName = new ComparatorClassName();
        comparatorClassName.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorClassName.compare(myFile1,myFile2)==0);
    }


}
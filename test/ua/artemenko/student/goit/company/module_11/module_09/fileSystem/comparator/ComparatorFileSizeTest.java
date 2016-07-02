package ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator;

import org.junit.Assert;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;

import static org.junit.Assert.*;

public class ComparatorFileSizeTest {
    @Test
    public void compare() throws Exception {
        MyFile myFile1 = new AudioFile("Name1",999,"3aaa");
        MyFile myFile2 = new AudioFile("Name1",999,"3aaa");
        ComparatorFileSize comparatorFileSize = new ComparatorFileSize();
        comparatorFileSize.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSize.compare(myFile1,myFile2)==0);
    }

    @Test
    public void compareLess() throws Exception {
        MyFile myFile1 = new AudioFile("Name22",999,"3aaa");
        MyFile myFile2 = new AudioFile("Name1",900,"2aa");
        ComparatorFileSize comparatorFileSize = new ComparatorFileSize();
        comparatorFileSize.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSize.compare(myFile1,myFile2) > 0);
    }

    @Test
    public void compareMore() throws Exception {
        MyFile myFile1 = new AudioFile("Name1",900,"3aaa");
        MyFile myFile2 = new AudioFile("Name22",999,"4aaaa");
        ComparatorFileSize comparatorFileSize = new ComparatorFileSize();
        comparatorFileSize.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSize.compare(myFile1,myFile2) < 0);
    }

}
package ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator;

import org.junit.Assert;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;

import static org.junit.Assert.*;

public class ComparatorFileSpecificationTest {
    @Test
    public void compare() throws Exception {
        MyFile myFile1 = new AudioFile("Name",999,"3aaa");
        MyFile myFile2 = new AudioFile("Name",999,"3aaa");
        ComparatorFileSpecification comparatorFileSpecification = new ComparatorFileSpecification();
        comparatorFileSpecification.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSpecification.compare(myFile1,myFile2)==0);
    }

    @Test
    public void compareLess() throws Exception {
        MyFile myFile1 = new AudioFile("Name",999,"3aaa");
        MyFile myFile2 = new AudioFile("Name",999,"2aa");
        ComparatorFileSpecification comparatorFileSpecification = new ComparatorFileSpecification();
        comparatorFileSpecification.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSpecification.compare(myFile1,myFile2)==1);
    }

    @Test
    public void compareMore() throws Exception {
        MyFile myFile1 = new AudioFile("Name",999,"3aaa");
        MyFile myFile2 = new AudioFile("Name",999,"4aaaa");
        ComparatorFileSpecification comparatorFileSpecification = new ComparatorFileSpecification();
        comparatorFileSpecification.compare(myFile1,myFile2);
        Assert.assertTrue(comparatorFileSpecification.compare(myFile1,myFile2)==-1);
    }

}
package ua.artemenko.student.goit.company.module_11.module_10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptedTextFilesTest {

    private EncryptedTextFiles encryptedTextFiles;

    @Before
    public void setUp() throws Exception {
        encryptedTextFiles = new EncryptedTextFiles("test.txt");

    }

    @Test
    public void getFile() throws Exception {
        Assert.assertNotNull(encryptedTextFiles.getFile());
    }

    @Test
    public void addText() throws Exception {
        encryptedTextFiles.addText(false);
    }

    @Test
    public void closeStream() throws Exception {

    }

    @Test
    public void readFromFile() throws Exception {

    }

    @Test
    public void showInConsole() throws Exception {

    }

}
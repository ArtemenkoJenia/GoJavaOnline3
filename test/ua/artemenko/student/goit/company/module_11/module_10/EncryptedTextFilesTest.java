package ua.artemenko.student.goit.company.module_11.module_10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_09.processData.EncryptString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

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
        encryptedTextFiles.addText("test text",false);
        String textRead;
        try (BufferedReader rd = new BufferedReader(new FileReader(encryptedTextFiles.getFile()))) {
            textRead = EncryptString.encryptString(rd.readLine(),false);
            Assert.assertTrue(textRead.equals("test text"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void closeStream() throws Exception{
        encryptedTextFiles.closeStream();
        encryptedTextFiles.addText(null,false);
        ArrayList<String> textRead = new ArrayList<>();
        try (BufferedReader rd = new BufferedReader(new FileReader(encryptedTextFiles.getFile()))) {
            String s;
            while ((s = rd.readLine()) != null) {
                textRead.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(textRead.size() == 0);
    }

    @Test
    public void readFromFile() throws Exception {
        ArrayList<String> textRead = encryptedTextFiles.readFromFile();
        Assert.assertTrue(textRead.size() == 0);
    }


}
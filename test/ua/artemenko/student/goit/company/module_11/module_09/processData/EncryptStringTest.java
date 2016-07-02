package ua.artemenko.student.goit.company.module_11.module_09.processData;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class EncryptStringTest {

    private boolean flagTest;
    private String stringTest;
    private String stringReturnTest;

    public EncryptStringTest(String stringTest,String stringReturnTest,boolean flagTest){
        this.flagTest = flagTest;
        this.stringTest = stringTest;
        this.stringReturnTest = stringReturnTest;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFGHIJKLMNOPQRSTUVWXYZ","DEFGHIJKLMNOPQRSTUVWXYZABC",true},
                {"DEFGHIJKLMNOPQRSTUVWXYZABC","ABCDEFGHIJKLMNOPQRSTUVWXYZ",false},
                {"abcdefghijklmnopqrstuvwxyz","defghijklmnopqrstuvwxyzabc",true},
                {"defghijklmnopqrstuvwxyzabc","abcdefghijklmnopqrstuvwxyz",false},
        });

    }

    @Test
    public void encryptString() throws Exception {
        Assert.assertTrue(stringReturnTest.equals(EncryptString.encryptString(stringTest,flagTest)));
    }

}
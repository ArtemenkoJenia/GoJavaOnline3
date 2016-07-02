package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CelsiusTest {

    private static double temperatureTest;
    private static Celsius celsius;


    @BeforeClass
    public static void setUpClass() throws Exception {
        celsius = new Celsius();

    }

    @Test
    public void convert() throws Exception {
        double fahrenheit = 54;
        double temperature = (fahrenheit - 32) / 1.8;
        double result = celsius.convert(fahrenheit);
        Assert.assertEquals(temperature,result,1e-9);
    }

    @Test
    public void getValueTemperatureInCelsius() throws Exception {
        double result = celsius.getValueTemperatureInCelsius();
        Assert.assertEquals(temperatureTest,result,1e-9);
    }

    @Test
    public void setValueTemperatureInCelsius() throws Exception {
        double testValue = -20;
        celsius.setValueTemperatureInCelsius(testValue);
        temperatureTest = celsius.getValueTemperatureInCelsius();
        Assert.assertEquals(temperatureTest,testValue,1e-9);
    }

}
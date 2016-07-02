package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitTest {
    private static double temperatureTest;
    private static Fahrenheit fahrenheit;


    @BeforeClass
    public static void setUpClass() throws Exception {
        fahrenheit = new Fahrenheit();

    }

    @Test
    public void convert() throws Exception {
        double celsius = 54;
        double temperature = 1.8 * celsius + 32;
        double result = fahrenheit.convert(celsius);
        Assert.assertEquals(temperature,result,1e-9);
    }

    @Test
    public void getValueTemperatureInFahrenheit() throws Exception {
        double result = fahrenheit.getValueTemperatureInFahrenheit();
        Assert.assertEquals(temperatureTest,result,1e-9);
    }

    @Test
    public void setValueTemperatureInFahrenheit() throws Exception {
        double testValue = -20;
        fahrenheit.setValueTemperature(testValue);
        temperatureTest = fahrenheit.getValueTemperatureInFahrenheit();
        Assert.assertEquals(temperatureTest,testValue,1e-9);
    }
}
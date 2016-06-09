package ua.artemenko.student.goit.company.module_06.item_1.mod4.temperature;


public class Fahrenheit implements Temperature {

    private double valueTemperatureInFahrenheit;

    @Override
    public double convert(double celsius) {
        double fahrenheit = 0.0;
        fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public double getValueTemperatureInFahrenheit() {
        return valueTemperatureInFahrenheit;
    }

    public void setValueTemperature(double value) {
        this.valueTemperatureInFahrenheit = value;
    }
}

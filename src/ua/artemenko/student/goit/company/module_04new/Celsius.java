package ua.artemenko.student.goit.company.module_04new;

public class Celsius implements Temperature {

    private double valueTemperatureInCelsius;

    @Override
    public double convert(double fahrenheit) {
        double celsius = 0.0;
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public double getValueTemperatureInCelsius() {
        return valueTemperatureInCelsius;
    }

    public void setValueTemperatureInCelsius(double value) {
        this.valueTemperatureInCelsius = value;
    }

}

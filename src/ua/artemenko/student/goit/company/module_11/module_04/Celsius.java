package ua.artemenko.student.goit.company.module_11.module_04;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Celsius celsius = (Celsius) o;

        return Double.compare(celsius.valueTemperatureInCelsius, valueTemperatureInCelsius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueTemperatureInCelsius);
        return (int) (temp ^ (temp >>> 32));
    }
}

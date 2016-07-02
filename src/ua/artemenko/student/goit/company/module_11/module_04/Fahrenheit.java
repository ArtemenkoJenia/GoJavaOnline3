package ua.artemenko.student.goit.company.module_11.module_04;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fahrenheit that = (Fahrenheit) o;

        return Double.compare(that.valueTemperatureInFahrenheit, valueTemperatureInFahrenheit) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueTemperatureInFahrenheit);
        return (int) (temp ^ (temp >>> 32));
    }
}

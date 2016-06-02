package ua.artemenko.student.goit.company.module_04;


public class Calculation {

    public static double distanceBetweenTwoPoints(Point one, Point two) {
        double x_2 = (two.getX() - one.getX()) * (two.getX() - one.getX());
        double y_2 = (two.getY() - one.getY()) * (two.getY() - one.getY());
        double distance = Math.sqrt(x_2 + y_2);
        return distance;
    }

    public static double FigureArea(Triangle ob) {

        double halfPeriod = (ob.getOne().getLengthSegment() + ob.getTwo().getLengthSegment() + ob.getThree().getLengthSegment()) / 2;

        double area = Math.sqrt(halfPeriod *
                (halfPeriod - ob.getOne().getLengthSegment()) *
                (halfPeriod - ob.getTwo().getLengthSegment()) *
                (halfPeriod - ob.getThree().getLengthSegment()));
        return area;
    }

    public static double FigureArea(Rectangle ob) {

        double area = ob.getHeight() * ob.getWidth();
        return area;
    }

    public static double FigureArea(Circle ob) {

        double area = Math.PI * ob.getRadius() * ob.getRadius();
        return area;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        double fahrenheit = 0.0;
        fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        double celsius = 0.0;
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}

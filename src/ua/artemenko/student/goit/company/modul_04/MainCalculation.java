package ua.artemenko.student.goit.company.modul_04;


public class MainCalculation {
    public static void main(String[] args) {
        Circle circle = new Circle(5.4);
        LineSegment lineSegment = new LineSegment(new Point(3.0, 5.4), new Point(14.7, 1.4));
        Triangle triangle = new Triangle(new Point(3.0, 5.4), new Point(14.7, 1.4),new Point(8.3,7.2));
        Rectangle rectangle = new Rectangle(5,9);

        System.out.println(Calculation.distanceBetweenTwoPoints(lineSegment.getOne(),lineSegment.getTwo()));
        System.out.println(Calculation.FigureArea(circle));
        System.out.println(Calculation.FigureArea(triangle));
        System.out.println(Calculation.FigureArea(rectangle));

        System.out.println();
        System.out.println("Нормальная температура человеческого тела по Фаренгейту равна " + Calculation.CelsiusToFahrenheit(36.6));
        System.out.println("Сто градусов по Фаренгейту равны " + Calculation.FahrenheitToCelsius(100) + " по Цельсию");
    }
}

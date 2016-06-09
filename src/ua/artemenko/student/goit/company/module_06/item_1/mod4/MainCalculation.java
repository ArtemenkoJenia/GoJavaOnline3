package ua.artemenko.student.goit.company.module_06.item_1.mod4;


import ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric.*;
import ua.artemenko.student.goit.company.module_06.item_1.mod4.temperature.Celsius;
import ua.artemenko.student.goit.company.module_06.item_1.mod4.temperature.Fahrenheit;
import ua.artemenko.student.goit.company.module_06.item_1.mod4.temperature.Temperature;

import java.util.ArrayList;
import java.util.List;

public class MainCalculation {
    public static void main(String[] args) {
        LineSegment lineSegment = new LineSegment(new Point(3.0, 5.4), new Point(14.7, 1.4));
        Triangle triangle = new Triangle(new Point(3.0, 5.4), new Point(14.7, 1.4), new Point(8.3, 7.2));
        Circle circle = new Circle(5.4);

        Rectangle rectangle = new Rectangle(5, 9);

        List<GeometricFigure> geometricFigure = new ArrayList<>();
        geometricFigure.add(circle);
        geometricFigure.add(triangle);
        geometricFigure.add(rectangle);

        for (GeometricFigure ob : geometricFigure) {
            System.out.println(ob.strHelpInput() + ob.ariaFigure());
        }

        Temperature temperature = new Fahrenheit();
        System.out.println("Нормальная температура человеческого тела по Фаренгейту равна " + temperature.convert(36.6));
        temperature = new Celsius();
        System.out.println("Сто градусов по Фаренгейту равны " + temperature.convert(100) + " по Цельсию");

    }
}

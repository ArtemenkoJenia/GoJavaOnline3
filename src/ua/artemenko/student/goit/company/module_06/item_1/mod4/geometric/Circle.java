package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;


import ua.artemenko.student.goit.company.module_06.packageExcepcion.IncorrectValueException;

import java.util.Scanner;

public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius){
        try {
            if (radius <= 0) {
                throw new IncorrectValueException();
            }
            else this.radius = radius;

        } catch (IncorrectValueException e) {
            System.out.println("Введите новое значение радиуса.Радиус должен быть положительным числом.");
            boolean flag = false;
            while (!flag) {
                Scanner scanner = new Scanner(System.in);
                String helpImput = scanner.next();
                try {
                    double newRadius = Double.parseDouble(helpImput);
                    System.out.println("Новый радиус введён");
                    this.radius = newRadius;
                    flag = true;
                } catch (NumberFormatException n) {
                    System.out.println("Вы ввели не коректное значение . Попробуйте ещё раз");
                }
            }
        }
    }

    @Override
    public String strHelpInput(){
        return "Площадь круга = ";
    }

    @Override
    public double ariaFigure() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}

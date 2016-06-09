package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;


import ua.artemenko.student.goit.company.module_06.packageExcepcion.IncorrectValueException;

import java.util.Scanner;

public class Rectangle implements GeometricFigure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = corectProbe(width);
        this.height = corectProbe(height);
    }

    @Override
    public String strHelpInput(){
        return "Площадь прямоугольника =  ";
    }

    @Override
    public double ariaFigure() {
        double area = height * width;
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double corectProbe(double hDouble) {
        try {
            if (hDouble <= 0) {
                throw new IncorrectValueException();
            }

        } catch (IncorrectValueException e) {
            System.out.println("Введите новое значение стороны прямоугольника.Она должена быть положительным числом.");
            boolean flag = false;
            while (!flag) {
                Scanner scanner = new Scanner(System.in);
                String helpImput = scanner.next();
                try {
                    double newDouble = Double.parseDouble(helpImput);
                    System.out.println("Новое значение введено");
                    flag = true;
                    return newDouble;

                } catch (NumberFormatException n) {
                    System.out.println("Вы ввели не коректное значение . Попробуйте ещё раз");
                }
            }
        }
        return hDouble;
    }
}

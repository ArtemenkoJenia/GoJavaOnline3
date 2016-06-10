package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;

import ua.artemenko.student.goit.company.module_06.packageExcepcion.IncorrectValueException;

import java.util.Scanner;

public class CorrectionClass {

    public static double correction(double hDouble, String str) {
        double corectP = hDouble;
        try {
            if (corectP <= 0) {
                throw new IncorrectValueException("Не коректное значение параметра " + str);
            }
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
            corectP = correctionValue(corectP,str);
        }
        return corectP;
    }

    private static double correctionValue(double hDouble, String str){
        double newValue = hDouble;
        System.out.println("Введите новое значение ");
        boolean flag = false;
        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            String helpImput = scanner.next();
            try {
                newValue = Double.parseDouble(helpImput);
                System.out.println("Новое значение параметра " + str + " введёно");
                System.out.println("Новое значение параметра " + str + " равно " + newValue);
                flag = true;
            } catch (NumberFormatException n) {
                System.out.println("Вы ввели не коректное значение . Попробуйте ещё раз");
            }
        }
        return newValue;
    }
}

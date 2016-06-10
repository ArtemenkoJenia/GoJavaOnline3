package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;



public class Rectangle implements GeometricFigure {

    private double width;
    private double height;
    private String comment = "RECTANGLE";

    public Rectangle(double width, double height) {
        this.width = CorrectionClass.correction(width,comment);
        this.height = CorrectionClass.correction(height,comment);
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

//    private double corectProbe(double hDouble,String str) {
//        try {
//            if (hDouble <= 0) {
//                throw new IncorrectValueException("Не коректное значение");
//            }
//
//        } catch (IncorrectValueException e) {
//            System.out.println(e.getMessage());
//            System.out.println(str);
//            boolean flag = false;
//            while (!flag) {
//                Scanner scanner = new Scanner(System.in);
//                String helpImput = scanner.next();
//                try {
//                    double newDouble = Double.parseDouble(helpImput);
//                    System.out.println("Новое значение введено");
//                    flag = true;
//                    return newDouble;
//
//                } catch (NumberFormatException n) {
//                    System.out.println("Вы ввели не коректное значение . Попробуйте ещё раз");
//                }
//            }
//        }
//        return hDouble;
//    }
}

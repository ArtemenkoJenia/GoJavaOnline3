package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;


public class Circle implements GeometricFigure {

    private double radius;
    private String comment = "RADIUS";

    public Circle(double radius){
        this.radius = CorrectionClass.correction(radius,comment);
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

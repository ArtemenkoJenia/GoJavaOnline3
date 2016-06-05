package ua.artemenko.student.goit.company.module_04new;


public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String strHelpInput(){
        return "Площадь круга равна ";
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

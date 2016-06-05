package ua.artemenko.student.goit.company.module_04new;


public class Rectangle implements GeometricFigure{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String strHelpInput(){
        return "Площадь прямоугольника равна ";
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


}

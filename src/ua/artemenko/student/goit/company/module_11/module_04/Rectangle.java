package ua.artemenko.student.goit.company.module_11.module_04;


public class Rectangle implements GeometricFigure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width < 0)
            this.width = -width;
        else
            this.width = width;

        if (height < 0)
            this.height = -height;
        else
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

        try {
            if (width <= 0)
                throw new IllegalArgumentException();
            else
                this.width = width;
        } catch (IllegalArgumentException e) {
            System.out.println("width can not be negative");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        try {
            if (height <= 0)
                throw new IllegalArgumentException();
            else
                this.height = height;
        } catch (IllegalArgumentException e) {
            System.out.println("height can not be negative");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.width, width) != 0) return false;
        return Double.compare(rectangle.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

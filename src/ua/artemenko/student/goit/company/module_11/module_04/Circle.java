package ua.artemenko.student.goit.company.module_11.module_04;


public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius) {
        if (radius < 0)
            this.radius = -radius;
        else
            this.radius = radius;
    }

    @Override
    public String strHelpInput() {
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
        try {
            if (radius <= 0)
                throw new IllegalArgumentException();
            else
                this.radius = radius;
        } catch (IllegalArgumentException e) {
            System.out.println("radius can not be negative");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}

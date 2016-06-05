package ua.artemenko.student.goit.company.module_04new;


public class LineSegment{

    private Point one;
    private Point two;
    private double lengthSegment;

    public LineSegment(Point one, Point two) {
        this.one = one;
        this.two = two;
        lengthSegment = distanceBetweenTwoPoints(one, two);
    }

    public double distanceBetweenTwoPoints(Point one, Point two) {
        double x_2 = (two.getX() - one.getX()) * (two.getX() - one.getX());
        double y_2 = (two.getY() - one.getY()) * (two.getY() - one.getY());
        double distance = Math.sqrt(x_2 + y_2);
        return distance;
    }

    public Point getTwo() {
        return two;
    }

    public void setTwo(Point ob) {
        this.two = ob;
    }

    public Point getOne() {
        return one;
    }

    public void setOne(Point ob) {
        this.one = ob;
    }

    public double getLengthSegment() {
        return lengthSegment;
    }

    public void setLengthSegment(double lengthSegment) {
        this.lengthSegment = lengthSegment;
    }


}

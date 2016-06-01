package ua.artemenko.student.goit.company.modul_04;


public class LineSegment {

    private Point one;
    private Point two;
    private double lengthSegment;

    public LineSegment(Point one, Point two) {
        this.one = one;
        this.two = two;
        lengthSegment = Calculation.distanceBetweenTwoPoints(one, two);
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

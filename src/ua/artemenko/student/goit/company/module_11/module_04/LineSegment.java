package ua.artemenko.student.goit.company.module_11.module_04;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineSegment that = (LineSegment) o;

        if (Double.compare(that.lengthSegment, lengthSegment) != 0) return false;
        if (one != null ? !one.equals(that.one) : that.one != null) return false;
        return two != null ? two.equals(that.two) : that.two == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = one != null ? one.hashCode() : 0;
        result = 31 * result + (two != null ? two.hashCode() : 0);
        temp = Double.doubleToLongBits(lengthSegment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

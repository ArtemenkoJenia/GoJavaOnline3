package ua.artemenko.student.goit.company.module_11.module_04;


public class Triangle implements GeometricFigure {

    private LineSegment one;
    private LineSegment two;
    private LineSegment three;

    public Triangle(Point one, Point two, Point three) {
        this.one = new LineSegment(one, two);
        this.two = new LineSegment(two, three);
        this.three = new LineSegment(three, one);
    }

    @Override
    public String strHelpInput(){
        return "Площадь треугольника равна ";
    }

    @Override
    public double ariaFigure() {
        double halfPeriod = (one.getLengthSegment() + two.getLengthSegment() + three.getLengthSegment()) / 2;

        double area = Math.sqrt(halfPeriod *
                (halfPeriod - one.getLengthSegment()) *
                (halfPeriod - two.getLengthSegment()) *
                (halfPeriod - three.getLengthSegment()));
        return area;
    }

    public LineSegment getOne() {
        return one;
    }

    public void setOne(LineSegment ob) {
        this.one = ob;
    }

    public LineSegment getTwo() {
        return two;
    }

    public void setTwo(LineSegment ob) {
        this.two = ob;
    }

    public LineSegment getThree() {
        return three;
    }

    public void setThree(LineSegment ob) {
        this.three = ob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (one != null ? !one.equals(triangle.one) : triangle.one != null) return false;
        if (two != null ? !two.equals(triangle.two) : triangle.two != null) return false;
        return three != null ? three.equals(triangle.three) : triangle.three == null;

    }

    @Override
    public int hashCode() {
        int result = one != null ? one.hashCode() : 0;
        result = 31 * result + (two != null ? two.hashCode() : 0);
        result = 31 * result + (three != null ? three.hashCode() : 0);
        return result;
    }
}

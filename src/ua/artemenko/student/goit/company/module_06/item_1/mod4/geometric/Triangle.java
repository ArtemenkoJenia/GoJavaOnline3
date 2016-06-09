package ua.artemenko.student.goit.company.module_06.item_1.mod4.geometric;


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
        return "Площадь триугольника = ";
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


}

package ua.artemenko.student.goit.company.modul_04;


public class Triangle{

    private LineSegment one;
    private LineSegment two;
    private LineSegment three;

    public Triangle(Point one, Point two, Point three) {
        this.one = new LineSegment (one, two);
        this.two = new LineSegment (two, three);
        this.three = new LineSegment (three, one);
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

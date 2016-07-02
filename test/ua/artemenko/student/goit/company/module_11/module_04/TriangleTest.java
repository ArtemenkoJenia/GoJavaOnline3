package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private LineSegment one;
    private LineSegment two;
    private LineSegment three;

    @Before
    public void setUp() throws Exception {
        pointOne = new Point(3,5);
        pointTwo = new Point(-6,4);
        pointThree = new Point(9,-7);
        triangle = new Triangle(pointOne,pointTwo,pointThree);
        one = new LineSegment(pointOne,pointTwo);
        two = new LineSegment(pointTwo,pointThree);
        three = new LineSegment(pointThree,pointOne);

    }

    @Test
    public void strHelpInput() throws Exception {
        String str = "Площадь треугольника равна ";
        String result = triangle.strHelpInput();
        Assert.assertTrue(str.equals(result));
    }

    @Test
    public void ariaFigure() throws Exception {

        double halfPeriod = (one.getLengthSegment() + two.getLengthSegment() + three.getLengthSegment()) / 2;

        double areaTest = Math.sqrt(halfPeriod *
                (halfPeriod - one.getLengthSegment()) *
                (halfPeriod - two.getLengthSegment()) *
                (halfPeriod - three.getLengthSegment()));
        Assert.assertEquals(areaTest,triangle.ariaFigure(),1e-9);

    }
    @Test
    public void ariaFigurePosetive() throws Exception {
        double areaTest = triangle.ariaFigure();
        Assert.assertTrue(areaTest >= 0);
    }

    @Test
    public void getThree() throws Exception {
        LineSegment lineSegment = triangle.getThree();
        Assert.assertEquals(lineSegment,three);
    }

    @Test
    public void setThree() throws Exception {
        triangle.setThree(three);
        Assert.assertEquals(three,triangle.getThree());
    }

    @Test
    public void getTwo() throws Exception {
        LineSegment lineSegment = triangle.getTwo();
        Assert.assertEquals(lineSegment,two);
    }

    @Test
    public void setTwo() throws Exception {
        triangle.setTwo(two);
        Assert.assertEquals(two,triangle.getTwo());
    }

    @Test
    public void getOne() throws Exception {
        LineSegment lineSegment = triangle.getOne();
        Assert.assertEquals(lineSegment,one);
    }

    @Test
    public void setOne() throws Exception {
        triangle.setOne(one);
        Assert.assertEquals(one,triangle.getOne());
    }
}
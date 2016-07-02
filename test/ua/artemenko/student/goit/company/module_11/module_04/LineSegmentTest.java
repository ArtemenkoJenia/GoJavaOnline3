package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineSegmentTest {

    private LineSegment lineSegment;
    private Point one;
    private Point two;

    @Before
    public void setUp() throws Exception {
        one = new Point(-5,7);
        two = new Point(17,-6);
        lineSegment = new LineSegment(one,two);

    }

    @Test
    public void distanceBetweenTwoPoints() throws Exception {
        double x_2 = (two.getX() - one.getX()) * (two.getX() - one.getX());
        double y_2 = (two.getY() - one.getY()) * (two.getY() - one.getY());
        double distance = Math.sqrt(x_2 + y_2);

        Assert.assertEquals(distance,lineSegment.distanceBetweenTwoPoints(one,two),1e-9);
    }

    @Test
    public void distanceBetweenTwoPointsNegative() throws Exception {

        Assert.assertTrue(lineSegment.distanceBetweenTwoPoints(one,two)>=0);
    }

    @Test
    public void getTwo() throws Exception {
        Point point = lineSegment.getTwo();
        Assert.assertEquals(point,two);
    }

    @Test
    public void setTwo() throws Exception {
        lineSegment.setTwo(two);
        Assert.assertEquals(two,lineSegment.getTwo());
    }

    @Test
    public void getOne() throws Exception {
        Point point = lineSegment.getOne();
        Assert.assertEquals(point,one);
    }

    @Test
    public void setOne() throws Exception {
        lineSegment.setOne(one);
        Assert.assertEquals(one,lineSegment.getOne());
    }

    @Test
    public void getLengthSegment() throws Exception {
        double x_2 = (two.getX() - one.getX()) * (two.getX() - one.getX());
        double y_2 = (two.getY() - one.getY()) * (two.getY() - one.getY());
        double distance = Math.sqrt(x_2 + y_2);

        Assert.assertEquals(distance,lineSegment.getLengthSegment(),1e-9);
    }

    @Test
    public void getLengthSegmentNegative() throws Exception {
        double result = lineSegment.getLengthSegment();
        Assert.assertTrue(result >= 0);
    }
}
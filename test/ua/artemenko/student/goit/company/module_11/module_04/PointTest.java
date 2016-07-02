package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

    private Point point;
    private double testX = 3;
    private double testY = 5;

    @Before
    public void setUp() throws Exception {
        point = new Point(testX,testY);
    }

    @Test
    public void getX() throws Exception {
        double result = point.getX();
        Assert.assertEquals(testX,result,1e-9);
    }

    @Test
    public void setX() throws Exception {
        point.setX(7);
        Assert.assertEquals(point.getX(),7,1e-9);
    }

    @Test
    public void getY() throws Exception {
        double result = point.getY();
        Assert.assertEquals(testY,result,1e-9);
    }

    @Test
    public void setY() throws Exception {
        point.setY(-20);
        Assert.assertEquals(point.getY(),-20,1e-9);
    }

}
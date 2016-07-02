package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    private Circle circle;
    private double  radiusTest = 0;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(radiusTest);

    }

    @Test
    public void strHelpInput() throws Exception {
        String str = "Площадь круга равна ";
        String result = circle.strHelpInput();
        Assert.assertTrue(str.equals(result));
    }

    @Test
    public void ariaFigure() throws Exception {
        double areaTest = Math.PI * radiusTest * radiusTest;
        Assert.assertEquals(areaTest,circle.ariaFigure(),1e-9);
    }

    @Test
    public void ariaFigurePosetive() throws Exception {
        double areaTest = circle.ariaFigure();
        Assert.assertTrue(areaTest >= 0);
    }

    @Test
    public void getRadius() throws Exception {
        double result = circle.getRadius();
        Assert.assertEquals(radiusTest,result,1e-9);
    }
    @Test
    public void getRadiusNegative() throws Exception {
        double result = circle.getRadius();
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void setRadius() throws Exception {
        circle.setRadius(20);
        Assert.assertEquals(circle.getRadius(),20,1e-9);

    }

    @Test
    public void setRadiusNegative() throws Exception {
        circle.setRadius(-20);
        Assert.assertEquals(circle.getRadius(),radiusTest,1e-9);

    }

}
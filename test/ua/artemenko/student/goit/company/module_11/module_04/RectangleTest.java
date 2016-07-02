package ua.artemenko.student.goit.company.module_11.module_04;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    private Rectangle rectangle;
    private double widthTest;
    private double heightTest;

    @Before
    public void setUp() throws Exception {
        widthTest = 5;
        heightTest = 8;
        rectangle = new Rectangle(widthTest,heightTest);
    }

    @Test
    public void strHelpInput() throws Exception {
        String str = "Площадь прямоугольника равна ";
        String result = rectangle.strHelpInput();
        Assert.assertTrue(str.equals(result));
    }

    @Test
    public void ariaFigure() throws Exception {
        double area = heightTest * widthTest;
        Assert.assertEquals(area,rectangle.ariaFigure(),1e-9);
    }

    @Test
    public void ariaFigurePosetive() throws Exception {
        double areaTest = rectangle.ariaFigure();
        Assert.assertTrue(areaTest >= 0);
    }

    @Test
    public void getWidth() throws Exception {
        double result = rectangle.getWidth();
        Assert.assertEquals(widthTest,result,1e-9);
    }

    @Test
    public void getWidthNegative() throws Exception {
        double result = rectangle.getWidth();
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void setWidth() throws Exception {
        rectangle.setWidth(20);
        Assert.assertEquals(rectangle.getWidth(),20,1e-9);
    }

    @Test
    public void setWidthNegative() throws Exception {
        rectangle.setWidth(-20);
        Assert.assertEquals(rectangle.getWidth(),widthTest,1e-9);

    }

    @Test
    public void getHeight() throws Exception {
        double result = rectangle.getHeight();
        Assert.assertEquals(heightTest,result,1e-9);
    }

    @Test
    public void getHeightNegative() throws Exception {
        double result = rectangle.getHeight();
        Assert.assertTrue(result >= 0);
    }
    @Test
    public void setHeight() throws Exception {
        rectangle.setHeight(20);
        Assert.assertEquals(rectangle.getHeight(),20,1e-9);
    }

    @Test
    public void setHeightNegative() throws Exception {
        rectangle.setHeight(-20);
        Assert.assertEquals(rectangle.getHeight(),heightTest,1e-9);

    }

}
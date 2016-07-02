package ua.artemenko.student.goit.company.module_11.module_09.flower.comparator;

import org.junit.Assert;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.flower.Flower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.Rose;
import ua.artemenko.student.goit.company.module_11.module_09.flower.SizeFlower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.Tulip;

import static org.junit.Assert.*;

public class ComparatorSizeFlowerTest {
    @Test
    public void compare() throws Exception {
        Flower flower1 = new Tulip("BLUE", SizeFlower.Medium);
        Flower flower2 = new Tulip("BLUE", SizeFlower.Medium);
        ComparatorSizeFlower comparatorSizeFlower = new ComparatorSizeFlower();
        comparatorSizeFlower.compare(flower1,flower2);
        Assert.assertTrue(comparatorSizeFlower.compare(flower1,flower2)==0);
    }

    @Test
    public void compareLess() throws Exception {
        Flower flower1 = new Tulip("BLUE", SizeFlower.Small);
        Flower flower2 = new Rose("RED", SizeFlower.Medium);
        ComparatorSizeFlower comparatorSizeFlower = new ComparatorSizeFlower();
        comparatorSizeFlower.compare(flower1,flower2);
        Assert.assertTrue(comparatorSizeFlower.compare(flower1,flower2) < 0);
    }

    @Test
    public void compareMore() throws Exception {
        Flower flower1 = new Rose("RED", SizeFlower.Large);
        Flower flower2 = new Tulip("BLUE", SizeFlower.Medium);
        ComparatorSizeFlower comparatorSizeFlower = new ComparatorSizeFlower();
        comparatorSizeFlower.compare(flower1,flower2);
        Assert.assertTrue(comparatorSizeFlower.compare(flower1,flower2) > 0);
    }

}
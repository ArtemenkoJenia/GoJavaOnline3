package ua.artemenko.student.goit.company.module_11.module_09.flower.comparator;

import ua.artemenko.student.goit.company.module_11.module_09.flower.Flower;

import java.util.Comparator;

public class ComparatorColorFlower implements Comparator<Flower> {

    @Override
    public int compare(Flower ob1, Flower ob2) {
        return ob1.getColorFlower().compareTo(ob2.getColorFlower());
    }
}
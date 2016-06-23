package ua.artemenko.student.goit.company.module_09.flower.comparator;

import ua.artemenko.student.goit.company.module_09.flower.Flower;

import java.util.Comparator;

public class ComparatorNameFlower implements Comparator<Flower> {

    @Override
    public int compare(Flower ob1, Flower ob2) {
        return ob1.getNameFlower().compareTo(ob2.getNameFlower());

    }
}

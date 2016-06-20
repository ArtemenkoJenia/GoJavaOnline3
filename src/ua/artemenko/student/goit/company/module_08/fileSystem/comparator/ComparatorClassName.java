package ua.artemenko.student.goit.company.module_08.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_08.fileSystem.MyFile;

import java.util.Comparator;

public class ComparatorClassName implements Comparator<MyFile> {

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        return ob1.getNameClass().compareTo(ob2.getNameClass());
    }
}
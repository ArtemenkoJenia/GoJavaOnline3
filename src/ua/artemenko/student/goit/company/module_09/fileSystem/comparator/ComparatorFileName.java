package ua.artemenko.student.goit.company.module_09.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_09.fileSystem.MyFile;

import java.util.Comparator;

public class ComparatorFileName implements Comparator<MyFile> {

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        return ob1.getName().compareTo(ob2.getName());
    }
}


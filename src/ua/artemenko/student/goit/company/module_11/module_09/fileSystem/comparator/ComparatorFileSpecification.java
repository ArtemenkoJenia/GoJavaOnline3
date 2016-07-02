package ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;

import java.util.Comparator;

public class ComparatorFileSpecification implements Comparator<MyFile> {

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        return ob1.getSpecification().compareTo(ob2.getSpecification());
    }
}

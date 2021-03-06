package ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;

import java.util.Comparator;

public class ComparatorClassName implements Comparator<MyFile> {

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        return ob1.getNAME_CLASS().compareTo(ob2.getNAME_CLASS());
    }
}
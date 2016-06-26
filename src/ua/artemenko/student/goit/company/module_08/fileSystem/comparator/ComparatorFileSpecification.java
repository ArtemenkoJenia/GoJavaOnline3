package ua.artemenko.student.goit.company.module_08.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_08.fileSystem.File;

import java.util.Comparator;

public class ComparatorFileSpecification implements Comparator<File> {

    @Override
    public int compare(File ob1, File ob2) {
        return ob1.getSpecification().compareTo(ob2.getSpecification());
    }
}

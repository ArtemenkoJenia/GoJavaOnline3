package ua.artemenko.student.goit.company.module_08.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_08.fileSystem.File;

import java.util.Comparator;

public class ComparatorFileName implements Comparator<File> {

    @Override
    public int compare(File ob1, File ob2) {
        return ob1.getName().compareTo(ob2.getName());
    }
}


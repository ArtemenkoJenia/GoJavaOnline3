package ua.artemenko.student.goit.company.module_08.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_08.fileSystem.File;

import java.util.Comparator;

public class ComparatorFileSize implements Comparator<File> {

    @Override
    public int compare(File ob1, File ob2) {
        return ob1.getSize() - ob2.getSize();
    }
}

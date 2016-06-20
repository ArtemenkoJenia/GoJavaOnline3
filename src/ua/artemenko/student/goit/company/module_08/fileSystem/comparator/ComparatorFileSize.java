package ua.artemenko.student.goit.company.module_08.fileSystem.comparator;

import ua.artemenko.student.goit.company.module_08.fileSystem.MyFile;

import java.util.Comparator;

public class ComparatorFileSize implements Comparator<MyFile> {

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        return ob1.getSize() - ob2.getSize();
    }
}

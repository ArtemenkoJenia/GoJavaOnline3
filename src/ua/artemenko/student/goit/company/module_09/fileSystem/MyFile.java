package ua.artemenko.student.goit.company.module_09.fileSystem;

import ua.artemenko.student.goit.company.module_09.AbstractAuxiliary;
import ua.artemenko.student.goit.company.module_09.fileSystem.comparator.ComparatorClassName;
import ua.artemenko.student.goit.company.module_09.fileSystem.comparator.ComparatorFileName;
import ua.artemenko.student.goit.company.module_09.fileSystem.comparator.ComparatorFileSize;
import ua.artemenko.student.goit.company.module_09.fileSystem.comparator.ComparatorFileSpecification;

import java.util.Comparator;
import java.util.Formatter;

public class MyFile extends AbstractAuxiliary {

    protected String nameClass;
    protected String nameFile;
    protected int sizeFile;
    protected String specificationFile;

    private static int countLetterNameClass = 0;
    private static int countLetterNameFile = 0;
    private static int countSpecification = 0;
    private final int COLUMN_WIDTH_SIZE = 14;

    public static Comparator<MyFile> compar = new ComparatorClassName().thenComparing(new ComparatorFileName()).
            thenComparing(new ComparatorFileSize()).
            thenComparing(new ComparatorFileSpecification());

    public MyFile(String nameClass, String nameFile, int sizeFile, String specificationFile) {
        this.nameClass = nameClass;
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.specificationFile = specificationFile;
        SizeFileComponent(this.nameClass, this.nameFile, this.specificationFile);
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getName() {
        return nameFile;
    }

    public void setName(String name) {
        this.nameFile = name;
    }

    public int getSize() {
        return sizeFile;
    }

    public void setSize(int size) {
        this.sizeFile = size;
    }

    public String getSpecification() {
        return specificationFile;
    }

    public void setSpecification(String specification) {
        this.specificationFile = specification;
    }

    @Override
    protected void objectToStringBuilder() {
        Formatter form = new Formatter();
        form.format("|%" + countLetterNameClass + "s|%" +
                        countLetterNameFile + "s|%" +
                        COLUMN_WIDTH_SIZE + "sKB|%" +
                        countSpecification + "s|",
                nameClass, nameFile, sizeFile, specificationFile);
        objectToString = new StringBuffer(form.toString());
        form.close();
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }

        MyFile myFile = (MyFile) ob;

        if (sizeFile != myFile.sizeFile) {
            return false;
        }
        if ((nameFile != null) && (myFile.nameFile != null)) {
            return !nameFile.equals(myFile.nameFile);
        } else if (((nameFile == null) && (myFile.nameFile != null)) ||
                ((nameFile != null) && (myFile.nameFile == null))) {
            return false;
        }

        if ((specificationFile != null) && (myFile.specificationFile != null)) {
            return !specificationFile.equals(myFile.specificationFile);
        } else if (((specificationFile == null) && (myFile.specificationFile != null)) ||
                ((specificationFile != null) && (myFile.specificationFile == null))) {
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result = nameFile != null ? nameFile.hashCode() : 0;
        result = 31 * result + sizeFile;
        result = 31 * result + (specificationFile != null ? specificationFile.hashCode() : 0);
        return result;
    }

    private void SizeFileComponent(String nameClass, String nameFile, String specificationFile) {

        countLetterNameClass = countLetterNameClass < nameClass.length() ? nameClass.length() : countLetterNameClass;

        countLetterNameFile = countLetterNameFile < nameFile.length() ? nameFile.length() : countLetterNameFile;

        countSpecification = countSpecification < specificationFile.length() ? specificationFile.length() : countSpecification;
    }
}














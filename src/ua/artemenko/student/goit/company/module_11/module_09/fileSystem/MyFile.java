package ua.artemenko.student.goit.company.module_11.module_09.fileSystem;

import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorClassName;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileName;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileSize;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileSpecification;
import ua.artemenko.student.goit.company.module_11.module_09.subsidiary.AbstractAuxiliary;

import java.util.Comparator;
import java.util.Formatter;

public class MyFile extends AbstractAuxiliary {

    protected final String NAME_CLASS;
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
        this.NAME_CLASS = nameClass;
        setName(nameFile);
        setSize(sizeFile);
        setSpecification(specificationFile);
        SizeFileComponent(this.NAME_CLASS, this.nameFile, this.specificationFile);
    }

    public String getNAME_CLASS() {
        return NAME_CLASS;
    }

    public String getName() {

        return nameFile;
    }

    public void setName(String name) {
        if((name==null)||(name.equals(""))){
            this.nameFile = "New " + NAME_CLASS;
        }
        else{
            this.nameFile = name;
        }

    }

    public int getSize() {
        return sizeFile;
    }

    public void setSize(int size) {
        if(size < 0){
            this.sizeFile = 0;
        }
        else{
            this.sizeFile = size;
        }

    }

    public String getSpecification() {
        return specificationFile;
    }

    public void setSpecification(String specification) {
        if(specification==null){
            this.specificationFile = " ";
        }
        else{
            this.specificationFile = specification;
        }
    }

    @Override
    protected void objectToStringBuilder() {
        Formatter form = new Formatter();
        form.format("|%" + countLetterNameClass + "s|%" +
                        countLetterNameFile + "s|%" +
                        COLUMN_WIDTH_SIZE + "sKB|%" +
                        countSpecification + "s|",
                NAME_CLASS, nameFile, sizeFile, specificationFile);
        objectToString = form.toString();
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
            if(!nameFile.equals(myFile.nameFile)){
                return false;
            }
        } else if (((nameFile == null) && (myFile.nameFile != null)) ||
                ((nameFile != null) && (myFile.nameFile == null))) {
            return false;
        }

        if ((specificationFile != null) && (myFile.specificationFile != null)) {
            if(!specificationFile.equals(myFile.specificationFile)){
                return false;
            }
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














package ua.artemenko.student.goit.company.module_03.fileSystem;


public class MyFile {

    protected String nameFile;

    public  MyFile(String name){
        nameFile = name;
    }

    public String getName() {
        return nameFile;
    }

    public void setName(String name) {
        this.nameFile = name;
    }


}

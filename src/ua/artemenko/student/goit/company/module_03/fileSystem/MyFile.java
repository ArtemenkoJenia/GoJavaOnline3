package ua.artemenko.student.goit.company.module_03.fileSystem;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

public class MyFile implements AuxiliaryInterface {

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

    @Override
    public String toString()
    {
        return this.nameFile;
    }
}

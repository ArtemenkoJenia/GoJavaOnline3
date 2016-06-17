package ua.artemenko.student.goit.company.module_03.fileSystem;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

import java.util.Comparator;
import java.util.Formatter;

public class MyFile implements AuxiliaryInterface,Comparator<MyFile>{

    protected String nameFile;
    protected int sizeFile;
    protected String specificationFile;

    public  MyFile(String name,int size,String specification){
        nameFile = name;
        sizeFile = size;
        specificationFile = specification;

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
    public String toString()
    {
        Formatter form = new Formatter();
        form.format("|%12s|%12s|%12s|",nameFile,sizeFile + "KB",specificationFile);
        String s = form.toString();
        form.close();
        return s;
    }

    @Override
    public int compare(MyFile ob1, MyFile ob2) {
        
        Comparator<MyFile> comp = ((new Comparator<MyFile>() {
            @Override
            public int compare(MyFile ob1, MyFile ob2) {
                return ob1.getName().compareTo(ob2.getName());
            }
        }).thenComparing(new Comparator<MyFile>() {
            @Override
            public int compare(MyFile ob1, MyFile ob2) {
                return ob1.getSize() - ob2.getSize();
            }
        })).thenComparing(new Comparator<MyFile>(){
            @Override
            public int compare(MyFile ob1, MyFile ob2) {
                return ob1.getSpecification().compareTo(ob2.getSpecification());
            }
        });
        return comp.compare(ob1,ob2);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()){
            return false;
        }

        MyFile myFile = (MyFile) ob;

        if (sizeFile != myFile.sizeFile){
            return false;
        }
        if((nameFile != null)&&(myFile.nameFile != null)){
            return !nameFile.equals(myFile.nameFile);
        }else if(((nameFile == null)&&(myFile.nameFile != null))||
                ((nameFile != null)&&(myFile.nameFile == null))) {
            return false;
        }

        if((specificationFile != null)&&(myFile.specificationFile != null)){
            return !specificationFile.equals(myFile.specificationFile);
        }else if(((specificationFile == null)&&(myFile.specificationFile != null))||
                ((specificationFile != null)&&(myFile.specificationFile == null))) {
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

//
}

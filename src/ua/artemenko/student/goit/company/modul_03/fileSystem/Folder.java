package ua.artemenko.student.goit.company.modul_03.fileSystem;

import java.util.ArrayList;

public class Folder {

    private ArrayList<MyFile> listFile;

    public Folder() {
        listFile = new ArrayList<>();
    }

    public MyFile getFile(String name) {
        MyFile file = new MyFile();
        if(listFile.size() != 0){
            for(MyFile helpFile:listFile){
                if(name.equals(helpFile.getName())){
                    file = helpFile;
                    break;
                }
            }
        }
        return file;
    }

    public void setFile(MyFile file) {
        this.listFile.add(file);
    }

    public MyFile removeFile(int index) {
        MyFile file = listFile.get(index);
        return file;
    }



}

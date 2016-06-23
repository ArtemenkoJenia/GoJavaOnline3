package ua.artemenko.student.goit.company.module_09.fileSystem;

import java.util.ArrayList;

public class Folder {

    private ArrayList<MyFile> listFile;

    public Folder() {
        listFile = new ArrayList<>();
    }

    public void setFile(MyFile file) {
        this.listFile.add(file);
    }

    public void setAllFile(MyFile... file) {
        for (MyFile help:file){
            setFile(help);
        }
    }

    public void removeFile(MyFile file) {
        listFile.remove(file);
    }


}

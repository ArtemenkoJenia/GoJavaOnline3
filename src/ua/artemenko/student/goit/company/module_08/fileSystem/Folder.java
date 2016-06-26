package ua.artemenko.student.goit.company.module_08.fileSystem;

import java.util.ArrayList;

public class Folder {

    private ArrayList<File> listFile;

    public Folder() {
        listFile = new ArrayList<>();
    }

    public void setFile(File file) {
        this.listFile.add(file);
    }

    public void setAllFile(File... file) {
        for (File help:file){
            setFile(help);
        }
    }

    public void removeFile(File file) {
        listFile.remove(file);
    }


}

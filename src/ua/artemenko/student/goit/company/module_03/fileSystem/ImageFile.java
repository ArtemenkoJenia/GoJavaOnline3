package ua.artemenko.student.goit.company.module_03.fileSystem;


public class ImageFile extends MyFile {

    public ImageFile(String nameImageFile) {
        super(nameImageFile);
    }

    public void showImage() {
        System.out.println("Picture open");
    }

    public void closeImage() {
        System.out.println("Picture close");
    }
}

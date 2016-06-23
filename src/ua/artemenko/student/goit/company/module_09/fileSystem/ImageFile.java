package ua.artemenko.student.goit.company.module_09.fileSystem;


public class ImageFile extends MyFile {

    public ImageFile(String nameImageFile,int sizeImageFile,String specificationImageFile){
        super("ImageFile",nameImageFile,sizeImageFile,specificationImageFile);
    }

    public void showImage() {
        System.out.println("Picture open");
    }

    public void closeImage() {
        System.out.println("Picture close");
    }
}

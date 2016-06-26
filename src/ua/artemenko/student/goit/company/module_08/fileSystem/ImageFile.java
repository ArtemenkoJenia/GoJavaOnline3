package ua.artemenko.student.goit.company.module_08.fileSystem;


public class ImageFile extends File {

    public ImageFile(String nameClass,String nameImageFile,int sizeImageFile,String specificationImageFile){
        super(nameClass,nameImageFile,sizeImageFile,specificationImageFile);
    }

    public void showImage() {
        System.out.println("Picture open");
    }

    public void closeImage() {
        System.out.println("Picture close");
    }
}

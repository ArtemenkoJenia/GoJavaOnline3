package ua.artemenko.student.goit.company.module_08.fileSystem;



public class TextFile extends MyFile {

    private String text;

    public TextFile(String nameClass,String nameTextFile, int sizeTextFile, String specificationTextFile) {
        super(nameClass,nameTextFile, sizeTextFile, specificationTextFile);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

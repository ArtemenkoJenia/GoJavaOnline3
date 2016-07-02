package ua.artemenko.student.goit.company.module_11.module_09.fileSystem;


public class TextFile extends MyFile {

    private String text;

    public TextFile(String nameTextFile, int sizeTextFile, String specificationTextFile) {
        super("TextFile",nameTextFile, sizeTextFile, specificationTextFile);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

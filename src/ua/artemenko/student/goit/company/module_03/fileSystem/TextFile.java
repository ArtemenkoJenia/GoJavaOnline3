package ua.artemenko.student.goit.company.module_03.fileSystem;


public class TextFile extends MyFile {

    private String text;

    public TextFile(String nameTextFile){
        super(nameTextFile);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

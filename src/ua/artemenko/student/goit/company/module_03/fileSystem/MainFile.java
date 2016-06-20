package ua.artemenko.student.goit.company.module_03.fileSystem;

public class MainFile {
    public static void main(String[] args) {
        Folder folder = new Folder();
        AudioFile audioFile = new AudioFile("AudioFile",25756,".mp3");
        TextFile textFile = new TextFile("TextFile",235,".txt");
        ImageFile imageFile = new ImageFile("ImageFile",3675,".png");
        folder.setAllFile(audioFile,textFile,imageFile);

        audioFile.play();
        audioFile.stop();
        imageFile.showImage();
        imageFile.closeImage();
        textFile.setText("Это текстовый файл");
        System.out.println(textFile.getText());

    }
}

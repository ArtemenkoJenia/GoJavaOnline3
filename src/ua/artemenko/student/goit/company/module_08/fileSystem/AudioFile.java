package ua.artemenko.student.goit.company.module_08.fileSystem;


public class AudioFile extends File {

    public AudioFile(String nameClass,String nameAudioFile, int sizeAudioFile, String specificationAudioFile) {
        super(nameClass,nameAudioFile, sizeAudioFile, specificationAudioFile);

    }

    public void play() {
        System.out.println("Play music");
    }

    public void stop() {
        System.out.println("Stop music");
    }


}

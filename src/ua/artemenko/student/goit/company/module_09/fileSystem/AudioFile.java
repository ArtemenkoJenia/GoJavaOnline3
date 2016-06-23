package ua.artemenko.student.goit.company.module_09.fileSystem;


public class AudioFile extends MyFile {

    public AudioFile(String nameAudioFile, int sizeAudioFile, String specificationAudioFile) {
        super("AudioFile",nameAudioFile, sizeAudioFile, specificationAudioFile);
    }

    public void play() {
        System.out.println("Play music");
    }

    public void stop() {
        System.out.println("Stop music");
    }


}

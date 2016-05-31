package ua.artemenko.student.goit.company.modul_03.fileSystem;


public class AudioFile extends MyFile {

    public AudioFile(String nameAudioFile){
        super(nameAudioFile);
    }

    public void play() {
        System.out.println("Play music");
    }

    public void stop() {
        System.out.println("Stop music");
    }
}

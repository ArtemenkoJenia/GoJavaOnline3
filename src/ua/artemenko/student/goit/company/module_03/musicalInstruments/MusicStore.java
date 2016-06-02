package ua.artemenko.student.goit.company.module_03.musicalInstruments;


import java.util.ArrayList;
import java.util.List;

public class MusicStore {

    private List<MusicalInstrument> listMusicalInstrument;

    public MusicStore() {
        listMusicalInstrument = new ArrayList<>();
    }

    public MusicalInstrument getMusicalInstrument(String name) {
        MusicalInstrument file = null;
        if(listMusicalInstrument.size() != 0){
            for(MusicalInstrument helpFile:listMusicalInstrument){
                if(name.equals(helpFile.nameMusicalInstrument)){
                    file = helpFile;
                    return file;
                }
            }
        }
        else{
            System.out.println("Магазин пуст");
            return file;
        }
        return file;
    }

    public void setMusicalInstrument(MusicalInstrument file) {
        this.listMusicalInstrument.add(file);
    }

    public void setAllMusicalInstrument(MusicalInstrument... file) {
        for (MusicalInstrument help:file){
            setMusicalInstrument(help);
        }
    }

    public void removeMusicalInstrument(MusicalInstrument file) {
        listMusicalInstrument.remove(file);
    }
}

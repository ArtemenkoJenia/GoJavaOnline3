package ua.artemenko.student.goit.company.module_09.musicalInstruments.comparatorMusicInstrument;

import ua.artemenko.student.goit.company.module_09.musicalInstruments.MusicalInstrument;

import java.util.Comparator;

public class ComparatorMusic<T extends MusicalInstrument> implements Comparator<T>{
    @Override
    public int compare(T ob1, T ob2) {

        return ob1.getNameMusicalInstrument().compareTo(ob2.getNameMusicalInstrument());
    }
}

package ua.artemenko.student.goit.company.module_09.musicalInstruments.comparatorMusicInstrument;

import ua.artemenko.student.goit.company.module_09.musicalInstruments.MusicalInstrument;

import java.util.Comparator;

public class ComparatorInstrumentValue <T extends MusicalInstrument> implements Comparator<T> {
    @Override
    public int compare(T ob1, T ob2) {
        return (int)(ob1.getValueMusicalInstrument() - ob2.getValueMusicalInstrument());
    }
}
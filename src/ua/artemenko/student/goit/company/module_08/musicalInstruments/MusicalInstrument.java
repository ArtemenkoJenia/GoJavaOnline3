package ua.artemenko.student.goit.company.module_08.musicalInstruments;

import ua.artemenko.student.goit.company.module_08.subsidiary.AuxiliaryInterface;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.comparatorMusicInstrument.ComparatorInstrumentValue;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.comparatorMusicInstrument.ComparatorMusic;

import java.util.Comparator;
import java.util.Formatter;

public class MusicalInstrument implements AuxiliaryInterface {

    protected String nameMusicalInstrument;
    protected double valueMusicalInstrument;

    private static int countLetterNameMusicalInstrument = 0;
    private final int COLUMN_WIDTH_SIZE = 14;

    public static Comparator<MusicalInstrument> compar = new ComparatorMusic().
            thenComparing(new ComparatorInstrumentValue());

    public MusicalInstrument(String nameMusicalInstrument, double valueMusicalInstrument) {
        this.nameMusicalInstrument = nameMusicalInstrument;
        this.valueMusicalInstrument = valueMusicalInstrument;
        SizeFileComponent(nameMusicalInstrument);
    }

    public String getNameMusicalInstrument() {
        return nameMusicalInstrument;
    }

    public void setNameMusicalInstrument(String nameMusicalInstrument) {
        this.nameMusicalInstrument = nameMusicalInstrument;
    }

    public double getValueMusicalInstrument() {
        return valueMusicalInstrument;
    }

    public void setValueMusicalInstrument(double valueMusicalInstrument) {
        this.valueMusicalInstrument = valueMusicalInstrument;
    }

    public void SoundInstrument() {
    }

    @Override
    public String toString() {
        Formatter form = new Formatter();
        form.format("|%" + countLetterNameMusicalInstrument + "s|%" + COLUMN_WIDTH_SIZE + "s|", nameMusicalInstrument, valueMusicalInstrument);
        String s = form.toString();
        form.close();
        return s;

    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }

        MusicalInstrument myFile = (MusicalInstrument) ob;

        if (Double.compare(myFile.valueMusicalInstrument, valueMusicalInstrument) != 0) {
            return false;
        }
        if ((nameMusicalInstrument != null) && (myFile.nameMusicalInstrument != null)) {
            return !nameMusicalInstrument.equals(myFile.nameMusicalInstrument);
        } else if (((nameMusicalInstrument == null) && (myFile.nameMusicalInstrument != null)) ||
                ((nameMusicalInstrument != null) && (myFile.nameMusicalInstrument == null))) {
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result;
        result = nameMusicalInstrument != null ? nameMusicalInstrument.hashCode() : 0;
        result = 31 * result + (int) valueMusicalInstrument;
        return result;
    }

    private void SizeFileComponent(String nameMusicalInstrument) {

        countLetterNameMusicalInstrument =
                countLetterNameMusicalInstrument < nameMusicalInstrument.length() ? nameMusicalInstrument.length() : countLetterNameMusicalInstrument;
    }
}

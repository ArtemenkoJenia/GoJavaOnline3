package ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments;

import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.comparatorMusicInstrument.ComparatorInstrumentValue;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.comparatorMusicInstrument.ComparatorMusic;
import ua.artemenko.student.goit.company.module_11.module_09.subsidiary.AbstractAuxiliary;

import java.util.Comparator;
import java.util.Formatter;

public class MusicalInstrument extends AbstractAuxiliary {

    protected String nameMusicalInstrument;
    protected double valueMusicalInstrument;

    private static int countLetterNameMusicalInstrument = 0;
    private final int COLUMN_WIDTH_SIZE = 14;

    public static Comparator<MusicalInstrument> compar = new ComparatorMusic().
            thenComparing(new ComparatorInstrumentValue());

    public MusicalInstrument(String nameMusicalInstrument, double valueMusicalInstrument) {
        setNameMusicalInstrument(nameMusicalInstrument);
        this.valueMusicalInstrument = valueMusicalInstrument;
        SizeFileComponent(this.nameMusicalInstrument);
    }

    public String getNameMusicalInstrument() {
        return nameMusicalInstrument;
    }

    public void setNameMusicalInstrument(String nameMusicalInstrument) {
        if((nameMusicalInstrument==null)||(nameMusicalInstrument.equals(""))){
            this.nameMusicalInstrument = "NotName";
        }
        else{
            this.nameMusicalInstrument = nameMusicalInstrument;
        }
    }

    public double getValueMusicalInstrument() {
        return valueMusicalInstrument;
    }

    public void setValueMusicalInstrument(double valueMusicalInstrument) {
        if(valueMusicalInstrument < 0){
            this.valueMusicalInstrument = 0;
        }
        else{
            this.valueMusicalInstrument = valueMusicalInstrument;
        }

    }

    public void SoundInstrument() {
    }
    @Override
    protected void objectToStringBuilder() {
        Formatter form = new Formatter();
        form.format("|%" + countLetterNameMusicalInstrument + "s|%" + COLUMN_WIDTH_SIZE + "s|", nameMusicalInstrument, valueMusicalInstrument);
        objectToString = form.toString();
        form.close();
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
            if(!nameMusicalInstrument.equals(myFile.nameMusicalInstrument)){
                return false;
            }
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

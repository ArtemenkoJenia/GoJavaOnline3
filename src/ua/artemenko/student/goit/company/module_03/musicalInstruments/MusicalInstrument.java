package ua.artemenko.student.goit.company.module_03.musicalInstruments;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

import java.util.Formatter;

public class MusicalInstrument implements AuxiliaryInterface {

    protected String nameMusicalInstrument;
    protected double valueMusicalInstrument;

    public MusicalInstrument(String nameMusicalInstrument, double valueMusicalInstrument) {
        this.nameMusicalInstrument = nameMusicalInstrument;
        this.valueMusicalInstrument = valueMusicalInstrument;
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
        form.format("|%12s|%12s|", nameMusicalInstrument, valueMusicalInstrument);
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

        if (Double.compare(myFile.valueMusicalInstrument, valueMusicalInstrument) != 0){
            return false;
        }
        if((nameMusicalInstrument != null)&&(myFile.nameMusicalInstrument != null)){
            return !nameMusicalInstrument.equals(myFile.nameMusicalInstrument);
        }else if(((nameMusicalInstrument == null)&&(myFile.nameMusicalInstrument != null))||
                ((nameMusicalInstrument != null)&&(myFile.nameMusicalInstrument == null))) {
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameMusicalInstrument != null ? nameMusicalInstrument.hashCode() : 0;
        temp = Double.doubleToLongBits(valueMusicalInstrument);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

package ua.artemenko.student.goit.company.modul_03.musicalInstruments;


public class MusicalInstrument {

    protected String nameMusicalInstrument;
    protected double valueMusicalInstrument;

    public MusicalInstrument(String nameMusicalInstrument,double valueMusicalInstrument){
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

    public void SoundInstrument(){
    }

}

package ua.artemenko.student.goit.company.module_03.musicalInstruments;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

public class MusicalInstrument implements AuxiliaryInterface {

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

    @Override
    public String toString()
    {
        return this.nameMusicalInstrument + "  " + this.valueMusicalInstrument;
    }

}

package ua.artemenko.student.goit.company.module_08.musicalInstruments;


public class Piano extends MusicalInstrument {

    public Piano(String namePiano,double valuePiano){
        super(namePiano,valuePiano);
    }

    public void SoundInstrument(){
        System.out.println("Звук пианино");

    }
}

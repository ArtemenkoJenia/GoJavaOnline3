package ua.artemenko.student.goit.company.modul_03.musicalInstruments;


public class Piano extends MusicalInstrument{

    public Piano(String namePiano,double valuePiano){
        super(namePiano,valuePiano);
    }

    public void SoundInstrument(){
        System.out.println("Звук пианино");

    }
}

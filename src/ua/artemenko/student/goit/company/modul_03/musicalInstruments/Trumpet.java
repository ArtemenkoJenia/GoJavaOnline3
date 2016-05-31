package ua.artemenko.student.goit.company.modul_03.musicalInstruments;


public class Trumpet extends MusicalInstrument{

    public Trumpet(String nameTrumpet,double valueTrumpet){
        super(nameTrumpet,valueTrumpet);
    }

    public void SoundInstrument(){
        System.out.println("Звук трубы");

    }
}

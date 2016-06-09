package ua.artemenko.student.goit.company.module_06.item_2.musicalInstruments;


public class Piano extends MusicalInstrument {

    public Piano(String namePiano,double valuePiano){
        super(namePiano,valuePiano);
    }

    public void SoundInstrument(){
        System.out.println("Звук пианино");

    }
}

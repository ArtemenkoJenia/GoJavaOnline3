package ua.artemenko.student.goit.company.module_03.musicalInstruments;


public class MainMusicInstrument {
    public static void main(String[] args) {

        Guiter guiter = new Guiter("Guiter",25.5);
        Trumpet trumpet = new Trumpet("Trumpet",1200.0);
        Piano piano = new Piano("Piano",5000.0);

        MusicStore musicStore = new MusicStore();
        musicStore.setAllMusicalInstrument(guiter,trumpet,piano);
        MusicalInstrument instrument;

        try {
            instrument = musicStore.getMusicalInstrument("Guiter");
            instrument.SoundInstrument();
            System.out.println("Стоимость " + instrument.valueMusicalInstrument);
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Такой инструмент не найден");
        }

        try {
            instrument = musicStore.getMusicalInstrument("Piano");
            instrument.SoundInstrument();
            System.out.println("Стоимость " + instrument.valueMusicalInstrument);
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Такой инструмент не найден");
        }

        try {
            instrument = musicStore.getMusicalInstrument("Trumpet");
            instrument.SoundInstrument();
            System.out.println("Стоимость " + instrument.valueMusicalInstrument);
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("Такой инструмент не найден");
        }
    }
}

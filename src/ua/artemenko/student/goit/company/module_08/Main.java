package ua.artemenko.student.goit.company.module_08;

import ua.artemenko.student.goit.company.module_08.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_08.fileSystem.ImageFile;
import ua.artemenko.student.goit.company.module_08.fileSystem.MyFile;
import ua.artemenko.student.goit.company.module_08.fileSystem.TextFile;
import ua.artemenko.student.goit.company.module_08.flower.*;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.Guiter;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.MusicalInstrument;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.Piano;
import ua.artemenko.student.goit.company.module_08.musicalInstruments.Trumpet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<MyFile> collectionFile =
                new ArrayList<>(Arrays.asList(new AudioFile("AudioFile","Metallica - Ride The Lightning", 5756, ".mp3"),
                                            new AudioFile("AudioFile","Ultimate Oceans - Watching You...", 55756, ".aac"),
                                            new AudioFile("AudioFile","Ultimate Oceans - Galaxies", 5556, ".ffr"),
                                            new AudioFile("AudioFile","Ultimate Oceans - Galaxies", 5556, ".aac"),
                                            new AudioFile("AudioFile","Wavestar - Voyager", 7756, ".aac"),
                                            new AudioFile("AudioFile","Wavestar - Cabala", 9756, ".mp3"),
                                            new AudioFile("AudioFile","Ariana Grande - Into You", 3756, ".FLAC"),
                                            new TextFile("TextFile","Statement", 235, ".txt"),
                                            new TextFile("TextFile","Statement", 235, ".doc"),
                                            new TextFile("TextFile","Statement", 555, ".txt"),
                                            new TextFile("TextFile","Application", 235, ".txt"),
                                            new TextFile("TextFile","TextFile", 235, ".doc"),
                                            new ImageFile("ImageFile","Foto", 5675, ".jpg"),
                                            new ImageFile("ImageFile","Image", 8675, ".png"),
                                            new ImageFile("ImageFile","Image", 10675, ".png"),
                                            new ImageFile("ImageFile","Image", 10675, ".ai"),
                                            new ImageFile("ImageFile","Picture", 3675, ".png"),
                                            new ImageFile("ImageFile","Picture", 3675, ".png")));
        SortCollection.insertSortArray(collectionFile,MyFile.compar);


        List<Flower> collectionFlower =
                new ArrayList<>(Arrays.asList(new Rose("Rose", "RED", SizeFlower.Large),
                                            new Rose("Rose", "YELLOW", SizeFlower.Large),
                                            new Rose("Rose", "WHITE", SizeFlower.Large),
                                            new Rose("Rose", "BLUE", SizeFlower.Large),
                                            new Rose("Rose", "BLACK", SizeFlower.Large),
                                            new Rose("Rose", "PINK", SizeFlower.Large),
                                            new Tulip("Tulip", "BLUE", SizeFlower.Small),
                                            new Chamomile("Chamomile", "WHITE", SizeFlower.Medium),
                                            new Aster("Aster", "WHITE", SizeFlower.Large)));
        SortCollection.insertSortArray(collectionFlower,Flower.compar);


        List<MusicalInstrument> collectionInstrument =
                new ArrayList<>(Arrays.asList(new Guiter("Guiter", 25.5),
                                            new Trumpet("Trumpet", 1200.0),
                                            new Trumpet("Trumpet", 1300.0),
                                            new Trumpet("Trumpet", 1200.0),
                                            new Piano("Piano", 5300.0),
                                            new Piano("Piano", 4000.0),
                                            new Piano("Piano", 800.0),
                                            new Piano("Piano", 5000.0)));
        SortCollection.insertSortArray(collectionInstrument,MusicalInstrument.compar);



        PrintCollection printCollection = new PrintCollection();
        printCollection.printList(collectionFile);
        printCollection.printList(collectionFlower);
        printCollection.printList(collectionInstrument);

        Map<String, List<? extends MyAuxiliaryInterface>> setList = new HashMap<>();
        setList.put("File", collectionFile);
        setList.put("Flower", collectionFlower);
        setList.put("MusicalInstrument", collectionInstrument);
        printCollection.printMap(setList);

    }
}

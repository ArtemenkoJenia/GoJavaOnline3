package ua.artemenko.student.goit.company.module_08;

import ua.artemenko.student.goit.company.module_03.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_03.fileSystem.ImageFile;
import ua.artemenko.student.goit.company.module_03.fileSystem.TextFile;
import ua.artemenko.student.goit.company.module_03.flower.*;
import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;
import ua.artemenko.student.goit.company.module_03.musicalInstruments.Guiter;
import ua.artemenko.student.goit.company.module_03.musicalInstruments.Piano;
import ua.artemenko.student.goit.company.module_03.musicalInstruments.Trumpet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        AudioFile audioFile = new AudioFile("AudioFile",25756,".mp3");
        AudioFile audioFile1 = new AudioFile("AudioFile",55756,".mp3");
        TextFile textFile = new TextFile("TextFile",235,".txt");
        ImageFile imageFile = new ImageFile("ImageFile",3675,".png");
        List<AuxiliaryInterface> collectionFile = new ArrayList<>(Arrays.asList(audioFile1,audioFile,textFile,imageFile));

        Rose roseOne = new Rose("Rose","RED", SizeFlower.Large);
        Tulip tulip = new Tulip("Tulip","BLUE",SizeFlower.Small);
        Chamomile chamomile = new Chamomile("Chamomile","WHITE",SizeFlower.Medium);
        Aster aster = new Aster("Aster","WHITE",SizeFlower.Large);
        List<AuxiliaryInterface> collectionFlower = new ArrayList<>(Arrays.asList(roseOne,tulip,chamomile,aster));

        Guiter guiter = new Guiter("Guiter",25.5);
        Trumpet trumpet = new Trumpet("Trumpet",1200.0);
        Piano piano = new Piano("Piano",5000.0);
        List<AuxiliaryInterface> collectionInstrument = new ArrayList<>(Arrays.asList(guiter, trumpet, piano));

        List<AuxiliaryInterface> collection = new ArrayList<>(Arrays.asList(audioFile, tulip, piano));

        Map<String,List<AuxiliaryInterface>> mapList = new HashMap<>();
        mapList.put("File",collectionFile);
        mapList.put("Flower",collectionFlower);
        mapList.put("Instrument",collectionInstrument);

        PrintCollection printCollection = new PrintCollection();
        printCollection.printList(collectionFile);
        printCollection.printList(collectionFlower);
        printCollection.printList(collectionInstrument);
        printCollection.printList(collection);

        printCollection.printMap(mapList);
    }
}

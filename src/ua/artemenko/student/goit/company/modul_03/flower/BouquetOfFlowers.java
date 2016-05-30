package ua.artemenko.student.goit.company.modul_03.flower;


import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowers {

    private List<Flower> bouquetOfFlowers;

    public BouquetOfFlowers(){
        bouquetOfFlowers = new ArrayList<>();
    }

    public void removeFlowersInBouquet(String nameFlower) {
        if(fullBouquet()){
            for(Flower helpFile:bouquetOfFlowers){
                if(nameFlower.equals(helpFile.getName())){
                    bouquetOfFlowers.remove(helpFile);
                    return;
                }
            }
        }
        else{
            System.out.println("Букет не собран");
            return;
        }
        System.out.println("Нет такого цветка в букете");
    }

    public void addFlowers(Flower flower) {
        this.bouquetOfFlowers.add(flower);
    }

    public void addAllFlowers(Flower... flower) {
        for (Flower help:flower){
            addFlowers(help);
        }
    }

    public List<Flower> getBouquetOfFlowers() {
        return bouquetOfFlowers;
    }

    public List<Flower> getAllFlowersWithName(String nameFlower) {
        List<Flower> listReturnFlower = new ArrayList<>();
        if(fullBouquet()){
            for(Flower helpFile:bouquetOfFlowers){
                if(nameFlower.equals(helpFile.getName())){
                    listReturnFlower.add(helpFile);
                }
            }
        }
        else{
            System.out.println("Букет не собран");

        }

        return listReturnFlower;
    }

    public boolean fullBouquet(){
        if(bouquetOfFlowers.size() != 0) {
            return true;
        }
            else {
                return false;
            }
    }

}
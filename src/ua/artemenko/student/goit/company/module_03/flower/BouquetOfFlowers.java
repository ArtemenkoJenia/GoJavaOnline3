package ua.artemenko.student.goit.company.module_03.flower;


import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowers {

    private List<Flower> bouquetOfFlowers;

    public BouquetOfFlowers(){
        bouquetOfFlowers = new ArrayList<>();
    }

    public void removeFlowersInBouquet(String name) {
        if(fullBouquet()){
            for(Flower helpFile:bouquetOfFlowers){
                if(name.equals(helpFile.nameFlower)){
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

    public List<Flower> getAllFlowersWithName(String name) {
        List<Flower> listReturnFlower = new ArrayList<>();
        if(fullBouquet()){
            for(Flower helpFile:bouquetOfFlowers){
                if(name.equals(helpFile.nameFlower)){
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

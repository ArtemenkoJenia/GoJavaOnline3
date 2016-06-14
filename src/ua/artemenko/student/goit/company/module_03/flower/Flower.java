package ua.artemenko.student.goit.company.module_03.flower;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

public class Flower implements AuxiliaryInterface {


    protected String nameFlower;
    protected String colorFlower;
    protected SizeFlower sizeFlower;

    public Flower(String name,String color,SizeFlower size){
        this.nameFlower = name;
        this.colorFlower = color;
        this.sizeFlower = size;
    }

    public SizeFlower getSizeFlower() {
        return sizeFlower;
    }

    public void setSizeFlower(SizeFlower sizeFlower) {
        this.sizeFlower = sizeFlower;
    }

    public String getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(String colorFlower) {
        this.colorFlower = colorFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    @Override
    public String toString()
    {
        return this.nameFlower + "  " + this.colorFlower + "  " + sizeFlower.toString();
    }
}

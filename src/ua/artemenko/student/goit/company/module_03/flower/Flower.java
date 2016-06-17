package ua.artemenko.student.goit.company.module_03.flower;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

import java.util.Formatter;

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
        Formatter form = new Formatter();
        form.format("|%12s|%12s|%12s|",nameFlower,colorFlower,sizeFlower.toString());
        String s = form.toString();
        form.close();
        return s;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;

        Flower flower = (Flower) ob;
        if((nameFlower != null)&&(flower.nameFlower != null)){
            return !nameFlower.equals(flower.nameFlower);
        }else if(((nameFlower == null)&&(flower.nameFlower != null))||
                ((nameFlower != null)&&(flower.nameFlower == null))) {
            return false;
        }
        if((colorFlower != null)&&(flower.colorFlower != null)){
            return !colorFlower.equals(flower.colorFlower);
        }else if(((colorFlower == null)&&(flower.colorFlower != null))||
                ((colorFlower != null)&&(flower.colorFlower == null))) {
            return false;
        }
        return sizeFlower == flower.sizeFlower;

    }

    @Override
    public int hashCode() {
        int result = nameFlower != null ? nameFlower.hashCode() : 0;
        result = 31 * result + (colorFlower != null ? colorFlower.hashCode() : 0);
        result = 31 * result + (sizeFlower != null ? sizeFlower.hashCode() : 0);
        return result;
    }
}

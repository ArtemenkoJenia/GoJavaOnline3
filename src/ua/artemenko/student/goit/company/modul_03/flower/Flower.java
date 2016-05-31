package ua.artemenko.student.goit.company.modul_03.flower;


public class Flower {


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


}
enum SizeFlower{
    Small, Medium, Large
}

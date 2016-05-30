package ua.artemenko.student.goit.company.modul_03.flower;


public class Flower {


    private String name;
    private String color;
    private SizeFlower size;

    public Flower(String name,String color,SizeFlower size){
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public SizeFlower getSize() {
        return size;
    }

    public void setSize(SizeFlower size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
enum SizeFlower{
    Small, Medium, Large
}

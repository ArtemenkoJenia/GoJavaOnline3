package ua.artemenko.student.goit.company.module_09.flower;


import java.util.ArrayList;
import java.util.List;

public class RoseBush {

    private List<Rose> roseBush;

    public RoseBush(int countRose, String color, SizeFlower size) {
        roseBush = new ArrayList<>(countRose);
        for (int i = 0; i < countRose; i++) {
            roseBush.add(new Rose(color, size));
        }
    }

    public List<Rose> getRoseBush() {
        return roseBush;
    }

    public void setRoseBush(List<Rose> roseBush) {
        this.roseBush = roseBush;
    }

}

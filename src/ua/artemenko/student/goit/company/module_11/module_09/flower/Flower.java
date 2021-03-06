package ua.artemenko.student.goit.company.module_11.module_09.flower;


import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorColorFlower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorNameFlower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorSizeFlower;
import ua.artemenko.student.goit.company.module_11.module_09.subsidiary.AbstractAuxiliary;

import java.util.Comparator;
import java.util.Formatter;

public class Flower extends AbstractAuxiliary {


    protected String nameFlower;
    protected String colorFlower;
    protected SizeFlower sizeFlower;


    private static int countLetterNameFlower = 0;
    private static int countLetterColorFlower = 0;
    private static int countLetterSizeFlower = 0;


    public static Comparator<Flower> compar = new ComparatorNameFlower().
                                                        thenComparing(new ComparatorColorFlower()).
                                                        thenComparing(new ComparatorSizeFlower());

    public Flower(String name,String color,SizeFlower size){
        setNameFlower(name);
        setColorFlower(color);
        setSizeFlower(size);
        SizeFileComponent(this.nameFlower,this.colorFlower,this.sizeFlower.toString());
    }

    public SizeFlower getSizeFlower() {
        return sizeFlower;
    }

    public void setSizeFlower(SizeFlower sizeFlower) {
        if(sizeFlower==null){
            this.sizeFlower = SizeFlower.Small;
        }
        else{
            this.sizeFlower = sizeFlower;
        }

    }

    public String getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(String colorFlower) {
        if((colorFlower==null)||(colorFlower.equals(""))){
            this.colorFlower = "NotColor";
        }
        else{
            this.colorFlower = colorFlower;
        }

    }

    public String getNameFlower() {

        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        if((nameFlower==null)||(nameFlower.equals(""))){
            this.nameFlower = "NotName";
        }
        else{
            this.nameFlower = nameFlower;
        }

    }

    @Override
    protected void objectToStringBuilder() {
        Formatter form = new Formatter();
        form.format("|%" + countLetterNameFlower + "s|%" + countLetterColorFlower + "s|%" + countLetterSizeFlower + "s|",
                nameFlower,colorFlower,sizeFlower.toString());
        objectToString = form.toString();
        form.close();

    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;

        Flower flower = (Flower) ob;
        if((nameFlower != null)&&(flower.nameFlower != null)){
            if(!nameFlower.equals(flower.nameFlower)){
                return false;
            }
        }else if(((nameFlower == null)&&(flower.nameFlower != null))||
                ((nameFlower != null)&&(flower.nameFlower == null))) {
            return false;
        }
        if((colorFlower != null)&&(flower.colorFlower != null)){
            if(!colorFlower.equals(flower.colorFlower)){
                return false;
            }
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

    private void SizeFileComponent(String nameFlower, String colorFlower, String sizeFlower) {

        countLetterNameFlower = countLetterNameFlower < nameFlower.length() ? nameFlower.length() : countLetterNameFlower;

        countLetterColorFlower = countLetterColorFlower < colorFlower.length() ? colorFlower.length() : countLetterColorFlower;

        countLetterSizeFlower = countLetterSizeFlower < sizeFlower.length() ? sizeFlower.length() : countLetterSizeFlower;
    }
}

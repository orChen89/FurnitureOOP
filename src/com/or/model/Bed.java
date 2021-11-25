package com.or.model;

public class Bed extends Furniture implements detailsAndShape{

    private boolean isDoubleBed;

    public Bed(int length, int width, int height, FurnitureColor color, boolean isDoubleBed) {
        super(length, width, height, color);
        this.isDoubleBed = isDoubleBed;
    }

    public Bed() {
    }

    @Override
    public void display() {

        System.out.println("This Bed details are: " + "\n" +
                "                \"isDoubleBed = " + isDoubleBed +"\n" +
                "                \", length = " + length + " cm " +  "\n" +
                "                \", width = " + width +  " cm " + "\n" +
                "                \", height = " + height +  " cm " + "\n" +
                "                \", color = " + color + "\n" +
                "                ");
    }

    @Override
    public void draw() {

        System.out.println("   ||");
        System.out.println("   ||                   ||");
        System.out.println("||/||___                ||");
        System.out.println("|| /`   )____________||_/|");
        System.out.println("||/___ //_/_/_/_/_/_/||/ |");
        System.out.println("||(___)/_/_/_/_/_/_/_||  |");
        System.out.println("||     |_|_|_|_|_|_|_|| /|");
        System.out.println("||     | | | | | | | ||/||");
        System.out.println("||~~~~~~~~~~~~~~~~~~~||");
        System.out.println("||                   ||");


    }

    public boolean isDoubleBed() {
        return isDoubleBed;
    }

    public void setDoubleBed(boolean doubleBed) {
        isDoubleBed = doubleBed;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "isDoubleBed=" + isDoubleBed +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}

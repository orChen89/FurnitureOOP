package com.or.model;

public class Chair extends Furniture implements detailsAndShape {

    private int legNumber;

    public Chair(int length, int width, int height, FurnitureColor color, int legNumber) {
        super(length, width, height, color);
        this.legNumber = legNumber;
    }

    public Chair() {
    }

    @Override
    public void display() {

        System.out.println("This Chair's details are: " + "legNumber = " + legNumber + "\n" +
                "                \", length = " + length + " cm " + "\n" +
                "                \", width = " + width + " cm " + "\n" +
                "                \", height = " + height +  " cm " + "\n" +
                "                \", color = " + color + "\n" +
                "                ");
    }

    @Override
    public void draw() {

        System.out.println("  i______i");
        System.out.println("  I______I");
        System.out.println("  I      I");
        System.out.println("  I______I");
        System.out.println(" /      /I");
        System.out.println("(______( I");
        System.out.println("I I    I I");
        System.out.println("I      I");

    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legNumber=" + legNumber +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}

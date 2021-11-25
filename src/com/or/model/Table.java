package com.or.model;

public class Table extends Furniture implements detailsAndShape{

    private int numOfSeats;
    public Table(int length, int width, int height, FurnitureColor color, int numOfSeats) {
        super(length, width, height, color);
        this.numOfSeats = numOfSeats;
    }

    public Table() {
    }

    @Override
    public void display() {

        System.out.println("This Table details are: " + "length = " + length + "\n "+
                "                \", width = " + width +  " cm " + "\n" +
                "                \", height = " + height +  " cm " + "\n" +
                "                \", color = " + color + "\n" +
                "                \", numOfSeats = " + numOfSeats + "\n" +
                "                ");

    }

    @Override
    public void draw() {

        System.out.println("   =====================");
        System.out.println("  /                   /");
        System.out.println(" /                   /|");
        System.out.println("===================== |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");


    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Table{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                ", numOfSeats=" + numOfSeats +
                '}';
    }

}

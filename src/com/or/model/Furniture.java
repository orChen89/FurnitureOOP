package com.or.model;

interface detailsAndShape{

    void display();

    void draw();

}

enum FurnitureColor{

    BLACK,WHITE,YELLOW,RED,BLUE,BROWN,GREEN

}

public class Furniture implements detailsAndShape {

    protected int length;
    protected int width;
    protected int height;
    protected FurnitureColor color;

    public Furniture(int length, int width, int height, FurnitureColor color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Furniture() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FurnitureColor getColor() {
        return color;
    }

    public void setColor(FurnitureColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }

    @Override
    public void display() {

    }

    @Override
    public void draw() {

    }
}

package com.or.model;

public class Main {

    public static void main(String[] args) {

        FurnitureFactory fFactory = new FurnitureFactory();
        Furniture[] furnitures = new Furniture[20];

        for (int i = 0; i < furnitures.length; i++) {
            furnitures[i] = fFactory.createFurniture();
            furnitures[i].display();
            furnitures[i].draw();
            }

        for (int i = 0; i < furnitures.length; i++) {

            if (furnitures[i] instanceof Chair) {
               ((Chair) furnitures[i]).getLegNumber();
                System.out.println("The Chair's Number of legs: " + ((Chair) furnitures[i]).getLegNumber());

            } else if (furnitures[i] instanceof Table) {
                ((Table) furnitures[i]).getNumOfSeats();
                System.out.println("The Table's number of seats: " + ((Table) furnitures[i]).getNumOfSeats());

            } else if (furnitures[i] instanceof Bed) {
                ((Bed) furnitures[i]).isDoubleBed();
                System.out.println("Is The Bed a double bed: " + ((Bed) furnitures[i]).isDoubleBed());
            }
        }
    }
}



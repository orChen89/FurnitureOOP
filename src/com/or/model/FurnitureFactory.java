package com.or.model;

import java.util.Random;

public class FurnitureFactory {

    public static FurnitureColor generateRandomColor() {

        FurnitureColor[] values = FurnitureColor.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

    public Furniture createFurniture() {

        Furniture furniture = new Furniture();
        Random r = new Random();
        int randomType = r.nextInt(3);

        if (randomType == 1) {
            furniture = new Chair(r.nextInt(70), r.nextInt(60), r.nextInt(100),generateRandomColor(),r.nextInt(4));

        } else if (randomType == 2) {
            furniture = new Table(r.nextInt(300), r.nextInt(70), r.nextInt(150),generateRandomColor(),r.nextInt(8));

        } else  {
            furniture = new Bed(r.nextInt(220), r.nextInt(180), r.nextInt(100),generateRandomColor(),r.nextBoolean());

        }
        return furniture;
    }
}
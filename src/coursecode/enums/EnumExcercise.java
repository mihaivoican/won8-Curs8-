package org.fasttrackit.enums;

import java.util.Scanner;

public class EnumExcercise {
    public static void main(String[] args) {
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints north2 = CardinalPoints.NORTH;

        System.out.println(north.getSymbol());

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        CardinalPoints fromKeyboard = CardinalPoints.valueOf(s);
        System.out.println(String.format("your cardinal point has the symbol: %s", fromKeyboard.getSymbol()));
        switch (fromKeyboard) {
            case NORTH -> System.out.println("go up");
            case SOUTH -> System.out.println("go down");
            case EAST -> System.out.println("go right");
            case WEST -> System.out.println("go left");
        }

        System.out.println("Enter a cardinal symbol:");
        String symbolString = scanner.nextLine();
        CardinalPoints cardinalPoints = CardinalPoints.fromSymbol(symbolString);
        System.out.println(cardinalPoints.toDirection());
    }
}

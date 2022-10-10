package org.fasttrackit.enums;

public enum CardinalPoints {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String symbol;

    CardinalPoints(String symbol) {
        this.symbol = symbol;
    }

    public String toDirection() {
        return switch (this) {
            case NORTH -> "UP";
            case SOUTH -> "DOWN";
            case WEST -> "LEFT";
            case EAST -> "RIGHT";
        };
    }

    public static CardinalPoints fromSymbol(String symbol) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints value : values) {
            if (value.symbol.equals(symbol)) {
                return value;
            }
        }
        return null;
    }

    public String getSymbol() {
        return symbol;
    }
}

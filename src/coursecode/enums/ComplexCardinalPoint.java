package org.fasttrackit.enums;

public enum ComplexCardinalPoint {
    NW(CardinalPoints.NORTH, CardinalPoints.WEST),
    NE(CardinalPoints.NORTH, CardinalPoints.EAST);


    private final CardinalPoints firstDirection;
    private final CardinalPoints secondDirection;

    ComplexCardinalPoint(CardinalPoints firstDirection, CardinalPoints secondDirection) {
        this.firstDirection = firstDirection;
        this.secondDirection = secondDirection;
    }

    public CardinalPoints getFirstDirection() {
        return firstDirection;
    }

    public CardinalPoints getSecondDirection() {
        return secondDirection;
    }

}

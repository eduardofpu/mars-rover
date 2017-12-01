package com.challenge.marsrover.direction;

import com.challenge.marsrover.rover.Rover;

public class NorthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new EastDirection();
    }

    @Override
    public Direction spinLeft() {
        return new WestDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }
}

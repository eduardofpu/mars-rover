package com.desafio.marsrover.direction;

import com.desafio.marsrover.rover.Rover;

public class EastDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new SouthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new NorthDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }
}

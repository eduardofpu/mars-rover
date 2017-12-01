package com.challenge.marsrover.rover;

class RoverOutOfBoundsException extends RuntimeException {

    public RoverOutOfBoundsException() {
        super("The Rover cannot be out of bounds of the plateau!");
    }
}

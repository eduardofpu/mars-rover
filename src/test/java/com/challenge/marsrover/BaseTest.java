package com.challenge.marsrover;

import com.challenge.marsrover.Plateau;
import com.challenge.marsrover.command.Command;
import com.challenge.marsrover.direction.Direction;
import com.challenge.marsrover.rover.Rover;

public abstract class BaseTest {

    protected final Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}

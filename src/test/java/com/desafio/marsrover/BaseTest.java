package com.desafio.marsrover;

import com.desafio.marsrover.Plateau;
import com.desafio.marsrover.command.Command;
import com.desafio.marsrover.direction.Direction;
import com.desafio.marsrover.rover.Rover;

public abstract class BaseTest {

    protected final Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}

package com.desafio.marsrover.command;

import com.desafio.marsrover.rover.Rover;

public interface Command {

    public abstract void execute(Rover rover);
}

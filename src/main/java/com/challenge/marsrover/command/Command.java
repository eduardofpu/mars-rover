package com.challenge.marsrover.command;

import com.challenge.marsrover.rover.Rover;

public interface Command {

    public abstract void execute(Rover rover);
}

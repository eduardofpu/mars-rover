package com.desafio.marsrover.command;

import com.desafio.marsrover.rover.Rover;

public class SpinRightCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinRight();
    }
}

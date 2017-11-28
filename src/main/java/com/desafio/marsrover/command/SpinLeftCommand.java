package com.desafio.marsrover.command;

import com.desafio.marsrover.rover.Rover;

public class SpinLeftCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinLeft();
    }
}

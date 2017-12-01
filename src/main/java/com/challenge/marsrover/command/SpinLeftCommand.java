package com.challenge.marsrover.command;

import com.challenge.marsrover.rover.Rover;

public class SpinLeftCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinLeft();
    }
}

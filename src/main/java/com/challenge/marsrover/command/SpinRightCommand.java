package com.challenge.marsrover.command;

import com.challenge.marsrover.rover.Rover;

public class SpinRightCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinRight();
    }
}

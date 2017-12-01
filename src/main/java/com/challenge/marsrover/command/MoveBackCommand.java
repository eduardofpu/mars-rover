package com.challenge.marsrover.command;

import com.challenge.marsrover.rover.Rover;

public class MoveBackCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveBack();
    }
}

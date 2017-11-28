package com.desafio.marsrover.command;

import com.desafio.marsrover.rover.Rover;

public class MoveBackCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveBack();
    }
}

package com.desafio.marsrover;

import com.desafio.marsrover.command.Command;
import com.desafio.marsrover.rover.Rover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MarsRover {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputFileAsList = InputUtil.parseInputFromFile(MarsRover.class.getResourceAsStream("/input.txt"));        
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        for (String line : inputFileAsList)
            System.out.println(line);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = InputUtil.parsePlateauInput(inputFileAsList.get(0));        
        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = InputUtil.parsePositionInput(roverInput.get(i), plateau);
            ArrayList<Command> commands = InputUtil.parseCommandInput(roverInput.get(i + 1));
            rover.executeCommandList(commands);
            System.out.println(rover.broadcastLocation());
        }
    }
}

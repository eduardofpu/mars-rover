package com.challenge.marsrover.command;

import com.challenge.marsrover.BaseTest;
import com.challenge.marsrover.command.MoveForwardCommand;
import com.challenge.marsrover.direction.NorthDirection;
import com.challenge.marsrover.rover.Rover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoveForwardCommandTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
        command = new MoveForwardCommand();
    }

    @Test
    public void whenMoveForwardCommandIsExecutedRoverMovesForward() throws Exception {
        command.execute(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }
}

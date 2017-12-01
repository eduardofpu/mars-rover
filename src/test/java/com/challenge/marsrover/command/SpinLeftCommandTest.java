package com.challenge.marsrover.command;

import com.challenge.marsrover.BaseTest;
import com.challenge.marsrover.command.SpinLeftCommand;
import com.challenge.marsrover.direction.NorthDirection;
import com.challenge.marsrover.direction.WestDirection;
import com.challenge.marsrover.rover.Rover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpinLeftCommandTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
        command = new SpinLeftCommand();
    }

    @Test
    public void whenSpinLeftCommandIsExecutedRoverSpinsLeft() throws Exception {
        command.execute(rover);
        assertEquals(WestDirection.class, rover.getDirection().getClass());
    }
}

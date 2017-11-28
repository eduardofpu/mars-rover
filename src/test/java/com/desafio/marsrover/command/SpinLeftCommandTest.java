package com.desafio.marsrover.command;

import com.desafio.marsrover.BaseTest;
import com.desafio.marsrover.command.SpinLeftCommand;
import com.desafio.marsrover.direction.NorthDirection;
import com.desafio.marsrover.direction.WestDirection;
import com.desafio.marsrover.rover.Rover;

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

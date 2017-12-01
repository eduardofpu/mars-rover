package com.challenge.marsrover.direction;

import com.challenge.marsrover.BaseTest;
import com.challenge.marsrover.direction.EastDirection;
import com.challenge.marsrover.direction.NorthDirection;
import com.challenge.marsrover.direction.WestDirection;
import com.challenge.marsrover.rover.Rover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NorthDirectionTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() throws Exception {
        assertEquals(EastDirection.class, direction.spinRight().getClass());
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() throws Exception {
        assertEquals(WestDirection.class, direction.spinLeft().getClass());
    }

    @Test
    public void whenNorthDirectionMovesForwardCoordinateYIncrements() throws Exception {
        direction.moveForward(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }

    @Test
    public void whenNorthDirectionMovesBackCoordinateYDecrements() throws Exception {
        direction.moveBack(rover);
        assertEquals(--yCoordinate, rover.getCoordinateY());
    }
}

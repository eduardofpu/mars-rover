package com.desafio.marsrover;

import com.desafio.marsrover.command.MoveBackCommandTest;
import com.desafio.marsrover.command.MoveForwardCommandTest;
import com.desafio.marsrover.command.SpinLeftCommandTest;
import com.desafio.marsrover.command.SpinRightCommandTest;
import com.desafio.marsrover.direction.EastDirectionTest;
import com.desafio.marsrover.direction.NorthDirectionTest;
import com.desafio.marsrover.direction.SouthDirectionTest;
import com.desafio.marsrover.direction.WestDirectionTest;
import com.desafio.marsrover.rover.RoverExceptionTest;
import com.desafio.marsrover.rover.RoverTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveBackCommandTest.class,
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        RoverExceptionTest.class,
        InputUtilTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}

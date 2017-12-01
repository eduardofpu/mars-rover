package com.challenge.marsrover;

import com.challenge.marsrover.command.MoveBackCommandTest;
import com.challenge.marsrover.command.MoveForwardCommandTest;
import com.challenge.marsrover.command.SpinLeftCommandTest;
import com.challenge.marsrover.command.SpinRightCommandTest;
import com.challenge.marsrover.direction.EastDirectionTest;
import com.challenge.marsrover.direction.NorthDirectionTest;
import com.challenge.marsrover.direction.SouthDirectionTest;
import com.challenge.marsrover.direction.WestDirectionTest;
import com.challenge.marsrover.rover.RoverExceptionTest;
import com.challenge.marsrover.rover.RoverTest;

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

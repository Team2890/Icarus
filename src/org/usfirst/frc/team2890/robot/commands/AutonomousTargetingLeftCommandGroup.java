package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Autonomous from middle with switch on left using targeting
 */
public class AutonomousTargetingLeftCommandGroup extends CommandGroup 
{

<<<<<<< HEAD
    	//addSequential(new LiftUpCommand(RobotMap.LIFT_TIMED_RAISE));
    	//addSequential(new AutonomousDelayCommand(1.0));
=======
    public AutonomousTargetingLeftCommandGroup() 
    {
    	addSequential(new LiftUpCommand(RobotMap.LIFT_TIMED_RAISE));
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
    	addSequential(new AutonomousTimedDriveForward(RobotMap.AUTONOMOUS_MIDDLE_ONE_SECOND_TIMED_DRIVE));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(RobotMap.leftAutonomousMiddleTimeDrive));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(2.0));
    	addSequential(new ClawDownCommand());
    	addSequential(new OpenGripperCommand());
    }
}

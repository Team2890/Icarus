package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousTargetingRightCommandGroup extends CommandGroup 
{
    public AutonomousTargetingRightCommandGroup() 
    {
    	
    	//addSequential(new ClawDownCommand());
    	addSequential(new AutonomousTimedDriveForward(RobotMap.AUTONOMOUS_MIDDLE_ONE_SECOND_TIMED_DRIVE));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees));
    	addSequential(new AutonomousTimedDriveForward(RobotMap.autonomousMiddleTimeDrive));
    	addSequential(new AutonomousRotateIntCommand(RobotMap.leftTurnDegrees));
    	addSequential(new AutonomousRangedDriveForwardCommand());
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

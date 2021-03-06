package org.usfirst.frc.team2890.robot.commands;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Closes the gripper
 */
public class CloseGripperCommand extends Command 
{

    public CloseGripperCommand() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(RobotMap.manipulatorSubsystem);
    }

    /**
     * Called just before this Command runs the first time
     */
    protected void initialize() 
    {
    	RobotMap.closedGripperFlag = false;
    }

    /**
     * Called repeatedly when this Command is scheduled to run
     */
    protected void execute() 
    {
    	RobotMap.manipulatorSubsystem.closeGripper();
    }

    /**
     * Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() 
    {
        return RobotMap.closedGripperFlag;
    }

    /**
     * Called once after isFinished returns true
     */
    protected void end() 
    {
    }

    /**
     * Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() 
    {
    }
}

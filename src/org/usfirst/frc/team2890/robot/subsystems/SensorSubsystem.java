/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot.subsystems;

import org.usfirst.frc.team2890.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @deprecated
 * Grabs values for all sensors<br>
 * Sensors include: RangeFimder, gyro, and and 2 limit switched. <i>3 limit switches are present on the robot however only 2 have methods present here</i>
 */
public class SensorSubsystem extends Subsystem 
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	/**
	 * @deprecated
	 * SUPPOSEDLY initalizes a default command, not used in this way
	 */
	public void initDefaultCommand() 
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		// setDefaultCommand(new XboxDriveCommand());
		RobotMap.rangeFinder.setAutomaticMode(true);
	}
	
	/**
	 * @deprecated
	 * Resets and calibrates the gyros
	 */
	public void gyroSetting()
	{
		RobotMap.gyro.reset();
		RobotMap.gyro.calibrate();
	}
	
	/**
	 * @deprecated
	 * Grabs the values of the rangefinder and sets the value RobotMap.rangeFinderDistanceInches to said value.
	 */
	public void getRangeInInches()
	{
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
	}
	
	/**
	 * @deprecated
	 * Returns the value of the final lower limit switch
	 * @return
	 */
	public Boolean isLowerLimitSwitchPressed()
	{
		 return RobotMap.lowerElevatorLimitSwitch.get();
	}
	
	/**
	 * @deprecated
	 * Returns the value of the upper limit switch
	 * @return
	 */
	public Boolean isUpperLimitSwitchPressed()
	{
		 return RobotMap.upperElevatorLimitSwitch.get();
	}
	
	public Boolean isSecondaryLowerLimitSwitchPressed()
	{
		return RobotMap.secondaryLowerElevatorLimitSwitch.get();
	}
}

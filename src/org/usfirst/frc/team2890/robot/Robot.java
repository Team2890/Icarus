/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2890.robot.commands.*;

import org.usfirst.frc.team2890.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot 
{
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() 
	{
		SmartDashboard.putNumber("Time Drive Forward For the Middle: ", 1.0);
		//For when we're on the opposite side of the field that our target is on.
		SmartDashboard.putNumber("Straight Time Drive Forward: ", 5.0);
		SmartDashboard.putNumber("Left OR Right Side Time Drive: ", 3.0);
		
		SmartDashboard.putNumber("Rotate Right Degrees: ", 90);
		SmartDashboard.putNumber("Rotate Left Degrees: ", -90);
		
		RobotMap.init();
		RobotMap.m_oi = new OI();
		
		RobotMap.gyro.reset();
		
		// chooser.addObject("My Auto", new MyAutoCommand());
		
		//Have to have .addDefault() or else will not show up.
				m_chooser.addDefault("Autonomous from the Right: ", new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive));
				//This Command is middle
				m_chooser.addObject("Autonomous from the Middle: ", new TestCommandDontHateMeTaylor());
				//This Command is Left
				m_chooser.addObject("Autonomous from the Left: ", new LLAutonomousLeftCommandGroup());
				//This Command is Right
				m_chooser.addObject("Autonomous from the Right: ", new RRAutonomousRightCommandGroup());
				SmartDashboard.putData("Auto mode", m_chooser);
		
		//RobotMap.gyro.calibrate();
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() 
	{
		RobotMap.firstTimeThrough = true;
	}

	@Override
	public void disabledPeriodic() 
	{
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() 
	{	
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		SmartDashboard.putString("In R If Statement: ", "");
		SmartDashboard.putString("In 1st if: ", "");
		SmartDashboard.putString("In 2nd if: ", "");
		SmartDashboard.putString("In 3rd if: ", "");
		SmartDashboard.putString("In L If Statement: ", "");
		SmartDashboard.putString("In 4th if: ", "");
		SmartDashboard.putString("In 5th if: ", "");
		SmartDashboard.putString("In 6rd if: ", "");
		
		
		RobotMap.gyro.reset();
		
		RobotMap.autonomousCommandGroupChooser = (CommandGroup) m_chooser.getSelected();

		while((DriverStation.getInstance().getGameSpecificMessage()) == null)
		{
			
		}	
		
		RobotMap.gameData = DriverStation.getInstance().getGameSpecificMessage();
		RobotMap.gameDataLetter = RobotMap.gameData.substring(0, 1);
		System.out.println(RobotMap.gameDataLetter);
		
		SmartDashboard.putString("Game Data Letter", RobotMap.gameDataLetter);
		
		if(RobotMap.gameDataLetter.equalsIgnoreCase("R"))
			RobotMap.isRight = true;
		else if(RobotMap.gameDataLetter.equalsIgnoreCase("L"))
			RobotMap.isRight = false;
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() 
	{
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		
		RobotMap.autonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle: ", -1);
		RobotMap.autonomousLeftOrRightTimeDrive = SmartDashboard.getNumber("Left OR Right Side Time Drive: ", -19);
		RobotMap.driveStraightTimeDrive = SmartDashboard.getNumber("Straight Time Drive Forward: ", -1);
		
		RobotMap.rightTurnDegrees = SmartDashboard.getNumber("Rotate Right Degrees: ", 360);
		RobotMap.leftTurnDegrees = SmartDashboard.getNumber("Rotate Left Degrees: ", -360);
		
		
		System.out.println("Drive time middle: " + RobotMap.autonomousMiddleTimeDrive);
		System.out.println("Left or Right: " + RobotMap.autonomousLeftOrRightTimeDrive);
		System.out.println("Drive Straight Speed: " + RobotMap.driveStraightTimeDrive);
		System.out.println("Right Turn Degrees: " + RobotMap.rightTurnDegrees);
		System.out.println("Left Turn Degrees: " + RobotMap.leftTurnDegrees);
		
				
		if(RobotMap.firstTimeThrough)
		{
			RobotMap.rotationAutonomous = new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees);
			RobotMap.autonomousTargetingRightCommandGroup = new AutonomousTargetingRightCommandGroup();
			RobotMap.autonomousTargetingLeftCommandGroup = new AutonomousTargetingLeftCommandGroup();
			RobotMap.autonomousLeftCommandGroup = new LLAutonomousLeftCommandGroup();
			RobotMap.autonomousRightCommandGroup = new RRAutonomousRightCommandGroup();
			RobotMap.autonomousCommandGroupChooser = new CommandGroup();
			RobotMap.timedDriveForwardAutonomousCommand = new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive);
			scheduleCommands();
			RobotMap.firstTimeThrough = false;
		}
		
		
		
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() 
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (RobotMap.m_autonomousCommand != null) 
		{
			RobotMap.m_autonomousCommand.cancel();
		}
		
		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		
		Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		//RobotMap.compressor.setClosedLoopControl(true);
		
		
		//RobotMap.gyro.reset();
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();
		
		//test to tell if we are able to send data using the buttons by displaying it on SmartDashboard
		SmartDashboard.putBoolean("Y",RobotMap.driverController.getYButton());
		SmartDashboard.putBoolean("X",RobotMap.driverController.getXButton());
		SmartDashboard.putBoolean("B",RobotMap.driverController.getBButton());
		SmartDashboard.putBoolean("A",RobotMap.driverController.getAButton());
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		
		if(RobotMap.driverController.getBButton())
		{
			RobotMap.driveTrainSubsystem.stopMoving();
			Scheduler.getInstance().removeAll();
			Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		}
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() 
	{
		if(RobotMap.flag)
		{ 
			//RobotMap.compressor.setClosedLoopControl(true);
			RobotMap.flag = false;
		}
		//if(RobotMap.driverController.getBButton())
		//{
			//RobotMap.testTalon.set(1);
		//}
		//RobotMap.compressor.setClosedLoopControl(true);
	}
	
	public void scheduleCommands()
	{
		if(RobotMap.isRight)
		{
			SmartDashboard.putString("In R If Statement: ", "R");
			if(m_chooser.getSelected().getName().equals("RRAutonomousRightCommandGroup"))
			{
				SmartDashboard.putString("In 1st if: ", "In");
				Scheduler.getInstance().add(RobotMap.autonomousRightCommandGroup);
				return;
			}
			else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
			{
				SmartDashboard.putString("In 2nd if: ", "In");
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
				return;
			}
			//In middle
			else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
			{
				SmartDashboard.putString("In 3rd if: ", "In");
				Scheduler.getInstance().add(RobotMap.autonomousTargetingRightCommandGroup);
				return;
			}
		}
		else
		{
			SmartDashboard.putString("In L If Statement: ", "L");
			if(m_chooser.getSelected().getName().equals("RRAutonomousRightCommandGroup"))
			{
				SmartDashboard.putString("In 4th if: ", "In");
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
				return;
			}
			else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
			{
				SmartDashboard.putString("In 5th if: ", "In");
				Scheduler.getInstance().add(RobotMap.autonomousLeftCommandGroup);
				return;
			}
			//In middle
			else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
			{
				SmartDashboard.putString("In 6th if: ", "In");
				Scheduler.getInstance().add(RobotMap.autonomousTargetingLeftCommandGroup);
				return;
			}
		}
	}
}

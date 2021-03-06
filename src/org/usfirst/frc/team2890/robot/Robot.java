/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2890.robot.commands.*;

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
		SmartDashboard.putNumber("Time Drive Forward For the Middle (RIGHT SIDE): ", 1.0);
		SmartDashboard.putNumber("Time Drive Forward For the Middle (LEFT SIDE): ", 1.0);
		
		//For when we're on the opposite side of the field that our target is on.
		SmartDashboard.putNumber("Straight Time Drive Forward: ", 5.0);
		SmartDashboard.putNumber("Left OR Right Side Time Drive: ", 3.0);
		
		SmartDashboard.putNumber("Rotate Right Degrees: ", 90);
		SmartDashboard.putNumber("Rotate Left Degrees: ", -90);
<<<<<<< HEAD
		//SmartDashboard.putNumber("Switch Lift Time: ", 2.5);
		//SmartDashboard.putNumber("Scale lift time: ", 6.0);
		SmartDashboard.putBoolean("Lower Limit Switch KIERSTEN UPDATED: ", false);
		SmartDashboard.putBoolean("Secondary Lower Limit Switch KIERSTEM: ", false);
=======
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
		
		RobotMap.init();
		RobotMap.m_oi = new OI();
		
<<<<<<< HEAD
		RobotMap.frontRightTalon.enableCurrentLimit(true);
		RobotMap.frontLeftTalon.enableCurrentLimit(true);
		RobotMap.rearRightTalon.enableCurrentLimit(true);
		RobotMap.rearLeftTalon.enableCurrentLimit(true);
		
		RobotMap.gyro.reset();
=======
		//Have to have .addDefault() or else will not show up.
		m_chooser.addDefault("Autonomous from the Right: ", new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive));
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		
		//This Command is middle
		m_chooser.addObject("Autonomous from the Middle: ", new TestCommandDontHateMeTaylor());
		
<<<<<<< HEAD
		//Have to have .addDefault() or else will not show up.
				m_chooser.addDefault("Autonomous from the Right: ", new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive));
				//This Command is middle
				m_chooser.addObject("Autonomous from the Middle: ", new TestCommandDontHateMeTaylor());
				//This Command is Left
				m_chooser.addObject("Autonomous from the Left: ", new LLAutonomousLeftCommandGroup());
				//This Command is Right
				m_chooser.addObject("Autonomous from the Right: ", new RRAutonomousRightCommandGroup());
				
				//Sorry Sam, but weight changed so we lost a working autonomous middle -Faith //
				m_chooser.addObject("Autonomous Straight: ", new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive));
				//  new AutonomousForwardCommandGroup()
				// new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive)
				SmartDashboard.putData("Auto mode", m_chooser);
		
		//RobotMap.gyro.calibrate();
=======
		//This Command is Left
		m_chooser.addObject("Autonomous from the Left: ", new LLAutonomousLeftCommandGroup());
		
		//This Command is Right
		m_chooser.addObject("Autonomous from the Right: ", new RRAutonomousRightCommandGroup());
		
		SmartDashboard.putData("Auto mode", m_chooser);
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
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
	
	/**
	 * This function is called periodically while the robot is disabled
	 */
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
	 * to the switch structure below with additional strings and commands.
	 */
	@Override
	public void autonomousInit() 
	{
		RobotMap.m_autonomousCommand = m_chooser.getSelected();
		
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
		
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
<<<<<<< HEAD
		//Scheduler.getInstance().add(RobotMap.clawDownCommand);
//	Scheduler.getInstance().add(RobotMap.closeGripperCommand);
		//Scheduler.getInstance().add(RobotMap.liftUpCommand);
		Scheduler.getInstance().add(RobotMap.autonomousDelayCommand);
		//Scheduler.getInstance().add(RobotMap.openGripperCommand);
	//	Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
=======
<<<<<<< HEAD
		//Scheduler.getInstance().add(RobotMap);
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428

=======
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		
		while((DriverStation.getInstance().getGameSpecificMessage()) == null)
		{
			
		}	
		
		RobotMap.gameData = DriverStation.getInstance().getGameSpecificMessage();
		RobotMap.gameDataLetter = RobotMap.gameData.substring(0, 1);
		System.out.println(RobotMap.gameDataLetter);
		
		SmartDashboard.putString("Game Data Letter", RobotMap.gameDataLetter);
		
		if(RobotMap.gameDataLetter.equalsIgnoreCase("R"))
		{
			RobotMap.isRight = true;
		}
		else if(RobotMap.gameDataLetter.equalsIgnoreCase("L"))
		{
			RobotMap.isRight = false;
<<<<<<< HEAD
		
=======
		}
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() 
	{
		
		
		RobotMap.rangeFinderDistanceInches = RobotMap.rangeFinder.getRangeInches();
		//System.out.println(RobotMap.rangeFinderDistanceInches);
		//zSystem.out.println(RobotMap.RANGE_TARGET);
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		
<<<<<<< HEAD
		
		RobotMap.autonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle: ", -1);
=======
		RobotMap.rightAutonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle (RIGHT SIDE): ", -1);
		RobotMap.leftAutonomousMiddleTimeDrive = SmartDashboard.getNumber("Time Drive Forward For the Middle (LEFT SIDE): ", -1);
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		RobotMap.autonomousLeftOrRightTimeDrive = SmartDashboard.getNumber("Left OR Right Side Time Drive: ", -19);
		RobotMap.driveStraightTimeDrive = SmartDashboard.getNumber("Straight Time Drive Forward: ", -1);
	
		RobotMap.rightTurnDegrees = SmartDashboard.getNumber("Rotate Right Degrees: ", 360);
		RobotMap.leftTurnDegrees = SmartDashboard.getNumber("Rotate Left Degrees: ", -360);
<<<<<<< HEAD
		
		/*
		System.out.println("Drive time middle: " + RobotMap.autonomousMiddleTimeDrive);
		System.out.println("Left or Right: " + RobotMap.autonomousLeftOrRightTimeDrive);
		System.out.println("Drive Straight Speed: " + RobotMap.driveStraightTimeDrive);
		System.out.println("Right Turn Degrees: " + RobotMap.rightTurnDegrees);
		System.out.println("Left Turn Degrees: " + RobotMap.leftTurnDegrees);
		*/
		
				
=======
			
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		if(RobotMap.firstTimeThrough)
		{
			RobotMap.rotationAutonomous = new AutonomousRotateIntCommand(RobotMap.rightTurnDegrees);
			RobotMap.autonomousTargetingRightCommandGroup = new AutonomousTargetingRightCommandGroup();
			RobotMap.autonomousTargetingLeftCommandGroup = new AutonomousTargetingLeftCommandGroup();
			RobotMap.autonomousLeftCommandGroup = new LLAutonomousLeftCommandGroup();
			RobotMap.autonomousRightCommandGroup = new RRAutonomousRightCommandGroup();
			RobotMap.autonomousForwardCommandGroup = new AutonomousForwardCommandGroup();
			RobotMap.autonomousCommandGroupChooser = new CommandGroup();
			RobotMap.timedDriveForwardAutonomousCommand = new AutonomousTimedDriveForward(RobotMap.driveStraightTimeDrive);
			scheduleCommands();
			RobotMap.firstTimeThrough = false;
		}
		
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Max Current: ", RobotMap.driveTrainSubsystem.maxCurrent);
	}
	
	/**
	 * This function is called once when the robot is enabled in teleop mode.
	 */
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
		
		RobotMap.startThread();
<<<<<<< HEAD
		
		//Scheduler.getInstance().
		//RobotMap.talonRampOnCommand.start();
		/*
=======

>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		RobotMap.frontLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearLeftTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.frontRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
		RobotMap.rearRightTalon.configOpenloopRamp(RobotMap.RAMP_TIME, RobotMap.RAMP_TIMEOUT);
<<<<<<< HEAD
		*/
		
		//Scheduler.getInstance().add(RobotMap.controlCubeCommand);
		//Scheduler.getInstance().add(RobotMap.controlGripperCommand);
=======

>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
		Scheduler.getInstance().add(RobotMap.controlManipulatorCommand);
		Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		
		RobotMap.compressor.setClosedLoopControl(true);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();

		SmartDashboard.putNumber("Rectangle", RobotMap.hambyRoomGripPipelineShortRange.filterContoursOutput.size());
		SmartDashboard.putNumber("Center X: ", RobotMap.centerX);
		SmartDashboard.putNumber("Distance From Target: ", RobotMap.distanceFromTargetUsingTargeting);
		SmartDashboard.putNumber("Angle: ", RobotMap.angleFromTarget);
		
		SmartDashboard.putBoolean("Upper Limit Switch (false if pressed): ", RobotMap.sensorSubsystem.isUpperLimitSwitchPressed());
		SmartDashboard.putBoolean("Lower Limit Switch (true if pressed): ", RobotMap.sensorSubsystem.isLowerLimitSwitchPressed());
		SmartDashboard.putBoolean("Ratchet Engaged(true) or Disengaged(false): ", RobotMap.ratchetEngaged);
		SmartDashboard.putBoolean("High Gear(true): ", RobotMap.highGear);
		SmartDashboard.putBoolean("Low Gear(true): ", RobotMap.lowGear);
		SmartDashboard.putBoolean("Elbow is down(true): ", RobotMap.elbowIsDown);
		SmartDashboard.putBoolean("Lower Limit Switch KIERSTEN UPDATED: ", RobotMap.sensorSubsystem.isLowerLimitSwitchPressed());
		SmartDashboard.putBoolean("Secondary Lower Limit Switch KIERSTEN: ", RobotMap.sensorSubsystem.isSecondaryLowerLimitSwitchPressed());
		
		
		//test to tell if we are able to send data using the buttons by displaying it on SmartDashboard
		SmartDashboard.putBoolean("Y",RobotMap.driverController.getYButton());
		SmartDashboard.putBoolean("X",RobotMap.driverController.getXButton());
		SmartDashboard.putBoolean("B",RobotMap.driverController.getBButton());
		SmartDashboard.putBoolean("A",RobotMap.driverController.getAButton());
		
		SmartDashboard.putNumber("Gyro:", RobotMap.gyro.getAngle());
		SmartDashboard.putNumber("Gyro Rate:", RobotMap.gyro.getRate());
		
<<<<<<< HEAD
		if(RobotMap.driverController.getBButton())
		{
			RobotMap.driveTrainSubsystem.stopMoving();
			Scheduler.getInstance().removeAll();
			Scheduler.getInstance().add(RobotMap.xboxDriveCommand);
		}
		
		double temp =RobotMap.frontLeftTalon.getOutputCurrent();
		if(temp > DriveTrainSubsystem.maxCurrent)
			DriveTrainSubsystem.maxCurrent = temp;
		
		double temp2 =RobotMap.frontLeftTalon.getMotorOutputVoltage();
		if(temp2 > DriveTrainSubsystem.maxVolt)
			DriveTrainSubsystem.maxVolt=temp2;
		
		RobotMap.frontLeftTalon.configContinuousCurrentLimit(35, 0);
		RobotMap.frontRightTalon.configContinuousCurrentLimit(35, 0);
		RobotMap.rearLeftTalon.configContinuousCurrentLimit(35, 0);
		RobotMap.rearRightTalon.configContinuousCurrentLimit(35, 0);
		
		SmartDashboard.putNumber("Current Limited: ", temp);
		SmartDashboard.putNumber("Voltage Limited: ", temp2);
		SmartDashboard.putNumber("Max Current Teleop: ", DriveTrainSubsystem.maxCurrent);
		SmartDashboard.putNumber("Max Voltage Teleop: ", DriveTrainSubsystem.maxVolt);
		
		//RobotMap.leftTowerTalon.set(1);
		//RobotMap.rightTowerTalon.set(1);
		
		/*if(RobotMap.driverController.getAButton())
    	{
    		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kForward);
    		System.out.println("shifting to low gear");
    			
    	}
		else if(RobotMap.driverController.getBButton())
    	{
    		RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kReverse);
    		System.out.println("shifting to high gearr");
    	}
		else if (RobotMap.driverController.getXButton())
			RobotMap.gearBoxSolenoid.set(DoubleSolenoid.Value.kOff);*/
	
=======
		System.out.println("Amps: " + RobotMap.leftTowerTalon.getOutputCurrent());
		System.out.println("Volts: " + RobotMap.rightTowerTalon.getMotorOutputVoltage());
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() 
	{
		
	}
	
	/**
	 * Calls the commands when the buttons are pressed in the smartdashboard<br>
	 * Commands MUST be added here in order to work in autonomous
	 */
	public void scheduleCommands()
	{
		if(RobotMap.isRight)
		{
			SmartDashboard.putString("In R If Statement: ", "R");
			if(m_chooser.getSelected().getName().equals("RRAutonomousRightCommandGroup"))
			{
				SmartDashboard.putString("In 1st if: ", "In");
				System.out.println("1st: ");
				
				Scheduler.getInstance().add(RobotMap.autonomousRightCommandGroup);
				
				return;
			}
			else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
			{
				System.out.println("2nd: ");
				SmartDashboard.putString("In 2nd if: ", "In");
				
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
				
				return;
			}
			//In middle
			else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
			{
				System.out.println("3rd: ");
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
				System.out.println("4th: ");
				SmartDashboard.putString("In 4th if: ", "In");
				
				Scheduler.getInstance().add(RobotMap.timedDriveForwardAutonomousCommand);
				
				return;
			}
			else if(m_chooser.getSelected().getName().equals("LLAutonomousLeftCommandGroup"))
			{
				System.out.println("5th ");
				SmartDashboard.putString("In 5th if: ", "In");
				
				Scheduler.getInstance().add(RobotMap.autonomousLeftCommandGroup);
				
				return;
			}
			//In middle
			else if(m_chooser.getSelected().getName().equals("TestCommandDontHateMeTaylor"))
			{
				System.out.println("6th: ");
				SmartDashboard.putString("In 6th if: ", "In");
				
				Scheduler.getInstance().add(RobotMap.autonomousTargetingLeftCommandGroup);
				
				return;
			}
		}
	}
	
	@Override
	public boolean isDisabled() 
	{
		// TODO Auto-generated method stub
		 RobotMap.keepThreadRunning = false;
		return super.isDisabled();
	}
}

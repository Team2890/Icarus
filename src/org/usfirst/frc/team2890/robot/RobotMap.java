/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2890.robot;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team2890.robot.commands.*;
import org.usfirst.frc.team2890.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//===============================================
	//PORT IDS
	//===============================================
<<<<<<< HEAD
	public static final int FRONT_RIGHT_TALON_ID = 1;
	public static final int REAR_RIGHT_TALON_ID = 6; //chnage t
	public static final int FRONT_LEFT_TALON_ID = 3;
	public static final int REAR_LEFT_TALON_ID = 2;
=======
	public static final int FRONT_RIGHT_TALON_ID = 2;
	public static final int REAR_RIGHT_TALON_ID = 3;
	public static final int FRONT_LEFT_TALON_ID = 1;
	public static final int REAR_LEFT_TALON_ID = 4;
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
	public static final int TEST_TALON_ID = 6;
	public static final int DRIVER_CONTROLLER_PORT = 0;
	public static final int ASSISTANT_DRIVER_CONTROLLER_PORT = 1;
	public static final int GRABBER_SOLENOID_FORWARD_PORT = 0;
	public static final int GRABBER_SOLENOID_BACKWARD_PORT = 1;
	public static final int ROTATE_SOLENOID_FORWARD_PORT = 2;
	public static final int ROTATE_SOLENOID_BACKWARD_PORT = 3;
	public static final int GEARBOX_SOLENOID_FORWARD_PORT = 4;
	public static final int GEARBOX_SOLENOID_BACKWARD_PORT = 5;
	public static final int RATCHET_ENGAGE_CHANNEL_PORT = 6;
	public static final int RATCHET_DISENGAGE_CHANNEL_PORT = 7;
	public static final int RANGEFINDER_PINGCHANNEL = 0;
	public static final int RANGEFINDER_ECHOCHANNEL = 1;
	public static final int LEFT_TALON_TOWER_ID = 5;
	public static final int RIGHT_TALON_TOWER_ID = 4;
	public static final int SECONDARY_LOWER_LIMIT_SWITCH_PORT = 7;
	public static final int LOWER_LIMIT_SWITCH_PORT = 8;
	public static final int UPPER_LIMIT_SWITCH_PORT = 9;
	
	//===============================================
	//CONSTANTS
	//==============================================
	public static final int X_INVERTED = -1;
	public static final int RAMP_TIMEOUT = 1;
	public static final double RAMP_TIME = 0.25;
	public static final double RAMP_OFF_TIME = 0.0;
	public static final double X_AXIS_LOWER_DEADBAND = -0.01;
	public static final double X_AXIS_UPPER_DEADBAND = 0.01;
	public static final double ROTATION_SENSITIVTY = 0.7; //from 0.65
<<<<<<< HEAD
=======
	public static final double FORWARDS_BACKWARDS_SENSITIVITY = 1.0; //from 0.8
<<<<<<< HEAD
	public static final double AUTONOMOUS_FORWARD_SPEED = -.5; //-.65
	public static final double AUTONOMOUS_BACKWARD_SPEED = .5; //.65
	public static final double AUTONOMOUS_ROTATE_LEFT_SPEED = 0.45; // from 0.65
	public static final double AUTONOMOUS_ROTATE_RIGHT_SPEED = -0.45; // from -0.65
=======
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
	public static final double AUTONOMOUS_FORWARD_SPEED = -0.65; //-.65
	public static final double AUTONOMOUS_BACKWARD_SPEED = 0.65; //.65
	public static final double AUTONOMOUS_ROTATE_LEFT_SPEED = 0.5; // from 0.65
	public static final double AUTONOMOUS_ROTATE_RIGHT_SPEED = -0.5; // from -0.65
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
	public static final double AUTONOMOUS_KILL_SWITCH = 0;
	public static final double RANGE_TARGET = 12.0;
	public static final double TOWER_UP_VARIABLE = 1.0;
	public static final double TOWER_DOWN_VARIABLE = 1.0;
	public static final double TRIGGER_SENSITIVIY = .15; //At this point, the tower will start moving.
	public static final int TOWER_UP_DIRECTION = -1; 
	public static final double LIFT_TIMED_RAISE = 1.0;
	public static final double AUTONOMOUS_MIDDLE_ONE_SECOND_TIMED_DRIVE = 1.0;
	
	//===============================================
	//VARIABLES
	//===============================================
	public static double centerX;
	public static double distanceFromTargetUsingTargeting;
	public static double angleFromTarget;
	public static double rangeFinderDistanceInches;
	
	public static double rightAutonomousMiddleTimeDrive = 1.0;
	public static double leftAutonomousMiddleTimeDrive = 1.0;//time in seconds 
	public static double autonomousLeftOrRightTimeDrive = 3.0;
<<<<<<< HEAD
	public static double driveStraightTimeDrive = 0.25;
=======
	public static double driveStraightTimeDrive = 5.0;
	public static double autonomousSwitchLiftTime = 2.5;
	public static double autonomousScaleLiftTime = 6.0;
<<<<<<< HEAD
	public static double forwardsBackwardsSensitivity = 1.0; //from 0.8
	
	public static double towerLoweringSensitivity = 1.0;
=======
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
	
	public static double initialGyro;
	public static double goalAngle;
	public static double rightTurnDegrees = 90;
	public static double leftTurnDegrees = -90;
	
	public static String gameData;
	public static String gameDataLetter;
	
	public static boolean flag = true;
	public static boolean stopRotating = false;
	public static boolean firstTimeThrough = true;
	public static boolean isRight = true;
	
	public static boolean keepThreadRunning = true;
	public static boolean upperLimitSwitch = false;
	public static boolean lowerLimitSwitch = false;
	public static boolean secondaryLowerLimitSwitch = false; // Slows down speed during the last inches of lowering the tower
	
<<<<<<< HEAD
	public static boolean openedGripperFlag = false;
	public static boolean closedGripperFlag = false;
	public static boolean forwardsBackwardsSensitivityFlag = false;
	public static boolean clawDownFlag = false;
	public static boolean ratchetEngaged = false;
	public static boolean highGear = false;
=======
	//Teleop Flags
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
	public static boolean lowGear = false;
	public static boolean highGear = false;
	public static boolean shiftGearButtonFlag = true;
	public static boolean elbowIsDown = false;
	public static boolean controlCubeFlag = true;
	public static boolean controlGripperFlag = true;
	public static boolean controlRatchetFlag = true;
	public static boolean ratchetEngaged = false;
	public static boolean turnSecondCameraOn = true;
	
	//Autonomous Flags
	public static boolean openedGripperFlag = false;
	public static boolean closedGripperFlag = false;
	public static boolean clawDownFlag = false;
	public static boolean liftUpFlag = false;
	public static boolean rangeFinderExitFlag = false;
		
	//===============================================
	//TALONS, CONTROLLERS & OTHER OBJECTS
	//===============================================
	//Vision
	public static Thread m_visionThread;
	public static GripPipeline gripPipeline;
	public static HambyRoomGripPipelineLongRange hambyRoomGripPipelineLongRange;
	public static HambyRoomGripPipelineShortRange hambyRoomGripPipelineShortRange;	
	
	//Controllers
	public static XboxController driverController;
	public static XboxController assistantDriverController;
	
	//Talons
	public static WPI_TalonSRX frontRightTalon;
	public static WPI_TalonSRX rearRightTalon;
	public static WPI_TalonSRX frontLeftTalon;
	public static WPI_TalonSRX rearLeftTalon;
	public static WPI_TalonSRX leftTowerTalon;
	public static WPI_TalonSRX rightTowerTalon;
	public static SpeedControllerGroup rightTalonGroup;
	public static SpeedControllerGroup leftTalonGroup;
	
	//Sensors
	public static Ultrasonic rangeFinder;
	public static DigitalInput upperElevatorLimitSwitch;
	public static DigitalInput lowerElevatorLimitSwitch;
<<<<<<< HEAD
	public static DigitalInput secondaryLowerElevatorLimitSwitch;
	public static SpeedControllerGroup rightTalonGroup;
	public static SpeedControllerGroup leftTalonGroup;
=======
	public static ADXRS450_Gyro gyro;
	
	//Subsystems
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
	public static DifferentialDrive driveTrain;
	public static DriveTrainSubsystem driveTrainSubsystem;
	public static SensorSubsystem sensorSubsystem;
	public static ManipulatorSubsystem manipulatorSubsystem;
	
	//Pneumatics
	public static Compressor compressor;
	public static DoubleSolenoid grabberSolenoid;
	public static DoubleSolenoid elbowSolenoid;
	public static DoubleSolenoid gearBoxSolenoid;
	public static DoubleSolenoid ratchetSolenoid;
	
	//Cameras
	public static UsbCamera camera;
	public static UsbCamera secondCamera;
	
	//Misc
	public static OI m_oi;
	
	//===============================================
	//COMMANDS
	//===============================================
	public static Command exampleCommand;
	public static Command xboxDriveCommand;
	public static Command talonRampOnCommand;
	public static Command talonRampOffCommand;
	public static Command stopMovingCommand;
<<<<<<< HEAD
	public static Command maxCurrentControlCommand;
=======
	public static Command autonomousDelayCommand;
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
	
	//===============================================
	//AUTONOMOUS COMMANDS
	//===============================================
	public static Command m_autonomousCommand;
	public static Command driveForwardAutonomousCommand;
	public static Command timedDriveForwardAutonomousCommand;
	public static Command driveBackwardAutonomousCommand;
	public static Command turnLeftAutonomousCommand;
	public static Command turnRightAutonomousCommand;
	public static Command rotationAutonomous; 
	public static Command controlManipulatorCommand;
	public static Command getDistanceInInches; //Testing on SmartDashboard
	public static Command rangedDriveForwardCommand;
	public static Command liftUpCommand;
	public static Command clawDownCommand;
	public static Command closeGripperCommand;
	public static Command openGripperCommand;
	
	//===============================================
	//AUTONOMOUS COMMANDGROUPS
	//===============================================
	public static CommandGroup autonomousTargetingLeftCommandGroup;
	public static CommandGroup autonomousTargetingRightCommandGroup;
	public static CommandGroup autonomousLeftCommandGroup;
	public static CommandGroup autonomousRightCommandGroup;
	public static CommandGroup autonomousCommandGroupChooser;
	public static CommandGroup testCommandGroup;
	public static CommandGroup autonomousForwardCommandGroup;
	
	/**
	 * Instantiates ALL objects and variables with their default values<br>
	 * Called at robot startup
	 */
	public static void init()
	{		
		//Controllers
		driverController = new XboxController(DRIVER_CONTROLLER_PORT);
		assistantDriverController = new XboxController(ASSISTANT_DRIVER_CONTROLLER_PORT);
		
		//Sensors
		gyro = new ADXRS450_Gyro();
		rangeFinder = new Ultrasonic(RANGEFINDER_PINGCHANNEL, RANGEFINDER_ECHOCHANNEL);
		upperElevatorLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH_PORT);
		lowerElevatorLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH_PORT);
		
		//Pneumatics
		compressor = new Compressor();
		grabberSolenoid = new DoubleSolenoid(GRABBER_SOLENOID_FORWARD_PORT, GRABBER_SOLENOID_BACKWARD_PORT); //GRABBER_SOLENOID_FORWARD_PORT, GRABBER_SOLENOID_BACKWARD_PORT
		elbowSolenoid = new DoubleSolenoid(ROTATE_SOLENOID_FORWARD_PORT, ROTATE_SOLENOID_BACKWARD_PORT); //ROTATE_SOLENOID_FORWARD_PORT, ROTATE_SOLENOID_BACKWARD_PORT
		gearBoxSolenoid = new DoubleSolenoid(GEARBOX_SOLENOID_FORWARD_PORT, GEARBOX_SOLENOID_BACKWARD_PORT); //GEARBOX_SOLENOID_FORWARD_PORT, GEARBOX_SOLENOID_BACKWARD_PORT
		ratchetSolenoid = new DoubleSolenoid(RATCHET_ENGAGE_CHANNEL_PORT, RATCHET_DISENGAGE_CHANNEL_PORT);
		
<<<<<<< HEAD
		upperElevatorLimitSwitch = new DigitalInput(UPPER_LIMIT_SWITCH_PORT);
		lowerElevatorLimitSwitch = new DigitalInput(LOWER_LIMIT_SWITCH_PORT);
		secondaryLowerElevatorLimitSwitch = new DigitalInput(SECONDARY_LOWER_LIMIT_SWITCH_PORT);
		
=======
		//Talons
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
		frontRightTalon = new WPI_TalonSRX(FRONT_RIGHT_TALON_ID);
		rearRightTalon = new WPI_TalonSRX(REAR_RIGHT_TALON_ID);
		frontLeftTalon = new WPI_TalonSRX(FRONT_LEFT_TALON_ID);
		rearLeftTalon = new WPI_TalonSRX(REAR_LEFT_TALON_ID);
		leftTowerTalon = new WPI_TalonSRX(RIGHT_TALON_TOWER_ID); 
		rightTowerTalon = new WPI_TalonSRX(LEFT_TALON_TOWER_ID);
		
		rightTalonGroup = new SpeedControllerGroup(frontRightTalon, rearRightTalon);
		leftTalonGroup = new SpeedControllerGroup(frontLeftTalon, rearLeftTalon);
		
		//Subsystems
		driveTrainSubsystem = new DriveTrainSubsystem();
		sensorSubsystem = new SensorSubsystem();
		manipulatorSubsystem = new ManipulatorSubsystem();

		//Commands
		xboxDriveCommand = new XboxDriveCommand();
		talonRampOnCommand = new TalonRampOnCommand();
		talonRampOffCommand = new TalonRampOffCommand();
		driveForwardAutonomousCommand = new AutonomousDriveForwardCommand();
		stopMovingCommand = new StopMovingCommand();
		driveBackwardAutonomousCommand = new AutonomousDriveBackwardCommand();
		turnLeftAutonomousCommand = new AutonomousTurnLeftCommand();
		turnRightAutonomousCommand = new AutonomousTurnRightCommand();
		controlManipulatorCommand = new ControlManipulatorCommand();
		getDistanceInInches = new RangeFinderFindDistanceInInchesCommand();
		rangedDriveForwardCommand = new AutonomousRangedDriveForwardCommand();
		testCommandGroup = new TestCommandDontHateMeTaylor();
<<<<<<< HEAD
		maxCurrentControlCommand = new MaxCurrentCommand(.25);

=======
		liftUpCommand = new LiftUpCommand(LIFT_TIMED_RAISE);
		clawDownCommand = new ClawDownCommand();
		closeGripperCommand = new CloseGripperCommand();
<<<<<<< HEAD
		openGripperCommand = new OpenGripperCommand(1.0);
		autonomousDelayCommand = new AutonomousDelayCommand(1.0);

=======
		openGripperCommand = new OpenGripperCommand();
		autonomousDelayCommand = new AutonomousDelayCommand(2.0);
		
		driveTrainSubsystem.xboxArcadeDrive();
		
		//Misc
		m_oi = new OI();
		
		driveTrain = new DifferentialDrive(leftTalonGroup, rightTalonGroup);
		
>>>>>>> a1f793077d5079396c220c5f7b6ec4ec360527d3
>>>>>>> c46bf84ab5a0278a92cb22a9ee2547d6b6813428
		initialGyro = RobotMap.gyro.getAngle();
		
		rightTalonGroup.setInverted(true);
		leftTalonGroup.setInverted(true);

		System.out.println("In robotInit method");
	}

	public static void startThread()
	{
		gripPipeline = new GripPipeline();
		hambyRoomGripPipelineLongRange = new HambyRoomGripPipelineLongRange();
		hambyRoomGripPipelineShortRange = new HambyRoomGripPipelineShortRange();
		
		System.out.println("In startThread method");
		
		centerX = -1;
		distanceFromTargetUsingTargeting = -1;
		angleFromTarget = -1;
		
		m_visionThread = new Thread(() -> 
		{
			System.out.println("In vision thread");
			// Get the UsbCamera from CameraServer
			camera = CameraServer.getInstance().startAutomaticCapture();
			secondCamera = CameraServer.getInstance().startAutomaticCapture();
			// Set the resolution
			camera.setResolution(1, 1);
			camera.setFPS(30);
			secondCamera.setResolution(1, 1);
			secondCamera.setFPS(30);
			
			// Get a CvSink. This will capture Mats from the camera
			CvSink cvSink = CameraServer.getInstance().getVideo();
			// Setup a CvSource. This will send images back to the Dashboard
			CvSource outputStream
					= CameraServer.getInstance().putVideo("Rectangle", 640, 480);

			// Mats are very memory expensive. Lets reuse this Mat.
			Mat mat = new Mat();
			System.out.println(Thread.interrupted());

			// This cannot be 'true'. The program will never exit if it is. This
			// lets the robot stop this thread when restarting robot code or
			// deploying.
			
			while (keepThreadRunning) {
				//System.out.println("In infinite thread loop.");
				// Tell the CvSink to grab a frame from the camera and put it
				// in the source mat.  If there is an error notify the output.
				if (cvSink.grabFrame(mat) == 0) {
					// Send the output the error.
					outputStream.notifyError(cvSink.getError());
					// skip the rest of the current iteration
					continue;
				}
				// Put a rectangle on the image
				Imgproc.rectangle(mat, new Point(100, 100), new Point(400, 400),
						new Scalar(255, 255, 255), 5);
				// Give the output stream a new image to display
				outputStream.putFrame(mat);
				hambyRoomGripPipelineShortRange.process(mat);
				
				centerX = Processing.returnCenterX(hambyRoomGripPipelineShortRange.filterContoursOutput);
				distanceFromTargetUsingTargeting = Processing.distanceFromTarget(hambyRoomGripPipelineShortRange.filterContoursOutput);
				angleFromTarget = Processing.getAngle(hambyRoomGripPipelineShortRange.filterContoursOutput);
			}
		});
		m_visionThread.setDaemon(true);
		m_visionThread.start();
	}

}

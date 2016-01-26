package org.usfirst.frc.team68.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // DriveTrain Port Mapping Constants
    public static final int driveLeftFront = 1;		// CAN bus port 1
    public static final int driveRightFront = 2;	// CAN bus port 2
    public static final int driveLeftRear = 3;		// CAN bus port 3
    public static final int driveRightRear = 4;		// CAN bus port 4
    
    // Intake Port Mapping Constants
    public static final int intakeForward = 4;
    public static final int intakeReverse = 5;
    public static final int intakeLF = 4;			// PWM port 4
    public static final int intakeRF = 5;			// PWM port 5


    // Latches Port Mapping Constants
    
    
    // Joystick Port Mapping Constants
    public static final int leftJoystick = 0;		// USB port 0
    public static final int rightJoystick = 1;		// USB port 1
    public static final int xBoxController = 2;		// USB port 2
    
    // xBoxController Button & Axis Mapping Constants
    // Buttons
    public static final int xboxA = 1;
    public static final int xboxB = 2;
    public static final int xboxX = 3;
    public static final int xboxY = 4;
    public static final int xboxLB = 5;
    public static final int xboxRB = 6;
    // Axis
    public static final int xboxLY = 1;
    public static final int xboxRY = 5;


    
    public static final int joystickYAxis = 1;
    
    // Pneumatics Port Mapping Constants
    public static final int pcmMain = 0;
    public static final int pcmAux = 1;
    public static final int latchForward = 0;
    public static final int latchReverse = 1;
    public static final int canHolderForward = 2;
    public static final int canHolderReverse = 3;
    public static final int gateForward = 6;
    public static final int gateReverse = 7;
    
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}

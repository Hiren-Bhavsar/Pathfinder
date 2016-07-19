package org.usfirst.frc.team5254.robot;

public class Constants {

	// Drivetrain -- CANTalon and Pneumatics
	public final static int MASTER_LEFT_DRIVE = 0;
	public final static int FOLLOWER_LEFT_DRIVE = 1;
	public final static int MASTER_RIGHT_DRIVE = 2;
	public final static int FOLLOWER_RIGHT_DRIVE = 3;
	public final static int RIGHT_SHIFT = 7;
	public final static int LEFT_SHIFT = 8;
	public final static int RIGHT_HOLDER = 9;
	public final static int LEFT_HOLDER = 10;

	// Climber -- TalonSR and Pneumatics
	public final static int CLIMBER_MOTOR = 1;
	public final static int CLIMBER_SOLENOID = 6;

	// Flywheels -- CANTalon
	public final static int MASTER_FLYWHEEL = 4;
	public final static int FOLLOWER_FLYWHEEL = 5;

	// Collector -- Pneumatics and TalonSR
	public final static int COLLECTOR_SOLENOID_RETRACT = 0;
	public final static int COLLECTOR_SOLENOID_EXTEND = 1;
	public final static int COLLECTOR_MOTOR = 0;
	public final static int INTAKE_SENSOR = 2;

	// Shooter Arm -- CANTalon
	public final static int SHOOTER_ARM = 6;
	public final static int SHOOTER_HOME_SENSOR = 0;

	// Tomahawks -- Pneumatics
	public final static int TOMAHAWKS_EXTEND = 2;
	public final static int TOMAHAWKS_RETRACT = 3;

	// Puncher -- Pneumatics
	public final static int PUNCHER_EXTEND = 4;
	public final static int PUNCHER_RETRACT = 5;
}

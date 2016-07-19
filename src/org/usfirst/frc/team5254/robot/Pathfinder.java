package org.usfirst.frc.team5254.robot;

import subsystems.frc.team5254.Climber;
import subsystems.frc.team5254.Collector;
import subsystems.frc.team5254.Drivetrain;
import subsystems.frc.team5254.Flywheels;
import subsystems.frc.team5254.Puncher;
import subsystems.frc.team5254.ShooterArm;
import subsystems.frc.team5254.Tomahawks;

public class Pathfinder {

	public Pathfinder() {

	}

	public Constants constants = new Constants();
	public Collector collector = new Collector();
	public Tomahawks tomahawks = new Tomahawks();
	public Flywheels flywheels = new Flywheels();
	public Puncher puncher = new Puncher();
	public ShooterArm shooterArm = new ShooterArm();
	public Drivetrain drivetrain = new Drivetrain();
	public Climber climber = new Climber();
}

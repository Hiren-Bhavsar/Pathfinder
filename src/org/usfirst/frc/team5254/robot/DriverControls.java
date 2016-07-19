package org.usfirst.frc.team5254.robot;

import org.usfirst.frc.team20.robot.Team20Libraries.T20GamePad;

public class DriverControls extends Pathfinder {

	private T20GamePad driverJoy = new T20GamePad(T20GamePad.JS_TYPE_XBOX, 0);

	public DriverControls() {

	}

	public void driverControls() {
		// Drivetrain Control
		drivetrain.driveManual(driverJoy.getAxisLeftStickY(), driverJoy.getAxisTrigger());

		if (driverJoy.getButtonRB()) {
			drivetrain.shiftUp();
		}
		if (driverJoy.getButtonLB()) {
			drivetrain.shiftDown();
		}
		// Tomahawk Control
		if (driverJoy.getButtonX()) {
			tomahawks.tomahawksUp();
		}
		if (driverJoy.getButtonB()) {
			tomahawks.tomahawksUp();
		}
		// Climber Control
		if (driverJoy.getButtonY()) {
			climber.releaseClimber();
		}
		if (driverJoy.getButtonA()) {
			climber.winchClimber();
		} else {
			climber.winchStop();
		}
	}
}

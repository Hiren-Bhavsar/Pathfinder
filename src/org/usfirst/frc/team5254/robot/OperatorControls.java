package org.usfirst.frc.team5254.robot;

import org.usfirst.frc.team20.robot.Team20Libraries.T20GamePad;

public class OperatorControls extends Pathfinder {

	private T20GamePad opJoy = new T20GamePad(T20GamePad.JS_TYPE_XBOX, 1);
	private double flySpeed = 0, armPos = 0;
	private boolean shouldWatch = false;

	public OperatorControls() {
	}

	public void opControls() {
		shooterArm.shooterHomeWatchDog();
		// Collector Control
		if (opJoy.getButtonLB()) {
			collector.collectorUp();
			flySpeed = flywheels.FLYSPEED_OFF;
		}
		if (opJoy.getButtonRB()) {
			collector.collectorDown();
		}
		if (opJoy.getButtonY()) {
			collector.collectorOn();
			flySpeed = flywheels.FLYSPEED_COLLECT;
			shouldWatch = true;
		}
		if (opJoy.getButtonB() || opJoy.getButtonX() || (shouldWatch && collector.getIntakeButton())) {
			collector.collectorOff();
			flySpeed = flywheels.FLYSPEED_OFF;
			shouldWatch = false;
		}
		if (opJoy.getButtonA()) {
			collector.collectorBackdrive();
			flySpeed = flywheels.FLYSPEED_LOW_GOAL;
			puncher.puncherPunch();
		}
		// Shot Control
		if (opJoy.getButtonDPadXL()) {
			armPos = shooterArm.SHOOTER_POS_BATTER;
			flySpeed = flywheels.FLYSPEED_BATTER;
		}
		if (opJoy.getButtonDPadXR()) {
			armPos = shooterArm.SHOOTER_POS_OUTERWORKS;
			flySpeed = flywheels.FLYSPEED_OUTERWORKS;
		}
		if (opJoy.getButtonDPadYD()) {
			armPos = shooterArm.SHOOTER_POS_HOME;
			flySpeed = flywheels.FLYSPEED_OFF;
			shooterArm.armShouldHome = true;
		}
		if (opJoy.getAxisTrigger() > .3) {
			puncher.puncherPunch();
		} else {
			puncher.puncherPullBack();
		}
		// Misc Control
		if (opJoy.getButtonBack()) {
			armPos = shooterArm.SHOOTER_POS_HOME;
			flySpeed = flywheels.FLYSPEED_OFF;
			collector.collectorOff();
		}
		if (opJoy.getButtonStart()) {
			flySpeed = flywheels.FLYSPEED_OUTERWORKS;
		}
		flywheels.flywheelToSpeed(flySpeed);
		shooterArm.shooterToPos(armPos);
	}
}

package subsystems.frc.team5254;

import org.usfirst.frc.team20.robot.Team20Libraries.T20CANTalon;
import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.Solenoid;

public class Drivetrain {

	private T20CANTalon masterLeft = new T20CANTalon(Constants.MASTER_LEFT_DRIVE);
	private T20CANTalon followerLeft = new T20CANTalon(Constants.FOLLOWER_LEFT_DRIVE);
	private T20CANTalon masterRight = new T20CANTalon(Constants.MASTER_RIGHT_DRIVE);
	private T20CANTalon followerRight = new T20CANTalon(Constants.FOLLOWER_RIGHT_DRIVE);

	private Solenoid leftShifter = new Solenoid(Constants.LEFT_SHIFT);
	private Solenoid leftHolder = new Solenoid(Constants.LEFT_HOLDER);
	private Solenoid rightShifter = new Solenoid(Constants.RIGHT_SHIFT);
	private Solenoid rightHolder = new Solenoid(Constants.RIGHT_HOLDER);

	public Drivetrain() {
		followerLeft.changeControlMode(TalonControlMode.Follower);
		followerRight.changeControlMode(TalonControlMode.Follower);
		masterLeft.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		masterRight.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		masterLeft.enableControl();
		masterRight.enableControl();
		masterLeft.setPID(.08, 0, 0);
		masterRight.setPID(.08, 0, 0);
		masterLeft.setPosition(0);
		masterRight.setPosition(0);
	}

	public void resetEncoders() {
		masterLeft.setEncPosition(0);
		masterRight.setEncPosition(0);
		masterLeft.setPosition(0);
		masterRight.setPosition(0);
	}

	public void driveManual(double speed, double heading) {
		masterLeft.changeControlMode(TalonControlMode.PercentVbus);
		masterRight.changeControlMode(TalonControlMode.PercentVbus);
		speed = -speed;
		masterRight.set((-speed - heading));
		masterLeft.set(((speed) - heading));
		followerLeft.set(Constants.MASTER_LEFT_DRIVE);
		followerRight.set(Constants.MASTER_RIGHT_DRIVE);
	}

	public void shiftUp() {
		leftShifter.set(true);
		rightShifter.set(true);
		leftHolder.set(true);
		rightHolder.set(true);
	}

	public void shiftDown() {
		leftShifter.set(false);
		rightShifter.set(false);
		leftHolder.set(false);
		rightHolder.set(false);
	}

}

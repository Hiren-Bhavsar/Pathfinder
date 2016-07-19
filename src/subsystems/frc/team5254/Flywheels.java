package subsystems.frc.team5254;

import org.usfirst.frc.team20.robot.Team20Libraries.T20CANTalon;
import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;

public class Flywheels {

	private T20CANTalon flyWheelMaster = new T20CANTalon(Constants.MASTER_FLYWHEEL);
	private T20CANTalon flyWheelFollower = new T20CANTalon(Constants.FOLLOWER_FLYWHEEL);

	public final int FLYSPEED_OUTERWORKS = 0, FLYSPEED_BATTER = 0, FLYSPEED_OFF = 0, FLYSPEED_LOW_GOAL = 0,
			FLYSPEED_COLLECT = 0;

	public Flywheels() {
		flyWheelMaster.changeControlMode(TalonControlMode.Speed);
		flyWheelFollower.changeControlMode(TalonControlMode.Follower);
		flyWheelFollower.reverseOutput(true);
		flyWheelMaster.setFeedbackDevice(FeedbackDevice.QuadEncoder);
	}

	public void flywheelToSpeed(double speed) {
		flyWheelMaster.set(speed);
		flyWheelFollower.set(Constants.MASTER_FLYWHEEL);
	}

}

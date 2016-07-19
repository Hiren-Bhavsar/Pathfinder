package subsystems.frc.team5254;

import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Climber {

	private Solenoid climberRelease = new Solenoid(Constants.CLIMBER_SOLENOID);
	private Talon winchMotor = new Talon(Constants.CLIMBER_MOTOR);

	public Climber() {
	}

	public void releaseClimber() {
		climberRelease.set(false);
	}

	public void winchClimber() {
		winchMotor.set(-1);
	}

	public void winchStop() {
		winchMotor.set(0);
	}
}

package subsystems.frc.team5254;

import org.usfirst.frc.team5254.robot.Constants;
import org.usfirst.frc.team5254.robot.Pathfinder;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Tomahawks {

	private DoubleSolenoid tomahawkPistons = new DoubleSolenoid(Constants.TOMAHAWKS_EXTEND,
			Constants.TOMAHAWKS_RETRACT);

	public Tomahawks() {

	}

	public void tomahawksUp() {
		tomahawkPistons.set(DoubleSolenoid.Value.kForward);
	}

	public void tomahawksDown() {
		tomahawkPistons.set(DoubleSolenoid.Value.kReverse);
	}

}

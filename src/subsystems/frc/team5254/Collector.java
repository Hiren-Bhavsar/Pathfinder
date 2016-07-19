package subsystems.frc.team5254;

import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;

public class Collector {

	private DoubleSolenoid collectorPistons = new DoubleSolenoid(Constants.COLLECTOR_SOLENOID_EXTEND,
			Constants.COLLECTOR_SOLENOID_RETRACT);
	private Talon collectorTalon = new Talon(Constants.COLLECTOR_MOTOR);

	public Collector() {

	}

	public void collectorOn() {
		collectorTalon.set(1);
	}

	public void collectorOff() {
		collectorTalon.set(0);
	}

	public void collectorBackdrive() {
		collectorTalon.set(-1);
	}

	public void collectorUp() {
		collectorPistons.set(DoubleSolenoid.Value.kForward);
	}

	public void collectorDown() {
		collectorPistons.set(DoubleSolenoid.Value.kReverse);
	}

}

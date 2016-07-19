package subsystems.frc.team5254;

import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Puncher {

	DoubleSolenoid puncher = new DoubleSolenoid(Constants.PUNCHER_EXTEND, Constants.PUNCHER_RETRACT);

	public Puncher() {

	}

	public void puncherPunch() {
		puncher.set(DoubleSolenoid.Value.kForward);
	}

	public void puncherPullBack() {
		puncher.set(DoubleSolenoid.Value.kReverse);
	}

}

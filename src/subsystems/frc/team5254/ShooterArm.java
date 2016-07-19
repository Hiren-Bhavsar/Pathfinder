package subsystems.frc.team5254;

import org.usfirst.frc.team20.robot.Team20Libraries.T20CANTalon;
import org.usfirst.frc.team5254.robot.Constants;

import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.DigitalInput;

public class ShooterArm {

	private T20CANTalon shooterArmMotor = new T20CANTalon(Constants.SHOOTER_ARM);
	private DigitalInput shooterArmHomeSensor = new DigitalInput(Constants.SHOOTER_HOME_SENSOR);

	public final double SHOOTER_POS_OUTERWORKS = 0, SHOOTER_POS_BATTER = 0, SHOOTER_POS_HOME = 0;

	public boolean armShouldHome = false;

	public ShooterArm() {
		shooterArmMotor.changeControlMode(TalonControlMode.Position);
		shooterArmMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		shooterArmMotor.setPosition(0);
	}

	public void shooterToPos(double pos) {
		shooterArmMotor.set(pos);
	}

	public boolean getArmHomeState() {
		return shooterArmMotor.homed;
	}

	public boolean getShooterArmHomeSensor() {
		return shooterArmHomeSensor.get();
	}

	public void shooterHomeWatchDog() {
		if (armShouldHome) {
			shooterArmMotor.setPosition(0);
			shooterArmMotor.set(-3000);
		}
		if (shooterArmHomeSensor.get()) {
			armShouldHome = false;
			shooterArmMotor.homed = true;
		}
	}

}

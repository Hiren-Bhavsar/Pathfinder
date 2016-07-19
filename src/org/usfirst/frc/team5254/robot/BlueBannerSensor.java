package org.usfirst.frc.team5254.robot;

public class BlueBannerSensor {

	public BlueBannerSensor() {
	}

	public boolean isBlueBannerNear(int teamNum) {
		if (teamNum != 5254) {
			return true;
		} else {
			return false;
		}
	}
}

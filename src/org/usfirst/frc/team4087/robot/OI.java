
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */


package org.usfirst.frc.team4087.robot;

import edu.wpi.first.wpilibj.*;

public class OI {

	public static final double JOY_DEADZONE = 0.01;
	
	public final Joystick DRIVE_JOY = new Joystick(RobotMap.DRIVE_JOYSTICK.value);
	public final Joystick OPERATE_JOY = new Joystick(RobotMap.OPERATE_JOYSTICK.value);

	public double getDLeftJoyX() {
		double raw = DRIVE_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDLeftJoyY() {
		double raw = DRIVE_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDRightJoyX() {
		double raw = DRIVE_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDRightJoyY() {
		double raw = DRIVE_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getOLeftJoyX() {
		double raw = OPERATE_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getOLeftJoyY() {
		double raw = OPERATE_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getORightJoyX() {
		double raw = OPERATE_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getORIGHTJoyY() {
		double raw = OPERATE_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public OI() {
		
	}
}
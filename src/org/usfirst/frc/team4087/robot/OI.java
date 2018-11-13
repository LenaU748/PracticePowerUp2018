
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */


package org.usfirst.frc.team4087.robot;

import edu.wpi.first.wpilibj.*;

public class OI {

	public static final double JOY_DEADZONE = 0.01;
	
	public final Joystick DLEFT_JOY = new Joystick(RobotMap.DLEFT_JOYSTICK.value);
	public final Joystick DRIGHT_JOY = new Joystick(RobotMap.DRIGHT_JOYSTICK.value);
	public final Joystick OLEFT_JOY = new Joystick(RobotMap.OLEFT_JOYSTICK.value);
	public final Joystick ORIGHT_JOY = new Joystick(RobotMap.ORIGHT_JOYSTICK.value);
	
	public double getDLeftJoyX() {
		double raw = DLEFT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDLeftJoyY() {
		double raw = DLEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDRightJoyX() {
		double raw = DRIGHT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getDRightJoyY() {
		double raw = DRIGHT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getOLeftJoyX() {
		double raw = OLEFT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getOLeftJoyY() {
		double raw = OLEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getORightJoyX() {
		double raw = ORIGHT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getORIGHTJoyY() {
		double raw = ORIGHT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public OI() {
		
	}
}
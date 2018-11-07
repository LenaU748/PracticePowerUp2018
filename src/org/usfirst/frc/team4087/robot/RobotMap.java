/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */


package org.usfirst.frc.team4087.robot;

public enum RobotMap {
	//PWM Motor Mappings
	LEFT_MOTOR(1), 
	RIGHT_MOTOR(2),
	LEFT_FOLLOW_MOTOR(2),
	RIGHT_FOLLOW_MOTOR(3),
	//Control Mappings
	LEFT_JOYSTICK(0),
	RIGHT_JOYSTICK(1); 

	public final int value;

	RobotMap(int value) {
		this.value = value;
	}
}
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */


package org.usfirst.frc.team4087.robot;

public enum RobotMap {
	//Motor Mapping
	//DriveTrain
	LEFT_MOTOR(1), 
	RIGHT_MOTOR(2),
	LEFT_FOLLOW_MOTOR(2),
	RIGHT_FOLLOW_MOTOR(3),
	//Winch
	WINCH_MOTOR(4),
	WINCH_SLAVE(5),
	//Control Mappings
	DLEFT_JOYSTICK(0),
	DRIGHT_JOYSTICK(0),
	OLEFT_JOYSTICK(1),
	ORIGHT_JOYSTICK(1);
	//

	public final int value;

	RobotMap(int value) {
		this.value = value;
	}
}
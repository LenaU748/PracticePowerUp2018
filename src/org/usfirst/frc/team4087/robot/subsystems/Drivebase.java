package org.usfirst.frc.team4087.robot.subsystems;

import org.usfirst.frc.team4087.robot.*;
import org.usfirst.frc.team4087.robot.commands.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.command.*;

public class Drivebase extends Subsystem {
	
	private TalonSRX LeftMotor;
	private TalonSRX LeftMotorFollower;
	private TalonSRX RightMotor;
	private TalonSRX RightMotorFollower;
	
	public Drivebase() {
		LeftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
		RightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value);
		LeftMotorFollower = new TalonSRX(RobotMap.LEFT_FOLLOW_MOTOR.value);
		RightMotorFollower = new TalonSRX(RobotMap.RIGHT_FOLLOW_MOTOR.value);
		
		Robot.initTalon(LeftMotor);
		Robot.initTalon(RightMotor);
		Robot.initTalon(LeftMotorFollower);
		Robot.initTalon(RightMotorFollower);
		
		LeftMotorFollower.follow(LeftMotor);
		RightMotorFollower.follow(RightMotor);
			
	}
	
	public void set(ControlMode mode, double leftvalue, double rightvalue) {
		LeftMotor.set(mode, leftvalue);
		RightMotor.set(mode, rightvalue);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

}

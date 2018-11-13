package org.usfirst.frc.team4087.robot.subsystems;

import org.usfirst.frc.team4087.robot.*;
import org.usfirst.frc.team4087.robot.commands.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import com.kauailabs.navx.frc.*;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.*;

public class Drivebase extends Subsystem implements PIDOutput{
	
	private TalonSRX LeftMotor;
	private TalonSRX LeftMotorFollower;
	private TalonSRX RightMotor;
	private TalonSRX RightMotorFollower;
	private final AHRS ahrs;
	
	public final PIDController turnController;
	
	private final double kP = -0;
	private final double kI = -0;
	private final double kD = -0;
	
	public Drivebase() {
		LeftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
		RightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value);
		LeftMotorFollower = new TalonSRX(RobotMap.LEFT_FOLLOW_MOTOR.value);
		RightMotorFollower = new TalonSRX(RobotMap.RIGHT_FOLLOW_MOTOR.value);
		ahrs = new AHRS(SPI.Port.kMXP);
		
		Robot.initTalon(LeftMotor);
		Robot.initTalon(RightMotor);
		Robot.initTalon(LeftMotorFollower);
		Robot.initTalon(RightMotorFollower);
		
		LeftMotorFollower.follow(LeftMotor);
		RightMotorFollower.follow(RightMotor);
			
		turnController = new PIDController(kP, kI, kD, ahrs, this);
		turnController.setInputRange(-180.0f, 180.0f);
		turnController.setOutputRange(-0.45, 0.45);
		turnController.setAbsoluteTolerance(2.0f);
		turnController.setContinuous();
	}
	
	public void rotateDegrees(double angle) {
		ahrs.reset();
		turnController.reset();
		turnController.setPID(kP, kI, kD);
		turnController.setSetpoint(angle);
		turnController.enable();
		
	}
	public void set(ControlMode mode, double leftvalue, double rightvalue) {
		LeftMotor.set(mode, leftvalue);
		RightMotor.set(mode, rightvalue);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

	@Override
	public void pidWrite(double output) {
		set(ControlMode.PercentOutput, -output, output);
		
	}

}

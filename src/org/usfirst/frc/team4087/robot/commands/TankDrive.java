package org.usfirst.frc.team4087.robot.commands;

import org.usfirst.frc.team4087.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);
		
	}
	protected void initialize() {
		
	}
	protected void execute() {
		double throttle = (1.0 - Robot.oi.LEFT_JOY.getThrottle()) / -2.0;
		
		Robot.drivebase.set(ControlMode.PercentOutput, Robot.oi.getLeftJoyY() * throttle, Robot.oi.getRightJoyY() * throttle);
	}
	protected boolean isFinished() {

		return false;
	}

	protected void interrupted() {
		end();
	}
}

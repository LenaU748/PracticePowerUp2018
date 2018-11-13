package org.usfirst.frc.team4087.robot.commands;

import org.usfirst.frc.team4087.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class WinchPractice extends Command {

	public WinchPractice() {
		requires(Robot.winch);
	}
	
protected void initialize() {
		
	}
	protected void execute() {
		
	}
	protected boolean isFinished() {

		return false;
	}

	protected void interrupted() {
		end();
	}

}

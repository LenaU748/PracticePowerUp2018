package org.usfirst.frc.team4087.robot.commands;

import org.usfirst.frc.team4087.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurnToAngle extends Command {

	double Angle;

	boolean isFinished = false;
	boolean inErrorZone = false;
	int count;
	
	public TurnToAngle(double angle) {
		requires(Robot.drivebase);
		Angle = angle;
	}

	protected void initialize() {
		Robot.drivebase.rotateDegrees(Angle);
	}

	protected void execute() {
		double error = Robot.drivebase.turnController.getError();
		inErrorZone = Math.abs(error) < 2;
		
		if(inErrorZone){ 
			count++;
				isFinished = count >= 5;	
		}
		else {
			count = 0;
		}
	}

	protected boolean isFinished() {

		return isFinished;
	}

	protected void interrupted() {
		end();
	}
	
	protected void end() {
		Robot.drivebase.turnController.disable();
	}
}

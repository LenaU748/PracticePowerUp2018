package org.usfirst.frc.team4087.robot.subsystems;

import org.usfirst.frc.team4087.robot.Robot;
import org.usfirst.frc.team4087.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class WinchElevator extends Subsystem {

	private TalonSRX WinchMotor;
	private TalonSRX WinchSlave;

	public WinchElevator() {
		WinchMotor = new TalonSRX(RobotMap.WINCH_MOTOR.value);
		WinchSlave = new TalonSRX(RobotMap.WINCH_SLAVE.value);

		Robot.initTalon(WinchMotor);
		Robot.initTalon(WinchSlave);

		WinchSlave.follow(WinchMotor);

	}

	@Override
	protected void initDefaultCommand() {

	}

}

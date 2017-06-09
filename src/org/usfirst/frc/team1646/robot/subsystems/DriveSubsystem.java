package org.usfirst.frc.team1646.robot.subsystems;

import org.usfirst.frc.team1646.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	private Talon frontLeft;
	private Talon backLeft;
	private Talon frontRight;
	private Talon backRight;
	
	public DriveSubsystem() {
		frontLeft = new Talon(RobotMap.driveFrontLeft);
		backLeft = new Talon(RobotMap.driveBackLeft);
		frontRight = new Talon(RobotMap.driveFrontRight);
		backRight = new Talon(RobotMap.driveBackRight);	
	}
	
	public Talon getFrontLeft() {
		return frontLeft;
	}
	
	public Talon getBackLeft() {
		return backLeft;
	}
	
	public Talon getFrontRight() {
		return frontRight;
	}
	
	public Talon getBackRight() {
		return backRight;
	}
	
	//FIXME the directions might be the opposite
	public void rightPower(double right) {
		frontRight.set(right);
		backRight.set(right);
	}
	
	public void leftPower(double left) {
		frontLeft.set(left);
		backLeft.set(left);
	}
	
	public void tankDrive(double left, double right) {

		frontLeft.set(left);
		backLeft.set(left);
		
		frontRight.set(right);
		backRight.set(right);
	}
	//FIXME the directions might be the opposite
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub		
	}
}

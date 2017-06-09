package org.usfirst.frc.team1646.robot.commands;

import org.usfirst.frc.team1646.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
 
public class DriveWithSticks extends Command {

	private double maxPower = 0;
	
    public DriveWithSticks() {
    	requires(Robot.driveSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	
    	double left = Robot.oi.leftStick.getY();
		double right = Robot.oi.rightStick.getY();

		boolean leftTrigger = Robot.oi.leftStick.getRawButton(1);
		boolean rightTrigger = Robot.oi.rightStick.getRawButton(1);
		
		if (leftTrigger || rightTrigger) {
			maxPower = 1;
			Robot.driveSubsystem.tankDrive(maxPower * left, maxPower * right);
		} else {
			maxPower = 0.5;
			Robot.driveSubsystem.tankDrive(maxPower * left, maxPower * right);
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

package org.usfirst.frc.team1646.robot.subsystems;

import org.usfirst.frc.team1646.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BallCollector extends Subsystem {
	
	//FIXME is it a single solenoid or double? 
	private Solenoid intakeBall;
	private Talon keepBall;
	
	private DoubleSolenoid collectBall;
	
	public static boolean extend = false;
	public static boolean retract = true;
	
	public BallCollector() {
		intakeBall = new Solenoid(RobotMap.intakeBall);
		keepBall = new Talon(RobotMap.keepBall);
		
		//Don't know what the forward channel (1st) and a reverse channel (2nd) will be
		collectBall = new DoubleSolenoid( , );
	}
	
	public Solenoid getIntakeBall() {
		return intakeBall;
	}
	
	public Talon getKeepBall() {
		return keepBall;
	}
	
	public DoubleSolenoid getCollectBall() {
		return collectBall;
	}
	
	public void spinWheels() {
		keepBall.set(0.5);
	}
	
	// false = extend; true = retract
	// S = Single Solenoid; D = Double Solenoid
	public void moveToCollectS() {
		intakeBall.set(extend);
		spinWheels();
	}
	
	public void moveToOriginalS() {
		intakeBall.set(retract);
		spinWheels();
	}
	
	public void moveToCollectD() {
		collectBall.set(DoubleSolenoid.Value.kForward);
	}
	
	public void moveToOriginalD() {
		collectBall.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void neitherChannelEnabled() {
		collectBall.set(DoubleSolenoid.Value.kOff);
	}
	

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}


package com.sexy.beast.subsystems;

import com.sexy.beast.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController left = new Talon(RobotMap.leftMotor);
    SpeedController right = new Talon(RobotMap.rightMotor);
    
    public void initDefaultCommand() {
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double left, double right) {
        this.left.set(left);
        this.right.set(right);
    }
}


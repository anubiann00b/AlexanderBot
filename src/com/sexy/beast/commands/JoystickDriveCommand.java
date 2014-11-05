
package com.sexy.beast.commands;

import com.sexy.beast.OI;

public class JoystickDriveCommand extends CommandBase {
    
    public JoystickDriveCommand() {
        requires(driveSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        driveSubsystem.tankDrive(oi.getAxis(OI.LEFT_Y), oi.getAxis(OI.RIGHT_Y));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

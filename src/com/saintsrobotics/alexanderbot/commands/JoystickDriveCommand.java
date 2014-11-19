
package com.saintsrobotics.alexanderbot.commands;

import com.saintsrobotics.alexanderbot.OI;

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

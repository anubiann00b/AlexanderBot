package com.saintsrobotics.alexanderbot.commands;

public class AutonDriveCommand extends CommandBase {
    
    int iterations = 0;
    
    public AutonDriveCommand() {
        requires(driveSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        iterations++;
        driveSubsystem.tankDrive(0.1, 0.1);
    }

    protected boolean isFinished() {
        return iterations<=100;
    }

    protected void end() {
        driveSubsystem.tankDrive(0, 0);
    }

    protected void interrupted() {
    }
}

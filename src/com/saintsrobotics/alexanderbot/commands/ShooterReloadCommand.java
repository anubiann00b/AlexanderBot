package com.saintsrobotics.alexanderbot.commands;

public class ShooterReloadCommand extends CommandBase {

    public ShooterReloadCommand() {
        requires(shooterSubsytem);
    }

    protected void initialize() {
       shooterSubsytem.reload(); 
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return shooterSubsytem.shouldStopReload();
    }

    protected void end() {
        shooterSubsytem.stopReload();
    }

    protected void interrupted() {
    }
}

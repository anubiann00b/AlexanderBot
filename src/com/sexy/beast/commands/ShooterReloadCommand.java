package com.sexy.beast.commands;
//I <3 Shreyas 
//Shreyas <3 programming club

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

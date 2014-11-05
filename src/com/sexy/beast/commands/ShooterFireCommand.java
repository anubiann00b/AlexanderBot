package com.sexy.beast.commands;

public class ShooterFireCommand extends CommandBase {
    
    public ShooterFireCommand() {
        requires(shooterSubsytem);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooterSubsytem.fire();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

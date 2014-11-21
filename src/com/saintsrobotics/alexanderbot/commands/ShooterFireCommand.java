package com.saintsrobotics.alexanderbot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;

public class ShooterFireCommand extends CommandBase {

    Relay arm;
    SpeedController flyWheel;
    DigitalInput tripWire;

    public ShooterFireCommand() {
        requires(shooterSubsytem);
    }

    protected void initialize() {
       shooterSubsytem.push(); 
    }

    protected void execute() {
         
    }

    protected boolean isFinished() {
        return shooterSubsytem.tripped();
    }

    protected void end() {
        shooterSubsytem.freeze();
    }
            

    protected void interrupted() {
    }
}

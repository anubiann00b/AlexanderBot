package com.saintsrobotics.alexanderbot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {

    Relay arm;
    SpeedController flyWheel;
    DigitalInput tripWire;
    double reloadTime;
    Timer time;
    public void initDefaultCommand() {
        //setDefaultCommand(new MySpecialCommand());        
        arm = new Relay(1);
        flyWheel = new Jaguar(10);
        tripWire = new DigitalInput(2);
        time = new Timer();
    }

    public void push() {
        arm.set(Relay.Value.kForward);
    }

    public void freeze() {
        arm.set(Relay.Value.kOff);

    }
    public void reload() {
        arm.set(Relay.Value.kReverse);
    }
    public boolean shouldStopReload(){
        return time.get() >= reloadTime;
    }
    public void stopReload(){
        time.stop();
        time.reset();
        freeze();
    }

    public boolean tripped() {
        return tripWire.get();
    }
}

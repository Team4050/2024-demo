package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    private TalonSRX fr;
    private TalonSRX fl;
    private TalonSRX rr;
    private TalonSRX rl;

    public Drivetrain() {
        fr = new TalonSRX(Constants.SubsystemConstants.FR);
        fl = new TalonSRX(Constants.SubsystemConstants.FL);
        rr = new TalonSRX(Constants.SubsystemConstants.RR);
        rl = new TalonSRX(Constants.SubsystemConstants.RL);

        fr.setInverted(true);
        rr.setInverted(true);
    }

    public void set(double v, double t) {
        fr.set(TalonSRXControlMode.PercentOutput, v - t);
        rr.set(TalonSRXControlMode.PercentOutput, v - t);

        fl.set(TalonSRXControlMode.PercentOutput, v + t);
        rl.set(TalonSRXControlMode.PercentOutput, v + t);
    }
}

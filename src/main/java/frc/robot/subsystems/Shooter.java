package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    TalonSRX shooterMotor;
    Shooter() {
        shooterMotor = new TalonSRX(Constants.SubsystemConstants.RH);
    } 
   public void set(double a) {
    shooterMotor.set(TalonSRXControlMode.PercentOutput, a);
   };
}

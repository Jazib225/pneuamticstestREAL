package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain {
    private CANSparkMax leftMotor, rightMotor;
    public Drivetrain() {
   leftMotor = new CANSparkMax(1, MotorType.kBrushless);
   rightMotor = new CANSparkMax(2, MotorType.kBrushless);

   leftMotor.setInverted(true);
   
  //Differential Drive
DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);
}
}
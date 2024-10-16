
package frc.robot;
//https://software-metadata.revrobotics.com/REVLib-2024.json

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {

  //Xbox Controller
  XboxController controller = new XboxController(0);

  //Pneumatics
  private final Compressor compressor = new Compressor(null);
  private final DoubleSolenoid solenoid = new DoubleSolenoid(null, 0, 1);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    compressor.disable();
  }

  @Override
  public void teleopPeriodic() {
    if (controller.getRightBumper())  {
      solenoid.set(DoubleSolenoid.Value.kForward);
    } else if (controller.getLeftBumper()) {
      solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    if (controller.getAButton())  {
      compressor.disable();
    }

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    private XboxController controller;

    public Controller() {
        controller = new XboxController(0);
    }

    public double getLeftY() {
        return controller.getLeftY();
    }

    public double getRightY() {
        return controller.getRightY();
    }

    public double getRightX() {
        return controller.getRightX();
    }

    public boolean getLeftBumper() {
        return controller.getLeftBumperPressed();
    }

    public boolean getRightBumper() {
        return controller.getRightBumperPressed();
    }

    public boolean getAButton() {
        return controller.getAButtonPressed();
    }

    public boolean getBButton() {
        return controller.getBButtonPressed();
    }

    public boolean leftBumperPressed() {
        return controller.getLeftBumper();
    }

    public boolean rightBumperPressed() {
        return controller.getRightBumper();
    }

    public boolean aButtonPressed() {
        return controller.getAButtonPressed();
    }

    public boolean bButtonPressed() {
        return controller.getBButtonPressed();
    }

}
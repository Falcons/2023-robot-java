// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class RobotContainer {
  XboxController driveController = new XboxController(0);
  XboxController peripheralController = new XboxController(1);
  SendableChooser<Command> autoChooser = new SendableChooser<Command>();
  private final Drivetrain drivetrain = new Drivetrain();
  public RobotContainer() {
    configureBindings();
    drivetrain.setDefaultCommand(new ArcadeDrive(drivetrain,
     () -> -driveController.getLeftY(),
     () -> -driveController.getRightX()));
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
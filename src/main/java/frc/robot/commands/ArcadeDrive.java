// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends Command {
  Drivetrain drivetrain;
  Supplier<Double> speed, rotation;
  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(Drivetrain drivetrain,Supplier<Double> speed, Supplier<Double> rotation) {
    addRequirements(drivetrain);
    this.drivetrain = drivetrain;
    this.speed = speed;
    this.rotation = rotation;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("arcade drive start");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double RealTimeSpeed = speed.get();
    double RealTimeRotation = rotation.get();
    drivetrain.ArcadeDrive(RealTimeSpeed, RealTimeRotation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("arcade drive end");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstents;;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */
  public Arm() {
    ShuffleboardTab tab = Shuffleboard.getTab("Arm");

    TalonFX pivotMotor = new TalonFX(ArmConstents.PIVOT_MOTOR_ID);
    TalonFX boomOneMotor = new TalonFX(ArmConstents.BOOM_ONE_ID);
    TalonFX boomTwoMotor = new TalonFX(ArmConstents.BOOM_TWO_ID);
    TalonFX wristMotor = new TalonFX(ArmConstents.WRIST_MOTOR_ID);
    // The default power of the intake motor.
    double MaxEncoderExtensionBoomOne = -535000.0;
    double MotorPowerBoomOne = 0.99;
    double MaxEncoderExtensionBoomTwo = -437300.0;
    double MotorPowerBoomTwo = 0.99;
    double PivotPower = 0.65;
    double MaxEncoderExtensionPivot = -242000.0;
    double WristPower = 0.25;
    double MaxEncoderExtensionWrist = -70000.0;
    double DEADBAND_VALUE = 0.20;

    pivotMotor.setNeutralMode(NeutralModeValue.Brake);
    boomOneMotor.setNeutralMode(NeutralModeValue.Brake);
    boomTwoMotor.setNeutralMode(NeutralModeValue.Brake);
    wristMotor.setNeutralMode(NeutralModeValue.Brake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}

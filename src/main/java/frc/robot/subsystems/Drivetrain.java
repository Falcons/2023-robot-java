package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import com.ctre.phoenix6.controls.Follower;

public class Drivetrain extends SubsystemBase{
    final TalonFX leftFrontMotor = new TalonFX(DriveConstants.LEFT_FRONT_ID);
    final TalonFX leftRearMotor = new TalonFX(DriveConstants.LEFT_REAR_ID);
    final TalonFX rightFrontMotor = new TalonFX(DriveConstants.RIGHT_FRONT_ID);
    final TalonFX rightRearMotor = new TalonFX(DriveConstants.RIGHT_REAR_ID);

    final DifferentialDrive drive = new DifferentialDrive(leftFrontMotor::set, rightFrontMotor::set);
    
    public Drivetrain() {
        leftRearMotor.setControl(new Follower(DriveConstants.LEFT_FRONT_ID, false));
        rightRearMotor.setControl(new Follower(DriveConstants.RIGHT_FRONT_ID, false));
    }
    public void ArcadeDrive(Double speed, Double rotation) {
        drive.arcadeDrive(speed, rotation);
    }
    public void TankDrive(double leftSpeed, double RightSpeed){
        drive.tankDrive(leftSpeed, RightSpeed);
    }

    @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}

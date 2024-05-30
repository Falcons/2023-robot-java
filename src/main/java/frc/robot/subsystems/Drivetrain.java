package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.Pigeon2;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
// Drivetrain extends SubsystemBase, look at 2024Robot as example
// Right click on a folder -> "create a new class/command" (I did this for every file I ever made on Ingenuity)
public class Drivetrain extends SubsystemBase {
    private final TalonFX leftFrontMotor;
    private final TalonFX leftRearMotor;
    private final TalonFX rightFrontMotor;
    private final TalonFX rightRearMotor;
    private final DifferentialDrive drive;
    private final Pigeon2 gyro;
    public Drivetrain() {
        leftFrontMotor = new TalonFX(DriveConstants.LEFT_FRONT_ID);
        leftRearMotor = new TalonFX(DriveConstants.LEFT_REAR_ID);
        rightFrontMotor = new TalonFX(DriveConstants.RIGHT_FRONT_ID);
        rightRearMotor = new TalonFX(DriveConstants.RIGHT_REAR_ID);
        drive = new DifferentialDrive(leftFrontMotor::set, rightFrontMotor::set);
        gyro = new Pigeon2(DriveConstants.GYRO_ID);
        rightRearMotor.setControl(new Follower(DriveConstants.RIGHT_FRONT_ID, false));
        leftRearMotor.setControl(new Follower(DriveConstants.LEFT_FRONT_ID, false));
        drive.setMaxOutput(0.2);
    }
    public void driveForward() {
        drive.tankDrive(1, 1);
    }
}

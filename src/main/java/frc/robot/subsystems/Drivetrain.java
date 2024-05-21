package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.Pigeon2;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.DriveConstants;
import com.ctre.phoenix6.controls.Follower;

public class Drivetrain {
    public Drivetrain() {
        TalonFX leftFrontMotor = new TalonFX(DriveConstants.LEFT_FRONT_ID);
        TalonFX leftRearMotor = new TalonFX(DriveConstants.LEFT_REAR_ID);
        TalonFX rightFrontMotor = new TalonFX(DriveConstants.RIGHT_FRONT_ID);
        TalonFX rightRearMotor = new TalonFX(DriveConstants.RIGHT_REAR_ID);
        DifferentialDrive drive = new DifferentialDrive(leftFrontMotor::set, rightFrontMotor::set);
        Pigeon2 gyro = new Pigeon2(DriveConstants.GYRO_ID);
        rightRearMotor.setControl(new Follower(DriveConstants.RIGHT_FRONT_ID, false));
        leftRearMotor.setControl(new Follower(DriveConstants.LEFT_FRONT_ID, false));
    }
    public static void driveForward() {

    }
}

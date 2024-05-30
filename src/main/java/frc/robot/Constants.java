// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
public final class Constants {
    public static final class DriveConstants {
        public static final int LEFT_FRONT_ID = 3;
        public static final int LEFT_REAR_ID = 4;
        public static final int RIGHT_FRONT_ID = 1;
        public static final int RIGHT_REAR_ID = 2;
        public static final int TIME_OF_FLIGHT_ID = 6;
        public static final int GYRO_ID = 5;
    }
    public static final class IntakeConstants{
        public static final int INTAKE_MOTOR_ID = 7;
        public static final int GRAB_MOTOR_ID = 8;
        public static final int OBJECT_SENSOR_ID = 4;
    }
    public static final class LightConstants{
        public static final int ORANGE_ID = 0;
        public static final int PURPLE_ID = 1;
        public static final int PURPLE_BLINK_ID = 2;
        public static final int ORANGE_BLINK_ID = 3;
    }
    public static final class ArmConstents{
        public static final int BOOM_ONE_ID = 11;
        public static final int BOOM_TWO_ID = 12;

        public static final int WRIST_MOTOR_ID = 10;
        public static final int PIVOT_MOTOR_ID = 9;

        public double MaxEncoderExtensionBoomOne = -535000.0;
        public double MotorPowerBoomOne = 0.99;
        public double MaxEncoderExtensionBoomTwo = -437300.0;
        public double MotorPowerBoomTwo = 0.99;
        public double PivotPower = 0.65;
        public double MaxEncoderExtensionPivot = -242000.0;
        public double WristPower = 0.25;
        public double MaxEncoderExtensionWrist = -70000.0;
        public double DEADBAND_VALUE = 0.20;
    }
}
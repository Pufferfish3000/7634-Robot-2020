/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LiftSub extends SubsystemBase {
  private final Victor liftMotor;
  private final Victor trackMotor;
  private final Victor fakeMotorLol;
  private DifferentialDrive trackingDriveYeet;

  public LiftSub() {
    liftMotor = new Victor(Constants.LIFT_MOTOR);
    trackMotor = new Victor(Constants.TRACK_MOTOR);
    fakeMotorLol = new Victor(12);
    trackingDriveYeet = new DifferentialDrive(trackMotor,fakeMotorLol);
  }

  @Override
  public void periodic() {
  }

  public void liftWinchUp(){
    liftMotor.set(Constants.LIFT_UP);
  }

  public void liftWinchDown(){
    liftMotor.set(Constants.LIFT_DOWN);
  }

  public void liftWinchStop(){
    liftMotor.set(Constants.LIFT_STOP);
  }

  public void traaaaaackinnnnnngggggg(double left, double right) {
    trackingDriveYeet.tankDrive(left, right);
  }

  public void stopTracking(){
    trackMotor.set(Constants.TRACK_STOP);
  }
}
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.LiftSub;

public class TrackingCommand extends CommandBase {
  //getters
  private final LiftSub m_liftSub;
  private final XboxController climbController;

  public TrackingCommand(LiftSub liftSub, XboxController Xbox) {
    //setters
    m_liftSub = liftSub;
    climbController = Xbox;
    //subsystem dependencies
    addRequirements(m_liftSub);

  }

  public double GetDriverRawAxisT(final int axis) {
    return climbController.getRawAxis(axis);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rightStickY = GetDriverRawAxisT(Constants.LEFT_STICK_X);
    double rightStickX = (0);
    m_liftSub.traaaaaackinnnnnngggggg(rightStickY, rightStickX);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

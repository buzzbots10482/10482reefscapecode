// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANRollerSubsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.TimedRobot;


public final class Autos {

  
    public final static Command Auto(CANDriveSubsystem driveSubsystem, CANRollerSubsystem rollerSubsystem) {
      
    return driveSubsystem.driveArcade(driveSubsystem, () -> 0.55, () -> 0.0).withTimeout(3.25).andThen(rollerSubsystem.runRoller(rollerSubsystem,() -> 0.58, () -> 0).withTimeout(1.0));//.andThen(driveSubsystem.driveArcade(driveSubsystem, () -> -0.55, () -> 0).withTimeout(1.5).andThen(driveSubsystem.driveArcade(driveSubsystem, () -> 0, () -> 0.07).withTimeout(2.0).andThen(driveSubsystem.driveArcade(driveSubsystem, () -> 0.55, () -> 0).withTimeout(3.0).andThen(driveSubsystem.driveArcade(driveSubsystem, () -> 0, () -> 0.50)))));
  
     

      
  }
}
//This is a test 2
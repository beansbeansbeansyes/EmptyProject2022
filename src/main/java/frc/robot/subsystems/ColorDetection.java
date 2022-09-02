// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ColorDetection extends SubsystemBase {
  public ColorSensorV3 sensor = new ColorSensorV3(I2C.Port.kOnboard);

  /** Creates a new ColorDetection. */
  public ColorDetection() {
    
  }

  @Override
  public void periodic() {
    System.out.println(sensor.getRed() + " " + sensor.getBlue());
  }
}

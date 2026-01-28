package frc.robot.subsystems.FunnelLatch;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Latch extends SubsystemBase {
    private static final double LeftServoUnlatchedDegrees = 75;
    private static final double RightServoUnlatchedDegrees = -75;
        //private static final double LeftServoCurrentDegrees = 0;
                //private static final double RightServoCurrentDegrees = 0;
               
               
               
                private final Servo leftServo;
                private final Servo rightServo;
            
                public Latch(final int leftServoID, final int rightServoID) {
                    this.leftServo = new Servo(leftServoID);
                    this.rightServo = new Servo(rightServoID);
                }
            
                @Override
                public void periodic() {
                    SmartDashboard.putNumber("LeftServo", leftServo.getAngle());
                    SmartDashboard.putNumber("RightServo", rightServo.getAngle());
                }
            
                public Command unlatch() {
                    return runOnce(() -> {
                        this.leftServo.setAngle(Latch.LeftServoUnlatchedDegrees);
                        this.rightServo.setAngle(Latch.RightServoUnlatchedDegrees);
                    });
                }
                //public Command latchstop() {
                    //return runOnce(() -> {
                        //this.leftServo.setAngle(Latch.LeftServoCurrentDegrees);
                    //this.rightServo.setAngle(Latch.RightServoCurrentDegrees);
        //});
    }
  



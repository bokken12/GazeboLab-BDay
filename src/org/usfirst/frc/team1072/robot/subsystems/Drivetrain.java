package org.usfirst.frc.team1072.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import org.usfirst.frc.team1072.robot.RobotMap;
import org.usfirst.frc.team1072.robot.RobotMap.Robot.DT;
import org.usfirst.frc.team1072.robot.RobotMap.Robot.DT.Talons;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    private Talon frontLeft, backLeft, frontRight, backRight;
    private Encoder leftEncoder, rightEncoder;
    private Gyro gyro;
    
    public Drivetrain(){
        frontLeft = new Talon(Talons.FRONT_LEFT);
        backLeft = new Talon(Talons.BACK_LEFT);
        frontRight = new Talon(Talons.FRONT_RIGHT);
        backRight = new Talon(Talons.BACK_RIGHT);
        leftEncoder = new Encoder(Talons.FRONT_LEFT, Talons.BACK_LEFT);
        rightEncoder = new Encoder(Talons.FRONT_RIGHT, Talons.BACK_RIGHT);
        gyro = new AnalogGyro(DT.GYRO);
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed){
        frontLeft.set(leftSpeed);
        frontRight.set(rightSpeed);
        backLeft.set(leftSpeed);
        backRight.set(rightSpeed);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    /**
     * @return the frontLeft
     */
    public Talon getFrontLeft()
    {
        return frontLeft;
    }

    /**
     * @param frontLeft the frontLeft to set
     */
    public void setFrontLeft(Talon frontLeft)
    {
        this.frontLeft = frontLeft;
    }

    /**
     * @return the backLeft
     */
    public Talon getBackLeft()
    {
        return backLeft;
    }

    /**
     * @param backLeft the backLeft to set
     */
    public void setBackLeft(Talon backLeft)
    {
        this.backLeft = backLeft;
    }

    /**
     * @return the frontRight
     */
    public Talon getFrontRight()
    {
        return frontRight;
    }

    /**
     * @param frontRight the frontRight to set
     */
    public void setFrontRight(Talon frontRight)
    {
        this.frontRight = frontRight;
    }

    /**
     * @return the backRight
     */
    public Talon getBackRight()
    {
        return backRight;
    }

    /**
     * @param backRight the backRight to set
     */
    public void setBackRight(Talon backRight)
    {
        this.backRight = backRight;
    }

    /**
     * @return the leftEncoder
     */
    public Encoder getLeftEncoder()
    {
        return leftEncoder;
    }

    /**
     * @param leftEncoder the leftEncoder to set
     */
    public void setLeftEncoder(Encoder leftEncoder)
    {
        this.leftEncoder = leftEncoder;
    }

    /**
     * @return the rightEncoder
     */
    public Encoder getRightEncoder()
    {
        return rightEncoder;
    }

    /**
     * @param rightEncoder the rightEncoder to set
     */
    public void setRightEncoder(Encoder rightEncoder)
    {
        this.rightEncoder = rightEncoder;
    }

    /**
     * @return the gyro
     */
    public Gyro getGyro()
    {
        return gyro;
    }

    /**
     * @param gyro the gyro to set
     */
    public void setGyro(Gyro gyro)
    {
        this.gyro = gyro;
    }
    
}


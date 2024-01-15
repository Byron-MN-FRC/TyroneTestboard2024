// RobotBuilder Version: 6.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;



//import com.ctre.phoenix.motorcontrol.can.TalonFX;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Motors extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private CANSparkMax sparkMAX;
private WPI_TalonFX talonFX;
private WPI_TalonSRX talonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Motors() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
sparkMAX = new CANSparkMax(21, MotorType.kBrushless);
 
 sparkMAX.restoreFactoryDefaults();  
sparkMAX.setInverted(false);
sparkMAX.setIdleMode(IdleMode.kCoast);
sparkMAX.burnFlash();
  

talonFX = new WPI_TalonFX(13);
 
 

talonSRX = new WPI_TalonSRX(15);
 
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void spinTalonFX(){
        talonFX.set(0.1);
    }

    public void stopTalonFX(){
        talonFX.set(0);
    }

    public void spinTalonSRX(){
        talonSRX.set(0.2);
    }

    public void stopTalonSRX(){
        talonSRX.set(0);
    }

    public void spinSparkMAX(){
        sparkMAX.set(0.3);
    }

    public void stopSparkMAX(){
        sparkMAX.set(0);
    }
}


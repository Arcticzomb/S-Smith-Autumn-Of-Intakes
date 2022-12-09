package org.usd232.robotics.autumnofintakes.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static org.usd232.robotics.autumnofintakes.Constants.*;
import org.usd232.robotics.autumnofintakes.log.Logger;

public class IntakeSubsystem extends SubsystemBase {
    /**
     * The logger.
     *
     * @since 2018
     * (I copied this from DriveSubsystem.java... ha ha funny???)
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = new Logger();

    private static final Solenoid claw = new Solenoid(PneumaticConstants.PH_CAN_ID, PneumaticsModuleType.REVPH, IntakeConstants.CLAW_PNEUMATIC_PORT);
    private static final Solenoid elevator = new Solenoid(PneumaticConstants.PH_CAN_ID, PneumaticsModuleType.REVPH, IntakeConstants.CLAWEVATOR_PNEUMATIC_PORT);
    // toggles claw
    public void clawPneumatic(boolean on) {
        claw.set(on);
        // https://media1.giphy.com/media/sthmCnCpfr8M8jtTQy/giphy.gif?cid=ecf05e47pr938hr8yv76y9epteco8gjysrx3ilyw42hwerjh&rid=giphy.gif&ct=g
    }

    // toggles claw "elevator"
    public void elevatorPneumatic(boolean on) {
        elevator.set(on);
    }
}

package ClassWork;

import lombok.Getter;

import java.util.Date;

public class Aircraft {
    private @Getter final String m_manufacture;
    private @Getter float m_max_speed;
    private @Getter float m_max_altitude;
    private @Getter final Date m_production_date;


    public Aircraft(String mManufacture, float mMaxSpeed, float mMaxAltitude) {
        m_manufacture = mManufacture;
        m_max_speed = mMaxSpeed;
        m_max_altitude = mMaxAltitude;
        m_production_date = new Date();


    }
}

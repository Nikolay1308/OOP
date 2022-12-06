package ClassWork;

import lombok.Getter;

public class Helicopter extends Aircraft {
    public Helicopter(String mManufacture, float mMaxSpeed, float mMaxAltitude, String m_engine_power) {
        super(mManufacture, mMaxSpeed, mMaxAltitude);
        this.m_engine_power = m_engine_power;
    }

    private @Getter String m_engine_power;

}

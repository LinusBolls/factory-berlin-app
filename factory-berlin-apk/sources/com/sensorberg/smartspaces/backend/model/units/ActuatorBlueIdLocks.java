package com.sensorberg.smartspaces.backend.model.units;

import com.github.jasminb.jsonapi.p.g;

@g("blueid-locks")
public class ActuatorBlueIdLocks extends Actuator {
    public String getType() {
        return "blueid-locks";
    }
}

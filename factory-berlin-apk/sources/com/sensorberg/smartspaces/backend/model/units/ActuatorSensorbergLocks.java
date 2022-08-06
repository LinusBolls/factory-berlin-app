package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.g;

@g("sensorberg-locks")
public class ActuatorSensorbergLocks extends Actuator {
    @JsonProperty("actuator-index")
    public int actuatorIndex;
    @JsonProperty("locker-cluster-id")
    public String clusterId;
    @JsonProperty("locker-cluster-name")
    public String clusterName;

    public String getType() {
        return "sensorberg-locks";
    }
}

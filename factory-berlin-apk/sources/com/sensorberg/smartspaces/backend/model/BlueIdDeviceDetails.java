package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;

@g("actuator-blueid-locks")
public class BlueIdDeviceDetails {
    @JsonProperty("battery-level")
    public Integer batteryLevel;
    @JsonProperty("firmware-version")
    public String firmwareVersion;
    @JsonProperty("hardware-version")
    public String hardwareVersion;
    @a
    public String id;
}

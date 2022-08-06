package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.g;

@g("platform-details")
public class PlatformDetails {
    @JsonProperty("calibrated-threshold")
    public float calibratedThreshold;
}

package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;

@g("unit-bookings")
public class BeBooking {
    @JsonProperty("actuator-id")
    public String actuatorId;
    @JsonProperty("actuator-type")
    public String actuatorType;
    @JsonProperty("ends-at")
    public String endsAt;
    @a
    public String id;
    @JsonProperty("unique-request-id")
    public String requestId;
    @JsonProperty("starts-at")
    public String startsAt;
    @JsonProperty("unit-id")
    public String unitId;
    @JsonProperty("user-id")
    public String userId;
}

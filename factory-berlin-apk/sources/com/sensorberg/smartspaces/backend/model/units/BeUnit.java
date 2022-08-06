package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.d;
import com.github.jasminb.jsonapi.p.g;
import java.util.List;

@g("units")
public class BeUnit {
    @d("actuators")
    public List<Actuator> actuators;
    @JsonProperty("bookable")
    public boolean bookable;
    @JsonProperty("booking-duration-maximum-in-minutes")
    public Long bookingDurationMaxInMinutes;
    @JsonProperty("booking-duration-minimum-in-minutes")
    public Long bookingDurationMinInMinutes;
    @JsonProperty("booking-maximum-starts-at-offset-in-minutes")
    public Long bookingMaximumStartsAtOffsetInMinutes;
    @JsonProperty("booking-requires-actuator")
    public boolean bookingRequiresActuator;
    @JsonProperty("booking-requires-ends-at")
    public boolean bookingRequiresEndsAt;
    @d("connectables")
    public List<Connectable> connectors;
    @a
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("unit-type")
    public String unitType;
}

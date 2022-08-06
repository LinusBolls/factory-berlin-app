package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;
import com.google.gson.annotations.b;

@g("actuator-acting-requests")
public class ActuatorRequest implements Cloneable {
    public static final String STATE_APPROVED = "approved";
    public static final String STATE_DENIED = "denied";
    public static final String STATE_FAILED = "failed";
    public static final String STATE_SUCCESS = "success";
    public static final String STATE_UNAUTHORIZED = "unauthorized";
    @JsonProperty("action")
    @b("action")
    public String action;
    @JsonProperty("actuator-id")
    @b("actuator-id")
    public String actuatorId;
    @JsonProperty("actuator-type")
    @b("actuator-type")
    public String actuatorType;
    @JsonProperty("connector-id")
    @b("connector-id")
    public String connectorId;
    @JsonProperty("connector-type")
    @b("connector-type")
    public String connectorType;
    @JsonProperty("request-created-at")
    @b("request-created-at")
    public String createdAt;
    @JsonProperty("error-details")
    public String errorDetails;
    @JsonIgnore
    public Boolean finished = Boolean.FALSE;
    @a
    public String id;
    @JsonProperty("unique-request-id")
    @b("unique-request-id")
    public String requestId;
    @JsonProperty("state")
    public String state;
    @JsonIgnore
    public Long timestamp;
    @JsonProperty("unit-id")
    @b("unit-id")
    public String unitId;
    @JsonProperty("user-device-id")
    @b("user-device-id")
    public String userDeviceId;

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return "[" + this.requestId + "|" + this.state + "]";
    }
}

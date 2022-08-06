package com.sensorberg.smartspaces.backend.model.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"trust-center-host-name", "api-host-name", "api-key"})
public class BlueIdSettings {
    @JsonProperty("api-key")
    public String apiKey;
    @JsonProperty("maximum-device-time-offset")
    public long serverTimeThreshold;
    @JsonProperty("trust-center-host-name")
    public String trustCenterHostName;
}

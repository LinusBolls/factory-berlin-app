package com.sensorberg.smartspaces.backend.model.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"app-settings"})
public class MeMeta {
    @JsonProperty("app-settings")
    public AppSettings appSettings;
}

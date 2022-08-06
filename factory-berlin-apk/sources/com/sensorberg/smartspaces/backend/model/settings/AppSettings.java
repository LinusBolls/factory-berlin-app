package com.sensorberg.smartspaces.backend.model.settings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.jasminb.jsonapi.d;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"modules"})
public class AppSettings {
    @JsonProperty("modules")
    public Modules modules;

    public static AppSettings extractSettings(d dVar) {
        return ((MeMeta) dVar.d(MeMeta.class)).appSettings;
    }
}

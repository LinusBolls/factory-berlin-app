package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;
import java.util.List;

@g("actuators")
public abstract class Actuator {
    @JsonProperty("action-permissions")
    public List<Action> actions;
    @a
    public String id;
    @JsonProperty("name")
    public String name;

    public abstract String getType();
}

package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.g;
import java.util.List;

@g("sensorberg-gateways")
public class ConnectableSensorbergGateway extends Connectable {
    @JsonProperty("backend-communication-channels")
    public List<String> commChannels;
    @JsonProperty("bluetooth-service-uuid")
    public String serviceUuid;
}

package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.g;

@g("blueid-devices")
public class ConnectableBlueIdDevice extends Connectable {
    @JsonProperty("device-name")
    public String bluetoothName;
    @JsonProperty("secure-object-id")
    public String secureObjectId;
}

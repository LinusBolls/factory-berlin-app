package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionPeriod {
    @JsonProperty("ends-at")
    public long endsAt;
    @JsonProperty("starts-at")
    public long startsAt;

    public boolean isAvailable(long j2) {
        return j2 >= this.startsAt * 1000 && j2 < this.endsAt * 1000;
    }
}

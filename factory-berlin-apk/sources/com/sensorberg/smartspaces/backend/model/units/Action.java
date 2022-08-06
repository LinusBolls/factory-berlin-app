package com.sensorberg.smartspaces.backend.model.units;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Action {
    @JsonProperty("name")
    public String name;
    @JsonProperty("periods")
    public List<ActionPeriod> periods;

    public boolean isAvailableNow() {
        List<ActionPeriod> list = this.periods;
        if (list != null && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i2 = 0; i2 < this.periods.size(); i2++) {
                if (this.periods.get(i2).isAvailable(currentTimeMillis)) {
                    return true;
                }
            }
        }
        return false;
    }
}

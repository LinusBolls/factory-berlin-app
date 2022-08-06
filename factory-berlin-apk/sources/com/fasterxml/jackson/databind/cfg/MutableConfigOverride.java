package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

public class MutableConfigOverride extends ConfigOverride implements Serializable {
    public MutableConfigOverride() {
    }

    public MutableConfigOverride copy() {
        return new MutableConfigOverride(this);
    }

    protected MutableConfigOverride(MutableConfigOverride mutableConfigOverride) {
        super(mutableConfigOverride);
    }
}

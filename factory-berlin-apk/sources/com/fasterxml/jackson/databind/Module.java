package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;

public abstract class Module {

    public interface SetupContext {
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return Module.class.getName();
    }

    public abstract void setupModule(SetupContext setupContext);

    public abstract Version version();
}

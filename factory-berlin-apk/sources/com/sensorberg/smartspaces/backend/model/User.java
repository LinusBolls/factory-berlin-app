package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;

@g("users")
public class User {
    @JsonProperty("email")
    public String email;
    @JsonProperty("full-name")
    public String fullName;
    @a
    public String id;
}

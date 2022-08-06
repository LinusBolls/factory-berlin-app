package com.sensorberg.smartspaces.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;

@g("users")
public class ChangeUserPassword {
    @JsonProperty("current-password")
    public String currentPassword;
    @a
    public String id;
    @JsonProperty("password")
    public String newPassword;
    @JsonProperty("password-confirmation")
    public String newPasswordConfirmation;
}

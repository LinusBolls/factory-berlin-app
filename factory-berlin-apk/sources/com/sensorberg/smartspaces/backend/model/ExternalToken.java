package com.sensorberg.smartspaces.backend.model;

import com.google.gson.annotations.a;
import com.google.gson.annotations.b;

public class ExternalToken {
    @b("client_id")
    @a
    public String clientId;
    @b("grant_type")
    @a
    public String grantType = "password";
    @b("scope")
    @a
    public String scope = "me";
    @b("external_authentication_token")
    @a
    public String token;

    public ExternalToken(String str, String str2) {
        this.token = str;
        this.clientId = str2;
    }
}

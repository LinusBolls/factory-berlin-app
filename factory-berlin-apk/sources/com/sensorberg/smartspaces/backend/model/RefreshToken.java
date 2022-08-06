package com.sensorberg.smartspaces.backend.model;

import com.google.gson.annotations.a;
import com.google.gson.annotations.b;

public class RefreshToken {
    @b("client_id")
    @a
    public String clientId;
    @b("grant_type")
    @a
    public String grantType = "refresh_token";
    @b("refresh_token")
    @a
    public String refreshToken;

    public RefreshToken(String str, String str2) {
        this.refreshToken = str;
        this.clientId = str2;
    }
}

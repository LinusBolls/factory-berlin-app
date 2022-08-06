package com.sensorberg.smartspaces.backend.model;

import com.google.gson.annotations.a;
import com.google.gson.annotations.b;

public class LoginData {
    @b("client_id")
    @a
    public String clientId;
    @b("grant_type")
    @a
    public String grantType = "password";
    @b("password")
    @a
    public String password;
    @b("scope")
    @a
    public String scope = "me";
    @b("username")
    @a
    public String username;

    public LoginData(String str, String str2, String str3) {
        this.username = str;
        this.password = str2;
        this.clientId = str3;
    }
}

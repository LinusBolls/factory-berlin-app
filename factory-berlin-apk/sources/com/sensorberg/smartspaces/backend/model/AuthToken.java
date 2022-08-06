package com.sensorberg.smartspaces.backend.model;

import android.net.Uri;
import com.google.gson.annotations.a;
import com.google.gson.annotations.b;

public class AuthToken {
    static final long RENEW_THRESHOLD = 86400000;
    @b("access_token")
    @a
    public String accessToken;
    @b("created_at")
    @a
    public long createdAtInSeconds;
    @b("expires_in")
    @a
    public long expiresInSeconds;
    @b("refresh_token")
    @a
    public String refreshToken;
    @b("scope")
    @a
    public String scope;
    @b("token_type")
    @a
    public String tokenType;

    public static AuthToken from(String str) {
        AuthToken authToken = new AuthToken();
        Uri parse = Uri.parse(str);
        authToken.accessToken = parseString(parse, "access_token");
        authToken.tokenType = parseString(parse, "token_type");
        authToken.expiresInSeconds = parseLong(parse, "expires_in");
        authToken.refreshToken = parseString(parse, "refresh_token");
        authToken.scope = parseString(parse, "scope");
        authToken.createdAtInSeconds = parseLong(parse, "created_at");
        return authToken;
    }

    private static long parseLong(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.parseLong(queryParameter);
        }
        throw new IllegalArgumentException("Uri doesn't contain " + str);
    }

    private static String parseString(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new IllegalArgumentException("Uri doesn't contain " + str);
    }

    public static boolean shouldRenew(AuthToken authToken, long j2) {
        return j2 - (authToken.createdAtInSeconds * 1000) > RENEW_THRESHOLD;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
}

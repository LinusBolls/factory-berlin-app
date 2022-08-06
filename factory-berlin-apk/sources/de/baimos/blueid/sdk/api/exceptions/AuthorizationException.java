package de.baimos.blueid.sdk.api.exceptions;

import de.baimos.blueid.sdk.api.response.AuthorizationStatus;

public class AuthorizationException extends Exception {
    private int errorCode;
    private AuthorizationStatus status;

    public AuthorizationException(int i2, String str) {
        super(str);
        this.status = AuthorizationStatus.UNKNOWN_ERROR;
        this.errorCode = i2;
    }

    public AuthorizationException(AuthorizationStatus authorizationStatus, String str) {
        super(str);
        this.status = authorizationStatus;
        this.errorCode = authorizationStatus.getCode();
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public AuthorizationStatus getStatus() {
        return this.status;
    }
}

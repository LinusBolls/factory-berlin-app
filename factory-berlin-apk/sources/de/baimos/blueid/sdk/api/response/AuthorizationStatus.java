package de.baimos.blueid.sdk.api.response;

public enum AuthorizationStatus {
    OK(0),
    TICKET_INVALID(3),
    TICKET_NOT_VALID_YET(4),
    TICKET_NOT_VALID_ANYMORE(5),
    TICKET_REVOKED(10),
    COMMAND_NOT_ALLOWED(11),
    CHANNEL_NOT_ALLOWED(12),
    TICKET_FOR_OTHER_DEVICE(14),
    MOBILE_NOT_TRUSTED(15),
    INTERNAL_ERROR(16),
    NO_TICKET(17),
    NO_TICKET_ON_LOCKSERVER(30),
    NO_TICKET_ON_DEVICE(500),
    UNKNOWN_ERROR(-1);
    
    private final int a;

    private AuthorizationStatus(int i2) {
        this.a = i2;
    }

    public static AuthorizationStatus convertToStatus(int i2) {
        for (AuthorizationStatus authorizationStatus : values()) {
            if (authorizationStatus.a == i2) {
                return authorizationStatus;
            }
        }
        return UNKNOWN_ERROR;
    }

    public int getCode() {
        return this.a;
    }
}

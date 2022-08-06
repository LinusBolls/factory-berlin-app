package de.baimos;

public enum ai {
    NO_EXTENSION_LEFT(0),
    TICKET_REVOCATION_CONFIRMATION(1),
    OPERATOR_RESPONSE(2),
    SIGNED_TRUST_CENTER_RESPONSE(3);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f8186e;

    private ai(int i2) {
        this.f8186e = i2;
    }

    public int a() {
        return this.f8186e;
    }
}

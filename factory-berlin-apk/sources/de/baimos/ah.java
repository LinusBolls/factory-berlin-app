package de.baimos;

public enum ah {
    NO_EXTENSION_LEFT(0),
    COMMAND_PARAMETER(1),
    PROCESS_TICKET_REVOCATIONS(2);
    

    /* renamed from: d  reason: collision with root package name */
    private final int f8183d;

    private ah(int i2) {
        this.f8183d = i2;
    }

    public int a() {
        return this.f8183d;
    }
}

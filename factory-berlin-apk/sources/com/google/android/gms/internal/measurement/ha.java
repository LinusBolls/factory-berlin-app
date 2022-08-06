package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public enum ha {
    DOUBLE(ka.DOUBLE, 1),
    FLOAT(ka.FLOAT, 5),
    INT64(ka.LONG, 0),
    UINT64(ka.LONG, 0),
    INT32(ka.INT, 0),
    FIXED64(ka.LONG, 1),
    FIXED32(ka.INT, 5),
    BOOL(ka.BOOLEAN, 0),
    STRING(ka.STRING, 2),
    GROUP(ka.MESSAGE, 3),
    MESSAGE(ka.MESSAGE, 2),
    BYTES(ka.BYTE_STRING, 2),
    UINT32(ka.INT, 0),
    ENUM(ka.ENUM, 0),
    SFIXED32(ka.INT, 5),
    SFIXED64(ka.LONG, 1),
    SINT32(ka.INT, 0),
    SINT64(ka.LONG, 0);
    

    /* renamed from: g  reason: collision with root package name */
    private final ka f2341g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2342h;

    private ha(ka kaVar, int i2) {
        this.f2341g = kaVar;
        this.f2342h = i2;
    }

    public final ka a() {
        return this.f2341g;
    }

    public final int f() {
        return this.f2342h;
    }
}

package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: OutputPrefixType */
public enum f1 implements a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9578g;

    private f1(int i2) {
        this.f9578g = i2;
    }

    public static f1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9578g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

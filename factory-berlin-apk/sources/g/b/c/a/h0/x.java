package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: EcPointFormat */
public enum x implements a0.c {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9616g;

    private x(int i2) {
        this.f9616g = i2;
    }

    public static x a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i2 == 1) {
            return UNCOMPRESSED;
        }
        if (i2 == 2) {
            return COMPRESSED;
        }
        if (i2 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9616g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

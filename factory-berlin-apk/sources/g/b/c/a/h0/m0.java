package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: EllipticCurveType */
public enum m0 implements a0.c {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9586g;

    private m0(int i2) {
        this.f9586g = i2;
    }

    public static m0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 == 4) {
            return NIST_P521;
        }
        if (i2 != 5) {
            return null;
        }
        return CURVE25519;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9586g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

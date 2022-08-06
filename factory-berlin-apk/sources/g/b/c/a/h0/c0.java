package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: EcdsaSignatureEncoding */
public enum c0 implements a0.c {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9570g;

    private c0(int i2) {
        this.f9570g = i2;
    }

    public static c0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i2 == 1) {
            return IEEE_P1363;
        }
        if (i2 != 2) {
            return null;
        }
        return DER;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9570g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

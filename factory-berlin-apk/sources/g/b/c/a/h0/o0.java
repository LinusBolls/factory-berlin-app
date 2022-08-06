package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: HashType */
public enum o0 implements a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9594g;

    private o0(int i2) {
        this.f9594g = i2;
    }

    public static o0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9594g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

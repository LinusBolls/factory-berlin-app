package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;

/* compiled from: KeyStatusType */
public enum w0 implements a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f9609g;

    private w0(int i2) {
        this.f9609g = i2;
    }

    public static w0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int m() {
        if (this != UNRECOGNIZED) {
            return this.f9609g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* compiled from: WireFormat */
public final class s1 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f3792d = c(3, 2);

    /* compiled from: WireFormat */
    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(c.LONG, 0),
        UINT64(c.LONG, 0),
        INT32(c.INT, 0),
        FIXED64(c.LONG, 1),
        FIXED32(c.INT, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(c.MESSAGE, 3) {
        },
        MESSAGE(c.MESSAGE, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(c.INT, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(c.INT, 5),
        SFIXED64(c.LONG, 1),
        SINT32(c.INT, 0),
        SINT64(c.LONG, 0);
        

        /* renamed from: g  reason: collision with root package name */
        private final c f3799g;

        /* renamed from: h  reason: collision with root package name */
        private final int f3800h;

        public c a() {
            return this.f3799g;
        }

        public int f() {
            return this.f3800h;
        }

        private b(c cVar, int i2) {
            this.f3799g = cVar;
            this.f3800h = i2;
        }
    }

    /* compiled from: WireFormat */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f3733h),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: g  reason: collision with root package name */
        private final Object f3808g;

        private c(Object obj) {
            this.f3808g = obj;
        }
    }

    public static int a(int i2) {
        return i2 >>> 3;
    }

    public static int b(int i2) {
        return i2 & 7;
    }

    static int c(int i2, int i3) {
        return (i2 << 3) | i3;
    }
}

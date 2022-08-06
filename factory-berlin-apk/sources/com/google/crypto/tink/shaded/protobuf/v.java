package com.google.crypto.tink.shaded.protobuf;

/* compiled from: FieldType */
public enum v {
    DOUBLE(0, b.SCALAR, b0.DOUBLE),
    FLOAT(1, b.SCALAR, b0.FLOAT),
    INT64(2, b.SCALAR, b0.LONG),
    UINT64(3, b.SCALAR, b0.LONG),
    INT32(4, b.SCALAR, b0.INT),
    FIXED64(5, b.SCALAR, b0.LONG),
    FIXED32(6, b.SCALAR, b0.INT),
    BOOL(7, b.SCALAR, b0.BOOLEAN),
    STRING(8, b.SCALAR, b0.STRING),
    MESSAGE(9, b.SCALAR, b0.MESSAGE),
    BYTES(10, b.SCALAR, b0.BYTE_STRING),
    UINT32(11, b.SCALAR, b0.INT),
    ENUM(12, b.SCALAR, b0.ENUM),
    SFIXED32(13, b.SCALAR, b0.INT),
    SFIXED64(14, b.SCALAR, b0.LONG),
    SINT32(15, b.SCALAR, b0.INT),
    SINT64(16, b.SCALAR, b0.LONG),
    GROUP(17, b.SCALAR, b0.MESSAGE),
    DOUBLE_LIST(18, b.VECTOR, b0.DOUBLE),
    FLOAT_LIST(19, b.VECTOR, b0.FLOAT),
    INT64_LIST(20, b.VECTOR, b0.LONG),
    UINT64_LIST(21, b.VECTOR, b0.LONG),
    INT32_LIST(22, b.VECTOR, b0.INT),
    FIXED64_LIST(23, b.VECTOR, b0.LONG),
    FIXED32_LIST(24, b.VECTOR, b0.INT),
    BOOL_LIST(25, b.VECTOR, b0.BOOLEAN),
    STRING_LIST(26, b.VECTOR, b0.STRING),
    MESSAGE_LIST(27, b.VECTOR, b0.MESSAGE),
    BYTES_LIST(28, b.VECTOR, b0.BYTE_STRING),
    UINT32_LIST(29, b.VECTOR, b0.INT),
    ENUM_LIST(30, b.VECTOR, b0.ENUM),
    SFIXED32_LIST(31, b.VECTOR, b0.INT),
    SFIXED64_LIST(32, b.VECTOR, b0.LONG),
    SINT32_LIST(33, b.VECTOR, b0.INT),
    SINT64_LIST(34, b.VECTOR, b0.LONG),
    DOUBLE_LIST_PACKED(35, b.PACKED_VECTOR, b0.DOUBLE),
    FLOAT_LIST_PACKED(36, b.PACKED_VECTOR, b0.FLOAT),
    INT64_LIST_PACKED(37, b.PACKED_VECTOR, b0.LONG),
    UINT64_LIST_PACKED(38, b.PACKED_VECTOR, b0.LONG),
    INT32_LIST_PACKED(39, b.PACKED_VECTOR, b0.INT),
    FIXED64_LIST_PACKED(40, b.PACKED_VECTOR, b0.LONG),
    FIXED32_LIST_PACKED(41, b.PACKED_VECTOR, b0.INT),
    BOOL_LIST_PACKED(42, b.PACKED_VECTOR, b0.BOOLEAN),
    UINT32_LIST_PACKED(43, b.PACKED_VECTOR, b0.INT),
    ENUM_LIST_PACKED(44, b.PACKED_VECTOR, b0.ENUM),
    SFIXED32_LIST_PACKED(45, b.PACKED_VECTOR, b0.INT),
    SFIXED64_LIST_PACKED(46, b.PACKED_VECTOR, b0.LONG),
    SINT32_LIST_PACKED(47, b.PACKED_VECTOR, b0.INT),
    SINT64_LIST_PACKED(48, b.PACKED_VECTOR, b0.LONG),
    GROUP_LIST(49, b.VECTOR, b0.MESSAGE),
    MAP(50, b.MAP, b0.VOID);
    
    private static final v[] h0 = null;

    /* renamed from: g  reason: collision with root package name */
    private final int f3831g;

    /* renamed from: h  reason: collision with root package name */
    private final b f3832h;

    /* compiled from: FieldType */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.b0[] r0 = com.google.crypto.tink.shaded.protobuf.b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.b0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.b0 r3 = com.google.crypto.tink.shaded.protobuf.b0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.b0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.crypto.tink.shaded.protobuf.v$b[] r3 = com.google.crypto.tink.shaded.protobuf.v.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                com.google.crypto.tink.shaded.protobuf.v$b r4 = com.google.crypto.tink.shaded.protobuf.v.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.crypto.tink.shaded.protobuf.v$b r3 = com.google.crypto.tink.shaded.protobuf.v.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.crypto.tink.shaded.protobuf.v$b r1 = com.google.crypto.tink.shaded.protobuf.v.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v.a.<clinit>():void");
        }
    }

    /* compiled from: FieldType */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: g  reason: collision with root package name */
        private final boolean f3838g;

        private b(boolean z) {
            this.f3838g = z;
        }

        public boolean a() {
            return this.f3838g;
        }
    }

    static {
        int i2;
        v[] values = values();
        h0 = new v[values.length];
        for (v vVar : values) {
            h0[vVar.f3831g] = vVar;
        }
    }

    private v(int i2, b bVar, b0 b0Var) {
        int i3;
        this.f3831g = i2;
        this.f3832h = bVar;
        int i4 = a.a[bVar.ordinal()];
        if (i4 == 1) {
            b0Var.a();
        } else if (i4 == 2) {
            b0Var.a();
        }
        if (bVar == b.SCALAR && (i3 = a.b[b0Var.ordinal()]) != 1 && i3 != 2) {
        }
    }

    public int a() {
        return this.f3831g;
    }

    public boolean f() {
        return this.f3832h.a();
    }

    public boolean h() {
        return this.f3832h == b.MAP;
    }
}

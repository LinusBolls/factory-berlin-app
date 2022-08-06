package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public enum t6 {
    DOUBLE(0, v6.SCALAR, k7.DOUBLE),
    FLOAT(1, v6.SCALAR, k7.FLOAT),
    INT64(2, v6.SCALAR, k7.LONG),
    UINT64(3, v6.SCALAR, k7.LONG),
    INT32(4, v6.SCALAR, k7.INT),
    FIXED64(5, v6.SCALAR, k7.LONG),
    FIXED32(6, v6.SCALAR, k7.INT),
    BOOL(7, v6.SCALAR, k7.BOOLEAN),
    STRING(8, v6.SCALAR, k7.STRING),
    MESSAGE(9, v6.SCALAR, k7.MESSAGE),
    BYTES(10, v6.SCALAR, k7.BYTE_STRING),
    UINT32(11, v6.SCALAR, k7.INT),
    ENUM(12, v6.SCALAR, k7.ENUM),
    SFIXED32(13, v6.SCALAR, k7.INT),
    SFIXED64(14, v6.SCALAR, k7.LONG),
    SINT32(15, v6.SCALAR, k7.INT),
    SINT64(16, v6.SCALAR, k7.LONG),
    GROUP(17, v6.SCALAR, k7.MESSAGE),
    DOUBLE_LIST(18, v6.VECTOR, k7.DOUBLE),
    FLOAT_LIST(19, v6.VECTOR, k7.FLOAT),
    INT64_LIST(20, v6.VECTOR, k7.LONG),
    UINT64_LIST(21, v6.VECTOR, k7.LONG),
    INT32_LIST(22, v6.VECTOR, k7.INT),
    FIXED64_LIST(23, v6.VECTOR, k7.LONG),
    FIXED32_LIST(24, v6.VECTOR, k7.INT),
    BOOL_LIST(25, v6.VECTOR, k7.BOOLEAN),
    STRING_LIST(26, v6.VECTOR, k7.STRING),
    MESSAGE_LIST(27, v6.VECTOR, k7.MESSAGE),
    BYTES_LIST(28, v6.VECTOR, k7.BYTE_STRING),
    UINT32_LIST(29, v6.VECTOR, k7.INT),
    ENUM_LIST(30, v6.VECTOR, k7.ENUM),
    SFIXED32_LIST(31, v6.VECTOR, k7.INT),
    SFIXED64_LIST(32, v6.VECTOR, k7.LONG),
    SINT32_LIST(33, v6.VECTOR, k7.INT),
    SINT64_LIST(34, v6.VECTOR, k7.LONG),
    DOUBLE_LIST_PACKED(35, v6.PACKED_VECTOR, k7.DOUBLE),
    FLOAT_LIST_PACKED(36, v6.PACKED_VECTOR, k7.FLOAT),
    INT64_LIST_PACKED(37, v6.PACKED_VECTOR, k7.LONG),
    UINT64_LIST_PACKED(38, v6.PACKED_VECTOR, k7.LONG),
    INT32_LIST_PACKED(39, v6.PACKED_VECTOR, k7.INT),
    FIXED64_LIST_PACKED(40, v6.PACKED_VECTOR, k7.LONG),
    FIXED32_LIST_PACKED(41, v6.PACKED_VECTOR, k7.INT),
    BOOL_LIST_PACKED(42, v6.PACKED_VECTOR, k7.BOOLEAN),
    UINT32_LIST_PACKED(43, v6.PACKED_VECTOR, k7.INT),
    ENUM_LIST_PACKED(44, v6.PACKED_VECTOR, k7.ENUM),
    SFIXED32_LIST_PACKED(45, v6.PACKED_VECTOR, k7.INT),
    SFIXED64_LIST_PACKED(46, v6.PACKED_VECTOR, k7.LONG),
    SINT32_LIST_PACKED(47, v6.PACKED_VECTOR, k7.INT),
    SINT64_LIST_PACKED(48, v6.PACKED_VECTOR, k7.LONG),
    GROUP_LIST(49, v6.VECTOR, k7.MESSAGE),
    MAP(50, v6.MAP, k7.VOID);
    
    private static final t6[] g0 = null;

    /* renamed from: g  reason: collision with root package name */
    private final int f2555g;

    static {
        int i2;
        t6[] values = values();
        g0 = new t6[values.length];
        for (t6 t6Var : values) {
            g0[t6Var.f2555g] = t6Var;
        }
    }

    private t6(int i2, v6 v6Var, k7 k7Var) {
        int i3;
        this.f2555g = i2;
        int i4 = w6.a[v6Var.ordinal()];
        if (i4 == 1) {
            k7Var.a();
        } else if (i4 == 2) {
            k7Var.a();
        }
        if (v6Var == v6.SCALAR && (i3 = w6.b[k7Var.ordinal()]) != 1 && i3 != 2) {
        }
    }

    public final int b() {
        return this.f2555g;
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* compiled from: RawMessageInfo */
final class e1 implements o0 {
    private final q0 a;
    private final String b;
    private final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3723d;

    e1(q0 q0Var, String str, Object[] objArr) {
        this.a = q0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3723d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f3723d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f3723d & 2) == 2;
    }

    public b1 b() {
        return (this.f3723d & 1) == 1 ? b1.PROTO2 : b1.PROTO3;
    }

    public q0 c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}

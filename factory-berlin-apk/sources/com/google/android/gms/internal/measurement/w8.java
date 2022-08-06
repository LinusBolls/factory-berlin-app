package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class w8 implements h8 {
    private final j8 a;
    private final String b;
    private final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2605d;

    w8(j8 j8Var, String str, Object[] objArr) {
        this.a = j8Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2605d = charAt;
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
                this.f2605d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.b;
    }

    public final int b() {
        return (this.f2605d & 1) == 1 ? z6.e.f2654i : z6.e.f2655j;
    }

    public final boolean c() {
        return (this.f2605d & 2) == 2;
    }

    public final j8 d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.c;
    }
}

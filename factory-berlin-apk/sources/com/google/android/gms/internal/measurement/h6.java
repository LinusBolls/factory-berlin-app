package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class h6 extends e6 {
    private int a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2333d;

    /* renamed from: e  reason: collision with root package name */
    private int f2334e;

    private h6(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f2334e = Integer.MAX_VALUE;
        this.a = i3 + i2;
        this.c = i2;
        this.f2333d = i2;
    }

    private final void f() {
        int i2 = this.a + this.b;
        this.a = i2;
        int i3 = i2 - this.f2333d;
        int i4 = this.f2334e;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.b = i5;
            this.a = i2 - i5;
            return;
        }
        this.b = 0;
    }

    public final int d(int i2) {
        if (i2 >= 0) {
            int e2 = i2 + e();
            int i3 = this.f2334e;
            if (e2 <= i3) {
                this.f2334e = e2;
                f();
                return i3;
            }
            throw zzig.a();
        }
        throw zzig.b();
    }

    public final int e() {
        return this.c - this.f2333d;
    }
}

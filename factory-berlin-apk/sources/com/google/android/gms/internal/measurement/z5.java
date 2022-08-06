package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class z5 extends c6 {

    /* renamed from: k  reason: collision with root package name */
    private final int f2644k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2645l;

    z5(byte[] bArr, int i2, int i3) {
        super(bArr);
        t5.n(i2, i2 + i3, bArr.length);
        this.f2644k = i2;
        this.f2645l = i3;
    }

    public final byte a(int i2) {
        int d2 = d();
        if (((d2 - (i2 + 1)) | i2) >= 0) {
            return this.f2251j[this.f2644k + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(d2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int d() {
        return this.f2645l;
    }

    /* access modifiers changed from: package-private */
    public final byte m(int i2) {
        return this.f2251j[this.f2644k + i2];
    }

    /* access modifiers changed from: protected */
    public final int y() {
        return this.f2644k;
    }
}

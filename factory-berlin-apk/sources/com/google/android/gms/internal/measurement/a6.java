package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class a6 {
    private final zzhf a;
    private final byte[] b;

    private a6(int i2) {
        byte[] bArr = new byte[i2];
        this.b = bArr;
        this.a = zzhf.f(bArr);
    }

    public final t5 a() {
        this.a.N();
        return new c6(this.b);
    }

    public final zzhf b() {
        return this.a;
    }

    /* synthetic */ a6(int i2, v5 v5Var) {
        this(i2);
    }
}

package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
abstract class z9 {
    z9() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i2, byte[] bArr, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract int b(CharSequence charSequence, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public final boolean c(byte[] bArr, int i2, int i3) {
        return a(0, bArr, i2, i3) == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract String d(byte[] bArr, int i2, int i3);
}

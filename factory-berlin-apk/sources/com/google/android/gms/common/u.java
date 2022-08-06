package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class u extends s {
    private static final WeakReference<byte[]> c = new WeakReference<>((Object) null);
    private WeakReference<byte[]> b = c;

    u(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract byte[] T0();

    /* access modifiers changed from: package-private */
    public final byte[] o() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = T0();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}

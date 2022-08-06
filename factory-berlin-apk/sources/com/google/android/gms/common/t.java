package com.google.android.gms.common;

import java.util.Arrays;

final class t extends s {
    private final byte[] b;

    t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] o() {
        return this.b;
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.m5;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class m5<MessageType extends k5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> implements i8 {
    public final /* synthetic */ i8 Z(byte[] bArr, m6 m6Var) {
        s(bArr, 0, bArr.length, m6Var);
        return this;
    }

    public final /* synthetic */ i8 i0(byte[] bArr) {
        r(bArr, 0, bArr.length);
        return this;
    }

    public final /* synthetic */ i8 l0(j8 j8Var) {
        if (m().getClass().isInstance(j8Var)) {
            p((k5) j8Var);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType p(MessageType messagetype);

    public abstract BuilderType r(byte[] bArr, int i2, int i3);

    public abstract BuilderType s(byte[] bArr, int i2, int i3, m6 m6Var);
}

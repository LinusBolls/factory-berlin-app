package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import l.g;

/* compiled from: JsonWriter */
public abstract class l implements Closeable, Flushable {

    /* renamed from: g  reason: collision with root package name */
    int f8130g = 0;

    /* renamed from: h  reason: collision with root package name */
    int[] f8131h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    String[] f8132i = new String[32];

    /* renamed from: j  reason: collision with root package name */
    int[] f8133j = new int[32];

    /* renamed from: k  reason: collision with root package name */
    String f8134k;

    /* renamed from: l  reason: collision with root package name */
    boolean f8135l;

    /* renamed from: m  reason: collision with root package name */
    boolean f8136m;

    /* renamed from: n  reason: collision with root package name */
    boolean f8137n;
    int o = -1;

    l() {
    }

    public static l q(g gVar) {
        return new j(gVar);
    }

    /* access modifiers changed from: package-private */
    public final void D(int i2) {
        int[] iArr = this.f8131h;
        int i3 = this.f8130g;
        this.f8130g = i3 + 1;
        iArr[i3] = i2;
    }

    /* access modifiers changed from: package-private */
    public final void F(int i2) {
        this.f8131h[this.f8130g - 1] = i2;
    }

    public final void K(boolean z) {
        this.f8135l = z;
    }

    public final void L(boolean z) {
        this.f8136m = z;
    }

    public abstract l M(double d2);

    public abstract l U(long j2);

    public abstract l Z(Number number);

    public abstract l a();

    public abstract l b();

    public abstract l b0(String str);

    public final String getPath() {
        return h.a(this.f8130g, this.f8131h, this.f8132i, this.f8133j);
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        int i2 = this.f8130g;
        int[] iArr = this.f8131h;
        if (i2 != iArr.length) {
            return false;
        }
        if (i2 != 256) {
            this.f8131h = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8132i;
            this.f8132i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f8133j;
            this.f8133j = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof k)) {
                return true;
            }
            k kVar = (k) this;
            Object[] objArr = kVar.p;
            kVar.p = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    public abstract l i();

    public abstract l i0(boolean z);

    public abstract l j();

    public final boolean k() {
        return this.f8136m;
    }

    public final boolean l() {
        return this.f8135l;
    }

    public abstract l n(String str);

    public abstract l o();

    /* access modifiers changed from: package-private */
    public final int y() {
        int i2 = this.f8130g;
        if (i2 != 0) {
            return this.f8131h[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* access modifiers changed from: package-private */
    public final void z() {
        int y = y();
        if (y == 5 || y == 3) {
            this.f8137n = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }
}

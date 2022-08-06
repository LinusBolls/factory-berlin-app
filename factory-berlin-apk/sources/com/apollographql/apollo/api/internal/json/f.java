package com.apollographql.apollo.api.internal.json;

import java.io.Closeable;
import java.io.Flushable;
import kotlin.jvm.internal.k;
import l.g;

/* compiled from: JsonWriter.kt */
public abstract class f implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    public static final a f1818n = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private int f1819g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f1820h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    private final String[] f1821i = new String[32];

    /* renamed from: j  reason: collision with root package name */
    private final int[] f1822j = new int[32];

    /* renamed from: k  reason: collision with root package name */
    private String f1823k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1824l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1825m;

    /* compiled from: JsonWriter.kt */
    public static final class a {
        private a() {
        }

        public final f a(g gVar) {
            k.f(gVar, "sink");
            return new e(gVar);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final f K(g gVar) {
        return f1818n.a(gVar);
    }

    public abstract f D(String str);

    public abstract f F();

    public final int L() {
        if (this.f1819g != 0) {
            return this.f1820h[this.f1819g - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    public final void M(int i2) {
        int i3 = this.f1819g;
        int[] iArr = this.f1820h;
        if (i3 != iArr.length) {
            this.f1819g = i3 + 1;
            iArr[i3] = i2;
            return;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    public final void U(int i2) {
        this.f1820h[this.f1819g - 1] = i2;
    }

    public final void Z(boolean z) {
        this.f1825m = z;
    }

    public abstract f a();

    public abstract f b();

    /* access modifiers changed from: protected */
    public final void b0(int i2) {
        this.f1819g = i2;
    }

    public final String getPath() {
        return d.a.a(this.f1819g, this.f1820h, this.f1821i, this.f1822j);
    }

    public abstract f h();

    public abstract f i();

    public abstract f i0(long j2);

    public final String j() {
        return this.f1823k;
    }

    /* access modifiers changed from: protected */
    public final int[] k() {
        return this.f1822j;
    }

    /* access modifiers changed from: protected */
    public final String[] l() {
        return this.f1821i;
    }

    public abstract f l0(Boolean bool);

    /* access modifiers changed from: protected */
    public final int[] n() {
        return this.f1820h;
    }

    public abstract f n0(Number number);

    public final boolean o() {
        return this.f1825m;
    }

    /* access modifiers changed from: protected */
    public final int q() {
        return this.f1819g;
    }

    public abstract f r0(String str);

    public final boolean y() {
        return this.f1824l;
    }

    public abstract f z(String str);
}

package kotlinx.coroutines.internal;

import kotlin.c0.g;
import kotlin.x;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.h2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;

/* compiled from: MainDispatchers.kt */
final class s extends h2 implements s0 {

    /* renamed from: h  reason: collision with root package name */
    private final Throwable f11027h;

    /* renamed from: i  reason: collision with root package name */
    private final String f11028i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void w0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f11027h
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f11028i
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f11027h
            r1.<init>(r0, r2)
            throw r1
        L_0x0037:
            kotlinx.coroutines.internal.r.c()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.s.w0():java.lang.Void");
    }

    public Void F0(long j2, i<? super x> iVar) {
        w0();
        throw null;
    }

    public c1 U(long j2, Runnable runnable) {
        w0();
        throw null;
    }

    public /* bridge */ /* synthetic */ void i0(g gVar, Runnable runnable) {
        t0(gVar, runnable);
        throw null;
    }

    public /* bridge */ /* synthetic */ void j(long j2, i iVar) {
        F0(j2, iVar);
        throw null;
    }

    public boolean n0(g gVar) {
        w0();
        throw null;
    }

    public h2 r0() {
        return this;
    }

    public Void t0(g gVar, Runnable runnable) {
        w0();
        throw null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.f11027h != null) {
            str = ", cause=" + this.f11027h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public s(Throwable th, String str) {
        this.f11027h = th;
        this.f11028i = str;
    }
}

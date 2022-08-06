package okhttp3.internal.connection;

import java.io.IOException;
import k.a;
import k.f0;
import k.h0.b;
import k.h0.f.g;
import k.r;
import k.v;
import k.z;
import kotlin.jvm.internal.k;
import okhttp3.internal.connection.j;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: ExchangeFinder.kt */
public final class d {
    private j.b a;
    private j b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f11281d;

    /* renamed from: e  reason: collision with root package name */
    private int f11282e;

    /* renamed from: f  reason: collision with root package name */
    private f0 f11283f;

    /* renamed from: g  reason: collision with root package name */
    private final h f11284g;

    /* renamed from: h  reason: collision with root package name */
    private final a f11285h;

    /* renamed from: i  reason: collision with root package name */
    private final e f11286i;

    /* renamed from: j  reason: collision with root package name */
    private final r f11287j;

    public d(h hVar, a aVar, e eVar, r rVar) {
        k.f(hVar, "connectionPool");
        k.f(aVar, "address");
        k.f(eVar, "call");
        k.f(rVar, "eventListener");
        this.f11284g = hVar;
        this.f11285h = aVar;
        this.f11286i = eVar;
        this.f11287j = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.f b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.e r0 = r1.f11286i
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x018a
            okhttp3.internal.connection.e r0 = r1.f11286i
            okhttp3.internal.connection.f r2 = r0.t()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0064
            monitor-enter(r2)
            boolean r5 = r2.q()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0030
            k.f0 r5 = r2.A()     // Catch:{ all -> 0x0061 }
            k.a r5 = r5.a()     // Catch:{ all -> 0x0061 }
            k.v r5 = r5.l()     // Catch:{ all -> 0x0061 }
            boolean r5 = r14.g(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            okhttp3.internal.connection.e r5 = r1.f11286i     // Catch:{ all -> 0x0061 }
            java.net.Socket r5 = r5.D()     // Catch:{ all -> 0x0061 }
        L_0x0036:
            kotlin.x r6 = kotlin.x.a     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)
            okhttp3.internal.connection.e r6 = r1.f11286i
            okhttp3.internal.connection.f r6 = r6.t()
            if (r6 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            k.h0.b.k(r5)
        L_0x0059:
            k.r r5 = r1.f11287j
            okhttp3.internal.connection.e r6 = r1.f11286i
            r5.l(r6, r2)
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0064:
            r1.c = r3
            r1.f11281d = r3
            r1.f11282e = r3
            okhttp3.internal.connection.h r2 = r1.f11284g
            k.a r5 = r1.f11285h
            okhttp3.internal.connection.e r6 = r1.f11286i
            boolean r2 = r2.a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x008a
            okhttp3.internal.connection.e r0 = r1.f11286i
            okhttp3.internal.connection.f r0 = r0.t()
            if (r0 == 0) goto L_0x0086
            k.r r2 = r1.f11287j
            okhttp3.internal.connection.e r3 = r1.f11286i
            r2.k(r3, r0)
            return r0
        L_0x0086:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x008a:
            k.f0 r2 = r1.f11283f
            if (r2 == 0) goto L_0x0098
            if (r2 == 0) goto L_0x0094
            r1.f11283f = r4
        L_0x0092:
            r5 = r4
            goto L_0x0106
        L_0x0094:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x0098:
            okhttp3.internal.connection.j$b r2 = r1.a
            if (r2 == 0) goto L_0x00b5
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00b5
            okhttp3.internal.connection.j$b r2 = r1.a
            if (r2 == 0) goto L_0x00ad
            k.f0 r2 = r2.c()
            goto L_0x0092
        L_0x00ad:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x00b1:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x00b5:
            okhttp3.internal.connection.j r2 = r1.b
            if (r2 != 0) goto L_0x00d0
            okhttp3.internal.connection.j r2 = new okhttp3.internal.connection.j
            k.a r5 = r1.f11285h
            okhttp3.internal.connection.e r6 = r1.f11286i
            k.z r6 = r6.s()
            okhttp3.internal.connection.i r6 = r6.B()
            okhttp3.internal.connection.e r7 = r1.f11286i
            k.r r8 = r1.f11287j
            r2.<init>(r5, r6, r7, r8)
            r1.b = r2
        L_0x00d0:
            okhttp3.internal.connection.j$b r2 = r2.d()
            r1.a = r2
            java.util.List r5 = r2.a()
            okhttp3.internal.connection.e r6 = r1.f11286i
            boolean r6 = r6.n()
            if (r6 != 0) goto L_0x0182
            okhttp3.internal.connection.h r6 = r1.f11284g
            k.a r7 = r1.f11285h
            okhttp3.internal.connection.e r8 = r1.f11286i
            boolean r3 = r6.a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x0102
            okhttp3.internal.connection.e r0 = r1.f11286i
            okhttp3.internal.connection.f r0 = r0.t()
            if (r0 == 0) goto L_0x00fe
            k.r r2 = r1.f11287j
            okhttp3.internal.connection.e r3 = r1.f11286i
            r2.k(r3, r0)
            return r0
        L_0x00fe:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x0102:
            k.f0 r2 = r2.c()
        L_0x0106:
            okhttp3.internal.connection.f r3 = new okhttp3.internal.connection.f
            okhttp3.internal.connection.h r6 = r1.f11284g
            r3.<init>(r6, r2)
            okhttp3.internal.connection.e r6 = r1.f11286i
            r6.F(r3)
            okhttp3.internal.connection.e r12 = r1.f11286i     // Catch:{ all -> 0x017b }
            k.r r13 = r1.f11287j     // Catch:{ all -> 0x017b }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.g(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x017b }
            okhttp3.internal.connection.e r6 = r1.f11286i
            r6.F(r4)
            okhttp3.internal.connection.e r6 = r1.f11286i
            k.z r6 = r6.s()
            okhttp3.internal.connection.i r6 = r6.B()
            k.f0 r7 = r3.A()
            r6.a(r7)
            okhttp3.internal.connection.h r6 = r1.f11284g
            k.a r7 = r1.f11285h
            okhttp3.internal.connection.e r8 = r1.f11286i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x0162
            okhttp3.internal.connection.e r0 = r1.f11286i
            okhttp3.internal.connection.f r0 = r0.t()
            if (r0 == 0) goto L_0x015e
            r1.f11283f = r2
            java.net.Socket r2 = r3.E()
            k.h0.b.k(r2)
            k.r r2 = r1.f11287j
            okhttp3.internal.connection.e r3 = r1.f11286i
            r2.k(r3, r0)
            return r0
        L_0x015e:
            kotlin.jvm.internal.k.m()
            throw r4
        L_0x0162:
            monitor-enter(r3)
            okhttp3.internal.connection.h r0 = r1.f11284g     // Catch:{ all -> 0x0178 }
            r0.e(r3)     // Catch:{ all -> 0x0178 }
            okhttp3.internal.connection.e r0 = r1.f11286i     // Catch:{ all -> 0x0178 }
            r0.e(r3)     // Catch:{ all -> 0x0178 }
            kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0178 }
            monitor-exit(r3)
            k.r r0 = r1.f11287j
            okhttp3.internal.connection.e r2 = r1.f11286i
            r0.k(r2, r3)
            return r3
        L_0x0178:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x017b:
            r0 = move-exception
            okhttp3.internal.connection.e r2 = r1.f11286i
            r2.F(r4)
            throw r0
        L_0x0182:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x018a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.d.b(int, int, int, int, boolean):okhttp3.internal.connection.f");
    }

    private final f c(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        while (true) {
            f b2 = b(i2, i3, i4, i5, z);
            if (b2.v(z2)) {
                return b2;
            }
            b2.z();
            if (this.f11283f == null) {
                j.b bVar = this.a;
                boolean z3 = true;
                if (!(bVar != null ? bVar.b() : true)) {
                    j jVar = this.b;
                    if (jVar != null) {
                        z3 = jVar.b();
                    }
                    if (!z3) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final f0 f() {
        f t;
        if (this.c > 1 || this.f11281d > 1 || this.f11282e > 0 || (t = this.f11286i.t()) == null) {
            return null;
        }
        synchronized (t) {
            if (t.r() != 0) {
                return null;
            }
            if (!b.g(t.A().a().l(), this.f11285h.l())) {
                return null;
            }
            f0 A = t.A();
            return A;
        }
    }

    public final k.h0.f.d a(z zVar, g gVar) {
        k.f(zVar, "client");
        k.f(gVar, "chain");
        try {
            return c(gVar.f(), gVar.h(), gVar.k(), zVar.H(), zVar.P(), !k.a(gVar.i().h(), "GET")).x(zVar, gVar);
        } catch (RouteException e2) {
            h(e2.c());
            throw e2;
        } catch (IOException e3) {
            h(e3);
            throw new RouteException(e3);
        }
    }

    public final a d() {
        return this.f11285h;
    }

    public final boolean e() {
        j jVar;
        if (this.c == 0 && this.f11281d == 0 && this.f11282e == 0) {
            return false;
        }
        if (this.f11283f != null) {
            return true;
        }
        f0 f2 = f();
        if (f2 != null) {
            this.f11283f = f2;
            return true;
        }
        j.b bVar = this.a;
        if ((bVar == null || !bVar.b()) && (jVar = this.b) != null) {
            return jVar.b();
        }
        return true;
    }

    public final boolean g(v vVar) {
        k.f(vVar, "url");
        v l2 = this.f11285h.l();
        return vVar.o() == l2.o() && k.a(vVar.i(), l2.i());
    }

    public final void h(IOException iOException) {
        k.f(iOException, "e");
        this.f11283f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f11327g == okhttp3.internal.http2.a.REFUSED_STREAM) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f11281d++;
        } else {
            this.f11282e++;
        }
    }
}

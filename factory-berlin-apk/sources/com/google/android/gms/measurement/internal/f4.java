package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;
    private final h5 a;
    private final String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f2829d;

    /* renamed from: e  reason: collision with root package name */
    private String f2830e;

    /* renamed from: f  reason: collision with root package name */
    private String f2831f;

    /* renamed from: g  reason: collision with root package name */
    private long f2832g;

    /* renamed from: h  reason: collision with root package name */
    private long f2833h;

    /* renamed from: i  reason: collision with root package name */
    private long f2834i;

    /* renamed from: j  reason: collision with root package name */
    private String f2835j;

    /* renamed from: k  reason: collision with root package name */
    private long f2836k;

    /* renamed from: l  reason: collision with root package name */
    private String f2837l;

    /* renamed from: m  reason: collision with root package name */
    private long f2838m;

    /* renamed from: n  reason: collision with root package name */
    private long f2839n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    f4(h5 h5Var, String str) {
        r.k(h5Var);
        r.g(str);
        this.a = h5Var;
        this.b = str;
        h5Var.a().c();
    }

    public final String A() {
        this.a.a().c();
        return this.f2829d;
    }

    public final void B(long j2) {
        this.a.a().c();
        this.E |= this.f2839n != j2;
        this.f2839n = j2;
    }

    public final void C(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.f2830e, str);
        this.f2830e = str;
    }

    public final String D() {
        this.a.a().c();
        return this.s;
    }

    public final void E(long j2) {
        this.a.a().c();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void F(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.f2831f, str);
        this.f2831f = str;
    }

    public final String G() {
        this.a.a().c();
        return this.w;
    }

    public final void H(long j2) {
        boolean z2 = true;
        r.a(j2 >= 0);
        this.a.a().c();
        boolean z3 = this.E;
        if (this.f2832g == j2) {
            z2 = false;
        }
        this.E = z2 | z3;
        this.f2832g = j2;
    }

    public final void I(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.f2835j, str);
        this.f2835j = str;
    }

    public final String J() {
        this.a.a().c();
        return this.f2830e;
    }

    public final void K(long j2) {
        this.a.a().c();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void L(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.f2837l, str);
        this.f2837l = str;
    }

    public final String M() {
        this.a.a().c();
        return this.f2831f;
    }

    public final void N(long j2) {
        this.a.a().c();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void O(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.D, str);
        this.D = str;
    }

    public final long P() {
        this.a.a().c();
        return this.f2833h;
    }

    public final void Q(long j2) {
        this.a.a().c();
        this.E |= this.x != j2;
        this.x = j2;
    }

    public final long R() {
        this.a.a().c();
        return this.f2834i;
    }

    public final void S(long j2) {
        this.a.a().c();
        this.E |= this.y != j2;
        this.y = j2;
    }

    public final String T() {
        this.a.a().c();
        return this.f2835j;
    }

    public final void U(long j2) {
        this.a.a().c();
        this.E |= this.z != j2;
        this.z = j2;
    }

    public final long V() {
        this.a.a().c();
        return this.f2836k;
    }

    public final void W(long j2) {
        this.a.a().c();
        this.E |= this.A != j2;
        this.A = j2;
    }

    public final String X() {
        this.a.a().c();
        return this.f2837l;
    }

    public final void Y(long j2) {
        this.a.a().c();
        this.E |= this.C != j2;
        this.C = j2;
    }

    public final long Z() {
        this.a.a().c();
        return this.f2838m;
    }

    public final void a(long j2) {
        this.a.a().c();
        this.E |= this.f2833h != j2;
        this.f2833h = j2;
    }

    public final void a0(long j2) {
        this.a.a().c();
        this.E |= this.B != j2;
        this.B = j2;
    }

    public final void b(Boolean bool) {
        this.a.a().c();
        this.E |= !fa.b0(this.t, bool);
        this.t = bool;
    }

    public final long b0() {
        this.a.a().c();
        return this.f2839n;
    }

    public final void c(String str) {
        this.a.a().c();
        this.E |= !fa.B0(this.c, str);
        this.c = str;
    }

    public final void c0(long j2) {
        this.a.a().c();
        this.E |= this.p != j2;
        this.p = j2;
    }

    public final void d(List<String> list) {
        this.a.a().c();
        if (!fa.n0(this.v, list)) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final long d0() {
        this.a.a().c();
        return this.u;
    }

    public final void e(boolean z2) {
        this.a.a().c();
        this.E |= this.o != z2;
        this.o = z2;
    }

    public final boolean e0() {
        this.a.a().c();
        return this.o;
    }

    public final boolean f() {
        this.a.a().c();
        return this.E;
    }

    public final long f0() {
        this.a.a().c();
        return this.f2832g;
    }

    public final long g() {
        this.a.a().c();
        return this.C;
    }

    public final long g0() {
        this.a.a().c();
        return this.F;
    }

    public final long h() {
        this.a.a().c();
        return this.B;
    }

    public final long h0() {
        this.a.a().c();
        return this.G;
    }

    public final String i() {
        this.a.a().c();
        return this.D;
    }

    public final void i0() {
        this.a.a().c();
        long j2 = this.f2832g + 1;
        if (j2 > 2147483647L) {
            this.a.i().H().b("Bundle index overflow. appId", c4.w(this.b));
            j2 = 0;
        }
        this.E = true;
        this.f2832g = j2;
    }

    public final String j() {
        this.a.a().c();
        String str = this.D;
        O((String) null);
        return str;
    }

    public final long j0() {
        this.a.a().c();
        return this.x;
    }

    public final long k() {
        this.a.a().c();
        return this.p;
    }

    public final long k0() {
        this.a.a().c();
        return this.y;
    }

    public final boolean l() {
        this.a.a().c();
        return this.q;
    }

    public final long l0() {
        this.a.a().c();
        return this.z;
    }

    public final boolean m() {
        this.a.a().c();
        return this.r;
    }

    public final long m0() {
        this.a.a().c();
        return this.A;
    }

    public final Boolean n() {
        this.a.a().c();
        return this.t;
    }

    public final List<String> o() {
        this.a.a().c();
        return this.v;
    }

    public final void p() {
        this.a.a().c();
        this.E = false;
    }

    public final void q(long j2) {
        this.a.a().c();
        this.E |= this.f2834i != j2;
        this.f2834i = j2;
    }

    public final void r(String str) {
        this.a.a().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.f2829d, str);
        this.f2829d = str;
    }

    public final void s(boolean z2) {
        this.a.a().c();
        this.E |= this.q != z2;
        this.q = z2;
    }

    public final String t() {
        this.a.a().c();
        return this.b;
    }

    public final void u(long j2) {
        this.a.a().c();
        this.E |= this.f2836k != j2;
        this.f2836k = j2;
    }

    public final void v(String str) {
        this.a.a().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.s, str);
        this.s = str;
    }

    public final void w(boolean z2) {
        this.a.a().c();
        this.E |= this.r != z2;
        this.r = z2;
    }

    public final String x() {
        this.a.a().c();
        return this.c;
    }

    public final void y(long j2) {
        this.a.a().c();
        this.E |= this.f2838m != j2;
        this.f2838m = j2;
    }

    public final void z(String str) {
        this.a.a().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.w, str);
        this.w = str;
    }
}

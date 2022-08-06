package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class g1 extends z6<g1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final g1 zzg;
    private static volatile s8<g1> zzh;
    private i7 zzc = z6.z();
    private i7 zzd = z6.z();
    private h7<z0> zze = z6.A();
    private h7<h1> zzf = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<g1, a> implements l8 {
        private a() {
            super(g1.zzg);
        }

        public final a A(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).R(i2);
            return this;
        }

        public final a B(Iterable<? extends Long> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).G(iterable);
            return this;
        }

        public final a C() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).e0();
            return this;
        }

        public final a D(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).V(i2);
            return this;
        }

        public final a E(Iterable<? extends Long> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).M(iterable);
            return this;
        }

        public final a F(Iterable<? extends z0> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).P(iterable);
            return this;
        }

        public final a G(Iterable<? extends h1> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).T(iterable);
            return this;
        }

        public final a z() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((g1) this.f2647h).d0();
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        g1 g1Var = new g1();
        zzg = g1Var;
        z6.u(g1.class, g1Var);
    }

    private g1() {
    }

    /* access modifiers changed from: private */
    public final void G(Iterable<? extends Long> iterable) {
        i7 i7Var = this.zzc;
        if (!i7Var.b()) {
            this.zzc = z6.q(i7Var);
        }
        k5.a(iterable, this.zzc);
    }

    /* access modifiers changed from: private */
    public final void M(Iterable<? extends Long> iterable) {
        i7 i7Var = this.zzd;
        if (!i7Var.b()) {
            this.zzd = z6.q(i7Var);
        }
        k5.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void P(Iterable<? extends z0> iterable) {
        f0();
        k5.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void R(int i2) {
        f0();
        this.zze.remove(i2);
    }

    /* access modifiers changed from: private */
    public final void T(Iterable<? extends h1> iterable) {
        g0();
        k5.a(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    public final void V(int i2) {
        g0();
        this.zzf.remove(i2);
    }

    public static a a0() {
        return (a) zzg.w();
    }

    public static g1 b0() {
        return zzg;
    }

    /* access modifiers changed from: private */
    public final void d0() {
        this.zzc = z6.z();
    }

    /* access modifiers changed from: private */
    public final void e0() {
        this.zzd = z6.z();
    }

    private final void f0() {
        h7<z0> h7Var = this.zze;
        if (!h7Var.b()) {
            this.zze = z6.p(h7Var);
        }
    }

    private final void g0() {
        h7<h1> h7Var = this.zzf;
        if (!h7Var.b()) {
            this.zzf = z6.p(h7Var);
        }
    }

    public final z0 B(int i2) {
        return this.zze.get(i2);
    }

    public final List<Long> C() {
        return this.zzc;
    }

    public final int H() {
        return this.zzc.size();
    }

    public final h1 I(int i2) {
        return this.zzf.get(i2);
    }

    public final List<Long> N() {
        return this.zzd;
    }

    public final int Q() {
        return this.zzd.size();
    }

    public final List<z0> U() {
        return this.zze;
    }

    public final int W() {
        return this.zze.size();
    }

    public final List<h1> X() {
        return this.zzf;
    }

    public final int Y() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new g1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", z0.class, "zzf", h1.class});
            case 4:
                return zzg;
            case 5:
                s8<g1> s8Var = zzh;
                if (s8Var == null) {
                    synchronized (g1.class) {
                        s8Var = zzh;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzg);
                            zzh = s8Var;
                        }
                    }
                }
                return s8Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

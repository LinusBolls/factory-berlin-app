package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class c1 extends z6<c1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final c1 zzj;
    private static volatile s8<c1> zzk;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private float zzg;
    private double zzh;
    private h7<c1> zzi = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<c1, a> implements l8 {
        private a() {
            super(c1.zzj);
        }

        public final a A(double d2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).B(d2);
            return this;
        }

        public final a B(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).C(j2);
            return this;
        }

        public final a C(a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).U((c1) ((z6) aVar.l()));
            return this;
        }

        public final a D(Iterable<? extends c1> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).J(iterable);
            return this;
        }

        public final a E(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).K(str);
            return this;
        }

        public final a F() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).h0();
            return this;
        }

        public final a G(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).P(str);
            return this;
        }

        public final a H() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).j0();
            return this;
        }

        public final int I() {
            return ((c1) this.f2647h).d0();
        }

        public final a J() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).m0();
            return this;
        }

        public final a z() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((c1) this.f2647h).g0();
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        c1 c1Var = new c1();
        zzj = c1Var;
        z6.u(c1.class, c1Var);
    }

    private c1() {
    }

    /* access modifiers changed from: private */
    public final void B(double d2) {
        this.zzc |= 16;
        this.zzh = d2;
    }

    /* access modifiers changed from: private */
    public final void C(long j2) {
        this.zzc |= 4;
        this.zzf = j2;
    }

    /* access modifiers changed from: private */
    public final void J(Iterable<? extends c1> iterable) {
        k0();
        k5.a(iterable, this.zzi);
    }

    /* access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void U(c1 c1Var) {
        c1Var.getClass();
        k0();
        this.zzi.add(c1Var);
    }

    public static a e0() {
        return (a) zzj.w();
    }

    /* access modifiers changed from: private */
    public final void g0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* access modifiers changed from: private */
    public final void h0() {
        this.zzc &= -5;
        this.zzf = 0;
    }

    /* access modifiers changed from: private */
    public final void j0() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    private final void k0() {
        h7<c1> h7Var = this.zzi;
        if (!h7Var.b()) {
            this.zzi = z6.p(h7Var);
        }
    }

    /* access modifiers changed from: private */
    public final void m0() {
        this.zzi = z6.A();
    }

    public final boolean L() {
        return (this.zzc & 1) != 0;
    }

    public final String M() {
        return this.zzd;
    }

    public final boolean R() {
        return (this.zzc & 2) != 0;
    }

    public final String S() {
        return this.zze;
    }

    public final boolean V() {
        return (this.zzc & 4) != 0;
    }

    public final long W() {
        return this.zzf;
    }

    public final boolean X() {
        return (this.zzc & 8) != 0;
    }

    public final float Y() {
        return this.zzg;
    }

    public final boolean a0() {
        return (this.zzc & 16) != 0;
    }

    public final double b0() {
        return this.zzh;
    }

    public final List<c1> c0() {
        return this.zzi;
    }

    public final int d0() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        Class<c1> cls = c1.class;
        switch (j1.a[i2 - 1]) {
            case 1:
                return new c1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                s8<c1> s8Var = zzk;
                if (s8Var == null) {
                    synchronized (cls) {
                        s8Var = zzk;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzj);
                            zzk = s8Var;
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

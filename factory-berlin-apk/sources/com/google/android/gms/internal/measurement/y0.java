package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class y0 extends z6<y0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final y0 zzh;
    private static volatile s8<y0> zzi;
    private int zzc;
    private int zzd;
    private g1 zze;
    private g1 zzf;
    private boolean zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<y0, a> implements l8 {
        private a() {
            super(y0.zzh);
        }

        public final a A(g1.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((y0) this.f2647h).F((g1) ((z6) aVar.l()));
            return this;
        }

        public final a B(g1 g1Var) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((y0) this.f2647h).K(g1Var);
            return this;
        }

        public final a C(boolean z) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((y0) this.f2647h).G(z);
            return this;
        }

        public final a z(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((y0) this.f2647h).B(i2);
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        y0 y0Var = new y0();
        zzh = y0Var;
        z6.u(y0.class, y0Var);
    }

    private y0() {
    }

    /* access modifiers changed from: private */
    public final void B(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    /* access modifiers changed from: private */
    public final void F(g1 g1Var) {
        g1Var.getClass();
        this.zze = g1Var;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    public final void G(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    public final void K(g1 g1Var) {
        g1Var.getClass();
        this.zzf = g1Var;
        this.zzc |= 4;
    }

    public static a Q() {
        return (a) zzh.w();
    }

    public final boolean H() {
        return (this.zzc & 1) != 0;
    }

    public final int I() {
        return this.zzd;
    }

    public final g1 L() {
        g1 g1Var = this.zze;
        return g1Var == null ? g1.b0() : g1Var;
    }

    public final boolean M() {
        return (this.zzc & 4) != 0;
    }

    public final g1 N() {
        g1 g1Var = this.zzf;
        return g1Var == null ? g1.b0() : g1Var;
    }

    public final boolean O() {
        return (this.zzc & 8) != 0;
    }

    public final boolean P() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new y0();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s8<y0> s8Var = zzi;
                if (s8Var == null) {
                    synchronized (y0.class) {
                        s8Var = zzi;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzh);
                            zzi = s8Var;
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

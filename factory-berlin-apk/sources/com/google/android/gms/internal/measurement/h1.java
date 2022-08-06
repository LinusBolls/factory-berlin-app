package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class h1 extends z6<h1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final h1 zzf;
    private static volatile s8<h1> zzg;
    private int zzc;
    private int zzd;
    private i7 zze = z6.z();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<h1, a> implements l8 {
        private a() {
            super(h1.zzf);
        }

        public final a A(Iterable<? extends Long> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((h1) this.f2647h).E(iterable);
            return this;
        }

        public final a z(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((h1) this.f2647h).H(i2);
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        h1 h1Var = new h1();
        zzf = h1Var;
        z6.u(h1.class, h1Var);
    }

    private h1() {
    }

    /* access modifiers changed from: private */
    public final void E(Iterable<? extends Long> iterable) {
        i7 i7Var = this.zze;
        if (!i7Var.b()) {
            this.zze = z6.q(i7Var);
        }
        k5.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void H(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    public static a K() {
        return (a) zzf.w();
    }

    public final long B(int i2) {
        return this.zze.h(i2);
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final List<Long> I() {
        return this.zze;
    }

    public final int J() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new h1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s8<h1> s8Var = zzg;
                if (s8Var == null) {
                    synchronized (h1.class) {
                        s8Var = zzg;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzf);
                            zzg = s8Var;
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

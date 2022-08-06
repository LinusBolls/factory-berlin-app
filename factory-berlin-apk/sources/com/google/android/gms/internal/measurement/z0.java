package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class z0 extends z6<z0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final z0 zzf;
    private static volatile s8<z0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<z0, a> implements l8 {
        private a() {
            super(z0.zzf);
        }

        public final a A(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((z0) this.f2647h).C(j2);
            return this;
        }

        public final a z(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((z0) this.f2647h).B(i2);
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        z0 z0Var = new z0();
        zzf = z0Var;
        z6.u(z0.class, z0Var);
    }

    private z0() {
    }

    /* access modifiers changed from: private */
    public final void B(int i2) {
        this.zzc |= 1;
        this.zzd = i2;
    }

    /* access modifiers changed from: private */
    public final void C(long j2) {
        this.zzc |= 2;
        this.zze = j2;
    }

    public static a J() {
        return (a) zzf.w();
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzc & 2) != 0;
    }

    public final long I() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new z0();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s8<z0> s8Var = zzg;
                if (s8Var == null) {
                    synchronized (z0.class) {
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

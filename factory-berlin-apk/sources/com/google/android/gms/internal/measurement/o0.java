package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class o0 extends z6<o0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final o0 zzj;
    private static volatile s8<o0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private m0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<o0, a> implements l8 {
        private a() {
            super(o0.zzj);
        }

        public final a z(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((o0) this.f2647h).C(str);
            return this;
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    static {
        o0 o0Var = new o0();
        zzj = o0Var;
        z6.u(o0.class, o0Var);
    }

    private o0() {
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a L() {
        return (a) zzj.w();
    }

    public final boolean D() {
        return (this.zzc & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final m0 G() {
        m0 m0Var = this.zzf;
        return m0Var == null ? m0.L() : m0Var;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean J() {
        return (this.zzc & 32) != 0;
    }

    public final boolean K() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new o0();
            case 2:
                return new a((q0) null);
            case 3:
                return z6.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                s8<o0> s8Var = zzk;
                if (s8Var == null) {
                    synchronized (o0.class) {
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

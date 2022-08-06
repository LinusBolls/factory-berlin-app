package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class m0 extends z6<m0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final m0 zzh;
    private static volatile s8<m0> zzi;
    private int zzc;
    private p0 zzd;
    private n0 zze;
    private boolean zzf;
    private String zzg = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<m0, a> implements l8 {
        private a() {
            super(m0.zzh);
        }

        public final a z(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((m0) this.f2647h).C(str);
            return this;
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    static {
        m0 m0Var = new m0();
        zzh = m0Var;
        z6.u(m0.class, m0Var);
    }

    private m0() {
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static m0 L() {
        return zzh;
    }

    public final boolean D() {
        return (this.zzc & 1) != 0;
    }

    public final p0 E() {
        p0 p0Var = this.zzd;
        return p0Var == null ? p0.J() : p0Var;
    }

    public final boolean F() {
        return (this.zzc & 2) != 0;
    }

    public final n0 G() {
        n0 n0Var = this.zze;
        return n0Var == null ? n0.L() : n0Var;
    }

    public final boolean H() {
        return (this.zzc & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzc & 8) != 0;
    }

    public final String K() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new m0();
            case 2:
                return new a((q0) null);
            case 3:
                return z6.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s8<m0> s8Var = zzi;
                if (s8Var == null) {
                    synchronized (m0.class) {
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

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class t0 extends z6<t0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final t0 zzh;
    private static volatile s8<t0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<t0, a> implements l8 {
        private a() {
            super(t0.zzh);
        }

        public final String A() {
            return ((t0) this.f2647h).B();
        }

        public final boolean B() {
            return ((t0) this.f2647h).E();
        }

        public final boolean C() {
            return ((t0) this.f2647h).F();
        }

        public final boolean D() {
            return ((t0) this.f2647h).G();
        }

        public final int E() {
            return ((t0) this.f2647h).H();
        }

        public final a z(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((t0) this.f2647h).D(str);
            return this;
        }

        /* synthetic */ a(x0 x0Var) {
            this();
        }
    }

    static {
        t0 t0Var = new t0();
        zzh = t0Var;
        z6.u(t0.class, t0Var);
    }

    private t0() {
    }

    /* access modifiers changed from: private */
    public final void D(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final String B() {
        return this.zzd;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzc & 8) != 0;
    }

    public final int H() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (x0.a[i2 - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a((x0) null);
            case 3:
                return z6.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s8<t0> s8Var = zzi;
                if (s8Var == null) {
                    synchronized (t0.class) {
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

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class v0 extends z6<v0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final v0 zzf;
    private static volatile s8<v0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<v0, a> implements l8 {
        private a() {
            super(v0.zzf);
        }

        /* synthetic */ a(x0 x0Var) {
            this();
        }
    }

    static {
        v0 v0Var = new v0();
        zzf = v0Var;
        z6.u(v0.class, v0Var);
    }

    private v0() {
    }

    public final String B() {
        return this.zzd;
    }

    public final String C() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (x0.a[i2 - 1]) {
            case 1:
                return new v0();
            case 2:
                return new a((x0) null);
            case 3:
                return z6.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s8<v0> s8Var = zzg;
                if (s8Var == null) {
                    synchronized (v0.class) {
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

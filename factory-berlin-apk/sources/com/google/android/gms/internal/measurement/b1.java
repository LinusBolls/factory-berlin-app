package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class b1 extends z6<b1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final b1 zzf;
    private static volatile s8<b1> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<b1, a> implements l8 {
        private a() {
            super(b1.zzf);
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        b1 b1Var = new b1();
        zzf = b1Var;
        z6.u(b1.class, b1Var);
    }

    private b1() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s8<b1> s8Var = zzg;
                if (s8Var == null) {
                    synchronized (b1.class) {
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

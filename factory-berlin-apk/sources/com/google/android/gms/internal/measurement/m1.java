package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class m1 extends z6<m1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final m1 zzd;
    private static volatile s8<m1> zze;
    private h7<n1> zzc = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<m1, a> implements l8 {
        private a() {
            super(m1.zzd);
        }

        /* synthetic */ a(l1 l1Var) {
            this();
        }
    }

    static {
        m1 m1Var = new m1();
        zzd = m1Var;
        z6.u(m1.class, m1Var);
    }

    private m1() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (l1.a[i2 - 1]) {
            case 1:
                return new m1();
            case 2:
                return new a((l1) null);
            case 3:
                return z6.s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", n1.class});
            case 4:
                return zzd;
            case 5:
                s8<m1> s8Var = zze;
                if (s8Var == null) {
                    synchronized (m1.class) {
                        s8Var = zze;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzd);
                            zze = s8Var;
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

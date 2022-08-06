package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class f1 extends z6<f1, b> implements l8 {
    /* access modifiers changed from: private */
    public static final f1 zzf;
    private static volatile s8<f1> zzg;
    private int zzc;
    private int zzd = 1;
    private h7<b1> zze = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public enum a implements e7 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f2296g;

        private a(int i2) {
            this.f2296g = i2;
        }

        public static a a(int i2) {
            if (i2 == 1) {
                return RADS;
            }
            if (i2 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static g7 f() {
            return k1.a;
        }

        public final int b() {
            return this.f2296g;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2296g + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class b extends z6.b<f1, b> implements l8 {
        private b() {
            super(f1.zzf);
        }

        /* synthetic */ b(j1 j1Var) {
            this();
        }
    }

    static {
        f1 f1Var = new f1();
        zzf = f1Var;
        z6.u(f1.class, f1Var);
    }

    private f1() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new f1();
            case 2:
                return new b((j1) null);
            case 3:
                return z6.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.f(), "zze", b1.class});
            case 4:
                return zzf;
            case 5:
                s8<f1> s8Var = zzg;
                if (s8Var == null) {
                    synchronized (f1.class) {
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

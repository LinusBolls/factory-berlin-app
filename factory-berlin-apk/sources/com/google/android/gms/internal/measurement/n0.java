package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class n0 extends z6<n0, b> implements l8 {
    /* access modifiers changed from: private */
    public static final n0 zzi;
    private static volatile s8<n0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public enum a implements e7 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f2428g;

        private a(int i2) {
            this.f2428g = i2;
        }

        public static a a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i2 == 1) {
                return LESS_THAN;
            }
            if (i2 == 2) {
                return GREATER_THAN;
            }
            if (i2 == 3) {
                return EQUAL;
            }
            if (i2 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static g7 f() {
            return r0.a;
        }

        public final int b() {
            return this.f2428g;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2428g + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class b extends z6.b<n0, b> implements l8 {
        private b() {
            super(n0.zzi);
        }

        /* synthetic */ b(q0 q0Var) {
            this();
        }
    }

    static {
        n0 n0Var = new n0();
        zzi = n0Var;
        z6.u(n0.class, n0Var);
    }

    private n0() {
    }

    public static n0 L() {
        return zzi;
    }

    public final boolean B() {
        return (this.zzc & 1) != 0;
    }

    public final a C() {
        a a2 = a.a(this.zzd);
        return a2 == null ? a.UNKNOWN_COMPARISON_TYPE : a2;
    }

    public final boolean D() {
        return (this.zzc & 2) != 0;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzc & 8) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzc & 16) != 0;
    }

    public final String K() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new n0();
            case 2:
                return new b((q0) null);
            case 3:
                return z6.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.f(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s8<n0> s8Var = zzj;
                if (s8Var == null) {
                    synchronized (n0.class) {
                        s8Var = zzj;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzi);
                            zzj = s8Var;
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

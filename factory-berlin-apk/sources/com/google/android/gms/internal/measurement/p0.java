package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class p0 extends z6<p0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final p0 zzh;
    private static volatile s8<p0> zzi;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private h7<String> zzg = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<p0, a> implements l8 {
        private a() {
            super(p0.zzh);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public enum b implements e7 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f2478g;

        private b(int i2) {
            this.f2478g = i2;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static g7 f() {
            return w0.a;
        }

        public final int b() {
            return this.f2478g;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2478g + " name=" + name() + '>';
        }
    }

    static {
        p0 p0Var = new p0();
        zzh = p0Var;
        z6.u(p0.class, p0Var);
    }

    private p0() {
    }

    public static p0 J() {
        return zzh;
    }

    public final boolean B() {
        return (this.zzc & 1) != 0;
    }

    public final b C() {
        b a2 = b.a(this.zzd);
        return a2 == null ? b.UNKNOWN_MATCH_TYPE : a2;
    }

    public final boolean D() {
        return (this.zzc & 2) != 0;
    }

    public final String E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final List<String> H() {
        return this.zzg;
    }

    public final int I() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new p0();
            case 2:
                return new a((q0) null);
            case 3:
                return z6.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.f(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s8<p0> s8Var = zzi;
                if (s8Var == null) {
                    synchronized (p0.class) {
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

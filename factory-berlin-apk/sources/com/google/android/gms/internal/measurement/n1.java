package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class n1 extends z6<n1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final n1 zzk;
    private static volatile s8<n1> zzl;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private long zzg;
    private double zzh;
    private h7<n1> zzi = z6.A();
    private String zzj = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<n1, a> implements l8 {
        private a() {
            super(n1.zzk);
        }

        /* synthetic */ a(l1 l1Var) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public enum b implements e7 {
        UNDEFINED(0),
        NULL(1),
        STRING(2),
        NUMBER(3),
        BOOLEAN(4),
        LIST(5),
        MAP(6),
        STATEMENT(7);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f2436g;

        private b(int i2) {
            this.f2436g = i2;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return UNDEFINED;
                case 1:
                    return NULL;
                case 2:
                    return STRING;
                case 3:
                    return NUMBER;
                case 4:
                    return BOOLEAN;
                case 5:
                    return LIST;
                case 6:
                    return MAP;
                case 7:
                    return STATEMENT;
                default:
                    return null;
            }
        }

        public static g7 f() {
            return p1.a;
        }

        public final int b() {
            return this.f2436g;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2436g + " name=" + name() + '>';
        }
    }

    static {
        n1 n1Var = new n1();
        zzk = n1Var;
        z6.u(n1.class, n1Var);
    }

    private n1() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        Class<n1> cls = n1.class;
        switch (l1.a[i2 - 1]) {
            case 1:
                return new n1();
            case 2:
                return new a((l1) null);
            case 3:
                return z6.s(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", b.f(), "zze", "zzf", "zzg", "zzh", "zzi", cls, "zzj"});
            case 4:
                return zzk;
            case 5:
                s8<n1> s8Var = zzl;
                if (s8Var == null) {
                    synchronized (cls) {
                        s8Var = zzl;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzk);
                            zzl = s8Var;
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

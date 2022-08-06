package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class i1 extends z6<i1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final i1 zzj;
    private static volatile s8<i1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<i1, a> implements l8 {
        private a() {
            super(i1.zzj);
        }

        public final a A(double d2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).B(d2);
            return this;
        }

        public final a B(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).C(j2);
            return this;
        }

        public final a C(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).H(str);
            return this;
        }

        public final a D() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).b0();
            return this;
        }

        public final a E(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).K(j2);
            return this;
        }

        public final a F(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).O(str);
            return this;
        }

        public final a G() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).c0();
            return this;
        }

        public final a z() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((i1) this.f2647h).a0();
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        i1 i1Var = new i1();
        zzj = i1Var;
        z6.u(i1.class, i1Var);
    }

    private i1() {
    }

    /* access modifiers changed from: private */
    public final void B(double d2) {
        this.zzc |= 32;
        this.zzi = d2;
    }

    /* access modifiers changed from: private */
    public final void C(long j2) {
        this.zzc |= 1;
        this.zzd = j2;
    }

    /* access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void K(long j2) {
        this.zzc |= 8;
        this.zzg = j2;
    }

    /* access modifiers changed from: private */
    public final void O(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a X() {
        return (a) zzj.w();
    }

    /* access modifiers changed from: private */
    public final void a0() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* access modifiers changed from: private */
    public final void b0() {
        this.zzc &= -9;
        this.zzg = 0;
    }

    /* access modifiers changed from: private */
    public final void c0() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final long J() {
        return this.zzd;
    }

    public final String P() {
        return this.zze;
    }

    public final boolean R() {
        return (this.zzc & 4) != 0;
    }

    public final String S() {
        return this.zzf;
    }

    public final boolean T() {
        return (this.zzc & 8) != 0;
    }

    public final long U() {
        return this.zzg;
    }

    public final boolean V() {
        return (this.zzc & 32) != 0;
    }

    public final double W() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new i1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                s8<i1> s8Var = zzk;
                if (s8Var == null) {
                    synchronized (i1.class) {
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

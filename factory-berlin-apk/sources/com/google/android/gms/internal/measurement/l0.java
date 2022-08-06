package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class l0 extends z6<l0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final l0 zzl;
    private static volatile s8<l0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private h7<m0> zzf = z6.A();
    private boolean zzg;
    private n0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<l0, a> implements l8 {
        private a() {
            super(l0.zzl);
        }

        public final a A(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((l0) this.f2647h).F(str);
            return this;
        }

        public final m0 B(int i2) {
            return ((l0) this.f2647h).B(i2);
        }

        public final String C() {
            return ((l0) this.f2647h).I();
        }

        public final int D() {
            return ((l0) this.f2647h).K();
        }

        public final a z(int i2, m0 m0Var) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((l0) this.f2647h).C(i2, m0Var);
            return this;
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    static {
        l0 l0Var = new l0();
        zzl = l0Var;
        z6.u(l0.class, l0Var);
    }

    private l0() {
    }

    /* access modifiers changed from: private */
    public final void C(int i2, m0 m0Var) {
        m0Var.getClass();
        h7<m0> h7Var = this.zzf;
        if (!h7Var.b()) {
            this.zzf = z6.p(h7Var);
        }
        this.zzf.set(i2, m0Var);
    }

    /* access modifiers changed from: private */
    public final void F(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a R() {
        return (a) zzl.w();
    }

    public final m0 B(int i2) {
        return this.zzf.get(i2);
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final int H() {
        return this.zzd;
    }

    public final String I() {
        return this.zze;
    }

    public final List<m0> J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzf.size();
    }

    public final boolean L() {
        return (this.zzc & 8) != 0;
    }

    public final n0 M() {
        n0 n0Var = this.zzh;
        return n0Var == null ? n0.L() : n0Var;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return (this.zzc & 64) != 0;
    }

    public final boolean Q() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new l0();
            case 2:
                return new a((q0) null);
            case 3:
                return z6.s(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", m0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                s8<l0> s8Var = zzm;
                if (s8Var == null) {
                    synchronized (l0.class) {
                        s8Var = zzm;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzl);
                            zzm = s8Var;
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

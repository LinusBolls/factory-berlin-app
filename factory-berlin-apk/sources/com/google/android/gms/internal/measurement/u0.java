package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.z6;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class u0 extends z6<u0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final u0 zzm;
    private static volatile s8<u0> zzn;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private h7<v0> zzg = z6.A();
    private h7<t0> zzh = z6.A();
    private h7<k0> zzi = z6.A();
    private String zzj = "";
    private boolean zzk;
    private h7<m1> zzl = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<u0, a> implements l8 {
        private a() {
            super(u0.zzm);
        }

        public final t0 A(int i2) {
            return ((u0) this.f2647h).B(i2);
        }

        public final a B(int i2, t0.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((u0) this.f2647h).C(i2, (t0) ((z6) aVar.l()));
            return this;
        }

        public final List<k0> C() {
            return Collections.unmodifiableList(((u0) this.f2647h).L());
        }

        public final a D() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((u0) this.f2647h).Q();
            return this;
        }

        public final int z() {
            return ((u0) this.f2647h).K();
        }

        /* synthetic */ a(x0 x0Var) {
            this();
        }
    }

    static {
        u0 u0Var = new u0();
        zzm = u0Var;
        z6.u(u0.class, u0Var);
    }

    private u0() {
    }

    /* access modifiers changed from: private */
    public final void C(int i2, t0 t0Var) {
        t0Var.getClass();
        h7<t0> h7Var = this.zzh;
        if (!h7Var.b()) {
            this.zzh = z6.p(h7Var);
        }
        this.zzh.set(i2, t0Var);
    }

    public static a N() {
        return (a) zzm.w();
    }

    public static u0 O() {
        return zzm;
    }

    /* access modifiers changed from: private */
    public final void Q() {
        this.zzi = z6.A();
    }

    public final t0 B(int i2) {
        return this.zzh.get(i2);
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzc & 2) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final List<v0> J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh.size();
    }

    public final List<k0> L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (x0.a[i2 - 1]) {
            case 1:
                return new u0();
            case 2:
                return new a((x0) null);
            case 3:
                return z6.s(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", v0.class, "zzh", t0.class, "zzi", k0.class, "zzj", "zzk", "zzl", m1.class});
            case 4:
                return zzm;
            case 5:
                s8<u0> s8Var = zzn;
                if (s8Var == null) {
                    synchronized (u0.class) {
                        s8Var = zzn;
                        if (s8Var == null) {
                            s8Var = new z6.a<>(zzm);
                            zzn = s8Var;
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

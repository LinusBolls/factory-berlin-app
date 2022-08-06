package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class k0 extends z6<k0, a> implements l8 {
    /* access modifiers changed from: private */
    public static final k0 zzi;
    private static volatile s8<k0> zzj;
    private int zzc;
    private int zzd;
    private h7<o0> zze = z6.A();
    private h7<l0> zzf = z6.A();
    private boolean zzg;
    private boolean zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<k0, a> implements l8 {
        private a() {
            super(k0.zzi);
        }

        public final a A(int i2, l0.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((k0) this.f2647h).C(i2, (l0) ((z6) aVar.l()));
            return this;
        }

        public final a B(int i2, o0.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((k0) this.f2647h).D(i2, (o0) ((z6) aVar.l()));
            return this;
        }

        public final o0 C(int i2) {
            return ((k0) this.f2647h).B(i2);
        }

        public final int D() {
            return ((k0) this.f2647h).M();
        }

        public final l0 E(int i2) {
            return ((k0) this.f2647h).I(i2);
        }

        public final int z() {
            return ((k0) this.f2647h).K();
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    static {
        k0 k0Var = new k0();
        zzi = k0Var;
        z6.u(k0.class, k0Var);
    }

    private k0() {
    }

    /* access modifiers changed from: private */
    public final void C(int i2, l0 l0Var) {
        l0Var.getClass();
        h7<l0> h7Var = this.zzf;
        if (!h7Var.b()) {
            this.zzf = z6.p(h7Var);
        }
        this.zzf.set(i2, l0Var);
    }

    /* access modifiers changed from: private */
    public final void D(int i2, o0 o0Var) {
        o0Var.getClass();
        h7<o0> h7Var = this.zze;
        if (!h7Var.b()) {
            this.zze = z6.p(h7Var);
        }
        this.zze.set(i2, o0Var);
    }

    public final o0 B(int i2) {
        return this.zze.get(i2);
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final int H() {
        return this.zzd;
    }

    public final l0 I(int i2) {
        return this.zzf.get(i2);
    }

    public final List<o0> J() {
        return this.zze;
    }

    public final int K() {
        return this.zze.size();
    }

    public final List<l0> L() {
        return this.zzf;
    }

    public final int M() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (q0.a[i2 - 1]) {
            case 1:
                return new k0();
            case 2:
                return new a((q0) null);
            case 3:
                return z6.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", o0.class, "zzf", l0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s8<k0> s8Var = zzj;
                if (s8Var == null) {
                    synchronized (k0.class) {
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

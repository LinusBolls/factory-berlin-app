package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.z6;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class d1 extends z6<d1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final d1 zzd;
    private static volatile s8<d1> zze;
    private h7<e1> zzc = z6.A();

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<d1, a> implements l8 {
        private a() {
            super(d1.zzd);
        }

        public final e1 A(int i2) {
            return ((d1) this.f2647h).B(0);
        }

        public final a z(e1.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((d1) this.f2647h).E((e1) ((z6) aVar.l()));
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        d1 d1Var = new d1();
        zzd = d1Var;
        z6.u(d1.class, d1Var);
    }

    private d1() {
    }

    /* access modifiers changed from: private */
    public final void E(e1 e1Var) {
        e1Var.getClass();
        h7<e1> h7Var = this.zzc;
        if (!h7Var.b()) {
            this.zzc = z6.p(h7Var);
        }
        this.zzc.add(e1Var);
    }

    public static a F() {
        return (a) zzd.w();
    }

    public final e1 B(int i2) {
        return this.zzc.get(0);
    }

    public final List<e1> C() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new d1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", e1.class});
            case 4:
                return zzd;
            case 5:
                s8<d1> s8Var = zze;
                if (s8Var == null) {
                    synchronized (d1.class) {
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

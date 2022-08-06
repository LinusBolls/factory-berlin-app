package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.z6;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class a1 extends z6<a1, a> implements l8 {
    /* access modifiers changed from: private */
    public static final a1 zzi;
    private static volatile s8<a1> zzj;
    private int zzc;
    private h7<c1> zzd = z6.A();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    public static final class a extends z6.b<a1, a> implements l8 {
        private a() {
            super(a1.zzi);
        }

        public final a A(int i2, c1 c1Var) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).D(i2, c1Var);
            return this;
        }

        public final a B(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).E(j2);
            return this;
        }

        public final a C(c1.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).M((c1) ((z6) aVar.l()));
            return this;
        }

        public final a D(c1 c1Var) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).M(c1Var);
            return this;
        }

        public final a E(Iterable<? extends c1> iterable) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).N(iterable);
            return this;
        }

        public final a F(String str) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).O(str);
            return this;
        }

        public final c1 G(int i2) {
            return ((a1) this.f2647h).B(i2);
        }

        public final List<c1> H() {
            return Collections.unmodifiableList(((a1) this.f2647h).C());
        }

        public final int I() {
            return ((a1) this.f2647h).P();
        }

        public final a J(int i2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).Q(i2);
            return this;
        }

        public final a M(long j2) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).R(j2);
            return this;
        }

        public final a N() {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).e0();
            return this;
        }

        public final String O() {
            return ((a1) this.f2647h).T();
        }

        public final long P() {
            return ((a1) this.f2647h).V();
        }

        public final long Q() {
            return ((a1) this.f2647h).X();
        }

        public final a z(int i2, c1.a aVar) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            ((a1) this.f2647h).D(i2, (c1) ((z6) aVar.l()));
            return this;
        }

        /* synthetic */ a(j1 j1Var) {
            this();
        }
    }

    static {
        a1 a1Var = new a1();
        zzi = a1Var;
        z6.u(a1.class, a1Var);
    }

    private a1() {
    }

    /* access modifiers changed from: private */
    public final void D(int i2, c1 c1Var) {
        c1Var.getClass();
        d0();
        this.zzd.set(i2, c1Var);
    }

    /* access modifiers changed from: private */
    public final void E(long j2) {
        this.zzc |= 2;
        this.zzf = j2;
    }

    /* access modifiers changed from: private */
    public final void M(c1 c1Var) {
        c1Var.getClass();
        d0();
        this.zzd.add(c1Var);
    }

    /* access modifiers changed from: private */
    public final void N(Iterable<? extends c1> iterable) {
        d0();
        k5.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void O(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void Q(int i2) {
        d0();
        this.zzd.remove(i2);
    }

    /* access modifiers changed from: private */
    public final void R(long j2) {
        this.zzc |= 4;
        this.zzg = j2;
    }

    public static a b0() {
        return (a) zzi.w();
    }

    private final void d0() {
        h7<c1> h7Var = this.zzd;
        if (!h7Var.b()) {
            this.zzd = z6.p(h7Var);
        }
    }

    /* access modifiers changed from: private */
    public final void e0() {
        this.zzd = z6.A();
    }

    public final c1 B(int i2) {
        return this.zzd.get(i2);
    }

    public final List<c1> C() {
        return this.zzd;
    }

    public final int P() {
        return this.zzd.size();
    }

    public final String T() {
        return this.zze;
    }

    public final boolean U() {
        return (this.zzc & 2) != 0;
    }

    public final long V() {
        return this.zzf;
    }

    public final boolean W() {
        return (this.zzc & 4) != 0;
    }

    public final long X() {
        return this.zzg;
    }

    public final boolean Y() {
        return (this.zzc & 8) != 0;
    }

    public final int a0() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i2, Object obj, Object obj2) {
        switch (j1.a[i2 - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a((j1) null);
            case 3:
                return z6.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", c1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s8<a1> s8Var = zzj;
                if (s8Var == null) {
                    synchronized (a1.class) {
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

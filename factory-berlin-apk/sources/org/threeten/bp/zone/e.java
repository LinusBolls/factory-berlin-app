package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.f;
import org.threeten.bp.g;
import org.threeten.bp.p;
import org.threeten.bp.s.m;
import org.threeten.bp.t.d;

/* compiled from: ZoneOffsetTransitionRule */
public final class e implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final g f11765g;

    /* renamed from: h  reason: collision with root package name */
    private final byte f11766h;

    /* renamed from: i  reason: collision with root package name */
    private final org.threeten.bp.b f11767i;

    /* renamed from: j  reason: collision with root package name */
    private final f f11768j;

    /* renamed from: k  reason: collision with root package name */
    private final int f11769k;

    /* renamed from: l  reason: collision with root package name */
    private final b f11770l;

    /* renamed from: m  reason: collision with root package name */
    private final p f11771m;

    /* renamed from: n  reason: collision with root package name */
    private final p f11772n;
    private final p o;

    /* compiled from: ZoneOffsetTransitionRule */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.threeten.bp.zone.e$b[] r0 = org.threeten.bp.zone.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.zone.e$b r1 = org.threeten.bp.zone.e.b.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.zone.e$b r1 = org.threeten.bp.zone.e.b.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.zone.e.a.<clinit>():void");
        }
    }

    /* compiled from: ZoneOffsetTransitionRule */
    public enum b {
        UTC,
        WALL,
        STANDARD;

        public org.threeten.bp.e a(org.threeten.bp.e eVar, p pVar, p pVar2) {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                return eVar.A0((long) (pVar2.K() - p.f11630l.K()));
            }
            if (i2 != 2) {
                return eVar;
            }
            return eVar.A0((long) (pVar2.K() - pVar.K()));
        }
    }

    e(g gVar, int i2, org.threeten.bp.b bVar, f fVar, int i3, b bVar2, p pVar, p pVar2, p pVar3) {
        this.f11765g = gVar;
        this.f11766h = (byte) i2;
        this.f11767i = bVar;
        this.f11768j = fVar;
        this.f11769k = i3;
        this.f11770l = bVar2;
        this.f11771m = pVar;
        this.f11772n = pVar2;
        this.o = pVar3;
    }

    private void a(StringBuilder sb, long j2) {
        if (j2 < 10) {
            sb.append(0);
        }
        sb.append(j2);
    }

    static e c(DataInput dataInput) {
        org.threeten.bp.b bVar;
        int readInt = dataInput.readInt();
        g l2 = g.l(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        if (i3 == 0) {
            bVar = null;
        } else {
            bVar = org.threeten.bp.b.a(i3);
        }
        org.threeten.bp.b bVar2 = bVar;
        int i4 = (507904 & readInt) >>> 14;
        b bVar3 = b.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        int readInt2 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        p O = p.O(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        p O2 = p.O(i6 == 3 ? dataInput.readInt() : O.K() + (i6 * 1800));
        p O3 = p.O(i7 == 3 ? dataInput.readInt() : O.K() + (i7 * 1800));
        if (i2 >= -28 && i2 <= 31 && i2 != 0) {
            return new e(l2, i2, bVar2, f.c0((long) d.f(readInt2, 86400)), d.d(readInt2, 86400), bVar3, O, O2, O3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public d b(int i2) {
        LocalDate localDate;
        byte b2 = this.f11766h;
        if (b2 < 0) {
            g gVar = this.f11765g;
            localDate = LocalDate.A0(i2, gVar, gVar.i(m.f11663i.G((long) i2)) + 1 + this.f11766h);
            org.threeten.bp.b bVar = this.f11767i;
            if (bVar != null) {
                localDate = localDate.p(org.threeten.bp.temporal.g.b(bVar));
            }
        } else {
            localDate = LocalDate.A0(i2, this.f11765g, b2);
            org.threeten.bp.b bVar2 = this.f11767i;
            if (bVar2 != null) {
                localDate = localDate.p(org.threeten.bp.temporal.g.a(bVar2));
            }
        }
        return new d(this.f11770l.a(org.threeten.bp.e.q0(localDate.F0((long) this.f11769k), this.f11768j), this.f11771m, this.f11772n), this.f11772n, this.o);
    }

    /* access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        int i2;
        int i3;
        int i4;
        int o0 = this.f11768j.o0() + (this.f11769k * 86400);
        int K = this.f11771m.K();
        int K2 = this.f11772n.K() - K;
        int K3 = this.o.K() - K;
        if (o0 % 3600 != 0 || o0 > 86400) {
            i2 = 31;
        } else {
            i2 = o0 == 86400 ? 24 : this.f11768j.M();
        }
        int i5 = K % 900 == 0 ? (K / 900) + 128 : 255;
        if (K2 == 0 || K2 == 1800 || K2 == 3600) {
            i3 = K2 / 1800;
        } else {
            i3 = 3;
        }
        if (K3 == 0 || K3 == 1800 || K3 == 3600) {
            i4 = K3 / 1800;
        } else {
            i4 = 3;
        }
        org.threeten.bp.b bVar = this.f11767i;
        dataOutput.writeInt((this.f11765g.getValue() << 28) + ((this.f11766h + 32) << 22) + ((bVar == null ? 0 : bVar.getValue()) << 19) + (i2 << 14) + (this.f11770l.ordinal() << 12) + (i5 << 4) + (i3 << 2) + i4);
        if (i2 == 31) {
            dataOutput.writeInt(o0);
        }
        if (i5 == 255) {
            dataOutput.writeInt(K);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f11772n.K());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.o.K());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f11765g == eVar.f11765g && this.f11766h == eVar.f11766h && this.f11767i == eVar.f11767i && this.f11770l == eVar.f11770l && this.f11769k == eVar.f11769k && this.f11768j.equals(eVar.f11768j) && this.f11771m.equals(eVar.f11771m) && this.f11772n.equals(eVar.f11772n) && this.o.equals(eVar.o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int o0 = ((this.f11768j.o0() + this.f11769k) << 15) + (this.f11765g.ordinal() << 11) + ((this.f11766h + 32) << 5);
        org.threeten.bp.b bVar = this.f11767i;
        return ((((o0 + ((bVar == null ? 7 : bVar.ordinal()) << 2)) + this.f11770l.ordinal()) ^ this.f11771m.hashCode()) ^ this.f11772n.hashCode()) ^ this.o.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.f11772n.compareTo(this.o) > 0 ? "Gap " : "Overlap ");
        sb.append(this.f11772n);
        sb.append(" to ");
        sb.append(this.o);
        sb.append(", ");
        org.threeten.bp.b bVar = this.f11767i;
        if (bVar != null) {
            byte b2 = this.f11766h;
            if (b2 == -1) {
                sb.append(bVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.f11765g.name());
            } else if (b2 < 0) {
                sb.append(bVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f11766h) - 1);
                sb.append(" of ");
                sb.append(this.f11765g.name());
            } else {
                sb.append(bVar.name());
                sb.append(" on or after ");
                sb.append(this.f11765g.name());
                sb.append(' ');
                sb.append(this.f11766h);
            }
        } else {
            sb.append(this.f11765g.name());
            sb.append(' ');
            sb.append(this.f11766h);
        }
        sb.append(" at ");
        if (this.f11769k == 0) {
            sb.append(this.f11768j);
        } else {
            long o0 = (long) ((this.f11768j.o0() / 60) + (this.f11769k * 24 * 60));
            a(sb, d.e(o0, 60));
            sb.append(':');
            a(sb, (long) d.g(o0, 60));
        }
        sb.append(" ");
        sb.append(this.f11770l);
        sb.append(", standard offset ");
        sb.append(this.f11771m);
        sb.append(']');
        return sb.toString();
    }
}

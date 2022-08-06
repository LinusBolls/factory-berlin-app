package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.LocalDate;
import org.threeten.bp.e;
import org.threeten.bp.p;
import org.threeten.bp.t.d;
import org.threeten.bp.zone.f;

/* compiled from: StandardZoneRules */
final class b extends f implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final long[] f11753g;

    /* renamed from: h  reason: collision with root package name */
    private final p[] f11754h;

    /* renamed from: i  reason: collision with root package name */
    private final long[] f11755i;

    /* renamed from: j  reason: collision with root package name */
    private final e[] f11756j;

    /* renamed from: k  reason: collision with root package name */
    private final p[] f11757k;

    /* renamed from: l  reason: collision with root package name */
    private final e[] f11758l;

    /* renamed from: m  reason: collision with root package name */
    private final ConcurrentMap<Integer, d[]> f11759m = new ConcurrentHashMap();

    private b(long[] jArr, p[] pVarArr, long[] jArr2, p[] pVarArr2, e[] eVarArr) {
        this.f11753g = jArr;
        this.f11754h = pVarArr;
        this.f11755i = jArr2;
        this.f11757k = pVarArr2;
        this.f11758l = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jArr2.length) {
            int i3 = i2 + 1;
            d dVar = new d(jArr2[i2], pVarArr2[i2], pVarArr2[i3]);
            if (dVar.p()) {
                arrayList.add(dVar.h());
                arrayList.add(dVar.f());
            } else {
                arrayList.add(dVar.f());
                arrayList.add(dVar.h());
            }
            i2 = i3;
        }
        this.f11756j = (e[]) arrayList.toArray(new e[arrayList.size()]);
    }

    private Object h(e eVar, d dVar) {
        e h2 = dVar.h();
        if (dVar.p()) {
            if (eVar.O(h2)) {
                return dVar.n();
            }
            if (eVar.O(dVar.f())) {
                return dVar;
            }
            return dVar.l();
        } else if (!eVar.O(h2)) {
            return dVar.l();
        } else {
            return eVar.O(dVar.f()) ? dVar.n() : dVar;
        }
    }

    private d[] i(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        d[] dVarArr = (d[]) this.f11759m.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f11758l;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            dVarArr2[i3] = eVarArr[i3].b(i2);
        }
        if (i2 < 2100) {
            this.f11759m.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    private int j(long j2, p pVar) {
        return LocalDate.B0(d.e(j2 + ((long) pVar.K()), 86400)).o0();
    }

    private Object k(e eVar) {
        int i2 = 0;
        if (this.f11758l.length > 0) {
            e[] eVarArr = this.f11756j;
            if (eVar.M(eVarArr[eVarArr.length - 1])) {
                d[] i3 = i(eVar.h0());
                Object obj = null;
                int length = i3.length;
                while (i2 < length) {
                    d dVar = i3[i2];
                    Object h2 = h(eVar, dVar);
                    if ((h2 instanceof d) || h2.equals(dVar.n())) {
                        return h2;
                    }
                    i2++;
                    obj = h2;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f11756j, eVar);
        if (binarySearch == -1) {
            return this.f11757k[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            e[] eVarArr2 = this.f11756j;
            if (binarySearch < eVarArr2.length - 1) {
                int i4 = binarySearch + 1;
                if (eVarArr2[binarySearch].equals(eVarArr2[i4])) {
                    binarySearch = i4;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f11757k[(binarySearch / 2) + 1];
        }
        e[] eVarArr3 = this.f11756j;
        e eVar2 = eVarArr3[binarySearch];
        e eVar3 = eVarArr3[binarySearch + 1];
        p[] pVarArr = this.f11757k;
        int i5 = binarySearch / 2;
        p pVar = pVarArr[i5];
        p pVar2 = pVarArr[i5 + 1];
        if (pVar2.K() > pVar.K()) {
            return new d(eVar2, pVar, pVar2);
        }
        return new d(eVar3, pVar, pVar2);
    }

    static b m(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a.b(dataInput);
        }
        int i3 = readInt + 1;
        p[] pVarArr = new p[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            pVarArr[i4] = a.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr2[i5] = a.b(dataInput);
        }
        int i6 = readInt2 + 1;
        p[] pVarArr2 = new p[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            pVarArr2[i7] = a.d(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i8 = 0; i8 < readByte; i8++) {
            eVarArr[i8] = e.c(dataInput);
        }
        return new b(jArr, pVarArr, jArr2, pVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    public p a(org.threeten.bp.d dVar) {
        long I = dVar.I();
        if (this.f11758l.length > 0) {
            long[] jArr = this.f11755i;
            if (I > jArr[jArr.length - 1]) {
                p[] pVarArr = this.f11757k;
                d[] i2 = i(j(I, pVarArr[pVarArr.length - 1]));
                d dVar2 = null;
                for (int i3 = 0; i3 < i2.length; i3++) {
                    dVar2 = i2[i3];
                    if (I < dVar2.t()) {
                        return dVar2.n();
                    }
                }
                return dVar2.l();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f11755i, I);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f11757k[binarySearch + 1];
    }

    public d b(e eVar) {
        Object k2 = k(eVar);
        if (k2 instanceof d) {
            return (d) k2;
        }
        return null;
    }

    public List<p> c(e eVar) {
        Object k2 = k(eVar);
        if (k2 instanceof d) {
            return ((d) k2).o();
        }
        return Collections.singletonList((p) k2);
    }

    public boolean d(org.threeten.bp.d dVar) {
        return !l(dVar).equals(a(dVar));
    }

    public boolean e() {
        return this.f11755i.length == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (!Arrays.equals(this.f11753g, bVar.f11753g) || !Arrays.equals(this.f11754h, bVar.f11754h) || !Arrays.equals(this.f11755i, bVar.f11755i) || !Arrays.equals(this.f11757k, bVar.f11757k) || !Arrays.equals(this.f11758l, bVar.f11758l)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof f.a) || !e() || !a(org.threeten.bp.d.f11481i).equals(((f.a) obj).a(org.threeten.bp.d.f11481i))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean f(e eVar, p pVar) {
        return c(eVar).contains(pVar);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f11753g) ^ Arrays.hashCode(this.f11754h)) ^ Arrays.hashCode(this.f11755i)) ^ Arrays.hashCode(this.f11757k)) ^ Arrays.hashCode(this.f11758l);
    }

    public p l(org.threeten.bp.d dVar) {
        int binarySearch = Arrays.binarySearch(this.f11753g, dVar.I());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f11754h[binarySearch + 1];
    }

    /* access modifiers changed from: package-private */
    public void n(DataOutput dataOutput) {
        dataOutput.writeInt(this.f11753g.length);
        for (long e2 : this.f11753g) {
            a.e(e2, dataOutput);
        }
        for (p g2 : this.f11754h) {
            a.g(g2, dataOutput);
        }
        dataOutput.writeInt(this.f11755i.length);
        for (long e3 : this.f11755i) {
            a.e(e3, dataOutput);
        }
        for (p g3 : this.f11757k) {
            a.g(g3, dataOutput);
        }
        dataOutput.writeByte(this.f11758l.length);
        for (e d2 : this.f11758l) {
            d2.d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        p[] pVarArr = this.f11754h;
        sb.append(pVarArr[pVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.wb;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.internal.measurement.z6;
import e.e.a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class oa {
    private String a;
    private boolean b;
    private g1 c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f3019d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f3020e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f3021f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f3022g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ma f3023h;

    private oa(ma maVar, String str) {
        this.f3023h = maVar;
        this.a = str;
        this.b = true;
        this.f3019d = new BitSet();
        this.f3020e = new BitSet();
        this.f3021f = new a();
        this.f3022g = new a();
    }

    /* access modifiers changed from: package-private */
    public final y0 a(int i2) {
        ArrayList arrayList;
        List list;
        y0.a Q = y0.Q();
        Q.z(i2);
        Q.C(this.b);
        g1 g1Var = this.c;
        if (g1Var != null) {
            Q.B(g1Var);
        }
        g1.a a0 = g1.a0();
        a0.E(ba.E(this.f3019d));
        a0.B(ba.E(this.f3020e));
        if (this.f3021f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f3021f.size());
            for (Integer intValue : this.f3021f.keySet()) {
                int intValue2 = intValue.intValue();
                z0.a J = z0.J();
                J.z(intValue2);
                J.A(this.f3021f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((z0) ((z6) J.l()));
            }
        }
        a0.F(arrayList);
        if (this.f3022g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f3022g.size());
            for (Integer next : this.f3022g.keySet()) {
                h1.a K = h1.K();
                K.z(next.intValue());
                List list2 = this.f3022g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    K.A(list2);
                }
                arrayList2.add((h1) ((z6) K.l()));
            }
            list = arrayList2;
        }
        a0.G(list);
        Q.A(a0);
        return (y0) ((z6) Q.l());
    }

    /* access modifiers changed from: package-private */
    public final void c(ta taVar) {
        int a2 = taVar.a();
        Boolean bool = taVar.c;
        if (bool != null) {
            this.f3020e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = taVar.f3130d;
        if (bool2 != null) {
            this.f3019d.set(a2, bool2.booleanValue());
        }
        if (taVar.f3131e != null) {
            Long l2 = this.f3021f.get(Integer.valueOf(a2));
            long longValue = taVar.f3131e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f3021f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (taVar.f3132f != null) {
            List list = this.f3022g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.f3022g.put(Integer.valueOf(a2), list);
            }
            if (taVar.i()) {
                list.clear();
            }
            if (wb.a() && this.f3023h.l().z(this.a, u.d0) && taVar.j()) {
                list.clear();
            }
            if (!wb.a() || !this.f3023h.l().z(this.a, u.d0)) {
                list.add(Long.valueOf(taVar.f3132f.longValue() / 1000));
                return;
            }
            long longValue2 = taVar.f3132f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    private oa(ma maVar, String str, g1 g1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f3023h = maVar;
        this.a = str;
        this.f3019d = bitSet;
        this.f3020e = bitSet2;
        this.f3021f = map;
        this.f3022g = new a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f3022g.put(next, arrayList);
            }
        }
        this.b = false;
        this.c = g1Var;
    }

    /* synthetic */ oa(ma maVar, String str, g1 g1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, pa paVar) {
        this(maVar, str, g1Var, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ oa(ma maVar, String str, pa paVar) {
        this(maVar, str);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.internal.measurement.z6;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class ba extends u9 {
    ba(x9 x9Var) {
        super(x9Var);
    }

    private static String D(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    private static List<c1> G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                c1.a e0 = c1.e0();
                for (String str : bundle.keySet()) {
                    c1.a e02 = c1.e0();
                    e02.E(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        e02.B(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        e02.G((String) obj);
                    } else if (obj instanceof Double) {
                        e02.A(((Double) obj).doubleValue());
                    }
                    e0.C(e02);
                }
                if (e0.I() > 0) {
                    arrayList.add((c1) ((z6) e0.l()));
                }
            }
        }
        return arrayList;
    }

    private static void K(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private final void L(StringBuilder sb, int i2, m0 m0Var) {
        if (m0Var != null) {
            K(sb, i2);
            sb.append("filter {\n");
            if (m0Var.H()) {
                O(sb, i2, "complement", Boolean.valueOf(m0Var.I()));
            }
            if (m0Var.J()) {
                O(sb, i2, "param_name", e().y(m0Var.K()));
            }
            if (m0Var.D()) {
                int i3 = i2 + 1;
                p0 E = m0Var.E();
                if (E != null) {
                    K(sb, i3);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (E.B()) {
                        O(sb, i3, "match_type", E.C().name());
                    }
                    if (E.D()) {
                        O(sb, i3, "expression", E.E());
                    }
                    if (E.F()) {
                        O(sb, i3, "case_sensitive", Boolean.valueOf(E.G()));
                    }
                    if (E.I() > 0) {
                        K(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        for (String append : E.H()) {
                            K(sb, i3 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    K(sb, i3);
                    sb.append("}\n");
                }
            }
            if (m0Var.F()) {
                M(sb, i2 + 1, "number_filter", m0Var.G());
            }
            K(sb, i2);
            sb.append("}\n");
        }
    }

    private static void M(StringBuilder sb, int i2, String str, n0 n0Var) {
        if (n0Var != null) {
            K(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            if (n0Var.B()) {
                O(sb, i2, "comparison_type", n0Var.C().name());
            }
            if (n0Var.D()) {
                O(sb, i2, "match_as_float", Boolean.valueOf(n0Var.E()));
            }
            if (n0Var.F()) {
                O(sb, i2, "comparison_value", n0Var.G());
            }
            if (n0Var.H()) {
                O(sb, i2, "min_comparison_value", n0Var.I());
            }
            if (n0Var.J()) {
                O(sb, i2, "max_comparison_value", n0Var.K());
            }
            K(sb, i2);
            sb.append("}\n");
        }
    }

    private static void N(StringBuilder sb, int i2, String str, g1 g1Var, String str2) {
        if (g1Var != null) {
            K(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (g1Var.Q() != 0) {
                K(sb, 4);
                sb.append("results: ");
                int i3 = 0;
                for (Long next : g1Var.N()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (g1Var.H() != 0) {
                K(sb, 4);
                sb.append("status: ");
                int i5 = 0;
                for (Long next2 : g1Var.C()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i5 = i6;
                }
                sb.append(10);
            }
            if (g1Var.W() != 0) {
                K(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i7 = 0;
                for (z0 next3 : g1Var.U()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.F() ? Integer.valueOf(next3.G()) : null);
                    sb.append(":");
                    sb.append(next3.H() ? Long.valueOf(next3.I()) : null);
                    i7 = i8;
                }
                sb.append("}\n");
            }
            if (g1Var.Y() != 0) {
                K(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i9 = 0;
                for (h1 next4 : g1Var.X()) {
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.F() ? Integer.valueOf(next4.G()) : null);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : next4.I()) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i9 = i10;
                }
                sb.append("}\n");
            }
            K(sb, 3);
            sb.append("}\n");
        }
    }

    private static void O(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            K(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private final void P(StringBuilder sb, int i2, List<c1> list) {
        if (list != null) {
            int i3 = i2 + 1;
            for (c1 next : list) {
                if (next != null) {
                    K(sb, i3);
                    sb.append("param {\n");
                    Double d2 = null;
                    if (!lb.a() || !l().s(u.y0)) {
                        O(sb, i3, "name", e().y(next.M()));
                        O(sb, i3, "string_value", next.S());
                        O(sb, i3, "int_value", next.V() ? Long.valueOf(next.W()) : null);
                        if (next.a0()) {
                            d2 = Double.valueOf(next.b0());
                        }
                        O(sb, i3, "double_value", d2);
                    } else {
                        O(sb, i3, "name", next.L() ? e().y(next.M()) : null);
                        O(sb, i3, "string_value", next.R() ? next.S() : null);
                        O(sb, i3, "int_value", next.V() ? Long.valueOf(next.W()) : null);
                        if (next.a0()) {
                            d2 = Double.valueOf(next.b0());
                        }
                        O(sb, i3, "double_value", d2);
                        if (next.d0() > 0) {
                            P(sb, i3, next.c0());
                        }
                    }
                    K(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    static boolean R(s sVar, la laVar) {
        r.k(sVar);
        r.k(laVar);
        return !TextUtils.isEmpty(laVar.f2957h) || !TextUtils.isEmpty(laVar.x);
    }

    static boolean S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean T(List<Long> list, int i2) {
        if (i2 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
    }

    static int u(e1.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < aVar.c0(); i2++) {
            if (str.equals(aVar.a0(i2).P())) {
                return i2;
            }
        }
        return -1;
    }

    static c1 y(a1 a1Var, String str) {
        for (c1 next : a1Var.C()) {
            if (next.M().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <Builder extends i8> Builder z(Builder builder, byte[] bArr) {
        m6 c = m6.c();
        if (c != null) {
            builder.Z(bArr, c);
            return builder;
        }
        builder.i0(bArr);
        return builder;
    }

    /* access modifiers changed from: package-private */
    public final String A(l0 l0Var) {
        if (l0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (l0Var.G()) {
            O(sb, 0, "filter_id", Integer.valueOf(l0Var.H()));
        }
        O(sb, 0, "event_name", e().v(l0Var.I()));
        String D = D(l0Var.N(), l0Var.O(), l0Var.Q());
        if (!D.isEmpty()) {
            O(sb, 0, "filter_type", D);
        }
        if (l0Var.L()) {
            M(sb, 1, "event_count_filter", l0Var.M());
        }
        if (l0Var.K() > 0) {
            sb.append("  filters {\n");
            for (m0 L : l0Var.J()) {
                L(sb, 2, L);
            }
        }
        K(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String B(o0 o0Var) {
        if (o0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (o0Var.D()) {
            O(sb, 0, "filter_id", Integer.valueOf(o0Var.E()));
        }
        O(sb, 0, "property_name", e().z(o0Var.F()));
        String D = D(o0Var.H(), o0Var.I(), o0Var.K());
        if (!D.isEmpty()) {
            O(sb, 0, "filter_type", D);
        }
        L(sb, 1, o0Var.G());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String C(d1 d1Var) {
        if (d1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (e1 next : d1Var.C()) {
            if (next != null) {
                K(sb, 1);
                sb.append("bundle {\n");
                if (next.U()) {
                    O(sb, 1, "protocol_version", Integer.valueOf(next.y0()));
                }
                O(sb, 1, "platform", next.L2());
                if (next.W2()) {
                    O(sb, 1, "gmp_version", Long.valueOf(next.V()));
                }
                if (next.W()) {
                    O(sb, 1, "uploading_gmp_version", Long.valueOf(next.X()));
                }
                if (next.K0()) {
                    O(sb, 1, "dynamite_version", Long.valueOf(next.L0()));
                }
                if (next.s0()) {
                    O(sb, 1, "config_version", Long.valueOf(next.t0()));
                }
                O(sb, 1, "gmp_app_id", next.j0());
                O(sb, 1, "admob_app_id", next.J0());
                O(sb, 1, "app_id", next.U2());
                O(sb, 1, "app_version", next.V2());
                if (next.p0()) {
                    O(sb, 1, "app_version_major", Integer.valueOf(next.q0()));
                }
                O(sb, 1, "firebase_instance_id", next.o0());
                if (next.d0()) {
                    O(sb, 1, "dev_cert_hash", Long.valueOf(next.e0()));
                }
                O(sb, 1, "app_store", next.T2());
                if (next.T1()) {
                    O(sb, 1, "upload_timestamp_millis", Long.valueOf(next.U1()));
                }
                if (next.h2()) {
                    O(sb, 1, "start_timestamp_millis", Long.valueOf(next.i2()));
                }
                if (next.t2()) {
                    O(sb, 1, "end_timestamp_millis", Long.valueOf(next.u2()));
                }
                if (next.B2()) {
                    O(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.C2()));
                }
                if (next.H2()) {
                    O(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.I2()));
                }
                O(sb, 1, "app_instance_id", next.c0());
                O(sb, 1, "resettable_device_id", next.Y());
                O(sb, 1, "device_id", next.r0());
                O(sb, 1, "ds_id", next.w0());
                if (next.a0()) {
                    O(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.b0()));
                }
                O(sb, 1, "os_version", next.O2());
                O(sb, 1, "device_model", next.P2());
                O(sb, 1, "user_default_language", next.Q2());
                if (next.R2()) {
                    O(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.S2()));
                }
                if (next.f0()) {
                    O(sb, 1, "bundle_sequential_index", Integer.valueOf(next.g0()));
                }
                if (next.k0()) {
                    O(sb, 1, "service_upload", Boolean.valueOf(next.m0()));
                }
                O(sb, 1, "health_monitor", next.h0());
                if (!l().s(u.G0) && next.u0() && next.v0() != 0) {
                    O(sb, 1, "android_id", Long.valueOf(next.v0()));
                }
                if (next.x0()) {
                    O(sb, 1, "retry_counter", Integer.valueOf(next.I0()));
                }
                if (next.N0()) {
                    O(sb, 1, "consent_signals", next.O0());
                }
                List<i1> w1 = next.w1();
                if (w1 != null) {
                    for (i1 next2 : w1) {
                        if (next2 != null) {
                            K(sb, 2);
                            sb.append("user_property {\n");
                            Double d2 = null;
                            O(sb, 2, "set_timestamp_millis", next2.I() ? Long.valueOf(next2.J()) : null);
                            O(sb, 2, "name", e().z(next2.P()));
                            O(sb, 2, "string_value", next2.S());
                            O(sb, 2, "int_value", next2.T() ? Long.valueOf(next2.U()) : null);
                            if (next2.V()) {
                                d2 = Double.valueOf(next2.W());
                            }
                            O(sb, 2, "double_value", d2);
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<y0> n0 = next.n0();
                String U2 = next.U2();
                if (n0 != null) {
                    for (y0 next3 : n0) {
                        if (next3 != null) {
                            K(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.H()) {
                                O(sb, 2, "audience_id", Integer.valueOf(next3.I()));
                            }
                            if (next3.O()) {
                                O(sb, 2, "new_audience", Boolean.valueOf(next3.P()));
                            }
                            N(sb, 2, "current_data", next3.L(), U2);
                            if (next3.M()) {
                                N(sb, 2, "previous_data", next3.N(), U2);
                            }
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<a1> V0 = next.V0();
                if (V0 != null) {
                    for (a1 next4 : V0) {
                        if (next4 != null) {
                            K(sb, 2);
                            sb.append("event {\n");
                            O(sb, 2, "name", e().v(next4.T()));
                            if (next4.U()) {
                                O(sb, 2, "timestamp_millis", Long.valueOf(next4.V()));
                            }
                            if (next4.W()) {
                                O(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.X()));
                            }
                            if (next4.Y()) {
                                O(sb, 2, "count", Integer.valueOf(next4.a0()));
                            }
                            if (next4.P() != 0) {
                                P(sb, 2, next4.C());
                            }
                            K(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                K(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> F(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                i().H().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    i().H().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    /* access modifiers changed from: package-private */
    public final void H(a1.a aVar, String str, Object obj) {
        List<c1> H = aVar.H();
        int i2 = 0;
        while (true) {
            if (i2 >= H.size()) {
                i2 = -1;
                break;
            } else if (str.equals(H.get(i2).M())) {
                break;
            } else {
                i2++;
            }
        }
        c1.a e0 = c1.e0();
        e0.E(str);
        if (obj instanceof Long) {
            e0.B(((Long) obj).longValue());
        } else if (obj instanceof String) {
            e0.G((String) obj);
        } else if (obj instanceof Double) {
            e0.A(((Double) obj).doubleValue());
        } else if (lb.a() && l().s(u.A0) && (obj instanceof Bundle[])) {
            e0.D(G((Bundle[]) obj));
        }
        if (i2 >= 0) {
            aVar.z(i2, e0);
        } else {
            aVar.C(e0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(c1.a aVar, Object obj) {
        r.k(obj);
        aVar.z();
        aVar.F();
        aVar.H();
        aVar.J();
        if (obj instanceof String) {
            aVar.G((String) obj);
        } else if (obj instanceof Long) {
            aVar.B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.A(((Double) obj).doubleValue());
        } else if (!lb.a() || !l().s(u.A0) || !(obj instanceof Bundle[])) {
            i().E().b("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.D(G((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(i1.a aVar, Object obj) {
        r.k(obj);
        aVar.z();
        aVar.D();
        aVar.G();
        if (obj instanceof String) {
            aVar.F((String) obj);
        } else if (obj instanceof Long) {
            aVar.E(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.A(((Double) obj).doubleValue());
        } else {
            i().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Q(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(f().b() - j2) > j3;
    }

    /* access modifiers changed from: package-private */
    public final Object U(a1 a1Var, String str) {
        c1 y = y(a1Var, str);
        if (y == null) {
            return null;
        }
        if (y.R()) {
            return y.S();
        }
        if (y.V()) {
            return Long.valueOf(y.W());
        }
        if (y.a0()) {
            return Double.valueOf(y.b0());
        }
        if (!lb.a() || !l().s(u.A0) || y.d0() <= 0) {
            return null;
        }
        List<c1> c0 = y.c0();
        ArrayList arrayList = new ArrayList();
        for (c1 next : c0) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (c1 next2 : next.c0()) {
                    if (next2.R()) {
                        bundle.putString(next2.M(), next2.S());
                    } else if (next2.V()) {
                        bundle.putLong(next2.M(), next2.W());
                    } else if (next2.a0()) {
                        bundle.putDouble(next2.M(), next2.b0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            i().E().b("Failed to ungzip content", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] W(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            i().E().b("Failed to gzip content", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> X() {
        Map<String, String> c = u.c(this.b.j());
        if (c == null || c.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = u.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            i().H().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    i().H().b("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long v(byte[] bArr) {
        r.k(bArr);
        g().c();
        MessageDigest J0 = fa.J0();
        if (J0 != null) {
            return fa.z(J0.digest(bArr));
        }
        i().E().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        i().E().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T w(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.c4 r5 = r4.i()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ba.w(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final a1 x(l lVar) {
        a1.a b0 = a1.b0();
        b0.M(lVar.f2931e);
        Iterator<String> it = lVar.f2932f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            c1.a e0 = c1.e0();
            e0.E(next);
            I(e0, lVar.f2932f.n(next));
            b0.C(e0);
        }
        return (a1) ((z6) b0.l());
    }
}

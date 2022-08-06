package org.threeten.bp;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.j;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.f;
import org.threeten.bp.zone.h;

/* compiled from: ZoneId */
public abstract class o implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String> f11627g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f11627g = Collections.unmodifiableMap(hashMap);
    }

    o() {
        if (getClass() != p.class && getClass() != q.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static o C() {
        return o(TimeZone.getDefault().getID(), f11627g);
    }

    public static o a(e eVar) {
        o oVar = (o) eVar.h(j.f());
        if (oVar != null) {
            return oVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static Set<String> i() {
        return new HashSet(h.a());
    }

    public static o n(String str) {
        d.i(str, "zoneId");
        if (str.equals("Z")) {
            return p.f11630l;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: " + str);
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return p.L(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new q(str, p.f11630l.k());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                p L = p.L(str.substring(3));
                if (L.K() == 0) {
                    return new q(str.substring(0, 3), L.k());
                }
                return new q(str.substring(0, 3) + L.j(), L.k());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return q.F(str, true);
            } else {
                p L2 = p.L(str.substring(2));
                if (L2.K() == 0) {
                    return new q("UT", L2.k());
                }
                return new q("UT" + L2.j(), L2.k());
            }
        }
    }

    public static o o(String str, Map<String, String> map) {
        d.i(str, "zoneId");
        d.i(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return n(str);
    }

    public static o q(String str, p pVar) {
        d.i(str, "prefix");
        d.i(pVar, "offset");
        if (str.length() == 0) {
            return pVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        } else if (pVar.K() == 0) {
            return new q(str, pVar.k());
        } else {
            return new q(str + pVar.j(), pVar.k());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void D(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return j().equals(((o) obj).j());
        }
        return false;
    }

    public int hashCode() {
        return j().hashCode();
    }

    public abstract String j();

    public abstract f k();

    public o l() {
        try {
            f k2 = k();
            if (k2.e()) {
                return k2.a(d.f11481i);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public String toString() {
        return j();
    }
}

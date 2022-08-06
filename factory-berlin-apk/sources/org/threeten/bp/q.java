package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.t.d;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.f;
import org.threeten.bp.zone.h;

/* compiled from: ZoneRegion */
final class q extends o implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f11635j = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: h  reason: collision with root package name */
    private final String f11636h;

    /* renamed from: i  reason: collision with root package name */
    private final transient f f11637i;

    q(String str, f fVar) {
        this.f11636h = str;
        this.f11637i = fVar;
    }

    static q F(String str, boolean z) {
        d.i(str, "zoneId");
        if (str.length() < 2 || !f11635j.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        f fVar = null;
        try {
            fVar = h.c(str, true);
        } catch (ZoneRulesException e2) {
            if (str.equals("GMT0")) {
                fVar = p.f11630l.k();
            } else if (z) {
                throw e2;
            }
        }
        return new q(str, fVar);
    }

    private static q G(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new q(str, p.f11630l.k());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                p L = p.L(str.substring(3));
                if (L.K() == 0) {
                    return new q(str.substring(0, 3), L.k());
                }
                return new q(str.substring(0, 3) + L.j(), L.k());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return F(str, false);
            } else {
                p L2 = p.L(str.substring(2));
                if (L2.K() == 0) {
                    return new q("UT", L2.k());
                }
                return new q("UT" + L2.j(), L2.k());
            }
        }
    }

    static o I(DataInput dataInput) {
        return G(dataInput.readUTF());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 7, this);
    }

    /* access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        K(dataOutput);
    }

    /* access modifiers changed from: package-private */
    public void K(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f11636h);
    }

    public String j() {
        return this.f11636h;
    }

    public f k() {
        f fVar = this.f11637i;
        return fVar != null ? fVar : h.c(this.f11636h, false);
    }
}

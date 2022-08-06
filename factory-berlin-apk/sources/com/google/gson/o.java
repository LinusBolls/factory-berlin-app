package com.google.gson;

import com.google.gson.internal.a;
import com.google.gson.internal.f;
import java.math.BigInteger;

/* compiled from: JsonPrimitive */
public final class o extends l {
    private final Object a;

    public o(Boolean bool) {
        a.b(bool);
        this.a = bool;
    }

    private static boolean u(o oVar) {
        Object obj = oVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a == null) {
            if (oVar.a == null) {
                return true;
            }
            return false;
        } else if (!u(this) || !u(oVar)) {
            if (!(this.a instanceof Number) || !(oVar.a instanceof Number)) {
                return this.a.equals(oVar.a);
            }
            double doubleValue = q().doubleValue();
            double doubleValue2 = oVar.q().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (q().longValue() == oVar.q().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (u(this)) {
            doubleToLongBits = q().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean l() {
        if (s()) {
            return ((Boolean) this.a).booleanValue();
        }
        return Boolean.parseBoolean(r());
    }

    public double m() {
        return y() ? q().doubleValue() : Double.parseDouble(r());
    }

    public int n() {
        return y() ? q().intValue() : Integer.parseInt(r());
    }

    public long o() {
        return y() ? q().longValue() : Long.parseLong(r());
    }

    public Number q() {
        Object obj = this.a;
        return obj instanceof String ? new f((String) this.a) : (Number) obj;
    }

    public String r() {
        if (y()) {
            return q().toString();
        }
        if (s()) {
            return ((Boolean) this.a).toString();
        }
        return (String) this.a;
    }

    public boolean s() {
        return this.a instanceof Boolean;
    }

    public boolean y() {
        return this.a instanceof Number;
    }

    public boolean z() {
        return this.a instanceof String;
    }

    public o(Number number) {
        a.b(number);
        this.a = number;
    }

    public o(String str) {
        a.b(str);
        this.a = str;
    }
}

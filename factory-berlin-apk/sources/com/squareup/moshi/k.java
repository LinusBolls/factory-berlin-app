package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: JsonValueWriter */
final class k extends l {
    Object[] p = new Object[32];
    private String q;

    k() {
        D(6);
    }

    private k l0(Object obj) {
        Object put;
        int y = y();
        int i2 = this.f8130g;
        if (i2 == 1) {
            if (y == 6) {
                this.f8131h[i2 - 1] = 7;
                this.p[i2 - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (y != 3 || this.q == null) {
            if (y == 1) {
                ((List) this.p[this.f8130g - 1]).add(obj);
            } else if (y == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f8136m) && (put = ((Map) this.p[this.f8130g - 1]).put(this.q, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.q + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        } else {
            this.q = null;
        }
        return this;
    }

    public l M(double d2) {
        if (!this.f8135l && (Double.isNaN(d2) || d2 == Double.NEGATIVE_INFINITY || d2 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        } else if (this.f8137n) {
            n(Double.toString(d2));
            return this;
        } else {
            l0(Double.valueOf(d2));
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public l U(long j2) {
        if (this.f8137n) {
            n(Long.toString(j2));
            return this;
        }
        l0(Long.valueOf(j2));
        int[] iArr = this.f8133j;
        int i2 = this.f8130g - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public l Z(Number number) {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            U(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            M(number.doubleValue());
            return this;
        } else if (number == null) {
            o();
            return this;
        } else {
            if (number instanceof BigDecimal) {
                bigDecimal = (BigDecimal) number;
            } else {
                bigDecimal = new BigDecimal(number.toString());
            }
            if (this.f8137n) {
                n(bigDecimal.toString());
                return this;
            }
            l0(bigDecimal);
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public l a() {
        if (!this.f8137n) {
            int i2 = this.f8130g;
            int i3 = this.o;
            if (i2 == i3 && this.f8131h[i2 - 1] == 1) {
                this.o = ~i3;
                return this;
            }
            h();
            ArrayList arrayList = new ArrayList();
            l0(arrayList);
            Object[] objArr = this.p;
            int i4 = this.f8130g;
            objArr[i4] = arrayList;
            this.f8133j[i4] = 0;
            D(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    public l b() {
        if (!this.f8137n) {
            int i2 = this.f8130g;
            int i3 = this.o;
            if (i2 == i3 && this.f8131h[i2 - 1] == 3) {
                this.o = ~i3;
                return this;
            }
            h();
            m mVar = new m();
            l0(mVar);
            this.p[this.f8130g] = mVar;
            D(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public l b0(String str) {
        if (this.f8137n) {
            n(str);
            return this;
        }
        l0(str);
        int[] iArr = this.f8133j;
        int i2 = this.f8130g - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public void close() {
        int i2 = this.f8130g;
        if (i2 > 1 || (i2 == 1 && this.f8131h[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8130g = 0;
    }

    public void flush() {
        if (this.f8130g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public l i() {
        if (y() == 1) {
            int i2 = this.f8130g;
            int i3 = this.o;
            if (i2 == (~i3)) {
                this.o = ~i3;
                return this;
            }
            int i4 = i2 - 1;
            this.f8130g = i4;
            this.p[i4] = null;
            int[] iArr = this.f8133j;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public l i0(boolean z) {
        if (!this.f8137n) {
            l0(Boolean.valueOf(z));
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    public l j() {
        if (y() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.q == null) {
            int i2 = this.f8130g;
            int i3 = this.o;
            if (i2 == (~i3)) {
                this.o = ~i3;
                return this;
            }
            this.f8137n = false;
            int i4 = i2 - 1;
            this.f8130g = i4;
            this.p[i4] = null;
            this.f8132i[i4] = null;
            int[] iArr = this.f8133j;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.q);
        }
    }

    public l n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f8130g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (y() == 3 && this.q == null) {
            this.q = str;
            this.f8132i[this.f8130g - 1] = str;
            this.f8137n = false;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public l o() {
        if (!this.f8137n) {
            l0((Object) null);
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }
}

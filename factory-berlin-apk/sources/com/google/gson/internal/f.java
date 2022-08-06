package com.google.gson.internal;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber */
public final class f extends Number {

    /* renamed from: g  reason: collision with root package name */
    private final String f4303g;

    public f(String str) {
        this.f4303g = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f4303g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f4303g;
        String str2 = ((f) obj).f4303g;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.f4303g);
    }

    public int hashCode() {
        return this.f4303g.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f4303g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f4303g).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f4303g     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f4303g     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f4303g
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f4303g);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4303g).longValue();
        }
    }

    public String toString() {
        return this.f4303g;
    }
}

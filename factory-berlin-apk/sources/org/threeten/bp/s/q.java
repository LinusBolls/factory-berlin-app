package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.t.a;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.m;

/* compiled from: JapaneseEra */
public final class q extends a implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final q f11676j = new q(-1, LocalDate.z0(1868, 9, 8), "Meiji");

    /* renamed from: k  reason: collision with root package name */
    public static final q f11677k = new q(0, LocalDate.z0(1912, 7, 30), "Taisho");

    /* renamed from: l  reason: collision with root package name */
    public static final q f11678l = new q(1, LocalDate.z0(1926, 12, 25), "Showa");

    /* renamed from: m  reason: collision with root package name */
    public static final q f11679m = new q(2, LocalDate.z0(1989, 1, 8), "Heisei");

    /* renamed from: n  reason: collision with root package name */
    public static final q f11680n;
    private static final AtomicReference<q[]> o;

    /* renamed from: g  reason: collision with root package name */
    private final int f11681g;

    /* renamed from: h  reason: collision with root package name */
    private final transient LocalDate f11682h;

    /* renamed from: i  reason: collision with root package name */
    private final transient String f11683i;

    static {
        q qVar = new q(3, LocalDate.z0(2019, 5, 1), "Reiwa");
        f11680n = qVar;
        o = new AtomicReference<>(new q[]{f11676j, f11677k, f11678l, f11679m, qVar});
    }

    private q(int i2, LocalDate localDate, String str) {
        this.f11681g = i2;
        this.f11682h = localDate;
        this.f11683i = str;
    }

    static q D(LocalDate localDate) {
        if (!localDate.O(f11676j.f11682h)) {
            q[] qVarArr = o.get();
            for (int length = qVarArr.length - 1; length >= 0; length--) {
                q qVar = qVarArr[length];
                if (localDate.compareTo(qVar.f11682h) >= 0) {
                    return qVar;
                }
            }
            return null;
        }
        throw new DateTimeException("Date too early: " + localDate);
    }

    public static q F(int i2) {
        q[] qVarArr = o.get();
        if (i2 >= f11676j.f11681g && i2 <= qVarArr[qVarArr.length - 1].f11681g) {
            return qVarArr[G(i2)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    private static int G(int i2) {
        return i2 + 1;
    }

    static q I(DataInput dataInput) {
        return F(dataInput.readByte());
    }

    public static q[] O() {
        q[] qVarArr = o.get();
        return (q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    private Object readResolve() {
        try {
            return F(this.f11681g);
        } catch (DateTimeException e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    /* access modifiers changed from: package-private */
    public LocalDate C() {
        int G = G(this.f11681g);
        q[] O = O();
        if (G >= O.length - 1) {
            return LocalDate.f11465k;
        }
        return O[G + 1].M().u0(1);
    }

    /* access modifiers changed from: package-private */
    public LocalDate M() {
        return this.f11682h;
    }

    /* access modifiers changed from: package-private */
    public void Q(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    public m f(i iVar) {
        if (iVar == org.threeten.bp.temporal.a.ERA) {
            return o.f11668j.I(org.threeten.bp.temporal.a.ERA);
        }
        return super.f(iVar);
    }

    public int getValue() {
        return this.f11681g;
    }

    public String toString() {
        return this.f11683i;
    }
}

package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.m;

/* compiled from: ThaiBuddhistEra */
public enum x implements i {
    BEFORE_BE,
    BE;

    public static x a(int i2) {
        if (i2 == 0) {
            return BEFORE_BE;
        }
        if (i2 == 1) {
            return BE;
        }
        throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
    }

    static x i(DataInput dataInput) {
        return a(dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    public d A(d dVar) {
        return dVar.v(a.ERA, (long) getValue());
    }

    public m f(i iVar) {
        if (iVar == a.ERA) {
            return iVar.n();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public int getValue() {
        return ordinal();
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.e()) {
            return b.ERAS;
        }
        if (kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d() || kVar == j.b() || kVar == j.c()) {
            return null;
        }
        return kVar.a(this);
    }

    /* access modifiers changed from: package-private */
    public void j(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    public boolean t(i iVar) {
        if (iVar instanceof a) {
            if (iVar == a.ERA) {
                return true;
            }
            return false;
        } else if (iVar == null || !iVar.f(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int w(i iVar) {
        if (iVar == a.ERA) {
            return getValue();
        }
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        if (iVar == a.ERA) {
            return (long) getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.i(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }
}

package org.threeten.bp.t;

import org.threeten.bp.s.i;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;

/* compiled from: DefaultInterfaceEra */
public abstract class a extends c implements i {
    public d A(d dVar) {
        return dVar.v(org.threeten.bp.temporal.a.ERA, (long) getValue());
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

    public boolean t(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.ERA) {
                return true;
            }
            return false;
        } else if (iVar == null || !iVar.f(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int w(org.threeten.bp.temporal.i iVar) {
        if (iVar == org.threeten.bp.temporal.a.ERA) {
            return getValue();
        }
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(org.threeten.bp.temporal.i iVar) {
        if (iVar == org.threeten.bp.temporal.a.ERA) {
            return (long) getValue();
        }
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }
}

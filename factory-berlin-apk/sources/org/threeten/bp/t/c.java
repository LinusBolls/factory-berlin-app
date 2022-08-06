package org.threeten.bp.t;

import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.m;

/* compiled from: DefaultInterfaceTemporalAccessor */
public abstract class c implements e {
    public m f(i iVar) {
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        if (t(iVar)) {
            return iVar.n();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.g() || kVar == j.a() || kVar == j.e()) {
            return null;
        }
        return kVar.a(this);
    }

    public int w(i iVar) {
        return f(iVar).a(y(iVar), iVar);
    }
}

package org.threeten.bp.t;

import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.l;

/* compiled from: DefaultInterfaceTemporal */
public abstract class b extends c implements d {
    public d C(h hVar) {
        return hVar.a(this);
    }

    public d p(f fVar) {
        return fVar.A(this);
    }

    public d x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }
}

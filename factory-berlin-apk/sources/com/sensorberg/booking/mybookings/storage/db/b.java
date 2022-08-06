package com.sensorberg.booking.mybookings.storage.db;

import com.sensorberg.booking.mybookings.f;
import com.sensorberg.booking.mybookings.l.a;
import e.p.h;
import g.e.n.g.c;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;

/* compiled from: BookingBoundaryCallbackFactory.kt */
public final class b {
    private final a a;
    private final c b;
    private final h.f c;

    /* renamed from: d  reason: collision with root package name */
    private final f f4916d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f4917e;

    public b(a aVar, c cVar, h.f fVar, f fVar2, d0 d0Var) {
        k.e(aVar, "bookingRepository");
        k.e(cVar, "bookingManager");
        k.e(fVar, "pageConfig");
        k.e(fVar2, "displayTime");
        k.e(d0Var, "ioDispatcher");
        this.a = aVar;
        this.b = cVar;
        this.c = fVar;
        this.f4916d = fVar2;
        this.f4917e = d0Var;
    }

    public final a a(String str, i0 i0Var, l<? super List<? extends Throwable>, x> lVar) {
        k.e(str, "from");
        k.e(i0Var, "coroutineScope");
        k.e(lVar, "errorCallback");
        return new a(this.a, this.b, str, this.c.a, i0Var, this.f4916d, lVar, this.f4917e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a aVar, c cVar, h.f fVar, f fVar2, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, cVar, fVar, fVar2, (i2 & 16) != 0 ? a1.b() : d0Var);
    }
}

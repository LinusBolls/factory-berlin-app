package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.x;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.v;

/* compiled from: Builders.common.kt */
final class b3<T> extends v<T> {
    public b3(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        Object a = x.a(obj, this.f11029j);
        g c = this.f11029j.c();
        Object c2 = b0.c(c, (Object) null);
        try {
            this.f11029j.m(a);
            x xVar = x.a;
        } finally {
            b0.a(c, c2);
        }
    }
}

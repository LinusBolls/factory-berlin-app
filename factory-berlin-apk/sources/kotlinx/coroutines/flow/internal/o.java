package kotlinx.coroutines.flow.internal;

import kotlin.e0.c.q;
import kotlin.h0.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import kotlin.x;
import kotlinx.coroutines.e3.d;

/* compiled from: SafeCollector.kt */
public final class o {
    /* access modifiers changed from: private */
    public static final q<d<Object>, Object, kotlin.c0.d<? super x>, Object> a;

    /* compiled from: SafeCollector.kt */
    static final /* synthetic */ class a extends h implements q<d<? super Object>, Object, kotlin.c0.d<? super x>, Object> {
        a() {
            super(3);
        }

        public final String f() {
            return "emit";
        }

        public final c g() {
            return v.b(d.class);
        }

        public final String j() {
            return "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
        }

        /* renamed from: p */
        public final Object k(d<Object> dVar, Object obj, kotlin.c0.d<? super x> dVar2) {
            j.a(0);
            Object a = dVar.a(obj, dVar2);
            j.a(2);
            j.a(1);
            return a;
        }
    }

    static {
        a aVar = new a();
        y.d(aVar, 3);
        a = aVar;
    }
}

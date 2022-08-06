package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.c0.b;
import kotlin.c0.g;
import kotlin.jvm.internal.l;

/* compiled from: Executors.kt */
public abstract class m1 extends d0 implements Closeable {

    /* compiled from: Executors.kt */
    public static final class a extends b<d0, m1> {

        /* renamed from: kotlinx.coroutines.m1$a$a  reason: collision with other inner class name */
        /* compiled from: Executors.kt */
        static final class C0779a extends l implements kotlin.e0.c.l<g.b, m1> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0779a f11040h = new C0779a();

            C0779a() {
                super(1);
            }

            /* renamed from: a */
            public final m1 o(g.b bVar) {
                if (!(bVar instanceof m1)) {
                    bVar = null;
                }
                return (m1) bVar;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(d0.f10760g, C0779a.f11040h);
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public abstract Executor r0();
}

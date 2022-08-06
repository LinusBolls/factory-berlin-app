package g.e.d;

import e.p.d;
import kotlin.jvm.internal.k;

/* compiled from: AbstractDataSourceFactory.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: g.e.d.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractDataSourceFactory.kt */
    public static final class C0659a extends d.a<String, VALUE> {
        final /* synthetic */ d a;

        C0659a(d dVar) {
            this.a = dVar;
        }

        public d<String, VALUE> a() {
            return this.a;
        }
    }

    private a() {
    }

    public final <VALUE> d.a<String, VALUE> a(d<String, VALUE> dVar) {
        k.e(dVar, "dataSource");
        return new C0659a(dVar);
    }
}

package g.e.m;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: Result.kt */
public abstract class c<T> {

    /* compiled from: Result.kt */
    public static final class a extends c {
        private final List<Throwable> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<? extends Throwable> list) {
            super((DefaultConstructorMarker) null);
            k.e(list, "throwableList");
            this.a = list;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public final List<String> f() {
            List<Throwable> list = this.a;
            ArrayList arrayList = new ArrayList();
            for (Throwable message : list) {
                String message2 = message.getMessage();
                if (message2 != null) {
                    arrayList.add(message2);
                }
            }
            return arrayList;
        }

        public final List<Throwable> g() {
            return this.a;
        }

        public int hashCode() {
            List<Throwable> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(throwableList=" + this.a + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            this((List<? extends Throwable>) m.b(th));
            k.e(th, "throwable");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(String str) {
            this((Throwable) new Exception(str));
            k.e(str, "message");
        }
    }

    /* compiled from: Result.kt */
    public static final class b<T> extends c<T> {
        private final T a;

        public b(T t) {
            super((DefaultConstructorMarker) null);
            this.a = t;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public final T f() {
            return this.a;
        }

        public int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(data=" + this.a + ")";
        }
    }

    /* renamed from: g.e.m.c$c  reason: collision with other inner class name */
    /* compiled from: Result.kt */
    static final class C0682c extends l implements kotlin.e0.c.l<T, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0682c f9914h = new C0682c();

        C0682c() {
            super(1);
        }

        public final void a(T t) {
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    private c() {
    }

    public final T a() {
        b bVar = (b) (!(this instanceof b) ? null : this);
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public final <S> c<S> b(kotlin.e0.c.l<? super T, ? extends S> lVar) {
        k.e(lVar, "dataMapper");
        if (this instanceof b) {
            return new b(lVar.o(((b) this).f()));
        }
        if (this instanceof a) {
            return new a((List<? extends Throwable>) ((a) this).g());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final c<x> c() {
        return b(C0682c.f9914h);
    }

    public final c<T> d(kotlin.e0.c.l<? super List<? extends Throwable>, x> lVar) {
        List<Throwable> g2;
        k.e(lVar, "callback");
        a aVar = (a) (!(this instanceof a) ? null : this);
        if (!(aVar == null || (g2 = aVar.g()) == null)) {
            lVar.o(g2);
        }
        return this;
    }

    public final c<T> e(kotlin.e0.c.l<? super T, x> lVar) {
        Object a2;
        k.e(lVar, "callback");
        b bVar = (b) (!(this instanceof b) ? null : this);
        if (!(bVar == null || (a2 = bVar.a()) == null)) {
            lVar.o(a2);
        }
        return this;
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

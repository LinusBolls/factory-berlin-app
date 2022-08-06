package g.e.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: TransformationsHelper.kt */
public final class p {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: TransformationsHelper.kt */
    public static final class a {

        /* renamed from: g.e.d.p$a$a  reason: collision with other inner class name */
        /* compiled from: TransformationsHelper.kt */
        static final class C0660a<T> implements f0<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c0 f9759g;

            C0660a(c0 c0Var) {
                this.f9759g = c0Var;
            }

            public final void k(T t) {
                if (!k.a(t, this.f9759g.l())) {
                    this.f9759g.u(t);
                }
            }
        }

        /* compiled from: TransformationsHelper.kt */
        static final class b<T> implements f0<X> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c0 f9760g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f9761h;

            b(c0 c0Var, l lVar) {
                this.f9760g = c0Var;
                this.f9761h = lVar;
            }

            public final void k(X x) {
                this.f9760g.u(this.f9761h.o(x));
            }
        }

        /* compiled from: TransformationsHelper.kt */
        static final class c<T> implements f0 {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c0 f9762g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f9763h;

            c(c0 c0Var, l lVar) {
                this.f9762g = c0Var;
                this.f9763h = lVar;
            }

            public final void k(Object obj) {
                this.f9763h.o(this.f9762g);
            }
        }

        private a() {
        }

        public final <T> LiveData<T> a(LiveData<T> liveData) {
            k.e(liveData, "source");
            c0 c0Var = new c0();
            c0Var.v(liveData, new C0660a(c0Var));
            return c0Var;
        }

        public final <X, Y> LiveData<Y> b(LiveData<X> liveData, Y y, l<? super X, ? extends Y> lVar) {
            k.e(liveData, "source");
            k.e(lVar, "func");
            c0 c0Var = new c0();
            c0Var.v(liveData, new b(c0Var, lVar));
            c0Var.u(y);
            return c0Var;
        }

        public final <T> LiveData<T> c(LiveData<? extends Object>[] liveDataArr, l<? super e0<T>, x> lVar) {
            k.e(liveDataArr, "sources");
            k.e(lVar, "processData");
            c0 c0Var = new c0();
            for (LiveData<? extends Object> v : liveDataArr) {
                c0Var.v(v, new c(c0Var, lVar));
            }
            return c0Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

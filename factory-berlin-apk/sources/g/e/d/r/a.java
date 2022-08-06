package g.e.d.r;

import android.view.View;

/* compiled from: MessagePresenter.kt */
public interface a {

    /* renamed from: g.e.d.r.a$a  reason: collision with other inner class name */
    /* compiled from: MessagePresenter.kt */
    public static final class C0663a {
        public static /* synthetic */ void a(a aVar, String str, View view, b bVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    bVar = b.C0665b.a;
                }
                aVar.a(str, view, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
    }

    /* compiled from: MessagePresenter.kt */
    public static abstract class b {

        /* renamed from: g.e.d.r.a$b$a  reason: collision with other inner class name */
        /* compiled from: MessagePresenter.kt */
        public static final class C0664a extends b {
            public static final C0664a a = new C0664a();

            private C0664a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: g.e.d.r.a$b$b  reason: collision with other inner class name */
        /* compiled from: MessagePresenter.kt */
        public static final class C0665b extends b {
            public static final C0665b a = new C0665b();

            private C0665b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(String str, View view, b bVar);

    void b(int i2, View view, b bVar);
}

package k;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: CookieJar.kt */
public interface n {
    public static final n a = new a.C0750a();

    /* compiled from: CookieJar.kt */
    public static final class a {

        /* renamed from: k.n$a$a  reason: collision with other inner class name */
        /* compiled from: CookieJar.kt */
        private static final class C0750a implements n {
            public List<m> a(v vVar) {
                k.f(vVar, "url");
                return n.g();
            }

            public void b(v vVar, List<m> list) {
                k.f(vVar, "url");
                k.f(list, "cookies");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    List<m> a(v vVar);

    void b(v vVar, List<m> list);
}

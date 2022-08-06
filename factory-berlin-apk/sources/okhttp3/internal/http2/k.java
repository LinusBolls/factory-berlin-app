package okhttp3.internal.http2;

import java.util.List;
import l.h;

/* compiled from: PushObserver.kt */
public interface k {
    public static final k a = new a.C0797a();

    /* compiled from: PushObserver.kt */
    public static final class a {

        /* renamed from: okhttp3.internal.http2.k$a$a  reason: collision with other inner class name */
        /* compiled from: PushObserver.kt */
        private static final class C0797a implements k {
            public boolean a(int i2, List<b> list) {
                kotlin.jvm.internal.k.f(list, "requestHeaders");
                return true;
            }

            public boolean b(int i2, List<b> list, boolean z) {
                kotlin.jvm.internal.k.f(list, "responseHeaders");
                return true;
            }

            public void c(int i2, a aVar) {
                kotlin.jvm.internal.k.f(aVar, "errorCode");
            }

            public boolean d(int i2, h hVar, int i3, boolean z) {
                kotlin.jvm.internal.k.f(hVar, "source");
                hVar.x((long) i3);
                return true;
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

    boolean a(int i2, List<b> list);

    boolean b(int i2, List<b> list, boolean z);

    void c(int i2, a aVar);

    boolean d(int i2, h hVar, int i3, boolean z);
}

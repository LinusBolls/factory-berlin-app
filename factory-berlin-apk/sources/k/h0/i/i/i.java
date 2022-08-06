package k.h0.i.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import k.a0;
import k.h0.i.d;
import k.h0.i.h;
import k.h0.i.i.j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
public final class i implements k {
    /* access modifiers changed from: private */
    public static final j.a a = new a();
    public static final b b = new b((DefaultConstructorMarker) null);

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements j.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return d.f10461f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return new i();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class b {
        private b() {
        }

        public final j.a a() {
            return i.a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public boolean c() {
        return d.f10461f.c();
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.c.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}

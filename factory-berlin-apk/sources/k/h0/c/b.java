package k.h0.c;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import k.a;
import k.b0;
import k.d0;
import k.f0;
import k.h;
import k.o;
import k.q;
import k.v;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: JavaNetAuthenticator.kt */
public final class b implements k.b {
    private final q b;

    public b() {
        this((q) null, 1, (DefaultConstructorMarker) null);
    }

    public b(q qVar) {
        k.f(qVar, "defaultDns");
        this.b = qVar;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.a[type.ordinal()] == 1) {
            return (InetAddress) v.z(qVar.a(vVar.i()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            k.b(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    public b0 a(f0 f0Var, d0 d0Var) {
        Proxy proxy;
        q qVar;
        PasswordAuthentication passwordAuthentication;
        a a;
        k.f(d0Var, "response");
        List<h> i2 = d0Var.i();
        b0 Z = d0Var.Z();
        v k2 = Z.k();
        boolean z = d0Var.j() == 407;
        if (f0Var == null || (proxy = f0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h next : i2) {
            if (p.q("Basic", next.c(), true)) {
                if (f0Var == null || (a = f0Var.a()) == null || (qVar = a.c()) == null) {
                    qVar = this.b;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        k.b(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, k2, qVar), inetSocketAddress.getPort(), k2.s(), next.b(), next.c(), k2.u(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String i3 = k2.i();
                    k.b(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i3, b(proxy, k2, qVar), k2.o(), k2.s(), next.b(), next.c(), k2.u(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    k.b(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    k.b(password, "auth.password");
                    String a2 = o.a(userName, new String(password), next.a());
                    b0.a i4 = Z.i();
                    i4.e(str, a2);
                    return i4.b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? q.a : qVar);
    }
}

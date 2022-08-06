package k;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: Dns.kt */
public interface q {
    public static final q a = new a.C0751a();

    /* compiled from: Dns.kt */
    public static final class a {

        /* renamed from: k.q$a$a  reason: collision with other inner class name */
        /* compiled from: Dns.kt */
        private static final class C0751a implements q {
            public List<InetAddress> a(String str) {
                k.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    k.b(allByName, "InetAddress.getAllByName(hostname)");
                    return j.F(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
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

    List<InetAddress> a(String str);
}

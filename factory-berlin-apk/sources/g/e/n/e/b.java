package g.e.n.e;

import android.util.Base64;
import g.e.n.b.g.c;
import java.nio.charset.Charset;
import kotlin.j0.d;
import kotlin.jvm.internal.k;

/* compiled from: OpenPayloadDataSource.kt */
public final class b implements c {
    private final c a;
    private final g.e.n.b.e.b b;

    /* compiled from: OpenPayloadDataSource.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(c cVar, g.e.n.b.e.b bVar) {
        k.e(cVar, "userIdDataSource");
        k.e(bVar, "deviceIdDataSource");
        this.a = cVar;
        this.b = bVar;
    }

    private final byte[] b(String str) {
        Charset charset = d.a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return i.h(bytes, bytes.length - 16, bytes.length);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final byte[] c(g.e.n.b.g.b bVar) {
        String a2 = bVar.a();
        Charset charset = d.a;
        if (a2 != null) {
            byte[] bytes = a2.getBytes(charset);
            k.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return i.h(bytes, 0, 16);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public String a() {
        g.e.n.b.e.a deviceId = this.b.getDeviceId();
        if (deviceId != null) {
            g.e.n.b.g.b b2 = this.a.b();
            if (b2 != null) {
                byte[] c = c(b2);
                String valueOf = String.valueOf(g.e.h.b.c.b.c());
                Charset charset = d.a;
                if (valueOf != null) {
                    byte[] bytes = valueOf.getBytes(charset);
                    k.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(a.a.b(c, bytes, b(deviceId.a())), 0);
                    k.d(encodeToString, "Base64.encodeToString(encrypted, Base64.DEFAULT)");
                    return '1' + deviceId.a() + encodeToString;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalStateException("userId is null");
        }
        throw new IllegalStateException("deviceId is null");
    }
}

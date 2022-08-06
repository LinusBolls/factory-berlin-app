package k.h0.i.i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k.a0;
import k.h0.i.b;
import k.h0.i.h;
import k.h0.i.i.j;
import kotlin.jvm.internal.k;

/* compiled from: AndroidSocketAdapter.kt */
public class f implements k {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final j.a f10475f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10476g;
    private final Method a;
    private final Method b = this.f10478e.getMethod("setHostname", new Class[]{String.class});
    private final Method c = this.f10478e.getMethod("getAlpnSelectedProtocol", new Class[0]);

    /* renamed from: d  reason: collision with root package name */
    private final Method f10477d = this.f10478e.getMethod("setAlpnProtocols", new Class[]{byte[].class});

    /* renamed from: e  reason: collision with root package name */
    private final Class<? super SSLSocket> f10478e;

    /* compiled from: AndroidSocketAdapter.kt */
    public static final class a {

        /* renamed from: k.h0.i.i.f$a$a  reason: collision with other inner class name */
        /* compiled from: AndroidSocketAdapter.kt */
        public static final class C0746a implements j.a {
            final /* synthetic */ String a;

            C0746a(String str) {
                this.a = str;
            }

            public boolean a(SSLSocket sSLSocket) {
                k.f(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                k.b(name, "sslSocket.javaClass.name");
                return p.D(name, this.a + '.', false, 2, (Object) null);
            }

            public k b(SSLSocket sSLSocket) {
                k.f(sSLSocket, "sslSocket");
                return f.f10476g.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!k.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            if (cls2 != null) {
                return new f(cls2);
            }
            k.m();
            throw null;
        }

        public final j.a c(String str) {
            k.f(str, "packageName");
            return new C0746a(str);
        }

        public final j.a d() {
            return f.f10475f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f10476g = aVar;
        f10475f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) {
        k.f(cls, "sslSocketClass");
        this.f10478e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        k.b(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.a = declaredMethod;
    }

    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return this.f10478e.isInstance(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            k.b(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e2) {
            if (k.a(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean c() {
        return b.f10454g.b();
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.b.invoke(sSLSocket, new Object[]{str});
                }
                this.f10477d.invoke(sSLSocket, new Object[]{h.c.c(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}

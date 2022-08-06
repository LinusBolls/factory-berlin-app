package k.h0.i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k.a0;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class e extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final b f10463i = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f10464d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f10465e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f10466f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f10467g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f10468h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    private static final class a implements InvocationHandler {
        private boolean a;
        private String b;
        private final List<String> c;

        public a(List<String> list) {
            k.f(list, "protocols");
            this.c = list;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            k.f(obj, "proxy");
            k.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.a(name, "supports") && k.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!k.a(name, "unsupported") || !k.a(Void.TYPE, returnType)) {
                if (k.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.c;
                    }
                }
                if ((k.a(name, "selectProtocol") || k.a(name, "select")) && k.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                Object obj3 = list.get(i2);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.c.contains(str)) {
                                        if (i2 == size) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        this.b = str;
                                        return str;
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.c.get(0);
                        this.b = str2;
                        return str2;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!k.a(name, "protocolSelected") && !k.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.b = (String) obj4;
                        return null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.a = true;
                return null;
            }
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class b {
        private b() {
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                k.b(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                k.b(method, "putMethod");
                k.b(method2, "getMethod");
                k.b(method3, "removeMethod");
                k.b(cls3, "clientProviderClass");
                k.b(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        k.f(method, "putMethod");
        k.f(method2, "getMethod");
        k.f(method3, "removeMethod");
        k.f(cls, "clientProviderClass");
        k.f(cls2, "serverProviderClass");
        this.f10464d = method;
        this.f10465e = method2;
        this.f10466f = method3;
        this.f10467g = cls;
        this.f10468h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            this.f10466f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        List<String> b2 = h.c.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f10467g, this.f10468h}, new a(b2));
            this.f10464d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f10465e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}

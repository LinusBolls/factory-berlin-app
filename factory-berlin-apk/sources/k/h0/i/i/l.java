package k.h0.i.i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.h0.i.h;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: StandardAndroidSocketAdapter.kt */
public final class l extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10480h = new a((DefaultConstructorMarker) null);

    /* compiled from: StandardAndroidSocketAdapter.kt */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ k b(a aVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String str) {
            k.f(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                if (cls != null) {
                    Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                    if (cls2 != null) {
                        Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                        k.b(cls3, "paramsClass");
                        return new l(cls, cls2, cls3);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            } catch (Exception e2) {
                h.c.g().k("unable to load android socket classes", 5, e2);
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        k.f(cls, "sslSocketClass");
        k.f(cls2, "sslSocketFactoryClass");
        k.f(cls3, "paramClass");
    }
}

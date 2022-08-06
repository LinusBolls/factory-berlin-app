package k.h0.i;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import k.a0;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: Jdk9Platform.kt */
public class f extends h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f10469d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f10470e = new a((DefaultConstructorMarker) null);

    /* compiled from: Jdk9Platform.kt */
    public static final class a {
        private a() {
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f10469d;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            k.h0.i.f$a r0 = new k.h0.i.f$a
            r1 = 0
            r0.<init>(r1)
            f10470e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = kotlin.j0.o.i(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = 0
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            f10469d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.f.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b = h.c.b(list);
        k.b(sSLParameters, "sslParameters");
        Object[] array = b.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (k.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}

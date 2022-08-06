package k;

import de.baimos.blueid.sdk.api.Channel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: ConnectionSpec.kt */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    private static final i[] f10497e = {i.q, i.r, i.s, i.f10488k, i.f10490m, i.f10489l, i.f10491n, i.p, i.o};

    /* renamed from: f  reason: collision with root package name */
    private static final i[] f10498f = {i.q, i.r, i.s, i.f10488k, i.f10490m, i.f10489l, i.f10491n, i.p, i.o, i.f10486i, i.f10487j, i.f10484g, i.f10485h, i.f10482e, i.f10483f, i.f10481d};

    /* renamed from: g  reason: collision with root package name */
    public static final l f10499g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f10500h = new a(false).a();
    private final boolean a;
    private final boolean b;
    /* access modifiers changed from: private */
    public final String[] c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f10501d;

    /* compiled from: ConnectionSpec.kt */
    public static final class a {
        private boolean a;
        private String[] b;
        private String[] c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10502d;

        public a(boolean z) {
            this.a = z;
        }

        public final l a() {
            return new l(this.a, this.f10502d, this.b, this.c);
        }

        public final a b(String... strArr) {
            k.f(strArr, "cipherSuites");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.b = (String[]) clone;
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(i... iVarArr) {
            k.f(iVarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i d2 : iVarArr) {
                    arrayList.add(d2.d());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z) {
            if (this.a) {
                this.f10502d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            k.f(strArr, "tlsVersions");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.c = (String[]) clone;
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(g0... g0VarArr) {
            k.f(g0VarArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 f2 : g0VarArr) {
                    arrayList.add(f2.f());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(l lVar) {
            k.f(lVar, "connectionSpec");
            this.a = lVar.f();
            this.b = lVar.c;
            this.c = lVar.f10501d;
            this.f10502d = lVar.h();
        }
    }

    /* compiled from: ConnectionSpec.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
        a aVar = new a(true);
        i[] iVarArr = f10497e;
        aVar.c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        aVar.f(g0.TLS_1_3, g0.TLS_1_2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        i[] iVarArr2 = f10498f;
        aVar2.c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length));
        aVar2.f(g0.TLS_1_3, g0.TLS_1_2);
        aVar2.d(true);
        f10499g = aVar2.a();
        a aVar3 = new a(true);
        i[] iVarArr3 = f10498f;
        aVar3.c((i[]) Arrays.copyOf(iVarArr3, iVarArr3.length));
        aVar3.f(g0.TLS_1_3, g0.TLS_1_2, g0.TLS_1_1, g0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    public l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.f10501d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            k.b(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = k.h0.b.B(enabledCipherSuites, this.c, i.t.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f10501d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            k.b(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = k.h0.b.B(enabledProtocols, this.f10501d, b.e());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        k.b(supportedCipherSuites, "supportedCipherSuites");
        int u = k.h0.b.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.t.c());
        if (z && u != -1) {
            k.b(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u];
            k.b(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = k.h0.b.l(strArr, str);
        }
        a aVar = new a(this);
        k.b(strArr, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        k.b(strArr2, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
        return aVar.a();
    }

    public final void c(SSLSocket sSLSocket, boolean z) {
        k.f(sSLSocket, "sslSocket");
        l g2 = g(sSLSocket, z);
        if (g2.i() != null) {
            sSLSocket.setEnabledProtocols(g2.f10501d);
        }
        if (g2.d() != null) {
            sSLSocket.setEnabledCipherSuites(g2.c);
        }
    }

    public final List<i> d() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b2 : strArr) {
            arrayList.add(i.t.b(b2));
        }
        return v.R(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        k.f(sSLSocket, Channel.SOCKET_CHANNEL_ID);
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f10501d;
        if (strArr != null && !k.h0.b.r(strArr, sSLSocket.getEnabledProtocols(), b.e())) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 == null || k.h0.b.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.t.c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        l lVar = (l) obj;
        if (z != lVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, lVar.c) && Arrays.equals(this.f10501d, lVar.f10501d) && this.b == lVar.b);
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int i2 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f10501d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i2) * 31) + (this.b ^ true ? 1 : 0);
    }

    public final List<g0> i() {
        String[] strArr = this.f10501d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(g0.f10360n.a(a2));
        }
        return v.R(arrayList);
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(" + "cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", " + "tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", " + "supportsTlsExtensions=" + this.b + ')';
    }
}

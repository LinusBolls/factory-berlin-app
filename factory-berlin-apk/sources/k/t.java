package k;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: Handshake.kt */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10519e = new a((DefaultConstructorMarker) null);
    private final e a;
    private final g0 b;
    private final i c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f10520d;

    /* compiled from: Handshake.kt */
    public static final class a {

        /* renamed from: k.t$a$a  reason: collision with other inner class name */
        /* compiled from: Handshake.kt */
        static final class C0752a extends l implements kotlin.e0.c.a<List<? extends Certificate>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f10521h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0752a(List list) {
                super(0);
                this.f10521h = list;
            }

            /* renamed from: a */
            public final List<Certificate> d() {
                return this.f10521h;
            }
        }

        /* compiled from: Handshake.kt */
        static final class b extends l implements kotlin.e0.c.a<List<? extends Certificate>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f10522h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f10522h = list;
            }

            /* renamed from: a */
            public final List<Certificate> d() {
                return this.f10522h;
            }
        }

        private a() {
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return k.h0.b.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return n.g();
        }

        public final t a(SSLSession sSLSession) {
            List<Certificate> list;
            k.f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                i b2 = i.t.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!k.a("NONE", protocol)) {
                    g0 a = g0.f10360n.a(protocol);
                    try {
                        list = c(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = n.g();
                    }
                    return new t(a, b2, c(sSLSession.getLocalCertificates()), new b(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public final t b(g0 g0Var, i iVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
            k.f(g0Var, "tlsVersion");
            k.f(iVar, "cipherSuite");
            k.f(list, "peerCertificates");
            k.f(list2, "localCertificates");
            return new t(g0Var, iVar, k.h0.b.O(list2), new C0752a(k.h0.b.O(list)));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Handshake.kt */
    static final class b extends l implements kotlin.e0.c.a<List<? extends Certificate>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f10523h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(kotlin.e0.c.a aVar) {
            super(0);
            this.f10523h = aVar;
        }

        /* renamed from: a */
        public final List<Certificate> d() {
            try {
                return (List) this.f10523h.d();
            } catch (SSLPeerUnverifiedException unused) {
                return n.g();
            }
        }
    }

    public t(g0 g0Var, i iVar, List<? extends Certificate> list, kotlin.e0.c.a<? extends List<? extends Certificate>> aVar) {
        k.f(g0Var, "tlsVersion");
        k.f(iVar, "cipherSuite");
        k.f(list, "localCertificates");
        k.f(aVar, "peerCertificatesFn");
        this.b = g0Var;
        this.c = iVar;
        this.f10520d = list;
        this.a = g.a(new b(aVar));
    }

    public static final t b(g0 g0Var, i iVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return f10519e.b(g0Var, iVar, list, list2);
    }

    private final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        k.b(type, "type");
        return type;
    }

    public final i a() {
        return this.c;
    }

    public final List<Certificate> d() {
        return this.f10520d;
    }

    public final List<Certificate> e() {
        return (List) this.a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return tVar.b == this.b && k.a(tVar.c, this.c) && k.a(tVar.e(), e()) && k.a(tVar.f10520d, this.f10520d);
        }
    }

    public final g0 f() {
        return this.b;
    }

    public int hashCode() {
        return ((((((527 + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + e().hashCode()) * 31) + this.f10520d.hashCode();
    }

    public String toString() {
        List<Certificate> e2 = e();
        ArrayList arrayList = new ArrayList(o.p(e2, 10));
        for (Certificate c2 : e2) {
            arrayList.add(c(c2));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.f10520d;
        ArrayList arrayList2 = new ArrayList(o.p(list, 10));
        for (Certificate c3 : list) {
            arrayList2.add(c(c3));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}

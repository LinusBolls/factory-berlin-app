package k;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l.i;

/* compiled from: CertificatePinner.kt */
public final class g {
    public static final g c = new a().b();

    /* renamed from: d  reason: collision with root package name */
    public static final b f10350d = new b((DefaultConstructorMarker) null);
    private final Set<c> a;
    private final k.h0.k.c b;

    /* compiled from: CertificatePinner.kt */
    public static final class a {
        private final List<c> a = new ArrayList();

        public final a a(String str, String... strArr) {
            k.f(str, "pattern");
            k.f(strArr, "pins");
            for (String cVar : strArr) {
                this.a.add(new c(str, cVar));
            }
            return this;
        }

        public final g b() {
            return new g(v.V(this.a), (k.h0.k.c) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class b {
        private b() {
        }

        public final String a(Certificate certificate) {
            k.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final i b(X509Certificate x509Certificate) {
            k.f(x509Certificate, "$this$sha1Hash");
            i.a aVar = i.f11104k;
            PublicKey publicKey = x509Certificate.getPublicKey();
            k.b(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            k.b(encoded, "publicKey.encoded");
            return i.a.g(aVar, encoded, 0, 0, 3, (Object) null).D();
        }

        public final i c(X509Certificate x509Certificate) {
            k.f(x509Certificate, "$this$sha256Hash");
            i.a aVar = i.f11104k;
            PublicKey publicKey = x509Certificate.getPublicKey();
            k.b(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            k.b(encoded, "publicKey.encoded");
            return i.a.g(aVar, encoded, 0, 0, 3, (Object) null).F();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class c {
        private final String a;
        private final String b;
        private final i c;

        public c(String str, String str2) {
            k.f(str, "pattern");
            k.f(str2, "pin");
            if ((p.D(str, "*.", false, 2, (Object) null) && q.T(str, "*", 1, false, 4, (Object) null) == -1) || (p.D(str, "**.", false, 2, (Object) null) && q.T(str, "*", 2, false, 4, (Object) null) == -1) || q.T(str, "*", 0, false, 6, (Object) null) == -1) {
                String e2 = k.h0.a.e(str);
                if (e2 != null) {
                    this.a = e2;
                    if (p.D(str2, "sha1/", false, 2, (Object) null)) {
                        this.b = "sha1";
                        i.a aVar = i.f11104k;
                        String substring = str2.substring(5);
                        k.b(substring, "(this as java.lang.String).substring(startIndex)");
                        i a2 = aVar.a(substring);
                        if (a2 != null) {
                            this.c = a2;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: " + str2);
                    } else if (p.D(str2, "sha256/", false, 2, (Object) null)) {
                        this.b = "sha256";
                        i.a aVar2 = i.f11104k;
                        String substring2 = str2.substring(7);
                        k.b(substring2, "(this as java.lang.String).substring(startIndex)");
                        i a3 = aVar2.a(substring2);
                        if (a3 != null) {
                            this.c = a3;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: " + str2);
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid pattern: " + str);
                }
            } else {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
        }

        public final i a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x003f A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.k.f(r12, r0)
                java.lang.String r0 = r11.a
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.j0.p.D(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L_0x0041
                java.lang.String r0 = r11.a
                int r0 = r0.length()
                int r7 = r0 + -3
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.a
                r6 = 3
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = kotlin.j0.p.u(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x003f
                int r0 = r0 - r1
                char r12 = r12.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L_0x0082
            L_0x003f:
                r2 = 1
                goto L_0x0082
            L_0x0041:
                java.lang.String r0 = r11.a
                java.lang.String r5 = "*."
                boolean r0 = kotlin.j0.p.D(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L_0x007c
                java.lang.String r0 = r11.a
                int r0 = r0.length()
                int r7 = r0 + -1
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.a
                r6 = 1
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = kotlin.j0.p.u(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                r5 = 46
                int r6 = r0 + -1
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r12
                int r12 = kotlin.j0.q.X(r4, r5, r6, r7, r8, r9)
                r0 = -1
                if (r12 != r0) goto L_0x0082
                goto L_0x003f
            L_0x007c:
                java.lang.String r0 = r11.a
                boolean r2 = kotlin.jvm.internal.k.a(r12, r0)
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: k.g.c.c(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return !(k.a(this.a, cVar.a) ^ true) && !(k.a(this.b, cVar.b) ^ true) && !(k.a(this.c, cVar.c) ^ true);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return this.b + '/' + this.c.a();
        }
    }

    /* compiled from: CertificatePinner.kt */
    static final class d extends l implements kotlin.e0.c.a<List<? extends X509Certificate>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f10351h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f10352i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f10353j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, List list, String str) {
            super(0);
            this.f10351h = gVar;
            this.f10352i = list;
            this.f10353j = str;
        }

        /* renamed from: a */
        public final List<X509Certificate> d() {
            List<Certificate> list;
            k.h0.k.c d2 = this.f10351h.d();
            if (d2 == null || (list = d2.a(this.f10352i, this.f10353j)) == null) {
                list = this.f10352i;
            }
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            for (Certificate certificate : list) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
    }

    public g(Set<c> set, k.h0.k.c cVar) {
        k.f(set, "pins");
        this.a = set;
        this.b = cVar;
    }

    public final void a(String str, List<? extends Certificate> list) {
        k.f(str, "hostname");
        k.f(list, "peerCertificates");
        b(str, new d(this, list, str));
    }

    public final void b(String str, kotlin.e0.c.a<? extends List<? extends X509Certificate>> aVar) {
        c next;
        k.f(str, "hostname");
        k.f(aVar, "cleanedPeerCertificatesFn");
        List<c> c2 = c(str);
        if (!c2.isEmpty()) {
            List<X509Certificate> list = (List) aVar.d();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<c> it = c2.iterator();
                i iVar = null;
                i iVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String b2 = next.b();
                        int hashCode = b2.hashCode();
                        if (hashCode == -903629273) {
                            if (!b2.equals("sha256")) {
                                break loop0;
                            }
                            if (iVar == null) {
                                iVar = f10350d.c(x509Certificate);
                            }
                            if (k.a(next.a(), iVar)) {
                                return;
                            }
                        } else if (hashCode != 3528965 || !b2.equals("sha1")) {
                            break loop0;
                        } else {
                            if (iVar2 == null) {
                                iVar2 = f10350d.b(x509Certificate);
                            }
                            if (k.a(next.a(), iVar2)) {
                                return;
                            }
                        }
                    }
                }
                throw new AssertionError("unsupported hashAlgorithm: " + next.b());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f10350d.a(x509Certificate2));
                sb.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                k.b(subjectDN, "element.subjectDN");
                sb.append(subjectDN.getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (c append : c2) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            k.b(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public final List<c> c(String str) {
        k.f(str, "hostname");
        Set<c> set = this.a;
        List<c> g2 = n.g();
        for (T next : set) {
            if (((c) next).c(str)) {
                if (g2.isEmpty()) {
                    g2 = new ArrayList<>();
                }
                if (g2 != null) {
                    y.a(g2).add(next);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
                }
            }
        }
        return g2;
    }

    public final k.h0.k.c d() {
        return this.b;
    }

    public final g e(k.h0.k.c cVar) {
        k.f(cVar, "certificateChainCleaner");
        if (k.a(this.b, cVar)) {
            return this;
        }
        return new g(this.a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return k.a(gVar.a, this.a) && k.a(gVar.b, this.b);
        }
    }

    public int hashCode() {
        int hashCode = (1517 + this.a.hashCode()) * 41;
        k.h0.k.c cVar = this.b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Set set, k.h0.k.c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 & 2) != 0 ? null : cVar);
    }
}

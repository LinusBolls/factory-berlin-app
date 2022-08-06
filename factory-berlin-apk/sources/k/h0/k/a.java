package k.h0.k;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: BasicCertificateChainCleaner.kt */
public final class a extends c {
    private final e b;

    /* renamed from: k.h0.k.a$a  reason: collision with other inner class name */
    /* compiled from: BasicCertificateChainCleaner.kt */
    public static final class C0747a {
        private C0747a() {
        }

        public /* synthetic */ C0747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0747a((DefaultConstructorMarker) null);
    }

    public a(e eVar) {
        k.f(eVar, "trustRootIndex");
        this.b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!k.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) {
        k.f(list, "chain");
        k.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        k.b(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i2 = 0;
        boolean z = false;
        while (i2 < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj != null) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                X509Certificate a = this.b.a(x509Certificate);
                if (a != null) {
                    if (arrayList.size() > 1 || (!k.a(x509Certificate, a))) {
                        arrayList.add(a);
                    }
                    if (b(a, a)) {
                        return arrayList;
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    k.b(it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (b(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                i2++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && k.a(((a) obj).b, this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

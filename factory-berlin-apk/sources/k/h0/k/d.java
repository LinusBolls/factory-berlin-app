package k.h0.k;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import k.h0.a;
import k.h0.b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: OkHostnameVerifier.kt */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    private final List<String> b(X509Certificate x509Certificate, int i2) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return n.g();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!k.a(next.get(0), Integer.valueOf(i2)))) {
                            Object obj = next.get(1);
                            if (obj == null) {
                                continue;
                            } else if (obj != null) {
                                arrayList.add((String) obj);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return n.g();
        }
    }

    private final boolean d(String str, String str2) {
        if (!(str == null || str.length() == 0) && !p.D(str, ".", false, 2, (Object) null) && !p.p(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !p.D(str2, ".", false, 2, (Object) null) && !p.p(str2, "..", false, 2, (Object) null)) {
                if (!p.p(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!p.p(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                k.b(locale, "Locale.US");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    k.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!q.I(lowerCase, "*", false, 2, (Object) null)) {
                        return k.a(str3, lowerCase);
                    }
                    if (!p.D(lowerCase, "*.", false, 2, (Object) null) || q.S(lowerCase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < lowerCase.length() || k.a("*.", lowerCase)) {
                        return false;
                    }
                    if (lowerCase != null) {
                        String substring = lowerCase.substring(1);
                        k.b(substring, "(this as java.lang.String).substring(startIndex)");
                        if (!p.p(str3, substring, false, 2, (Object) null)) {
                            return false;
                        }
                        int length = str3.length() - substring.length();
                        return length <= 0 || q.X(str3, '.', length + -1, false, 4, (Object) null) == -1;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    private final boolean e(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        k.b(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            k.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> b = b(x509Certificate, 2);
            if ((b instanceof Collection) && b.isEmpty()) {
                return false;
            }
            for (String d2 : b) {
                if (a.d(lowerCase, d2)) {
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean f(String str, X509Certificate x509Certificate) {
        String e2 = a.e(str);
        List<String> b = b(x509Certificate, 7);
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        for (String e3 : b) {
            if (k.a(e2, a.e(e3))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        k.f(x509Certificate, "certificate");
        return v.J(b(x509Certificate, 7), b(x509Certificate, 2));
    }

    public final boolean c(String str, X509Certificate x509Certificate) {
        k.f(str, "host");
        k.f(x509Certificate, "certificate");
        if (b.f(str)) {
            return f(str, x509Certificate);
        }
        return e(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        k.f(str, "host");
        k.f(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}

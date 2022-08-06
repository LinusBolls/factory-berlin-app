package g.b.c.a.k0;

import g.b.c.a.k0.b0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineFactory */
public final class a0<T_WRAPPER extends b0<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f9625d = Logger.getLogger(a0.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f9626e;

    /* renamed from: f  reason: collision with root package name */
    public static final a0<b0.a, Cipher> f9627f = new a0<>(new b0.a());

    /* renamed from: g  reason: collision with root package name */
    public static final a0<b0.d, Mac> f9628g = new a0<>(new b0.d());

    /* renamed from: h  reason: collision with root package name */
    public static final a0<b0.f, Signature> f9629h = new a0<>(new b0.f());

    /* renamed from: i  reason: collision with root package name */
    public static final a0<b0.e, MessageDigest> f9630i = new a0<>(new b0.e());

    /* renamed from: j  reason: collision with root package name */
    public static final a0<b0.c, KeyPairGenerator> f9631j = new a0<>(new b0.c());

    /* renamed from: k  reason: collision with root package name */
    public static final a0<b0.b, KeyFactory> f9632k = new a0<>(new b0.b());
    private T_WRAPPER a;
    private List<Provider> b = f9626e;
    private boolean c = true;

    static {
        if (q0.c()) {
            f9626e = b("GmsCore_OpenSSL", "AndroidOpenSSL");
        } else {
            f9626e = new ArrayList();
        }
    }

    public a0(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f9625d.info(String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider a2 : this.b) {
            try {
                return this.a.a(str, a2);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.c) {
            return this.a.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}

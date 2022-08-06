package g.b.c.a.k0;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineWrapper */
public interface b0<T> {

    /* compiled from: EngineWrapper */
    public static class a implements b0<Cipher> {
        /* renamed from: b */
        public Cipher a(String str, Provider provider) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class b implements b0<KeyFactory> {
        /* renamed from: b */
        public KeyFactory a(String str, Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class c implements b0<KeyPairGenerator> {
        /* renamed from: b */
        public KeyPairGenerator a(String str, Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class d implements b0<Mac> {
        /* renamed from: b */
        public Mac a(String str, Provider provider) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class e implements b0<MessageDigest> {
        /* renamed from: b */
        public MessageDigest a(String str, Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class f implements b0<Signature> {
        /* renamed from: b */
        public Signature a(String str, Provider provider) {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}

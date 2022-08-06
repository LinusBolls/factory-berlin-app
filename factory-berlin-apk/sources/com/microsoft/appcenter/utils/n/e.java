package com.microsoft.appcenter.utils.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.CertificateExpiredException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* compiled from: CryptoUtils */
public class e {

    /* renamed from: f  reason: collision with root package name */
    static final C0132e f4610f = new a();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g  reason: collision with root package name */
    private static e f4611g;
    private final Map<String, b> a;
    private final Context b;
    private final C0132e c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4612d;

    /* renamed from: e  reason: collision with root package name */
    private final KeyStore f4613e;

    /* compiled from: CryptoUtils */
    static class a implements C0132e {

        /* renamed from: com.microsoft.appcenter.utils.n.e$a$a  reason: collision with other inner class name */
        /* compiled from: CryptoUtils */
        class C0131a implements f {
            final /* synthetic */ KeyGenerator a;

            C0131a(a aVar, KeyGenerator keyGenerator) {
                this.a = keyGenerator;
            }

            public void a() {
                this.a.generateKey();
            }

            public void b(AlgorithmParameterSpec algorithmParameterSpec) {
                this.a.init(algorithmParameterSpec);
            }
        }

        /* compiled from: CryptoUtils */
        class b implements d {
            final /* synthetic */ Cipher a;

            b(a aVar, Cipher cipher) {
                this.a = cipher;
            }

            public byte[] a() {
                return this.a.getIV();
            }

            public byte[] b(byte[] bArr) {
                return this.a.doFinal(bArr);
            }

            public void c(int i2, Key key) {
                this.a.init(i2, key);
            }

            public int d() {
                return this.a.getBlockSize();
            }

            public void e(int i2, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
                this.a.init(i2, key, algorithmParameterSpec);
            }

            public byte[] f(byte[] bArr, int i2, int i3) {
                return this.a.doFinal(bArr, i2, i3);
            }
        }

        a() {
        }

        public f a(String str, String str2) {
            return new C0131a(this, KeyGenerator.getInstance(str, str2));
        }

        public d b(String str, String str2) {
            return new b(this, Cipher.getInstance(str, str2));
        }
    }

    /* compiled from: CryptoUtils */
    static class b {
        final b a;
        int b;

        b(int i2, b bVar) {
            this.b = i2;
            this.a = bVar;
        }
    }

    /* compiled from: CryptoUtils */
    public static class c {
        final String a;
        final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    /* compiled from: CryptoUtils */
    interface d {
        byte[] a();

        byte[] b(byte[] bArr);

        void c(int i2, Key key);

        int d();

        void e(int i2, Key key, AlgorithmParameterSpec algorithmParameterSpec);

        byte[] f(byte[] bArr, int i2, int i3);
    }

    /* renamed from: com.microsoft.appcenter.utils.n.e$e  reason: collision with other inner class name */
    /* compiled from: CryptoUtils */
    interface C0132e {
        f a(String str, String str2);

        d b(String str, String str2);
    }

    /* compiled from: CryptoUtils */
    interface f {
        void a();

        void b(AlgorithmParameterSpec algorithmParameterSpec);
    }

    private e(Context context) {
        this(context, f4610f, Build.VERSION.SDK_INT);
    }

    private String c(b bVar, int i2) {
        return "appcenter." + i2 + "." + bVar.c();
    }

    private c d(b bVar, int i2, String str) {
        String str2 = new String(bVar.d(this.c, this.f4612d, f(bVar, i2), Base64.decode(str, 0)), "UTF-8");
        return new c(str2, bVar != this.a.values().iterator().next().a ? b(str2) : null);
    }

    public static e e(Context context) {
        if (f4611g == null) {
            f4611g = new e(context);
        }
        return f4611g;
    }

    private KeyStore.Entry f(b bVar, int i2) {
        if (this.f4613e == null) {
            return null;
        }
        return this.f4613e.getEntry(c(bVar, i2), (KeyStore.ProtectionParameter) null);
    }

    private KeyStore.Entry g(b bVar) {
        return f(bVar.a, bVar.b);
    }

    private void h(b bVar) {
        int i2 = 0;
        String c2 = c(bVar, 0);
        String c3 = c(bVar, 1);
        Date creationDate = this.f4613e.getCreationDate(c2);
        Date creationDate2 = this.f4613e.getCreationDate(c3);
        if (creationDate2 != null && creationDate2.after(creationDate)) {
            c2 = c3;
            i2 = 1;
        }
        if (this.a.isEmpty() && !this.f4613e.containsAlias(c2)) {
            com.microsoft.appcenter.utils.a.a("AppCenter", "Creating alias: " + c2);
            bVar.b(this.c, c2, this.b);
        }
        com.microsoft.appcenter.utils.a.a("AppCenter", "Using " + c2);
        this.a.put(bVar.c(), new b(i2, bVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        return d(r3, r2.b ^ 1, r1[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        com.microsoft.appcenter.utils.a.b("AppCenter", "Failed to decrypt data.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return new com.microsoft.appcenter.utils.n.e.c(r10, (java.lang.String) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.microsoft.appcenter.utils.n.e.c a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0009
            com.microsoft.appcenter.utils.n.e$c r10 = new com.microsoft.appcenter.utils.n.e$c
            r10.<init>(r0, r0)
            return r10
        L_0x0009:
            java.lang.String r1 = ":"
            java.lang.String[] r1 = r10.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 != r3) goto L_0x001f
            java.util.Map<java.lang.String, com.microsoft.appcenter.utils.n.e$b> r2 = r9.a
            r3 = 0
            r3 = r1[r3]
            java.lang.Object r2 = r2.get(r3)
            com.microsoft.appcenter.utils.n.e$b r2 = (com.microsoft.appcenter.utils.n.e.b) r2
            goto L_0x0020
        L_0x001f:
            r2 = r0
        L_0x0020:
            if (r2 != 0) goto L_0x0024
            r3 = r0
            goto L_0x0026
        L_0x0024:
            com.microsoft.appcenter.utils.n.b r3 = r2.a
        L_0x0026:
            java.lang.String r4 = "Failed to decrypt data."
            java.lang.String r5 = "AppCenter"
            if (r3 != 0) goto L_0x0035
            com.microsoft.appcenter.utils.a.b(r5, r4)
            com.microsoft.appcenter.utils.n.e$c r1 = new com.microsoft.appcenter.utils.n.e$c
            r1.<init>(r10, r0)
            return r1
        L_0x0035:
            r6 = 1
            int r7 = r2.b     // Catch:{ Exception -> 0x003f }
            r8 = r1[r6]     // Catch:{ Exception -> 0x003f }
            com.microsoft.appcenter.utils.n.e$c r10 = r9.d(r3, r7, r8)     // Catch:{ Exception -> 0x003f }
            return r10
        L_0x003f:
            int r2 = r2.b     // Catch:{ Exception -> 0x0049 }
            r2 = r2 ^ r6
            r1 = r1[r6]     // Catch:{ Exception -> 0x0049 }
            com.microsoft.appcenter.utils.n.e$c r10 = r9.d(r3, r2, r1)     // Catch:{ Exception -> 0x0049 }
            return r10
        L_0x0049:
            com.microsoft.appcenter.utils.a.b(r5, r4)
            com.microsoft.appcenter.utils.n.e$c r1 = new com.microsoft.appcenter.utils.n.e$c
            r1.<init>(r10, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.utils.n.e.a(java.lang.String):com.microsoft.appcenter.utils.n.e$c");
    }

    public String b(String str) {
        b next;
        b bVar;
        if (str == null) {
            return null;
        }
        try {
            next = this.a.values().iterator().next();
            bVar = next.a;
            String encodeToString = Base64.encodeToString(bVar.a(this.c, this.f4612d, g(next), str.getBytes("UTF-8")), 0);
            return bVar.c() + ":" + encodeToString;
        } catch (InvalidKeyException e2) {
            if (!(e2.getCause() instanceof CertificateExpiredException)) {
                if (!"android.security.keystore.KeyExpiredException".equals(e2.getClass().getName())) {
                    throw e2;
                }
            }
            com.microsoft.appcenter.utils.a.a("AppCenter", "Alias expired: " + next.b);
            int i2 = next.b ^ 1;
            next.b = i2;
            String c2 = c(bVar, i2);
            if (this.f4613e.containsAlias(c2)) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Deleting alias: " + c2);
                this.f4613e.deleteEntry(c2);
            }
            com.microsoft.appcenter.utils.a.a("AppCenter", "Creating alias: " + c2);
            bVar.b(this.c, c2, this.b);
            return b(str);
        } catch (Exception unused) {
            com.microsoft.appcenter.utils.a.b("AppCenter", "Failed to encrypt data.");
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC, Splitter:B:21:0x0044] */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    e(android.content.Context r3, com.microsoft.appcenter.utils.n.e.C0132e r4, int r5) {
        /*
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.a = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.b = r3
            r2.c = r4
            r2.f4612d = r5
            r3 = 0
            java.lang.String r4 = "AppCenter"
            r0 = 19
            if (r5 < r0) goto L_0x002c
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0027 }
            r0.load(r3)     // Catch:{ Exception -> 0x0026 }
            r3 = r0
            goto L_0x002c
        L_0x0026:
            r3 = r0
        L_0x0027:
            java.lang.String r0 = "Cannot use secure keystore on this device."
            com.microsoft.appcenter.utils.a.b(r4, r0)
        L_0x002c:
            r2.f4613e = r3
            if (r3 == 0) goto L_0x0042
            r0 = 23
            if (r5 < r0) goto L_0x0042
            com.microsoft.appcenter.utils.n.a r5 = new com.microsoft.appcenter.utils.n.a     // Catch:{ Exception -> 0x003d }
            r5.<init>()     // Catch:{ Exception -> 0x003d }
            r2.h(r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = "Cannot use modern encryption on this device."
            com.microsoft.appcenter.utils.a.b(r4, r5)
        L_0x0042:
            if (r3 == 0) goto L_0x0052
            com.microsoft.appcenter.utils.n.d r3 = new com.microsoft.appcenter.utils.n.d     // Catch:{ Exception -> 0x004d }
            r3.<init>()     // Catch:{ Exception -> 0x004d }
            r2.h(r3)     // Catch:{ Exception -> 0x004d }
            goto L_0x0052
        L_0x004d:
            java.lang.String r3 = "Cannot use old encryption on this device."
            com.microsoft.appcenter.utils.a.b(r4, r3)
        L_0x0052:
            com.microsoft.appcenter.utils.n.c r3 = new com.microsoft.appcenter.utils.n.c
            r3.<init>()
            java.util.Map<java.lang.String, com.microsoft.appcenter.utils.n.e$b> r4 = r2.a
            java.lang.String r5 = r3.c()
            com.microsoft.appcenter.utils.n.e$b r0 = new com.microsoft.appcenter.utils.n.e$b
            r1 = 0
            r0.<init>(r1, r3)
            r4.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.utils.n.e.<init>(android.content.Context, com.microsoft.appcenter.utils.n.e$e, int):void");
    }
}

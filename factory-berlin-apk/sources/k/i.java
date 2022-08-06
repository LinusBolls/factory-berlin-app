package k;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: CipherSuite.kt */
public final class i {
    /* access modifiers changed from: private */
    public static final Comparator<String> b = new a();
    /* access modifiers changed from: private */
    public static final Map<String, i> c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final i f10481d = t.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e  reason: collision with root package name */
    public static final i f10482e = t.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f  reason: collision with root package name */
    public static final i f10483f = t.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g  reason: collision with root package name */
    public static final i f10484g = t.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h  reason: collision with root package name */
    public static final i f10485h = t.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i  reason: collision with root package name */
    public static final i f10486i = t.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j  reason: collision with root package name */
    public static final i f10487j = t.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k  reason: collision with root package name */
    public static final i f10488k = t.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l  reason: collision with root package name */
    public static final i f10489l = t.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m  reason: collision with root package name */
    public static final i f10490m = t.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n  reason: collision with root package name */
    public static final i f10491n = t.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final i o = t.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final i p = t.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    public static final i q = t.d("TLS_AES_128_GCM_SHA256", 4865);
    public static final i r = t.d("TLS_AES_256_GCM_SHA384", 4866);
    public static final i s = t.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final b t = new b((DefaultConstructorMarker) null);
    private final String a;

    /* compiled from: CipherSuite.kt */
    public static final class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            k.f(str, "a");
            k.f(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i2 = 4;
            while (i2 < min) {
                char charAt = str.charAt(i2);
                char charAt2 = str2.charAt(i2);
                if (charAt == charAt2) {
                    i2++;
                } else if (charAt < charAt2) {
                    return -1;
                } else {
                    return 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: CipherSuite.kt */
    public static final class b {
        private b() {
        }

        /* access modifiers changed from: private */
        public final i d(String str, int i2) {
            i iVar = new i(str, (DefaultConstructorMarker) null);
            i.c.put(str, iVar);
            return iVar;
        }

        private final String e(String str) {
            if (p.D(str, "TLS_", false, 2, (Object) null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                if (str != null) {
                    String substring = str.substring(4);
                    k.b(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    return sb.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (!p.D(str, "SSL_", false, 2, (Object) null)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                if (str != null) {
                    String substring2 = str.substring(4);
                    k.b(substring2, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }

        public final synchronized i b(String str) {
            i iVar;
            k.f(str, "javaName");
            iVar = (i) i.c.get(str);
            if (iVar == null) {
                iVar = (i) i.c.get(e(str));
                if (iVar == null) {
                    iVar = new i(str, (DefaultConstructorMarker) null);
                }
                i.c.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.b;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        i unused = t.d("SSL_RSA_WITH_NULL_MD5", 1);
        i unused2 = t.d("SSL_RSA_WITH_NULL_SHA", 2);
        i unused3 = t.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        i unused4 = t.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        i unused5 = t.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        i unused6 = t.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        i unused7 = t.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        i unused8 = t.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        i unused9 = t.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        i unused10 = t.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        i unused11 = t.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        i unused12 = t.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        i unused13 = t.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        i unused14 = t.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        i unused15 = t.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        i unused16 = t.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        i unused17 = t.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        i unused18 = t.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        i unused19 = t.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        i unused20 = t.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        i unused21 = t.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        i unused22 = t.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        i unused23 = t.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        i unused24 = t.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        i unused25 = t.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        i unused26 = t.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        i unused27 = t.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        i unused28 = t.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        i unused29 = t.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        i unused30 = t.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        i unused31 = t.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        i unused32 = t.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        i unused33 = t.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        i unused34 = t.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        i unused35 = t.d("TLS_RSA_WITH_NULL_SHA256", 59);
        i unused36 = t.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        i unused37 = t.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        i unused38 = t.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        i unused39 = t.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        i unused40 = t.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        i unused41 = t.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        i unused42 = t.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        i unused43 = t.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        i unused44 = t.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        i unused45 = t.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        i unused46 = t.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        i unused47 = t.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        i unused48 = t.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        i unused49 = t.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        i unused50 = t.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        i unused51 = t.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        i unused52 = t.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        i unused53 = t.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        i unused54 = t.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        i unused55 = t.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        i unused56 = t.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        i unused57 = t.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        i unused58 = t.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        i unused59 = t.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        i unused60 = t.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        i unused61 = t.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        i unused62 = t.d("TLS_FALLBACK_SCSV", 22016);
        i unused63 = t.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        i unused64 = t.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        i unused65 = t.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        i unused66 = t.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        i unused67 = t.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        i unused68 = t.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        i unused69 = t.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        i unused70 = t.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        i unused71 = t.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        i unused72 = t.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        i unused73 = t.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        i unused74 = t.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        i unused75 = t.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        i unused76 = t.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        i unused77 = t.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        i unused78 = t.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        i unused79 = t.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        i unused80 = t.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        i unused81 = t.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        i unused82 = t.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        i unused83 = t.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        i unused84 = t.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        i unused85 = t.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        i unused86 = t.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        i unused87 = t.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        i unused88 = t.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        i unused89 = t.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        i unused90 = t.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        i unused91 = t.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        i unused92 = t.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        i unused93 = t.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        i unused94 = t.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        i unused95 = t.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        i unused96 = t.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        i unused97 = t.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        i unused98 = t.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        i unused99 = t.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        i unused100 = t.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        i unused101 = t.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        i unused102 = t.d("TLS_AES_128_CCM_SHA256", 4868);
        i unused103 = t.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private i(String str) {
        this.a = str;
    }

    public static final synchronized i c(String str) {
        i b2;
        synchronized (i.class) {
            b2 = t.b(str);
        }
        return b2;
    }

    public final String d() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ i(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

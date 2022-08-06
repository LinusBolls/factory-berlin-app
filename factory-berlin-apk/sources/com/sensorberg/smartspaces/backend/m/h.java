package com.sensorberg.smartspaces.backend.m;

import android.util.Base64;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import com.sensorberg.encryptor.m;
import com.sensorberg.smartspaces.backend.h;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import org.json.JSONObject;

/* compiled from: ObservableRsaEncryption.kt */
public final class h {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.f f6046e = new com.google.gson.f();

    /* renamed from: f  reason: collision with root package name */
    public static final c f6047f = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final c<String> a;
    /* access modifiers changed from: private */
    public final g.e.k.d<String> b = new g.e.k.d<>();
    /* access modifiers changed from: private */
    public final g.e.k.d<KeyPair> c = new g.e.k.d<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final g.e.k.a f6048d;

    /* compiled from: ObservableRsaEncryption.kt */
    public static final class a implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f6049g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f6050h;

        a(h hVar, LiveData liveData) {
            this.f6049g = hVar;
            this.f6050h = liveData;
        }

        /* renamed from: a */
        public void k(Boolean bool) {
            if (bool != null && !this.f6049g.f6048d.c()) {
                this.f6050h.t(this);
                if (k.a(bool, Boolean.FALSE)) {
                    this.f6049g.h();
                }
            }
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    public static final class b {
        @com.google.gson.annotations.b("message")
        private final String a;
        @com.google.gson.annotations.b("encryption-details")
        private final String b;
        @com.google.gson.annotations.b("user-device-id")
        private final String c;

        public b(String str, String str2, String str3) {
            k.e(str, "message");
            k.e(str2, "encryptionDetails");
            k.e(str3, "userDeviceId");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "AesWrappedMessage(message=" + this.a + ", encryptionDetails=" + this.b + ", userDeviceId=" + this.c + ")";
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    public static final class c {
        private c() {
        }

        public final KeyPair a() {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            KeyPair genKeyPair = instance.genKeyPair();
            k.d(genKeyPair, "kpg.genKeyPair()");
            return genKeyPair;
        }

        public final String b(String str, KeyPair keyPair) {
            k.e(str, "data");
            k.e(keyPair, "keyPair");
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, keyPair.getPrivate());
            byte[] bytes = str.getBytes(kotlin.j0.d.a);
            k.d(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
            k.d(encodeToString, "Base64.encodeToString(bytes, 0)");
            return encodeToString;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    public static final class d {
        @com.google.gson.annotations.b("key")
        private final String a;
        @com.google.gson.annotations.b("iv")
        private final String b;
        @com.google.gson.annotations.b("tag")
        private final String c;

        public d(String str, String str2, String str3) {
            k.e(str, "key");
            k.e(str2, "iv");
            k.e(str3, "tag");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k.a(this.a, dVar.a) && k.a(this.b, dVar.b) && k.a(this.c, dVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "EncryptionDetails(key=" + this.a + ", iv=" + this.b + ", tag=" + this.c + ")";
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    static final class e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f6051h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(0);
            this.f6051h = hVar;
        }

        public final void a() {
            KeyPair a = h.f6047f.a();
            PublicKey publicKey = a.getPublic();
            PrivateKey privateKey = a.getPrivate();
            JSONObject jSONObject = new JSONObject();
            k.d(publicKey, "pubK");
            jSONObject.put("pub", Base64.encodeToString(publicKey.getEncoded(), 0));
            k.d(privateKey, "privK");
            jSONObject.put("prv", Base64.encodeToString(privateKey.getEncoded(), 0));
            this.f6051h.a.w(jSONObject.toString());
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    static final class f extends l implements kotlin.e0.c.l<KeyPair, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f6052h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f6053i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6054j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h hVar, String str, String str2) {
            super(1);
            this.f6052h = hVar;
            this.f6053i = str;
            this.f6054j = str2;
        }

        /* renamed from: a */
        public final String o(KeyPair keyPair) {
            k.e(keyPair, "keyPair");
            String r = h.f6046e.r(this.f6052h.g(this.f6053i, this.f6054j, keyPair));
            h.j jVar = com.sensorberg.smartspaces.backend.h.r;
            k.d(r, "encryptedMessage");
            String b = jVar.b(r);
            return b + r;
        }
    }

    /* compiled from: ObservableRsaEncryption.kt */
    static final class g extends l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f6055h;

        /* compiled from: ObservableRsaEncryption.kt */
        static final class a extends l implements kotlin.e0.c.a<x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f6056h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f6057i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, String str) {
                super(0);
                this.f6056h = gVar;
                this.f6057i = str;
            }

            public final void a() {
                JSONObject jSONObject = new JSONObject(this.f6057i);
                KeyFactory instance = KeyFactory.getInstance("RSA");
                String string = jSONObject.getString("pub");
                String string2 = jSONObject.getString("prv");
                PublicKey generatePublic = instance.generatePublic(new X509EncodedKeySpec(Base64.decode(string, 0)));
                k.d(generatePublic, "factory.generatePublic(X…c(Base64.decode(pub, 0)))");
                this.f6056h.f6055h.c.w(new KeyPair(generatePublic, instance.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(string2, 0)))));
                this.f6056h.f6055h.b.w("-----BEGIN PUBLIC KEY-----\n" + Base64.encodeToString(generatePublic.getEncoded(), 0) + "-----END PUBLIC KEY-----");
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(1);
            this.f6055h = hVar;
        }

        public final void a(String str) {
            k.e(str, "it");
            g.e.e.a aVar = g.e.e.a.f9778f;
            aVar.j(aVar.c(), new a(this, str));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.m.h$h  reason: collision with other inner class name */
    /* compiled from: ObservableRsaEncryption.kt */
    static final class C0343h extends l implements kotlin.e0.c.l<String, g.e.k.e<T>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6058h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0343h(kotlin.e0.c.l lVar) {
            super(1);
            this.f6058h = lVar;
        }

        /* renamed from: a */
        public final g.e.k.e<T> o(String str) {
            k.e(str, "it");
            return (g.e.k.e) this.f6058h.o(str);
        }
    }

    public h(g.e.k.a aVar, com.sensorberg.encryptor.d dVar) {
        k.e(aVar, "cancellation");
        k.e(dVar, "encryptor");
        this.f6048d = aVar;
        this.a = new c<>(dVar.b("btkey"));
        LiveData<Boolean> contains = dVar.contains("btkey");
        contains.p(new a(this, contains));
        j();
    }

    /* access modifiers changed from: private */
    public final void h() {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.c(), new e(this));
    }

    private final void j() {
        g.e.k.h.j(g.e.k.h.a, this.a, (g.e.k.a) null, new g(this), 2, (Object) null);
    }

    public final b g(String str, String str2, KeyPair keyPair) {
        k.e(str, "data");
        k.e(str2, "deviceId");
        k.e(keyPair, "keyPair");
        SecretKey c2 = m.f5112i.c();
        com.sensorberg.encryptor.c b2 = m.f5112i.b("alias", str, c2);
        String encodeToString = Base64.encodeToString(c2.getEncoded(), 0);
        String d2 = b2.d();
        k.d(encodeToString, "base64Aes");
        String r = f6046e.r(new d(encodeToString, d2, b2.e()));
        c cVar = f6047f;
        k.d(r, "encryptionDetailsJson");
        return new b(b2.b(), cVar.b(r, keyPair), str2);
    }

    public final g.e.k.e<String> i(String str, String str2) {
        k.e(str, "data");
        k.e(str2, "deviceId");
        return g.e.k.h.d(g.e.k.h.a, this.c, (g.e.k.a) null, new f(this, str, str2), 2, (Object) null);
    }

    public final <T> g.e.k.e<T> k(kotlin.e0.c.l<? super String, ? extends g.e.k.e<T>> lVar) {
        k.e(lVar, "callback");
        return g.e.k.h.a.n(this.b, this.f6048d, new C0343h(lVar));
    }
}

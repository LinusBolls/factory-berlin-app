package com.sensorberg.encryptor;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.sensorberg.encryptor.d;
import g.e.f.b;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.crypto.SecretKey;
import kotlin.TypeCastException;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: EncryptorImpl.kt */
public final class g implements d {
    private final Executor b = g.e.e.a.f9778f.h();
    private final Executor c = g.e.e.a.f9778f.e();

    /* renamed from: d  reason: collision with root package name */
    private final SharedPreferences f5083d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final o f5084e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5085f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5086g;

    /* renamed from: h  reason: collision with root package name */
    private final e0<SecretKey> f5087h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, j> f5088i;

    /* renamed from: j  reason: collision with root package name */
    private final a f5089j;

    /* renamed from: k  reason: collision with root package name */
    private final e f5090k;

    /* renamed from: l  reason: collision with root package name */
    private final e0<Boolean> f5091l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e0<d.C0159d> f5092m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5093n;
    private final q<String, String, SecretKey, c> o;
    private final p<c, SecretKey, String> p;
    /* access modifiers changed from: private */
    public final EncryptorDb q;
    private final d.c r;
    /* access modifiers changed from: private */
    public final String s;
    /* access modifiers changed from: private */
    public final q<String, String, SecretKey, c> t;
    /* access modifiers changed from: private */
    public final p<c, SecretKey, String> u;

    /* compiled from: EncryptorImpl.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f5094g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f5095h;

        a(g gVar, Context context) {
            this.f5094g = gVar;
            this.f5095h = context;
        }

        public final void run() {
            d.C0159d dVar;
            try {
                if (this.f5094g.f5084e.b()) {
                    b.a.a(this.f5094g.q, this.f5095h, this.f5094g.s);
                }
                e0 k2 = this.f5094g.f5092m;
                if (this.f5094g.n()) {
                    dVar = this.f5094g.l();
                } else {
                    dVar = this.f5094g.m();
                }
                k2.s(dVar);
                n.a.a.a(this.f5094g.s + ". Encrytor operational", new Object[0]);
            } catch (Exception e2) {
                n.a.a.e(e2, this.f5094g.s + ". Failed to initialise encryptor. " + e2.getMessage(), new Object[0]);
                e0 k3 = this.f5094g.f5092m;
                String message = e2.getMessage();
                if (message == null) {
                    message = "Failed to initialise encryptor";
                }
                k3.s(new d.C0159d.b(message));
            }
        }
    }

    /* compiled from: EncryptorImpl.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EncryptorImpl.kt */
    static final class c extends l implements p<c, SecretKey, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f5096h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(2);
            this.f5096h = gVar;
        }

        /* renamed from: a */
        public final String l(c cVar, SecretKey secretKey) {
            k.f(cVar, "message");
            k.f(secretKey, "key");
            try {
                return (String) this.f5096h.u.l(cVar, secretKey);
            } catch (Exception e2) {
                e0 k2 = this.f5096h.f5092m;
                String message = e2.getMessage();
                if (message == null) {
                    message = "Encryption Failure";
                }
                k2.s(new d.C0159d.b(message));
                return null;
            }
        }
    }

    /* compiled from: EncryptorImpl.kt */
    static final class d extends l implements q<String, String, SecretKey, c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f5097h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(3);
            this.f5097h = gVar;
        }

        /* renamed from: a */
        public final c k(String str, String str2, SecretKey secretKey) {
            k.f(str, "alias");
            k.f(str2, "data");
            k.f(secretKey, "key");
            try {
                return (c) this.f5097h.t.k(str, str2, secretKey);
            } catch (Exception e2) {
                e0 k2 = this.f5097h.f5092m;
                String message = e2.getMessage();
                if (message == null) {
                    message = "Encryption Failure";
                }
                k2.s(new d.C0159d.b(message));
                return null;
            }
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public g(Context context, EncryptorDb encryptorDb, d.c cVar, String str, q<? super String, ? super String, ? super SecretKey, c> qVar, p<? super c, ? super SecretKey, String> pVar) {
        k.f(context, "context");
        k.f(encryptorDb, "db");
        k.f(str, "alias");
        k.f(qVar, "encrypt");
        k.f(pVar, "decrypt");
        this.q = encryptorDb;
        this.r = cVar;
        this.s = str;
        this.t = qVar;
        this.u = pVar;
        b.c cVar2 = g.e.f.b.f9799i;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        SharedPreferences a2 = cVar2.a(new File(noBackupFilesDir, "prefs_encryptor_" + this.s + ".json"));
        this.f5083d = a2;
        this.f5084e = o.c.a(a2, "0.8.0", context, this.s);
        this.f5085f = m.f5112i.e(this.f5083d);
        this.f5086g = m.f5112i.d(this.f5083d);
        this.f5087h = new e0<>();
        this.f5088i = new LinkedHashMap();
        this.f5089j = new a(this.s, this.f5086g, context);
        this.f5090k = this.q.y();
        this.f5091l = new e0<>();
        this.f5092m = new e0<>();
        n.a.a.a(this.s + ". Initializing EncryptorImpl", new Object[0]);
        this.f5092m.u(d.C0159d.c.a);
        this.b.execute(new a(this, context));
        this.o = new d(this);
        this.p = new c(this);
    }

    /* access modifiers changed from: private */
    public final d.C0159d l() {
        SecretKey a2 = new k(this.s, this.f5086g, this.f5090k).a(this.f5089j.b().b());
        this.f5087h.s(a2);
        n.a.a.j(this.s + ". Encrypting lorem ipsum", new Object[0]);
        this.f5090k.b(m.f5112i.b("com.sensorberg.encryptor.pref_known_data", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus lacinia, libero eu gravida congue, risus dui feugiat erat, id blandit dolor turpis et eros. Cras maximus porta sem. Morbi vitae nisl odio. Ut hendrerit arcu sed rhoncus pellentesque.", a2));
        return d.C0159d.C0160d.a;
    }

    /* access modifiers changed from: private */
    public final d.C0159d m() {
        SecretKey b2 = new k(this.s, this.f5086g, this.f5090k).b(this.f5089j.g().a());
        this.f5087h.s(b2);
        if (this.f5084e.a()) {
            n.a.a.j(this.s + ". Encrypting lorem ipsum", new Object[0]);
            this.f5090k.b(m.f5112i.b("com.sensorberg.encryptor.pref_known_data", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus lacinia, libero eu gravida congue, risus dui feugiat erat, id blandit dolor turpis et eros. Cras maximus porta sem. Morbi vitae nisl odio. Ut hendrerit arcu sed rhoncus pellentesque.", b2));
            return d.C0159d.C0160d.a;
        }
        n.a.a.j(this.s + ". Decrypting lorem ipsum", new Object[0]);
        c a2 = this.f5090k.a("com.sensorberg.encryptor.pref_known_data");
        if (a2 == null) {
            throw new IllegalStateException("Failed to query known data");
        } else if (!(!k.a(m.f5112i.a(a2, b2), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus lacinia, libero eu gravida congue, risus dui feugiat erat, id blandit dolor turpis et eros. Cras maximus porta sem. Morbi vitae nisl odio. Ut hendrerit arcu sed rhoncus pellentesque."))) {
            return d.C0159d.C0160d.a;
        } else {
            throw new IllegalStateException("Decrypted known data doesn't match known data. Keys are invalid");
        }
    }

    public LiveData<d.C0159d> a() {
        return this.f5092m;
    }

    public e0<String> b(String str) {
        k.f(str, "alias");
        if (this.f5088i.containsKey(str)) {
            j jVar = this.f5088i.get(str);
            if (jVar != null) {
                return jVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
        }
        j jVar2 = new j(this.b, this.c, str, this.f5090k, this.f5087h, this.f5093n, this.f5091l, this.o, this.p);
        this.f5088i.put(str, jVar2);
        return jVar2;
    }

    public <T> e0<T> c(String str, Class<T> cls) {
        k.f(str, "alias");
        k.f(cls, "klazz");
        e0<String> b2 = b(str);
        d.c cVar = this.r;
        if (cVar != null) {
            return new i(b2, cVar, cls);
        }
        k.m();
        throw null;
    }

    public LiveData<Boolean> contains(String str) {
        k.f(str, "alias");
        return new h(this.b, str, this.f5090k);
    }

    public void destroy() {
        this.f5092m.s(d.C0159d.a.a);
        this.f5091l.s(Boolean.TRUE);
        this.f5087h.s(null);
        this.f5088i.clear();
        this.q.d();
        this.f5083d.edit().clear().commit();
        this.f5089j.a();
    }

    public final boolean n() {
        return this.f5085f;
    }
}

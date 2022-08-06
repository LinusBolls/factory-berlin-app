package com.sensorberg.encryptor;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import javax.crypto.SecretKey;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: Encryptor.kt */
public interface d {
    public static final a a = a.f5076e;

    /* compiled from: Encryptor.kt */
    public static final class a {
        private static final b a;
        private static b b;
        private static final q<String, String, SecretKey, c> c = c.f5078h;

        /* renamed from: d  reason: collision with root package name */
        private static final p<c, SecretKey, String> f5075d = C0158a.f5077h;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ a f5076e;

        /* renamed from: com.sensorberg.encryptor.d$a$a  reason: collision with other inner class name */
        /* compiled from: Encryptor.kt */
        static final class C0158a extends l implements p<c, SecretKey, String> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0158a f5077h = new C0158a();

            C0158a() {
                super(2);
            }

            /* renamed from: a */
            public final String l(c cVar, SecretKey secretKey) {
                k.f(cVar, "message");
                k.f(secretKey, "key");
                return m.f5112i.a(cVar, secretKey);
            }
        }

        /* compiled from: Encryptor.kt */
        public static final class b implements b {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public d a(String str, Context context, c cVar) {
                k.f(str, "alias");
                k.f(context, "context");
                Context applicationContext = context.getApplicationContext();
                n nVar = n.a;
                k.b(applicationContext, "appContext");
                return new g(applicationContext, nVar.a(new l(applicationContext), str), cVar, str, this.a.d(), this.a.c());
            }
        }

        /* compiled from: Encryptor.kt */
        static final class c extends l implements q<String, String, SecretKey, c> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5078h = new c();

            c() {
                super(3);
            }

            /* renamed from: a */
            public final c k(String str, String str2, SecretKey secretKey) {
                k.f(str, "alias");
                k.f(str2, "data");
                k.f(secretKey, "key");
                return m.f5112i.b(str, str2, secretKey);
            }
        }

        static {
            a aVar = new a();
            f5076e = aVar;
            b bVar = new b(aVar);
            a = bVar;
            b = bVar;
        }

        private a() {
        }

        public static /* synthetic */ d b(a aVar, String str, Context context, c cVar, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                cVar = null;
            }
            return aVar.a(str, context, cVar);
        }

        public final d a(String str, Context context, c cVar) {
            k.f(str, "alias");
            k.f(context, "context");
            return b.a(str, context, cVar);
        }

        public final p<c, SecretKey, String> c() {
            return f5075d;
        }

        public final q<String, String, SecretKey, c> d() {
            return c;
        }
    }

    /* compiled from: Encryptor.kt */
    public interface b {
        d a(String str, Context context, c cVar);
    }

    /* compiled from: Encryptor.kt */
    public interface c {
        <T> String a(T t, Class<T> cls);

        <T> T b(String str, Class<T> cls);
    }

    /* renamed from: com.sensorberg.encryptor.d$d  reason: collision with other inner class name */
    /* compiled from: Encryptor.kt */
    public static abstract class C0159d {

        /* renamed from: com.sensorberg.encryptor.d$d$a */
        /* compiled from: Encryptor.kt */
        public static final class a extends C0159d {
            public static final a a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.sensorberg.encryptor.d$d$b */
        /* compiled from: Encryptor.kt */
        public static final class b extends C0159d {
            private final String a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                k.f(str, "message");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && k.a(this.a, ((b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                String str = this.a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Fail(message=" + this.a + ")";
            }
        }

        /* renamed from: com.sensorberg.encryptor.d$d$c */
        /* compiled from: Encryptor.kt */
        public static final class c extends C0159d {
            public static final c a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.sensorberg.encryptor.d$d$d  reason: collision with other inner class name */
        /* compiled from: Encryptor.kt */
        public static final class C0160d extends C0159d {
            public static final C0160d a = new C0160d();

            private C0160d() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C0159d() {
        }

        public /* synthetic */ C0159d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    LiveData<C0159d> a();

    e0<String> b(String str);

    <T> e0<T> c(String str, Class<T> cls);

    LiveData<Boolean> contains(String str);

    void destroy();
}

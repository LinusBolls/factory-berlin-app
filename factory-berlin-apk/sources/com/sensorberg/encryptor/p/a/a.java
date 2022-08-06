package com.sensorberg.encryptor.p.a;

import com.google.gson.f;
import com.sensorberg.encryptor.d;
import kotlin.jvm.internal.k;

/* compiled from: GsonSerializer.kt */
public final class a implements d.c {
    public static final C0161a b = new C0161a((DefaultConstructorMarker) null);
    private final f a;

    /* renamed from: com.sensorberg.encryptor.p.a.a$a  reason: collision with other inner class name */
    /* compiled from: GsonSerializer.kt */
    public static final class C0161a {
        private C0161a() {
        }

        public final d.c a(f fVar) {
            k.f(fVar, "gson");
            return new a(fVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private a(f fVar) {
        this.a = fVar;
    }

    public <T> String a(T t, Class<T> cls) {
        k.f(cls, "klazz");
        String r = this.a.r(t);
        k.b(r, "gson.toJson(t)");
        return r;
    }

    public <T> T b(String str, Class<T> cls) {
        k.f(str, "value");
        k.f(cls, "klazz");
        return this.a.i(str, cls);
    }

    public /* synthetic */ a(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }
}

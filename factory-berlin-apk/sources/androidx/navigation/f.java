package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.e;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.e0.c.a;
import kotlin.h0.b;
import kotlin.jvm.internal.k;

/* compiled from: NavArgsLazy.kt */
public final class f<Args extends e> implements kotlin.e<Args> {

    /* renamed from: g  reason: collision with root package name */
    private Args f1058g;

    /* renamed from: h  reason: collision with root package name */
    private final b<Args> f1059h;

    /* renamed from: i  reason: collision with root package name */
    private final a<Bundle> f1060i;

    public f(b<Args> bVar, a<Bundle> aVar) {
        k.f(bVar, "navArgsClass");
        k.f(aVar, "argumentProducer");
        this.f1059h = bVar;
        this.f1060i = aVar;
    }

    /* renamed from: a */
    public Args getValue() {
        Args args = this.f1058g;
        if (args != null) {
            return args;
        }
        Bundle d2 = this.f1060i.d();
        Method method = g.a().get(this.f1059h);
        if (method == null) {
            Class<Args> a = kotlin.e0.a.a(this.f1059h);
            Class[] b = g.b();
            method = a.getMethod("fromBundle", (Class[]) Arrays.copyOf(b, b.length));
            g.a().put(this.f1059h, method);
            k.b(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke = method.invoke((Object) null, new Object[]{d2});
        if (invoke != null) {
            Args args2 = (e) invoke;
            this.f1058g = args2;
            return args2;
        }
        throw new TypeCastException("null cannot be cast to non-null type Args");
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import java.util.Set;

public final class a<O extends d> {
    private final C0060a<?, O> a;
    private final g<?> b;
    private final String c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0060a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, d.a aVar, d.b bVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface C0061a extends d {
            Account h();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(c.e eVar);

        boolean b();

        void d(l lVar, Set<Scope> set);

        boolean f();

        int g();

        boolean i();

        com.google.android.gms.common.d[] j();

        String k();

        void l(c.C0063c cVar);

        void m();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        String c();

        T e(IBinder iBinder);

        String p();

        void q(int i2, T t);
    }

    public <C extends f> a(String str, C0060a<C, O> aVar, g<C> gVar) {
        r.l(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.c;
    }

    public final C0060a<?, O> c() {
        r.o(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}

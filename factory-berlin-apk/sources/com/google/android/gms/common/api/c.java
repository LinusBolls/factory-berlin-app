package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.util.Collections;
import java.util.Set;

public class c<O extends a.d> {
    private final Context a;
    private final a<O> b;
    private final O c;

    /* renamed from: d  reason: collision with root package name */
    private final q0<O> f2034d;

    /* renamed from: e  reason: collision with root package name */
    private final Looper f2035e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2036f;

    /* renamed from: g  reason: collision with root package name */
    private final d f2037g;

    /* renamed from: h  reason: collision with root package name */
    private final l f2038h;

    /* renamed from: i  reason: collision with root package name */
    protected final e f2039i;

    public static class a {
        public static final a c = new C0062a().a();
        public final l a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.c$a$a  reason: collision with other inner class name */
        public static class C0062a {
            private l a;
            private Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }

            public C0062a b(l lVar) {
                r.l(lVar, "StatusExceptionMapper must not be null.");
                this.a = lVar;
                return this;
            }
        }

        private a(l lVar, Account account, Looper looper) {
            this.a = lVar;
            this.b = looper;
        }
    }

    public c(Context context, a<O> aVar, O o, a aVar2) {
        r.l(context, "Null context is not permitted.");
        r.l(aVar, "Api must not be null.");
        r.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = o;
        this.f2035e = aVar2.b;
        this.f2034d = q0.a(aVar, o);
        this.f2037g = new b0(this);
        e h2 = e.h(this.a);
        this.f2039i = h2;
        this.f2036f = h2.k();
        this.f2038h = aVar2.a;
        this.f2039i.d(this);
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.c<? extends g, A>> T k(int i2, T t) {
        t.m();
        this.f2039i.e(this, i2, t);
        return t;
    }

    private final <TResult, A extends a.b> g<TResult> m(int i2, m<A, TResult> mVar) {
        h hVar = new h();
        this.f2039i.f(this, i2, mVar, hVar, this.f2038h);
        return hVar.a();
    }

    public d a() {
        return this.f2037g;
    }

    /* access modifiers changed from: protected */
    public e.a b() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        e.a aVar = new e.a();
        O o = this.c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.c;
            account = o2 instanceof a.d.C0061a ? ((a.d.C0061a) o2).h() : null;
        } else {
            account = a3.l();
        }
        aVar.c(account);
        O o3 = this.c;
        if (!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) {
            set = Collections.emptySet();
        } else {
            set = a2.S();
        }
        aVar.a(set);
        aVar.d(this.a.getClass().getName());
        aVar.e(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> g<TResult> c(m<A, TResult> mVar) {
        return m(0, mVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.c<? extends g, A>> T d(T t) {
        k(1, t);
        return t;
    }

    public <TResult, A extends a.b> g<TResult> e(m<A, TResult> mVar) {
        return m(1, mVar);
    }

    public O f() {
        return this.c;
    }

    public final int g() {
        return this.f2036f;
    }

    public Looper h() {
        return this.f2035e;
    }

    public <L> i<L> i(L l2, String str) {
        return j.a(l2, this.f2035e, str);
    }

    public a.f j(Looper looper, e.a<O> aVar) {
        return this.b.c().a(this.a, looper, b().b(), this.c, aVar, aVar);
    }

    public f0 l(Context context, Handler handler) {
        return new f0(context, handler, b().b());
    }

    public final q0<O> n() {
        return this.f2034d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.l r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.c$a$a r0 = new com.google.android.gms.common.api.c$a$a
            r0.<init>()
            r0.b(r5)
            com.google.android.gms.common.api.c$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.c.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.c.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.l):void");
    }
}

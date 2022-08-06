package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class e {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f2133d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2134e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2135f;

    /* renamed from: g  reason: collision with root package name */
    private final g.b.a.b.e.a f2136g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f2137h;

    public static final class a {
        private Account a;
        private e.e.b<Scope> b;
        private Map<com.google.android.gms.common.api.a<?>, b> c;

        /* renamed from: d  reason: collision with root package name */
        private int f2138d = 0;

        /* renamed from: e  reason: collision with root package name */
        private View f2139e;

        /* renamed from: f  reason: collision with root package name */
        private String f2140f;

        /* renamed from: g  reason: collision with root package name */
        private String f2141g;

        /* renamed from: h  reason: collision with root package name */
        private g.b.a.b.e.a f2142h = g.b.a.b.e.a.f9425i;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2143i;

        public final a a(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new e.e.b<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final e b() {
            return new e(this.a, this.b, this.c, this.f2138d, this.f2139e, this.f2140f, this.f2141g, this.f2142h, this.f2143i);
        }

        public final a c(Account account) {
            this.a = account;
            return this;
        }

        public final a d(String str) {
            this.f2141g = str;
            return this;
        }

        public final a e(String str) {
            this.f2140f = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> a;
    }

    public e(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, g.b.a.b.e.a aVar, boolean z) {
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f2133d = map == null ? Collections.EMPTY_MAP : map;
        this.f2134e = str;
        this.f2135f = str2;
        this.f2136g = aVar;
        HashSet hashSet = new HashSet(this.b);
        for (b bVar : this.f2133d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.a;
    }

    public final Account b() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.c;
    }

    public final Integer d() {
        return this.f2137h;
    }

    public final String e() {
        return this.f2135f;
    }

    public final String f() {
        return this.f2134e;
    }

    public final Set<Scope> g() {
        return this.b;
    }

    public final g.b.a.b.e.a h() {
        return this.f2136g;
    }

    public final void i(Integer num) {
        this.f2137h = num;
    }
}

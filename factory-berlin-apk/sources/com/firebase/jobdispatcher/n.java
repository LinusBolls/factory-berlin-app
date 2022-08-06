package com.firebase.jobdispatcher;

import android.os.Bundle;

/* compiled from: Job */
public final class n implements r {
    private final String a;
    private final String b;
    private final t c;

    /* renamed from: d  reason: collision with root package name */
    private final w f1852d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1853e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1854f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1855g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1856h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f1857i;

    /* compiled from: Job */
    public static final class b implements r {
        private final ValidationEnforcer a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public Bundle c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f1858d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public t f1859e = x.a;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f1860f = 1;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int[] f1861g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public w f1862h = w.f1881d;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f1863i = false;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f1864j = false;

        b(ValidationEnforcer validationEnforcer, r rVar) {
            this.a = validationEnforcer;
            this.f1858d = rVar.a();
            this.b = rVar.c();
            this.f1859e = rVar.d();
            this.f1864j = rVar.h();
            this.f1860f = rVar.f();
            this.f1861g = rVar.e();
            this.c = rVar.b();
            this.f1862h = rVar.g();
        }

        public String a() {
            return this.f1858d;
        }

        public Bundle b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }

        public t d() {
            return this.f1859e;
        }

        public int[] e() {
            int[] iArr = this.f1861g;
            return iArr == null ? new int[0] : iArr;
        }

        public int f() {
            return this.f1860f;
        }

        public w g() {
            return this.f1862h;
        }

        public boolean h() {
            return this.f1864j;
        }

        public boolean i() {
            return this.f1863i;
        }

        public n s() {
            this.a.c(this);
            return new n(this);
        }

        public b t(boolean z) {
            this.f1863i = z;
            return this;
        }
    }

    public String a() {
        return this.b;
    }

    public Bundle b() {
        return this.f1857i;
    }

    public String c() {
        return this.a;
    }

    public t d() {
        return this.c;
    }

    public int[] e() {
        return this.f1855g;
    }

    public int f() {
        return this.f1853e;
    }

    public w g() {
        return this.f1852d;
    }

    public boolean h() {
        return this.f1854f;
    }

    public boolean i() {
        return this.f1856h;
    }

    private n(b bVar) {
        this.a = bVar.b;
        this.f1857i = bVar.c == null ? null : new Bundle(bVar.c);
        this.b = bVar.f1858d;
        this.c = bVar.f1859e;
        this.f1852d = bVar.f1862h;
        this.f1853e = bVar.f1860f;
        this.f1854f = bVar.f1864j;
        this.f1855g = bVar.f1861g != null ? bVar.f1861g : new int[0];
        this.f1856h = bVar.f1863i;
    }
}

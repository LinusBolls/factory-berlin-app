package com.firebase.jobdispatcher;

import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: JobInvocation */
final class q implements r {
    private final String a;
    private final String b;
    private final t c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1865d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1866e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1867f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1868g;

    /* renamed from: h  reason: collision with root package name */
    private final w f1869h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1870i;

    /* renamed from: j  reason: collision with root package name */
    private final y f1871j;

    /* compiled from: JobInvocation */
    static final class b {
        /* access modifiers changed from: private */
        public String a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public t c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f1872d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f1873e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int[] f1874f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Bundle f1875g = new Bundle();
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public w f1876h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f1877i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public y f1878j;

        b() {
        }

        /* access modifiers changed from: package-private */
        public b k(Bundle bundle) {
            if (bundle != null) {
                this.f1875g.putAll(bundle);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public q l() {
            if (this.a != null && this.b != null && this.c != null) {
                return new q(this);
            }
            throw new IllegalArgumentException("Required fields were not populated.");
        }

        /* access modifiers changed from: package-private */
        public b m(int... iArr) {
            this.f1874f = iArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b n(int i2) {
            this.f1873e = i2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b o(boolean z) {
            this.f1872d = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b p(boolean z) {
            this.f1877i = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b q(w wVar) {
            this.f1876h = wVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b r(String str) {
            this.b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b s(String str) {
            this.a = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b t(t tVar) {
            this.c = tVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b u(y yVar) {
            this.f1878j = yVar;
            return this;
        }
    }

    public String a() {
        return this.a;
    }

    public Bundle b() {
        return this.f1868g;
    }

    public String c() {
        return this.b;
    }

    public t d() {
        return this.c;
    }

    public int[] e() {
        return this.f1867f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q.class.equals(obj.getClass())) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.a.equals(qVar.a) || !this.b.equals(qVar.b)) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f1866e;
    }

    public w g() {
        return this.f1869h;
    }

    public boolean h() {
        return this.f1865d;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public boolean i() {
        return this.f1870i;
    }

    public String toString() {
        return "JobInvocation{tag='" + JSONObject.quote(this.a) + '\'' + ", service='" + this.b + '\'' + ", trigger=" + this.c + ", recurring=" + this.f1865d + ", lifetime=" + this.f1866e + ", constraints=" + Arrays.toString(this.f1867f) + ", extras=" + this.f1868g + ", retryStrategy=" + this.f1869h + ", replaceCurrent=" + this.f1870i + ", triggerReason=" + this.f1871j + '}';
    }

    private q(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.f1869h = bVar.f1876h;
        this.f1865d = bVar.f1872d;
        this.f1866e = bVar.f1873e;
        this.f1867f = bVar.f1874f;
        this.f1868g = bVar.f1875g;
        this.f1870i = bVar.f1877i;
        this.f1871j = bVar.f1878j;
    }
}

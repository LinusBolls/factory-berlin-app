package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavArgument */
public final class h {
    private final v a;
    private final boolean b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1063d;

    /* compiled from: NavArgument */
    public static final class a {
        private v<?> a;
        private boolean b = false;
        private Object c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1064d = false;

        public h a() {
            if (this.a == null) {
                this.a = v.e(this.c);
            }
            return new h(this.a, this.b, this.c, this.f1064d);
        }

        public a b(Object obj) {
            this.c = obj;
            this.f1064d = true;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(v<?> vVar) {
            this.a = vVar;
            return this;
        }
    }

    h(v<?> vVar, boolean z, Object obj, boolean z2) {
        if (!vVar.f() && z) {
            throw new IllegalArgumentException(vVar.c() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.a = vVar;
            this.b = z;
            this.f1063d = obj;
            this.c = z2;
        } else {
            throw new IllegalArgumentException("Argument with type " + vVar.c() + " has null value but is not nullable.");
        }
    }

    public Object a() {
        return this.f1063d;
    }

    public v<?> b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void e(String str, Bundle bundle) {
        if (this.c) {
            this.a.i(bundle, str, this.f1063d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.b != hVar.b || this.c != hVar.c || !this.a.equals(hVar.a)) {
            return false;
        }
        Object obj2 = this.f1063d;
        if (obj2 != null) {
            return obj2.equals(hVar.f1063d);
        }
        if (hVar.f1063d == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str, Bundle bundle) {
        if (!this.b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.f1063d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}

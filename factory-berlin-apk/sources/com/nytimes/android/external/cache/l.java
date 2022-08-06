package com.nytimes.android.external.cache;

import java.util.Arrays;

/* compiled from: MoreObjects */
public final class l {

    /* compiled from: MoreObjects */
    public static final class b {
        private final String a;
        private a b;
        private a c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4756d;

        /* compiled from: MoreObjects */
        private static final class a {
            String a;
            Object b;
            a c;

            private a() {
            }
        }

        private a d() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private b e(Object obj) {
            d().b = obj;
            return this;
        }

        private b f(String str, Object obj) {
            a d2 = d();
            d2.b = obj;
            o.a(str);
            d2.a = str;
            return this;
        }

        public b a(String str, int i2) {
            f(str, String.valueOf(i2));
            return this;
        }

        public b b(String str, long j2) {
            f(str, String.valueOf(j2));
            return this;
        }

        public b c(String str, Object obj) {
            f(str, obj);
            return this;
        }

        public b g(Object obj) {
            e(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f4756d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                Object obj = aVar.b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString.substring(1, deepToString.length() - 1));
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.b = aVar;
            this.c = aVar;
            this.f4756d = false;
            o.a(str);
            this.a = str;
        }
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        o.a(t2);
        return t2;
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}

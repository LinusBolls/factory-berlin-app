package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.g;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class m {

    @AutoValue.Builder
    public static abstract class a {
        public a a(int i2) {
            e(Integer.valueOf(i2));
            return this;
        }

        public abstract a b(long j2);

        public abstract a c(k kVar);

        public abstract a d(p pVar);

        /* access modifiers changed from: package-private */
        public abstract a e(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a f(String str);

        public abstract a g(List<l> list);

        public abstract m h();

        public abstract a i(long j2);

        public a j(String str) {
            f(str);
            return this;
        }
    }

    public static a a() {
        return new g.b();
    }

    public abstract k b();

    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}

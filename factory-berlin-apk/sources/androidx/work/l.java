package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface l {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0048b b = new b.C0048b();

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: androidx.work.l$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0048b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0048b() {
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}

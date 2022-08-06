package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: g  reason: collision with root package name */
    private Context f1555g;

    /* renamed from: h  reason: collision with root package name */
    private WorkerParameters f1556h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1557i;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0040a extends a {
            private final e a;

            public C0040a() {
                this(e.c);
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0040a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0040a) obj).a);
            }

            public int hashCode() {
                return (C0040a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }

            public C0040a(e eVar) {
                this.a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final e a;

            public c() {
                this(e.c);
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public c(e eVar) {
                this.a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0040a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f1555g = context;
            this.f1556h = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.f1555g;
    }

    public Executor b() {
        return this.f1556h.a();
    }

    public final UUID e() {
        return this.f1556h.b();
    }

    public final e f() {
        return this.f1556h.c();
    }

    public androidx.work.impl.utils.k.a g() {
        return this.f1556h.d();
    }

    public s h() {
        return this.f1556h.e();
    }

    public final boolean i() {
        return this.f1557i;
    }

    public void j() {
    }

    public final void k() {
        this.f1557i = true;
    }

    public abstract g.b.b.a.a.a<a> l();

    public final void m() {
        j();
    }
}

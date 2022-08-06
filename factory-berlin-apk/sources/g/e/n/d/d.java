package g.e.n.d;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: AuthenticationResponse.kt */
public abstract class d {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: AuthenticationResponse.kt */
    public static final class a {
        private a() {
        }

        public final d a(g.d.a.e.c cVar) {
            k.e(cVar, "userLoginStatus");
            int i2 = c.a[cVar.ordinal()];
            if (i2 == 1) {
                return new c(false);
            }
            if (i2 == 2) {
                return new c(true);
            }
            if (i2 == 3) {
                return b.c.c;
            }
            if (i2 == 4) {
                return b.C0713d.c;
            }
            if (i2 == 5) {
                return b.C0712b.c;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AuthenticationResponse.kt */
    public static abstract class b extends d {

        /* compiled from: AuthenticationResponse.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: g.e.n.d.d$b$b  reason: collision with other inner class name */
        /* compiled from: AuthenticationResponse.kt */
        public static final class C0712b extends b {
            private static final String b = "Authentication Failed: Invalid Credentials";
            public static final C0712b c = new C0712b();

            private C0712b() {
                super((DefaultConstructorMarker) null);
            }

            public String a() {
                return b;
            }
        }

        /* compiled from: AuthenticationResponse.kt */
        public static final class c extends b {
            private static final String b = "Authentication Failed: No Network";
            public static final c c = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public String a() {
                return b;
            }
        }

        /* renamed from: g.e.n.d.d$b$d  reason: collision with other inner class name */
        /* compiled from: AuthenticationResponse.kt */
        public static final class C0713d extends b {
            private static final String b = "Authentication Failed: Server Error";
            public static final C0713d c = new C0713d();

            private C0713d() {
                super((DefaultConstructorMarker) null);
            }

            public String a() {
                return b;
            }
        }

        static {
            new a((DefaultConstructorMarker) null);
        }

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public abstract String a();

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AuthenticationResponse.kt */
    public static final class c extends d {
        private final boolean b;

        public c(boolean z) {
            super((DefaultConstructorMarker) null);
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.b == ((c) obj).b;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Successful(shouldChangePassword=" + this.b + ")";
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

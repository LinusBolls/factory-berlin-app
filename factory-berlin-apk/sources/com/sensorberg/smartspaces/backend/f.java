package com.sensorberg.smartspaces.backend;

import kotlin.jvm.internal.k;

/* compiled from: BackendStatus.kt */
public abstract class f {

    /* compiled from: BackendStatus.kt */
    public static final class a extends f {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((DefaultConstructorMarker) null);
            k.e(str, "message");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "EncryptionFailed(message=" + this.a + ")";
        }
    }

    /* compiled from: BackendStatus.kt */
    public static final class b extends f {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            k.e(str, "message");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "ForceLogout(message=" + this.a + ")";
        }
    }

    /* compiled from: BackendStatus.kt */
    public static final class c extends f {
        public static final c a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BackendStatus.kt */
    public static final class d extends f {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super((DefaultConstructorMarker) null);
            k.e(str, "message");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && k.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "LoginFailed(message=" + this.a + ")";
        }
    }

    /* compiled from: BackendStatus.kt */
    public static final class e extends f {
        public static final e a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.f$f  reason: collision with other inner class name */
    /* compiled from: BackendStatus.kt */
    public static final class C0185f extends f {
        public static final C0185f a = new C0185f();

        private C0185f() {
            super((DefaultConstructorMarker) null);
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

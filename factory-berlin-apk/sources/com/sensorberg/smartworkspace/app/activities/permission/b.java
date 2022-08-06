package com.sensorberg.smartworkspace.app.activities.permission;

import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: PermissionState.kt */
public abstract class b {

    /* compiled from: PermissionState.kt */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.activities.permission.b$b  reason: collision with other inner class name */
    /* compiled from: PermissionState.kt */
    public static final class C0427b extends b {
        public static final C0427b a = new C0427b();

        private C0427b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PermissionState.kt */
    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PermissionState.kt */
    public static final class d extends b {
        private final Set<g.e.l.a> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Set<? extends g.e.l.a> set) {
            super((DefaultConstructorMarker) null);
            k.e(set, "nonGrantedPermissions");
            this.a = set;
        }

        public final Set<g.e.l.a> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && k.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Set<g.e.l.a> set = this.a;
            if (set != null) {
                return set.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "NotGranted(nonGrantedPermissions=" + this.a + ")";
        }
    }

    /* compiled from: PermissionState.kt */
    public static final class e extends b {
        public static final e a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PermissionState.kt */
    public static final class f extends b {
        public static final f a = new f();

        private f() {
            super((DefaultConstructorMarker) null);
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

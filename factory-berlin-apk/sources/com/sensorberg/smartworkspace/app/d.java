package com.sensorberg.smartworkspace.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: MainNavigationDirections.kt */
public final class d {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: MainNavigationDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(String str) {
            return new b(str);
        }

        public final p b() {
            return new androidx.navigation.a(R.id.toDoorFragment);
        }

        public final p c(LockerErrorFragment.Arguments arguments) {
            k.e(arguments, "args");
            return new c(arguments);
        }

        public final p d() {
            return new androidx.navigation.a(R.id.toLockerFragment);
        }

        public final p e(String str, String str2) {
            k.e(str, "oauthId");
            k.e(str2, "baseUrl");
            return new C0429d(str, str2);
        }

        public final p f() {
            return new androidx.navigation.a(R.id.toNotificationFragment);
        }

        public final p g(Openable openable, String str) {
            return new e(openable, str);
        }

        public final p h() {
            return new androidx.navigation.a(R.id.toRoomsFragment);
        }

        public final p i() {
            return new androidx.navigation.a(R.id.toSettingsFragment);
        }

        public final p j() {
            return new androidx.navigation.a(R.id.toSpaceOverviewFragment);
        }

        public final p k(String str) {
            k.e(str, "url");
            return new f(str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MainNavigationDirections.kt */
    private static final class b implements p {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("itemId", this.a);
            return bundle;
        }

        public int b() {
            return R.id.toAlarmFragment;
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
            return "ToAlarmFragment(itemId=" + this.a + ")";
        }
    }

    /* compiled from: MainNavigationDirections.kt */
    private static final class c implements p {
        private final LockerErrorFragment.Arguments a;

        public c(LockerErrorFragment.Arguments arguments) {
            k.e(arguments, "args");
            this.a = arguments;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(LockerErrorFragment.Arguments.class)) {
                LockerErrorFragment.Arguments arguments = this.a;
                if (arguments != null) {
                    bundle.putParcelable("args", arguments);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                }
            } else if (Serializable.class.isAssignableFrom(LockerErrorFragment.Arguments.class)) {
                LockerErrorFragment.Arguments arguments2 = this.a;
                if (arguments2 != null) {
                    bundle.putSerializable("args", (Serializable) arguments2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
                }
            } else {
                throw new UnsupportedOperationException(LockerErrorFragment.Arguments.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int b() {
            return R.id.toLockerError;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            LockerErrorFragment.Arguments arguments = this.a;
            if (arguments != null) {
                return arguments.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "ToLockerError(args=" + this.a + ")";
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.d$d  reason: collision with other inner class name */
    /* compiled from: MainNavigationDirections.kt */
    private static final class C0429d implements p {
        private final String a;
        private final String b;

        public C0429d(String str, String str2) {
            k.e(str, "oauthId");
            k.e(str2, "baseUrl");
            this.a = str;
            this.b = str2;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("oauthId", this.a);
            bundle.putString("baseUrl", this.b);
            return bundle;
        }

        public int b() {
            return R.id.toNoiiseFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0429d)) {
                return false;
            }
            C0429d dVar = (C0429d) obj;
            return k.a(this.a, dVar.a) && k.a(this.b, dVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ToNoiiseFragment(oauthId=" + this.a + ", baseUrl=" + this.b + ")";
        }
    }

    /* compiled from: MainNavigationDirections.kt */
    private static final class e implements p {
        private final Openable a;
        private final String b;

        public e(Openable openable, String str) {
            this.a = openable;
            this.b = str;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(Openable.class)) {
                bundle.putParcelable("openable", this.a);
            } else if (Serializable.class.isAssignableFrom(Openable.class)) {
                bundle.putSerializable("openable", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(Openable.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("unitId", this.b);
            return bundle;
        }

        public int b() {
            return R.id.toOpenDoorFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k.a(this.a, eVar.a) && k.a(this.b, eVar.b);
        }

        public int hashCode() {
            Openable openable = this.a;
            int i2 = 0;
            int hashCode = (openable != null ? openable.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ToOpenDoorFragment(openable=" + this.a + ", unitId=" + this.b + ")";
        }
    }

    /* compiled from: MainNavigationDirections.kt */
    private static final class f implements p {
        private final String a;

        public f(String str) {
            k.e(str, "url");
            this.a = str;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("url", this.a);
            return bundle;
        }

        public int b() {
            return R.id.toWebViewFragment;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && k.a(this.a, ((f) obj).a);
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
            return "ToWebViewFragment(url=" + this.a + ")";
        }
    }
}

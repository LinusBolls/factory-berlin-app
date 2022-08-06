package com.sensorberg.noiise;

import android.os.Bundle;
import androidx.navigation.e;
import kotlin.jvm.internal.k;

/* compiled from: NoiiseFragmentArgs.kt */
public final class a implements e {
    public static final C0162a c = new C0162a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;

    /* renamed from: com.sensorberg.noiise.a$a  reason: collision with other inner class name */
    /* compiled from: NoiiseFragmentArgs.kt */
    public static final class C0162a {
        private C0162a() {
        }

        public final a a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("oauthId")) {
                String string = bundle.getString("oauthId");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"oauthId\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("baseUrl")) {
                    String string2 = bundle.getString("baseUrl");
                    if (string2 != null) {
                        return new a(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"baseUrl\" is marked as non-null but was passed a null value.");
                } else {
                    throw new IllegalArgumentException("Required argument \"baseUrl\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"oauthId\" is missing and does not have an android:defaultValue");
            }
        }

        public /* synthetic */ C0162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(String str, String str2) {
        k.e(str, "oauthId");
        k.e(str2, "baseUrl");
        this.a = str;
        this.b = str2;
    }

    public static final a fromBundle(Bundle bundle) {
        return c.a(bundle);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && k.a(this.b, aVar.b);
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
        return "NoiiseFragmentArgs(oauthId=" + this.a + ", baseUrl=" + this.b + ")";
    }
}

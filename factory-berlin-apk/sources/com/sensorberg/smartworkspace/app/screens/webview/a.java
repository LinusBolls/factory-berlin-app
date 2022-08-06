package com.sensorberg.smartworkspace.app.screens.webview;

import android.os.Bundle;
import androidx.navigation.e;
import kotlin.jvm.internal.k;

/* compiled from: WebViewFragmentArgs.kt */
public final class a implements e {
    public static final C0536a b = new C0536a((DefaultConstructorMarker) null);
    private final String a;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.webview.a$a  reason: collision with other inner class name */
    /* compiled from: WebViewFragmentArgs.kt */
    public static final class C0536a {
        private C0536a() {
        }

        public final a a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("url")) {
                String string = bundle.getString("url");
                if (string != null) {
                    return new a(string);
                }
                throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }

        public /* synthetic */ C0536a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(String str) {
        k.e(str, "url");
        this.a = str;
    }

    public static final a fromBundle(Bundle bundle) {
        return b.a(bundle);
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
        return "WebViewFragmentArgs(url=" + this.a + ")";
    }
}

package com.sensorberg.smartworkspace.app.screens.locker.error;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerErrorFragmentArgs.kt */
public final class a implements e {
    public static final C0511a b = new C0511a((DefaultConstructorMarker) null);
    private final LockerErrorFragment.Arguments a;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.error.a$a  reason: collision with other inner class name */
    /* compiled from: LockerErrorFragmentArgs.kt */
    public static final class C0511a {
        private C0511a() {
        }

        public final a a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (!bundle.containsKey("args")) {
                throw new IllegalArgumentException("Required argument \"args\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(LockerErrorFragment.Arguments.class) || Serializable.class.isAssignableFrom(LockerErrorFragment.Arguments.class)) {
                LockerErrorFragment.Arguments arguments = (LockerErrorFragment.Arguments) bundle.get("args");
                if (arguments != null) {
                    return new a(arguments);
                }
                throw new IllegalArgumentException("Argument \"args\" is marked as non-null but was passed a null value.");
            } else {
                throw new UnsupportedOperationException(LockerErrorFragment.Arguments.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ C0511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(LockerErrorFragment.Arguments arguments) {
        k.e(arguments, "args");
        this.a = arguments;
    }

    public static final a fromBundle(Bundle bundle) {
        return b.a(bundle);
    }

    public final LockerErrorFragment.Arguments a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && k.a(this.a, ((a) obj).a);
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
        return "LockerErrorFragmentArgs(args=" + this.a + ")";
    }
}

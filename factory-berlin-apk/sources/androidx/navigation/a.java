package androidx.navigation;

import android.os.Bundle;

/* compiled from: ActionOnlyNavDirections */
public final class a implements p {
    private final int a;

    public a(int i2) {
        this.a = i2;
    }

    public Bundle a() {
        return new Bundle();
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && b() == ((a) obj).b();
    }

    public int hashCode() {
        return 31 + b();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + b() + ")";
    }
}

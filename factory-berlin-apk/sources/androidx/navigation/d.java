package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavAction */
public final class d {
    private final int a;
    private u b;
    private Bundle c;

    public d(int i2) {
        this(i2, (u) null);
    }

    public Bundle a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public u c() {
        return this.b;
    }

    public void d(Bundle bundle) {
        this.c = bundle;
    }

    public void e(u uVar) {
        this.b = uVar;
    }

    public d(int i2, u uVar) {
        this(i2, uVar, (Bundle) null);
    }

    public d(int i2, u uVar, Bundle bundle) {
        this.a = i2;
        this.b = uVar;
        this.c = bundle;
    }
}

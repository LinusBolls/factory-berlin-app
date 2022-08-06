package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.c;
import java.util.Collections;
import java.util.WeakHashMap;

public abstract class d {

    public interface a {
        void i(int i2);

        void o(Bundle bundle);
    }

    public interface b {
        void l(com.google.android.gms.common.b bVar);
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public <A extends a.b, T extends c<? extends g, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }
}

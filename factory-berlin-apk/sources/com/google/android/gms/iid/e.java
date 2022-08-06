package com.google.android.gms.iid;

public abstract class e {
    private static e a;

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            if (a == null) {
                a = new a();
            }
            eVar = a;
        }
        return eVar;
    }

    public abstract f<Boolean> a(String str, boolean z);
}

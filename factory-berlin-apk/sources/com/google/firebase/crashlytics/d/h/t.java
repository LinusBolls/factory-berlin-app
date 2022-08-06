package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.q.i.b;

/* compiled from: DataTransportState */
public enum t {
    NONE,
    JAVA_ONLY,
    ALL;

    static t a(b bVar) {
        boolean z = true;
        boolean z2 = bVar.f4138g == 2;
        if (bVar.f4139h != 2) {
            z = false;
        }
        return f(z2, z);
    }

    static t f(boolean z, boolean z2) {
        if (!z) {
            return NONE;
        }
        if (!z2) {
            return JAVA_ONLY;
        }
        return ALL;
    }
}

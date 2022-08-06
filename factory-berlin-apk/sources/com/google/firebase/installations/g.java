package com.google.firebase.installations;

import com.google.android.gms.tasks.h;
import com.google.firebase.installations.k.d;

/* compiled from: GetIdListener */
class g implements i {
    final h<String> a;

    public g(h<String> hVar) {
        this.a = hVar;
    }

    public boolean a(d dVar, Exception exc) {
        return false;
    }

    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}

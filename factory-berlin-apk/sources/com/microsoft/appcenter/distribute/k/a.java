package com.microsoft.appcenter.distribute.k;

import com.microsoft.appcenter.k.d.d;

/* compiled from: DistributeInfoTracker */
public class a extends com.microsoft.appcenter.j.a {
    private String a;

    public a(String str) {
        this.a = str;
    }

    public synchronized void a(d dVar, String str) {
        if (this.a != null) {
            dVar.g(this.a);
        }
    }

    public synchronized void h() {
        this.a = null;
    }

    public synchronized void i(String str) {
        this.a = str;
    }
}

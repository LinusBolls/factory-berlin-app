package com.google.firebase.components;

import com.google.firebase.e.a;
import com.google.firebase.e.b;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class o implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final Map.Entry f3881g;

    /* renamed from: h  reason: collision with root package name */
    private final a f3882h;

    private o(Map.Entry entry, a aVar) {
        this.f3881g = entry;
        this.f3882h = aVar;
    }

    public static Runnable a(Map.Entry entry, a aVar) {
        return new o(entry, aVar);
    }

    public void run() {
        ((b) this.f3881g.getKey()).a(this.f3882h);
    }
}

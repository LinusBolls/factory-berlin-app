package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class c implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final d f4173g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4174h;

    private c(d dVar, boolean z) {
        this.f4173g = dVar;
        this.f4174h = z;
    }

    public static Runnable a(d dVar, boolean z) {
        return new c(dVar, z);
    }

    public void run() {
        this.f4173g.c(this.f4174h);
    }
}

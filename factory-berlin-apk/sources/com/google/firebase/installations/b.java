package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class b implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final d f4172g;

    private b(d dVar) {
        this.f4172g = dVar;
    }

    public static Runnable a(d dVar) {
        return new b(dVar);
    }

    public void run() {
        this.f4172g.d(false);
    }
}

package com.google.firebase.crashlytics.d.q.i;

/* compiled from: SettingsData */
public class f implements e {
    public final b a;
    public final d b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4140d;

    public f(long j2, b bVar, d dVar, c cVar, int i2, int i3) {
        this.f4140d = j2;
        this.a = bVar;
        this.b = dVar;
        this.c = cVar;
    }

    public d a() {
        return this.b;
    }

    public c b() {
        return this.c;
    }

    public b c() {
        return this.a;
    }

    public long d() {
        return this.f4140d;
    }

    public boolean e(long j2) {
        return this.f4140d < j2;
    }
}

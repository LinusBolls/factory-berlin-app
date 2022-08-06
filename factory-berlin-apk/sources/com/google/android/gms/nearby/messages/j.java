package com.google.android.gms.nearby.messages;

public final class j {
    private final h a;
    private final d b;
    private final i c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3315d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3316e;

    public static class a {
        private h a = h.o;
        private d b = d.f3248m;
        private i c;

        public j a() {
            return new j(this.a, this.b, this.c, false, 0, (p) null);
        }

        public a b(d dVar) {
            this.b = dVar;
            return this;
        }

        public a c(h hVar) {
            this.a = hVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    private j(h hVar, d dVar, i iVar, boolean z, int i2) {
        this.a = hVar;
        this.b = dVar;
        this.c = iVar;
        this.f3315d = z;
        this.f3316e = i2;
    }

    /* synthetic */ j(h hVar, d dVar, i iVar, boolean z, int i2, p pVar) {
        this(hVar, dVar, iVar, false, 0);
    }

    public final i a() {
        return this.c;
    }

    public final d b() {
        return this.b;
    }

    public final h c() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("SubscribeOptions{strategy=");
        sb.append(valueOf);
        sb.append(", filter=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}

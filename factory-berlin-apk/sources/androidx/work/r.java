package androidx.work;

import androidx.work.impl.l.j;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkRequest */
public abstract class r {
    private UUID a;
    private j b;
    private Set<String> c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a, W extends r> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        j c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f1801d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new j(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f1801d.add(str);
            return d();
        }

        public final W b() {
            W c2 = c();
            this.b = UUID.randomUUID();
            j jVar = new j(this.c);
            this.c = jVar;
            jVar.a = this.b.toString();
            return c2;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(a aVar, long j2, TimeUnit timeUnit) {
            this.a = true;
            j jVar = this.c;
            jVar.f1730l = aVar;
            jVar.e(timeUnit.toMillis(j2));
            return d();
        }

        public final B f(c cVar) {
            this.c.f1728j = cVar;
            return d();
        }

        public B g(long j2, TimeUnit timeUnit) {
            this.c.f1725g = timeUnit.toMillis(j2);
            return d();
        }

        public final B h(e eVar) {
            this.c.f1723e = eVar;
            return d();
        }
    }

    protected r(UUID uuid, j jVar, Set<String> set) {
        this.a = uuid;
        this.b = jVar;
        this.c = set;
    }

    public UUID a() {
        return this.a;
    }

    public String b() {
        return this.a.toString();
    }

    public Set<String> c() {
        return this.c;
    }

    public j d() {
        return this.b;
    }
}

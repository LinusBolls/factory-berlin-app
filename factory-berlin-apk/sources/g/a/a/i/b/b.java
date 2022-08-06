package g.a.a.i.b;

import g.a.a.h.r.a.d;
import g.a.a.h.r.a.e;
import g.a.a.i.b.j.a;
import g.a.a.i.b.j.c;
import java.io.File;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.b0;
import l.z;

/* compiled from: DiskLruHttpCacheStore */
public final class b implements e {
    private final c a;
    private final File b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private g.a.a.i.b.j.a f9089d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadWriteLock f9090e;

    /* compiled from: DiskLruHttpCacheStore */
    class a implements g.a.a.h.r.a.c {
        final /* synthetic */ a.f a;

        a(b bVar, a.f fVar) {
            this.a = fVar;
        }

        public b0 a() {
            return this.a.a(1);
        }

        public b0 b() {
            return this.a.a(0);
        }

        public void close() {
            this.a.close();
        }
    }

    /* renamed from: g.a.a.i.b.b$b  reason: collision with other inner class name */
    /* compiled from: DiskLruHttpCacheStore */
    class C0604b implements d {
        final /* synthetic */ a.d a;

        C0604b(b bVar, a.d dVar) {
            this.a = dVar;
        }

        public void a() {
            this.a.a();
        }

        public z b() {
            return this.a.d(0);
        }

        public z c() {
            return this.a.d(1);
        }

        public void commit() {
            this.a.b();
        }
    }

    public b(File file, long j2) {
        this(c.a, file, j2);
    }

    private g.a.a.i.b.j.a c() {
        return g.a.a.i.b.j.a.j(this.a, this.b, 99991, 2, this.c);
    }

    public g.a.a.h.r.a.c a(String str) {
        this.f9090e.readLock().lock();
        try {
            a.f o = this.f9089d.o(str);
            if (o == null) {
                return null;
            }
            return new a(this, o);
        } finally {
            this.f9090e.readLock().unlock();
        }
    }

    public d b(String str) {
        this.f9090e.readLock().lock();
        try {
            a.d l2 = this.f9089d.l(str);
            if (l2 == null) {
                return null;
            }
            return new C0604b(this, l2);
        } finally {
            this.f9090e.readLock().unlock();
        }
    }

    public void remove(String str) {
        this.f9090e.readLock().lock();
        try {
            this.f9089d.U(str);
        } finally {
            this.f9090e.readLock().unlock();
        }
    }

    public b(c cVar, File file, long j2) {
        this.f9090e = new ReentrantReadWriteLock();
        this.a = cVar;
        this.b = file;
        this.c = j2;
        this.f9089d = c();
    }
}

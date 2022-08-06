package androidx.work;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    private UUID a;
    private e b;
    private Executor c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.work.impl.utils.k.a f1560d;

    /* renamed from: e  reason: collision with root package name */
    private s f1561e;

    public static class a {
        public a() {
            Collections.emptyList();
            Collections.emptyList();
        }
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, androidx.work.impl.utils.k.a aVar2, s sVar) {
        this.a = uuid;
        this.b = eVar;
        new HashSet(collection);
        this.c = executor;
        this.f1560d = aVar2;
        this.f1561e = sVar;
    }

    public Executor a() {
        return this.c;
    }

    public UUID b() {
        return this.a;
    }

    public e c() {
        return this.b;
    }

    public androidx.work.impl.utils.k.a d() {
        return this.f1560d;
    }

    public s e() {
        return this.f1561e;
    }
}

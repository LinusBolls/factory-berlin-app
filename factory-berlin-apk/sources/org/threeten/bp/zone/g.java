package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer */
public abstract class g {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<g> b = new AtomicReference<>();

    /* compiled from: ZoneRulesInitializer */
    static class a extends g {
        a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            Class<h> cls = h.class;
            Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    h.f((h) it.next());
                } catch (ServiceConfigurationError e2) {
                    if (!(e2.getCause() instanceof SecurityException)) {
                        throw e2;
                    }
                }
            }
        }
    }

    static void a() {
        if (!a.getAndSet(true)) {
            b.compareAndSet((Object) null, new a());
            b.get().b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public static void c(g gVar) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!b.compareAndSet((Object) null, gVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();
}

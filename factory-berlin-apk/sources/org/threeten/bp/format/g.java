package org.threeten.bp.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.temporal.i;

/* compiled from: DateTimeTextProvider */
public abstract class g {
    /* access modifiers changed from: private */
    public static final AtomicReference<g> a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider */
    static class a {
        static final g a = a();

        static g a() {
            g.a.compareAndSet((Object) null, new m());
            return (g) g.a.get();
        }
    }

    static g b() {
        return a.a;
    }

    public abstract String c(i iVar, long j2, n nVar, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> d(i iVar, n nVar, Locale locale);
}

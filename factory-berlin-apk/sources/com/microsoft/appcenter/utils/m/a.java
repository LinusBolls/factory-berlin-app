package com.microsoft.appcenter.utils.m;

import com.microsoft.appcenter.utils.o.d;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

/* compiled from: SessionContext */
public class a {
    private static a c;
    private final NavigableMap<Long, C0130a> a = new TreeMap();
    private final long b = System.currentTimeMillis();

    /* renamed from: com.microsoft.appcenter.utils.m.a$a  reason: collision with other inner class name */
    /* compiled from: SessionContext */
    public static class C0130a {
        private final long a;
        private final UUID b;
        private final long c;

        C0130a(long j2, UUID uuid, long j3) {
            this.a = j2;
            this.b = uuid;
            this.c = j3;
        }

        public long a() {
            return this.c;
        }

        public UUID b() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return this.a;
        }

        public String toString() {
            String str = c() + "/";
            if (b() != null) {
                str = str + b();
            }
            return str + "/" + a();
        }
    }

    private a() {
        Set<String> h2 = d.h("sessions");
        if (h2 != null) {
            for (String next : h2) {
                String[] split = next.split("/", -1);
                try {
                    long parseLong = Long.parseLong(split[0]);
                    String str = split[1];
                    this.a.put(Long.valueOf(parseLong), new C0130a(parseLong, str.isEmpty() ? null : UUID.fromString(str), split.length > 2 ? Long.parseLong(split[2]) : parseLong));
                } catch (RuntimeException e2) {
                    com.microsoft.appcenter.utils.a.j("AppCenter", "Ignore invalid session in store: " + next, e2);
                }
            }
        }
        com.microsoft.appcenter.utils.a.a("AppCenter", "Loaded stored sessions: " + this.a);
        a((UUID) null);
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public synchronized void a(UUID uuid) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a.put(Long.valueOf(currentTimeMillis), new C0130a(currentTimeMillis, uuid, this.b));
        if (this.a.size() > 10) {
            this.a.pollFirstEntry();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0130a aVar : this.a.values()) {
            linkedHashSet.add(aVar.toString());
        }
        d.o("sessions", linkedHashSet);
    }

    public synchronized C0130a c(long j2) {
        Map.Entry<Long, C0130a> floorEntry = this.a.floorEntry(Long.valueOf(j2));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }
}

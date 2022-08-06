package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.auto.value.AutoValue;
import g.b.a.a.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* compiled from: SchedulerConfig */
public abstract class g {

    /* compiled from: SchedulerConfig */
    public static class a {
        private g.b.a.a.i.w.a a;
        private Map<d, b> b = new HashMap();

        public a a(d dVar, b bVar) {
            this.b.put(dVar, bVar);
            return this;
        }

        public g b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.b;
                this.b = new HashMap();
                return g.d(this.a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public a c(g.b.a.a.i.w.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    @AutoValue
    /* compiled from: SchedulerConfig */
    public static abstract class b {

        @AutoValue.Builder
        /* compiled from: SchedulerConfig */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j2);

            public abstract a c(Set<c> set);

            public abstract a d(long j2);
        }

        public static a a() {
            d.b bVar = new d.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i2, long j2) {
        int i3 = i2 - 1;
        return (long) (Math.pow(3.0d, (double) i3) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j2 > 1 ? j2 : 2) * ((long) i3)))));
    }

    public static a b() {
        return new a();
    }

    static g d(g.b.a.a.i.w.a aVar, Map<g.b.a.a.d, b> map) {
        return new c(aVar, map);
    }

    public static g f(g.b.a.a.i.w.a aVar) {
        a b2 = b();
        g.b.a.a.d dVar = g.b.a.a.d.DEFAULT;
        b.a a2 = b.a();
        a2.b(30000);
        a2.d(86400000);
        b2.a(dVar, a2.a());
        g.b.a.a.d dVar2 = g.b.a.a.d.HIGHEST;
        b.a a3 = b.a();
        a3.b(1000);
        a3.d(86400000);
        b2.a(dVar2, a3.a());
        g.b.a.a.d dVar3 = g.b.a.a.d.VERY_LOW;
        b.a a4 = b.a();
        a4.b(86400000);
        a4.d(86400000);
        a4.c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        b2.a(dVar3, a4.a());
        b2.c(aVar);
        return b2.b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, g.b.a.a.d dVar, long j2, int i2) {
        builder.setMinimumLatency(g(dVar, j2, i2));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract g.b.a.a.i.w.a e();

    public long g(g.b.a.a.d dVar, long j2, int i2) {
        long a2 = j2 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i2, bVar.b()), a2), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<g.b.a.a.d, b> h();
}

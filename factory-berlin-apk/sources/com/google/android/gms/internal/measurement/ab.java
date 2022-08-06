package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ab implements bb {
    private static final h2<Long> A;
    private static final h2<Long> B;
    private static final h2<Long> C;
    private static final h2<Long> D;
    private static final h2<Long> E;
    private static final h2<String> F;
    private static final h2<Long> G;
    private static final h2<Long> a;
    private static final h2<Long> b;
    private static final h2<String> c;

    /* renamed from: d  reason: collision with root package name */
    private static final h2<String> f2226d;

    /* renamed from: e  reason: collision with root package name */
    private static final h2<Long> f2227e;

    /* renamed from: f  reason: collision with root package name */
    private static final h2<Long> f2228f;

    /* renamed from: g  reason: collision with root package name */
    private static final h2<Long> f2229g;

    /* renamed from: h  reason: collision with root package name */
    private static final h2<Long> f2230h;

    /* renamed from: i  reason: collision with root package name */
    private static final h2<Long> f2231i;

    /* renamed from: j  reason: collision with root package name */
    private static final h2<Long> f2232j;

    /* renamed from: k  reason: collision with root package name */
    private static final h2<Long> f2233k;

    /* renamed from: l  reason: collision with root package name */
    private static final h2<Long> f2234l;

    /* renamed from: m  reason: collision with root package name */
    private static final h2<Long> f2235m;

    /* renamed from: n  reason: collision with root package name */
    private static final h2<Long> f2236n;
    private static final h2<Long> o;
    private static final h2<Long> p;
    private static final h2<Long> q;
    private static final h2<Long> r;
    private static final h2<Long> s;
    private static final h2<Long> t;
    private static final h2<Long> u;
    private static final h2<Long> v;
    private static final h2<Long> w;
    private static final h2<Long> x;
    private static final h2<Long> y;
    private static final h2<Long> z;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.b("measurement.ad_id_cache_time", 10000);
        b = q2Var.b("measurement.config.cache_time", 86400000);
        q2Var.c("measurement.log_tag", "FA");
        c = q2Var.c("measurement.config.url_authority", "app-measurement.com");
        f2226d = q2Var.c("measurement.config.url_scheme", "https");
        f2227e = q2Var.b("measurement.upload.debug_upload_interval", 1000);
        f2228f = q2Var.b("measurement.lifetimevalue.max_currency_tracked", 4);
        f2229g = q2Var.b("measurement.store.max_stored_events_per_app", 100000);
        f2230h = q2Var.b("measurement.experiment.max_ids", 50);
        f2231i = q2Var.b("measurement.audience.filter_result_max_count", 200);
        f2232j = q2Var.b("measurement.alarm_manager.minimum_interval", 60000);
        f2233k = q2Var.b("measurement.upload.minimum_delay", 500);
        f2234l = q2Var.b("measurement.monitoring.sample_period_millis", 86400000);
        f2235m = q2Var.b("measurement.upload.realtime_upload_interval", 10000);
        f2236n = q2Var.b("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        q2Var.b("measurement.config.cache_time.service", 3600000);
        o = q2Var.b("measurement.service_client.idle_disconnect_millis", 5000);
        q2Var.c("measurement.log_tag.service", "FA-SVC");
        p = q2Var.b("measurement.upload.stale_data_deletion_interval", 86400000);
        q = q2Var.b("measurement.upload.backoff_period", 43200000);
        r = q2Var.b("measurement.upload.initial_upload_delay_time", 15000);
        s = q2Var.b("measurement.upload.interval", 3600000);
        t = q2Var.b("measurement.upload.max_bundle_size", 65536);
        u = q2Var.b("measurement.upload.max_bundles", 100);
        v = q2Var.b("measurement.upload.max_conversions_per_day", 500);
        w = q2Var.b("measurement.upload.max_error_events_per_day", 1000);
        x = q2Var.b("measurement.upload.max_events_per_bundle", 1000);
        y = q2Var.b("measurement.upload.max_events_per_day", 100000);
        z = q2Var.b("measurement.upload.max_public_events_per_day", 50000);
        A = q2Var.b("measurement.upload.max_queue_time", 2419200000L);
        B = q2Var.b("measurement.upload.max_realtime_events_per_day", 10);
        C = q2Var.b("measurement.upload.max_batch_size", 65536);
        D = q2Var.b("measurement.upload.retry_count", 6);
        E = q2Var.b("measurement.upload.retry_time", 1800000);
        F = q2Var.c("measurement.upload.url", "https://app-measurement.com/a");
        G = q2Var.b("measurement.upload.window_interval", 3600000);
    }

    public final long A() {
        return A.o().longValue();
    }

    public final long B() {
        return w.o().longValue();
    }

    public final long C() {
        return E.o().longValue();
    }

    public final long D() {
        return s.o().longValue();
    }

    public final long E() {
        return o.o().longValue();
    }

    public final long F() {
        return f2233k.o().longValue();
    }

    public final long G() {
        return B.o().longValue();
    }

    public final String H() {
        return F.o();
    }

    public final long a() {
        return p.o().longValue();
    }

    public final long b() {
        return a.o().longValue();
    }

    public final long c() {
        return b.o().longValue();
    }

    public final String d() {
        return c.o();
    }

    public final String e() {
        return f2226d.o();
    }

    public final long f() {
        return f2234l.o().longValue();
    }

    public final long g() {
        return f2227e.o().longValue();
    }

    public final long i() {
        return q.o().longValue();
    }

    public final long j() {
        return f2235m.o().longValue();
    }

    public final long k() {
        return f2228f.o().longValue();
    }

    public final long l() {
        return y.o().longValue();
    }

    public final long m() {
        return f2229g.o().longValue();
    }

    public final long n() {
        return t.o().longValue();
    }

    public final long o() {
        return x.o().longValue();
    }

    public final long p() {
        return C.o().longValue();
    }

    public final long q() {
        return f2230h.o().longValue();
    }

    public final long r() {
        return G.o().longValue();
    }

    public final long s() {
        return u.o().longValue();
    }

    public final long t() {
        return z.o().longValue();
    }

    public final long u() {
        return v.o().longValue();
    }

    public final long v() {
        return f2231i.o().longValue();
    }

    public final long w() {
        return D.o().longValue();
    }

    public final long x() {
        return r.o().longValue();
    }

    public final long y() {
        return f2236n.o().longValue();
    }

    public final long z() {
        return f2232j.o().longValue();
    }
}

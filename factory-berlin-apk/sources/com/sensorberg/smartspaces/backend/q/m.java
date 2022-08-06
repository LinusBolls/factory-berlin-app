package com.sensorberg.smartspaces.backend.q;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.BeBookingInCluster;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.backend.model.ChangeUserPassword;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.backend.model.units.Actuator;
import com.sensorberg.smartspaces.backend.model.units.ActuatorBlueIdLocks;
import com.sensorberg.smartspaces.backend.model.units.ActuatorSensorbergLocks;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.backend.model.units.ConnectableBlueIdDevice;
import com.sensorberg.smartspaces.backend.model.units.ConnectableSensorbergGateway;
import g.a.a.b;
import g.a.a.h.c;
import g.a.a.h.p;
import g.a.a.i.b.f;
import g.a.a.i.b.h;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.g;
import k.i0.a;
import k.v;
import k.w;
import k.z;
import kotlin.jvm.internal.k;
import org.threeten.bp.format.c;
import retrofit2.r;

/* compiled from: Transport.kt */
public final class m {
    private static final c a;
    private static final c b;
    public static final m c = new m();

    /* compiled from: Transport.kt */
    public static final class a implements g.a.a.h.b<Long> {
        a() {
        }

        public /* bridge */ /* synthetic */ g.a.a.h.c a(Object obj) {
            return d(((Number) obj).longValue());
        }

        /* renamed from: c */
        public Long b(g.a.a.h.c<?> cVar) {
            k.e(cVar, "value");
            Long a = g.e.n.c.i.a.b.a(String.valueOf(cVar.a));
            return Long.valueOf(a != null ? a.longValue() : -1);
        }

        public g.a.a.h.c<?> d(long j2) {
            return new c.f(g.e.n.c.i.a.b.b(j2));
        }
    }

    /* compiled from: Transport.kt */
    public static final class b implements a.b {
        b() {
        }

        public void a(String str) {
            k.e(str, "message");
            n.a.a.j(str, new Object[0]);
        }
    }

    static {
        org.threeten.bp.format.c cVar = org.threeten.bp.format.c.f11507k;
        k.c(cVar);
        a = cVar;
        org.threeten.bp.format.c cVar2 = org.threeten.bp.format.c.f11504h;
        k.c(cVar2);
        b = cVar2;
    }

    private m() {
    }

    private final g.a.a.h.b<Long> b() {
        return new a();
    }

    public final g.a.a.b a(Context context, z zVar, v vVar, Map<p, ? extends g.a.a.h.b<? extends Object>> map) {
        k.e(context, "context");
        k.e(zVar, "okHttpClient");
        k.e(vVar, "baseHttpUrl");
        k.e(map, "apolloTypeAdapters");
        f fVar = new f(new g.a.a.i.b.b(new File(context.getCacheDir(), "apolloCache"), 10485760), new h());
        v.a k2 = vVar.k();
        k2.b("graphql");
        v d2 = k2.d();
        b.a a2 = g.a.a.b.a();
        a2.h(d2);
        a2.f(fVar);
        a2.a(com.sensorberg.smartspaces.backend.j.f.a.f5938h, c.b());
        for (Map.Entry next : map.entrySet()) {
            a2.a((p) next.getKey(), (g.a.a.h.b) next.getValue());
        }
        a2.g(zVar);
        g.a.a.b c2 = a2.c();
        k.d(c2, "ApolloClient.builder().a…okHttpClient)\n\t\t}.build()");
        return c2;
    }

    public final z c(Context context, g gVar, List<? extends w> list, List<? extends w> list2) {
        k.e(context, "context");
        k.e(gVar, "certificatePinner");
        k.e(list, "applicationInterceptors");
        k.e(list2, "networkInterceptors");
        z.a aVar = new z.a();
        aVar.M(true);
        aVar.f(gVar);
        for (w a2 : list) {
            aVar.a(a2);
        }
        for (w b2 : list2) {
            aVar.b(b2);
        }
        if (com.sensorberg.smartspaces.backend.a.v.a()) {
            aVar.b(new g.e.o.a.a());
        }
        if (com.sensorberg.smartspaces.backend.a.v.a()) {
            k.i0.a aVar2 = new k.i0.a(new b());
            aVar2.c(a.C0748a.BODY);
            aVar.b(aVar2);
        }
        aVar.d(new k.c(new File(context.getCacheDir(), "HttpResponseCache"), 10485760));
        aVar.g(30, TimeUnit.SECONDS);
        aVar.L(30, TimeUnit.SECONDS);
        aVar.N(30, TimeUnit.SECONDS);
        return aVar.c();
    }

    public final com.github.jasminb.jsonapi.k d() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return new com.github.jasminb.jsonapi.k(objectMapper, Actuator.class, User.class, ChangeUserPassword.class, UserDevice.class, Statistics.class, BeBooking.class, BeBookingInCluster.class, ActuatorRequest.class, ConnectableBlueIdDevice.class, ActuatorBlueIdLocks.class, ConnectableSensorbergGateway.class, ActuatorSensorbergLocks.class, BlueIdDeviceDetails.class, BeUnit.class);
    }

    public final c e(com.google.gson.f fVar, v vVar, z zVar) {
        k.e(fVar, "gson");
        k.e(vVar, "baseHttpUrl");
        k.e(zVar, "client");
        r.b bVar = new r.b();
        bVar.c(vVar);
        bVar.g(zVar);
        bVar.a(retrofit2.w.c.k.f());
        bVar.a(new com.github.jasminb.jsonapi.r.a(d()));
        bVar.a(retrofit2.w.a.a.f(fVar));
        Object b2 = bVar.d().b(c.class);
        k.d(b2, "restAdapter.create<Backe…>(BackendApi::class.java)");
        return (c) b2;
    }

    public final org.threeten.bp.format.c f() {
        return b;
    }

    public final org.threeten.bp.format.c g() {
        return a;
    }
}

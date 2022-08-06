package com.sensorberg.notifications.sdk.internal.m.b;

import android.app.Application;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.HistoryBody;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.JsonObjectAdapter;
import com.sensorberg.notifications.sdk.internal.m.a;
import com.sensorberg.notifications.sdk.internal.m.b.e.c;
import com.sensorberg.notifications.sdk.internal.m.b.e.e;
import com.sensorberg.notifications.sdk.internal.m.b.e.f;
import com.squareup.moshi.n;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import retrofit2.d;
import retrofit2.q;

/* compiled from: BackendSdkV2.kt */
public final class b implements com.sensorberg.notifications.sdk.internal.m.a {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, String> f5237f = e0.e();
    private final a a;
    private final com.sensorberg.notifications.sdk.internal.m.b.e.b b = new com.sensorberg.notifications.sdk.internal.m.b.e.b();
    private Map<String, String> c = f5237f;

    /* renamed from: d  reason: collision with root package name */
    private final n f5238d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5239e;

    /* compiled from: BackendSdkV2.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.m.b.b$b  reason: collision with other inner class name */
    /* compiled from: BackendSdkV2.kt */
    public static final class C0170b implements d<Void> {
        final /* synthetic */ l a;

        C0170b(l lVar) {
            this.a = lVar;
        }

        public void a(retrofit2.b<Void> bVar, q<Void> qVar) {
            k.f(bVar, "call");
            k.f(qVar, "response");
            this.a.o(Boolean.valueOf(qVar.e()));
        }

        public void b(retrofit2.b<Void> bVar, Throwable th) {
            k.f(bVar, "call");
            k.f(th, "t");
            this.a.o(Boolean.FALSE);
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(Application application, String str, String str2, String str3, boolean z) {
        k.f(application, "application");
        k.f(str, "baseUrl");
        k.f(str2, "apiKey");
        k.f(str3, "installId");
        this.f5239e = str2;
        n.a aVar = new n.a();
        aVar.b(JsonObjectAdapter.a);
        n c2 = aVar.c();
        k.b(c2, "Moshi.Builder().add(JsonObjectAdapter).build()");
        this.f5238d = c2;
        g.c.a.a.a(application);
        this.a = c.b.b(str, c.b.a(application, z, m.b(new com.sensorberg.notifications.sdk.internal.m.b.e.d(n.i(this.b, new c(this.f5239e), new f(application), new e(str3))))), c.b.c(this.f5238d));
    }

    public void a(List<com.sensorberg.notifications.sdk.internal.model.b> list, List<com.sensorberg.notifications.sdk.internal.model.a> list2, l<? super Boolean, x> lVar) {
        k.f(list, "actions");
        k.f(list2, "conversions");
        k.f(lVar, "callback");
        this.a.a(this.f5239e, HistoryBody.f5158e.a(list, list2)).t0(new C0170b(lVar));
    }

    public void b(Map<String, String> map) {
        Map<String, String> map2;
        if (map == null || map.isEmpty()) {
            map2 = f5237f;
        } else {
            map2 = new TreeMap<>(map);
        }
        this.c = map2;
    }

    public void c(a.C0169a aVar) {
        k.f(aVar, "callback");
        this.a.b(this.f5239e, this.c).t0(new d(aVar));
    }

    public void d(String str) {
        this.b.b(str);
    }
}

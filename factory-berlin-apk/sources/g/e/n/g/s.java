package g.e.n.g;

import android.content.Context;
import android.content.Intent;
import com.sensorberg.smartspaces.sdk.debug.DebugActivity;
import com.sensorberg.smartspaces.sdk.internal.m;
import com.sensorberg.smartspaces.sdk.internal.s.c;
import com.sensorberg.smartspaces.sdk.internal.s.e;
import g.a.a.h.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.g;
import k.v;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: SmartSpacesSdk.kt */
public interface s {

    /* compiled from: SmartSpacesSdk.kt */
    public static final class a {
        private final v a;
        private boolean b = true;
        private final Map<p, g.a.a.h.b<? extends Object>> c = new LinkedHashMap();

        /* renamed from: d  reason: collision with root package name */
        private final Context f10204d;

        /* renamed from: e  reason: collision with root package name */
        private final String f10205e;

        /* renamed from: f  reason: collision with root package name */
        private final String f10206f;

        public a(Context context, String str, String str2, String str3) {
            k.e(context, "context");
            k.e(str, "baseUrl");
            k.e(str2, "oauthId");
            k.e(str3, "certificate");
            this.f10204d = context;
            this.f10205e = str2;
            this.f10206f = str3;
            this.a = v.f10527l.f(str);
        }

        public final a a(p pVar, g.a.a.h.b<? extends Object> bVar) {
            k.e(pVar, "type");
            k.e(bVar, "adapter");
            this.c.put(pVar, bVar);
            return this;
        }

        public final s b() {
            if (this.a != null) {
                g.a aVar = new g.a();
                aVar.a(this.a.i(), this.f10206f);
                g b2 = aVar.b();
                Context context = this.f10204d;
                c cVar = new c(context, e.c(context, this.a, this.f10205e, b2, this.c), (kotlin.e0.c.a) null, 4, (DefaultConstructorMarker) null);
                Context applicationContext = this.f10204d.getApplicationContext();
                k.d(applicationContext, "context.applicationContext");
                return new m(applicationContext, this.b, cVar.k(), cVar.j(), cVar.d(), cVar.f(), cVar.i(), cVar.e(), cVar.h(), cVar.c(), cVar.g());
            }
            throw new IllegalArgumentException(("not a valid http url: " + this.a).toString());
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    /* compiled from: SmartSpacesSdk.kt */
    public static final class b {
        public static final b a = new b();

        private b() {
        }

        public final void a(Context context) {
            k.e(context, "context");
            Intent intent = new Intent(context, DebugActivity.class);
            intent.addFlags(268435456);
            x xVar = x.a;
            context.startActivity(intent);
        }
    }

    void c(List<? extends r> list);

    void d(r rVar);

    g e();

    y f();

    j g();

    a h();

    x i();

    v j();

    f k();

    c l();
}

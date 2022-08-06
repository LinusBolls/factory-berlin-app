package g.e.j.a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import com.sensorberg.notifications.sdk.internal.c;
import com.sensorberg.notifications.sdk.internal.h;
import com.sensorberg.notifications.sdk.internal.i;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: NotificationsSdk.kt */
public interface d {
    public static final b b = b.a;

    /* compiled from: NotificationsSdk.kt */
    public static final class a {
        private boolean a;
        private String b = "";
        private String c = "https://portal.sensorberg-cdn.com";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final Application f9826d;

        /* renamed from: g.e.j.a.d$a$a  reason: collision with other inner class name */
        /* compiled from: NotificationsSdk.kt */
        static final class C0674a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f9827g;

            C0674a(a aVar) {
                this.f9827g = aVar;
            }

            public final void run() {
                n.a.a.j("Empty NotificationsSdk is making sure everything is cleared", new Object[0]);
                WorkUtils.f5455d.a();
                j.o.b(false, this.f9827g.f9826d);
                j.o.d(this.f9827g.f9826d);
                SdkDatabase a = SdkDatabase.f5369l.a(this.f9827g.f9826d);
                a.d();
                a.e();
            }
        }

        public a(Application application) {
            k.f(application, "app");
            this.f9826d = application;
        }

        public final d b() {
            boolean z = true;
            if (!(this.b.length() == 0)) {
                if ((this.c.length() == 0) || !URLUtil.isNetworkUrl(this.c)) {
                    throw new IllegalArgumentException("baseUrl is invalid - use baseUrl to provide a valid baseUrl");
                }
                if (Build.VERSION.SDK_INT < 18) {
                    z = false;
                }
                boolean e2 = com.sensorberg.notifications.sdk.internal.d.e(this.f9826d);
                if (!z || !e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("NotificationsSdk disabled. Android Version(");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append("). Google Play Services (");
                    sb.append(e2 ? "" : "un");
                    sb.append("available)");
                    n.a.a.k(sb.toString(), new Object[0]);
                    j.o.b(false, this.f9826d);
                    return new c();
                }
                h.a(this.f9826d, this.b, this.c, this.a);
                return new i();
            }
            throw new IllegalArgumentException("apiKey is empty - use setApiKey to provide a apiKey");
        }

        public final d c() {
            n.a.a.k("Returning empty NotificationsSdk as requested by the host app", new Object[0]);
            new Thread(new C0674a(this)).start();
            return new c();
        }

        public final a d() {
            this.a = true;
            return this;
        }

        public final a e(String str) {
            k.f(str, "apiKey");
            this.b = str;
            return this;
        }

        public final a f(String str) {
            k.f(str, "baseUrl");
            this.c = str;
            return this;
        }
    }

    /* compiled from: NotificationsSdk.kt */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final a a(Context context) {
            k.f(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                return new a((Application) applicationContext);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
    }

    void a(b bVar, c cVar);

    void setEnabled(boolean z);
}

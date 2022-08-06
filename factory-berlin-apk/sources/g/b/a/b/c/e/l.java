package g.b.a.b.c.e;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.location.h;
import java.util.HashMap;
import java.util.Map;

public final class l {
    private final c0<j> a;
    private final Context b;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Map<i.a<com.google.android.gms.location.i>, q> f9344d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<i.a<Object>, p> f9345e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<i.a<h>, m> f9346f = new HashMap();

    public l(Context context, c0<j> c0Var) {
        this.b = context;
        this.a = c0Var;
    }

    public final Location a() {
        this.a.a();
        return this.a.c().a(this.b.getPackageName());
    }

    public final void b() {
        synchronized (this.f9344d) {
            for (q next : this.f9344d.values()) {
                if (next != null) {
                    this.a.c().h0(y.n(next, (f) null));
                }
            }
            this.f9344d.clear();
        }
        synchronized (this.f9346f) {
            for (m next2 : this.f9346f.values()) {
                if (next2 != null) {
                    this.a.c().h0(y.l(next2, (f) null));
                }
            }
            this.f9346f.clear();
        }
        synchronized (this.f9345e) {
            for (p next3 : this.f9345e.values()) {
                if (next3 != null) {
                    this.a.c().J0(new i0(2, (g0) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f9345e.clear();
        }
    }

    public final void c(boolean z) {
        this.a.a();
        this.a.c().a0(z);
        this.c = z;
    }

    public final void d() {
        if (this.c) {
            c(false);
        }
    }
}

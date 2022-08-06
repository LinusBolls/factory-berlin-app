package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.p;
import androidx.navigation.x;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: NavDeepLinkBuilder */
public final class m {
    private final Context a;
    private final Intent b;
    private q c;

    /* renamed from: d  reason: collision with root package name */
    private int f1087d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f1088e;

    /* compiled from: NavDeepLinkBuilder */
    private static class a extends y {
        private final x<o> c = new C0026a(this);

        /* renamed from: androidx.navigation.m$a$a  reason: collision with other inner class name */
        /* compiled from: NavDeepLinkBuilder */
        class C0026a extends x<o> {
            C0026a(a aVar) {
            }

            public o a() {
                return new o("permissive");
            }

            public o b(o oVar, Bundle bundle, u uVar, x.a aVar) {
                throw new IllegalStateException("navigate is not supported");
            }

            public boolean e() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        a() {
            a(new r(this));
        }

        public x<? extends o> d(String str) {
            try {
                return super.d(str);
            } catch (IllegalStateException unused) {
                return this.c;
            }
        }
    }

    public m(Context context) {
        this.a = context;
        if (context instanceof Activity) {
            Context context2 = this.a;
            this.b = new Intent(context2, context2.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
            this.b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.b.addFlags(268468224);
    }

    private void c() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.c);
        o oVar = null;
        while (!arrayDeque.isEmpty() && oVar == null) {
            o oVar2 = (o) arrayDeque.poll();
            if (oVar2.m() == this.f1087d) {
                oVar = oVar2;
            } else if (oVar2 instanceof q) {
                Iterator<o> it = ((q) oVar2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (oVar != null) {
            this.b.putExtra("android-support-nav:controller:deepLinkIds", oVar.g());
            return;
        }
        String l2 = o.l(this.a, this.f1087d);
        throw new IllegalArgumentException("Navigation destination " + l2 + " cannot be found in the navigation graph " + this.c);
    }

    public PendingIntent a() {
        Bundle bundle = this.f1088e;
        int i2 = 0;
        if (bundle != null) {
            int i3 = 0;
            for (String str : bundle.keySet()) {
                Object obj = this.f1088e.get(str);
                i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
            }
            i2 = i3;
        }
        return b().l((i2 * 31) + this.f1087d, 134217728);
    }

    public p b() {
        if (this.b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") != null) {
            p i2 = p.i(this.a);
            i2.d(new Intent(this.b));
            for (int i3 = 0; i3 < i2.k(); i3++) {
                i2.j(i3).putExtra("android-support-nav:controller:deepLinkIntent", this.b);
            }
            return i2;
        } else if (this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else {
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
    }

    public m d(Bundle bundle) {
        this.f1088e = bundle;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public m e(int i2) {
        this.f1087d = i2;
        if (this.c != null) {
            c();
        }
        return this;
    }

    public m f(int i2) {
        g(new t(this.a, new a()).c(i2));
        return this;
    }

    public m g(q qVar) {
        this.c = qVar;
        if (this.f1087d != 0) {
            c();
        }
        return this;
    }

    m(NavController navController) {
        this(navController.f());
        this.c = navController.j();
    }
}

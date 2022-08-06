package e.c.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.f;
import e.c.b.a;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class b {
    public final Intent a;
    public final Bundle b;

    /* compiled from: CustomTabsIntent */
    public static final class a {
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final a.C0555a b = new a.C0555a();
        private ArrayList<Bundle> c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f8429d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f8430e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8431f = true;

        /* renamed from: g  reason: collision with root package name */
        private SparseArray<Bundle> f8432g;

        private void b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public b a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                b((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f8430e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8431f);
            this.a.putExtras(this.b.a().a());
            if (this.f8432g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f8432g);
                this.a.putExtras(bundle);
            }
            return new b(this.a, this.f8429d);
        }

        public a c(int i2) {
            this.b.b(i2);
            return this;
        }
    }

    b(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        androidx.core.content.a.l(context, this.a, this.b);
    }
}

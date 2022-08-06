package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class p implements Iterable<Intent> {

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<Intent> f695g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Context f696h;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent h();
    }

    private p(Context context) {
        this.f696h = context;
    }

    public static p i(Context context) {
        return new p(context);
    }

    public p a(Intent intent) {
        this.f695g.add(intent);
        return this;
    }

    public p d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f696h.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        a(intent);
        return this;
    }

    public p e(Activity activity) {
        Intent h2 = activity instanceof a ? ((a) activity).h() : null;
        if (h2 == null) {
            h2 = h.a(activity);
        }
        if (h2 != null) {
            ComponentName component = h2.getComponent();
            if (component == null) {
                component = h2.resolveActivity(this.f696h.getPackageManager());
            }
            g(component);
            a(h2);
        }
        return this;
    }

    public p g(ComponentName componentName) {
        int size = this.f695g.size();
        try {
            Intent b = h.b(this.f696h, componentName);
            while (b != null) {
                this.f695g.add(size, b);
                b = h.b(this.f696h, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f695g.iterator();
    }

    public Intent j(int i2) {
        return this.f695g.get(i2);
    }

    public int k() {
        return this.f695g.size();
    }

    public PendingIntent l(int i2, int i3) {
        return m(i2, i3, (Bundle) null);
    }

    public PendingIntent m(int i2, int i3, Bundle bundle) {
        if (!this.f695g.isEmpty()) {
            ArrayList<Intent> arrayList = this.f695g;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (Build.VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.f696h, i2, intentArr, i3, bundle);
            }
            return PendingIntent.getActivities(this.f696h, i2, intentArr, i3);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void n() {
        o((Bundle) null);
    }

    public void o(Bundle bundle) {
        if (!this.f695g.isEmpty()) {
            ArrayList<Intent> arrayList = this.f695g;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.k(this.f696h, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f696h.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}

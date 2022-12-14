package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources */
public class b1 extends Resources {
    private static boolean b = false;
    private final WeakReference<Context> a;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<>(context);
    }

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    public final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    public Drawable getDrawable(int i2) {
        Context context = (Context) this.a.get();
        if (context != null) {
            return m0.h().t(context, this, i2);
        }
        return super.getDrawable(i2);
    }
}

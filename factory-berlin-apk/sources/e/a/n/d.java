package e.a.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import e.a.i;

/* compiled from: ContextThemeWrapper */
public class d extends ContextWrapper {
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f8386d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f8387e;

    public d() {
        super((Context) null);
    }

    private Resources a() {
        if (this.f8387e == null) {
            Configuration configuration = this.f8386d;
            if (configuration == null) {
                this.f8387e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f8387e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f8387e;
    }

    private void c() {
        boolean z = this.b == null;
        if (z) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        d(this.b, this.a, z);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void d(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return a();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.Theme_AppCompat_Light;
        }
        c();
        return this.b;
    }

    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            c();
        }
    }

    public d(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}

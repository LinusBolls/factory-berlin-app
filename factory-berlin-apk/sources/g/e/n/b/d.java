package g.e.n.b;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.k;

/* compiled from: SharedPreferenceDataSourceImpl.kt */
public final class d implements b {
    private final Context a;
    private final String b;

    public d(Context context, String str) {
        k.e(context, "context");
        k.e(str, "sharedPrefName");
        this.a = context;
        this.b = str;
    }

    public String a(String str) {
        k.e(str, "key");
        return b().getString(str, (String) null);
    }

    public SharedPreferences b() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
        k.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public void putString(String str, String str2) {
        k.e(str, "key");
        k.e(str2, "value");
        b().edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        k.e(str, "key");
        b().edit().remove(str).apply();
    }
}

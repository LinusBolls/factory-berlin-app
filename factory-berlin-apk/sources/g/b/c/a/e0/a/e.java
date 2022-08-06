package g.b.c.a.e0.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import g.b.c.a.h0.n0;
import g.b.c.a.h0.z0;
import g.b.c.a.k0.e0;
import g.b.c.a.n;
import java.io.IOException;

/* compiled from: SharedPrefKeysetWriter */
public final class e implements n {
    private final SharedPreferences.Editor a;
    private final String b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public void a(z0 z0Var) {
        if (!this.a.putString(this.b, e0.b(z0Var.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public void b(n0 n0Var) {
        if (!this.a.putString(this.b, e0.b(n0Var.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}

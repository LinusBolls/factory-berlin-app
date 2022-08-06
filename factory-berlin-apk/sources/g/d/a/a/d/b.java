package g.d.a.a.d;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;

public class b {
    private Application a;
    private String b = "shared_pref";
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9691d = true;

    /* renamed from: e  reason: collision with root package name */
    private String f9692e;

    public SharedPreferences a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
        if (!this.c && !this.f9691d) {
            return sharedPreferences;
        }
        c cVar = new c(this.a, sharedPreferences, this.f9691d);
        if (!TextUtils.isEmpty(this.f9692e)) {
            cVar.j(this.f9692e);
        } else {
            Log.d("SharedPrefsBuilder", "secret is empty");
        }
        return cVar;
    }

    public b b(boolean z) {
        this.f9691d = z;
        return this;
    }

    public b c(boolean z) {
        this.c = z;
        return this;
    }

    public b d(Application application) {
        this.a = application;
        return this;
    }

    public b e(String str) {
        this.f9692e = str;
        return this;
    }

    public b f(String str) {
        this.b = str;
        return this;
    }
}

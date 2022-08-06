package androidx.work.impl.background.gcm;

import com.google.android.gms.gcm.b;
import com.google.android.gms.gcm.d;

public class WorkManagerGcmService extends b {

    /* renamed from: n  reason: collision with root package name */
    private b f1595n;

    public void a() {
        this.f1595n.a();
    }

    public int b(d dVar) {
        return this.f1595n.b(dVar);
    }

    public void onCreate() {
        super.onCreate();
        this.f1595n = new b(getApplicationContext());
    }
}

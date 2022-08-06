package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService */
public class y extends Service implements v {

    /* renamed from: g  reason: collision with root package name */
    private final l0 f1044g = new l0(this);

    public p a() {
        return this.f1044g.a();
    }

    public IBinder onBind(Intent intent) {
        this.f1044g.b();
        return null;
    }

    public void onCreate() {
        this.f1044g.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f1044g.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i2) {
        this.f1044g.e();
        super.onStart(intent, i2);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}

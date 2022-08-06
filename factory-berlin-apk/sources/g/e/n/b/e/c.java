package g.e.n.b.e;

import g.e.n.b.b;
import kotlin.jvm.internal.k;

/* compiled from: SharedPreferenceDeviceIdDataSource.kt */
public final class c implements b {
    private final b a;

    public c(b bVar) {
        k.e(bVar, "sharedPreferenceDataSource");
        this.a = bVar;
    }

    public void a(String str) {
        k.e(str, "deviceId");
        this.a.putString("key_deviceid", str);
    }

    public void clear() {
        this.a.remove("key_deviceid");
    }

    public a getDeviceId() {
        String a2 = this.a.a("key_deviceid");
        if (a2 != null) {
            return new a(a2);
        }
        return null;
    }
}

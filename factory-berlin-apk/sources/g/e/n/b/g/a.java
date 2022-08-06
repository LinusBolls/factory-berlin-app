package g.e.n.b.g;

import g.e.n.b.b;
import kotlin.jvm.internal.k;

/* compiled from: SharedPreferenceUserIdDataSource.kt */
public final class a implements c {
    private final b a;

    public a(b bVar) {
        k.e(bVar, "sharedPreferenceDataSource");
        this.a = bVar;
    }

    public void a(String str) {
        k.e(str, "userId");
        this.a.putString("key_userid", str);
    }

    public b b() {
        String a2 = this.a.a("key_userid");
        if (a2 != null) {
            return new b(a2);
        }
        return null;
    }

    public void clear() {
        this.a.remove("key_userid");
    }
}

package g.e.n.b;

import android.content.Context;
import g.e.n.b.e.b;
import g.e.n.b.g.a;
import kotlin.jvm.internal.k;

/* compiled from: SharedPreferenceDataSourceFactory.kt */
public final class c implements a {
    public g.e.n.b.g.c a(Context context) {
        k.e(context, "context");
        return new a(new d(context, "data_sharedPref"));
    }

    public b b(Context context) {
        k.e(context, "context");
        return new g.e.n.b.e.c(new d(context, "data_sharedPref"));
    }
}

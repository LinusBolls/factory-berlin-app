package g.e.d.s;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.content.a;
import kotlin.jvm.internal.k;

/* compiled from: ConnectivityProviderImpl.kt */
public final class b implements a {
    private final ConnectivityManager a;

    public b(Context context) {
        k.e(context, "context");
        this.a = (ConnectivityManager) a.i(context, ConnectivityManager.class);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = this.a;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

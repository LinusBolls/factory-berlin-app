package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer */
public abstract class f {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.d0(context, str, bundle);
    }

    public abstract View e(int i2);

    public abstract boolean f();
}

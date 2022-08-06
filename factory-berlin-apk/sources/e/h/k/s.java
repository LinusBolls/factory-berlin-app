package e.h.k;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat */
public final class s {
    private Object a;

    private s(Object obj) {
        this.a = obj;
    }

    public static s b(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new s(PointerIcon.getSystemIcon(context, i2));
        }
        return new s((Object) null);
    }

    public Object a() {
        return this.a;
    }
}

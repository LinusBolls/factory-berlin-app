package e.h.k;

import android.os.Build;
import android.view.ViewGroup;
import e.h.b;

/* compiled from: ViewGroupCompat */
public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && u.D(viewGroup) == null) ? false : true;
    }
}

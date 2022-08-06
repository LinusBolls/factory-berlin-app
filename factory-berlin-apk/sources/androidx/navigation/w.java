package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: Navigation */
public final class w {
    public static NavController a(View view) {
        NavController b = b(view);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private static NavController b(View view) {
        while (view != null) {
            NavController c = c(view);
            if (c != null) {
                return c;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private static NavController c(View view) {
        Object tag = view.getTag(z.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static void d(View view, NavController navController) {
        view.setTag(z.nav_controller_view_tag, navController);
    }
}

package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.k;

/* compiled from: Fragment.kt */
public final class a {
    public static final NavController a(Fragment fragment) {
        k.f(fragment, "$this$findNavController");
        NavController R1 = c.R1(fragment);
        k.b(R1, "NavHostFragment.findNavController(this)");
        return R1;
    }
}

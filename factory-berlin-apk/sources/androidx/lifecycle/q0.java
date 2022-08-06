package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.p0;

@Deprecated
/* compiled from: ViewModelProviders */
public class q0 {
    @Deprecated
    public static p0 a(Fragment fragment) {
        return new p0(fragment);
    }

    @Deprecated
    public static p0 b(Fragment fragment, p0.b bVar) {
        if (bVar == null) {
            bVar = fragment.i();
        }
        return new p0(fragment.o(), bVar);
    }

    @Deprecated
    public static p0 c(d dVar) {
        return new p0(dVar);
    }
}

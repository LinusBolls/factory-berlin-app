package g.e.d.r;

import android.view.View;
import android.widget.Toast;
import g.e.d.r.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: ToastMessagePresenter.kt */
public final class b implements a {
    private final int c(a.b bVar) {
        if (k.a(bVar, a.b.C0665b.a)) {
            return 0;
        }
        if (k.a(bVar, a.b.C0664a.a)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void a(String str, View view, a.b bVar) {
        k.e(str, "message");
        k.e(view, "view");
        k.e(bVar, "duration");
        Toast.makeText(view.getContext(), str, c(bVar)).show();
    }

    public void b(int i2, View view, a.b bVar) {
        k.e(view, "view");
        k.e(bVar, "duration");
        Toast.makeText(view.getContext(), i2, c(bVar)).show();
    }
}

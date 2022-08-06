package g.e.d;

import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.internal.k;

/* compiled from: BackButtonInterceptor.kt */
public final class b {

    /* compiled from: BackButtonInterceptor.kt */
    static final class a implements View.OnKeyListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f9747g;

        a(kotlin.e0.c.a aVar) {
            this.f9747g = aVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            return i2 == 4 && ((Boolean) this.f9747g.d()).booleanValue();
        }
    }

    public static final void a(View view, kotlin.e0.c.a<Boolean> aVar) {
        k.e(view, "$this$onBackButton");
        k.e(aVar, "onBack");
        view.setOnKeyListener(new a(aVar));
        view.setFocusableInTouchMode(true);
        view.requestFocus();
    }
}

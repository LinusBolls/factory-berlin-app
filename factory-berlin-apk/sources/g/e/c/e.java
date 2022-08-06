package g.e.c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: Extensions.kt */
public final class e {
    public static final void a(View view) {
        k.f(view, "$this$hideKeyboard");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static final void b(Activity activity, Intent intent) {
        k.f(activity, "$this$reloadApplication");
        k.f(intent, "intent");
        ComponentName resolveActivity = intent.resolveActivity(activity.getPackageManager());
        k.b(resolveActivity, "intent.resolveActivity(packageManager)");
        a.f("Reload from %s to %s", activity.getClass().getSimpleName(), resolveActivity.getShortClassName());
        intent.addFlags(335577088);
        activity.startActivity(intent);
        activity.finishAffinity();
        activity.finish();
    }

    public static final void c(View view) {
        k.f(view, "$this$showKeyboard");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(view, 1);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}

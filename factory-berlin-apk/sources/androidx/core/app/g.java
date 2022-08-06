package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.i0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import e.h.k.f;

/* compiled from: ComponentActivity */
public class g extends Activity implements v, f.a {

    /* renamed from: g  reason: collision with root package name */
    private w f668g = new w(this);

    public g() {
        new e.e.g();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.d(decorView, keyEvent)) {
            return f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0.g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f668g.k(p.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}

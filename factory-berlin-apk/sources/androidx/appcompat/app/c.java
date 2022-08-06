package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b1;
import androidx.core.app.a;
import androidx.core.app.h;
import androidx.core.app.p;
import androidx.fragment.app.d;
import e.a.n.b;

/* compiled from: AppCompatActivity */
public class c extends d implements d, p.a {
    private e x;
    private Resources y;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean I(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.I(int, android.view.KeyEvent):boolean");
    }

    public void A() {
        B().m();
    }

    public e B() {
        if (this.x == null) {
            this.x = e.e(this, this);
        }
        return this.x;
    }

    public a C() {
        return B().k();
    }

    public void D(p pVar) {
        pVar.e(this);
    }

    /* access modifiers changed from: protected */
    public void E(int i2) {
    }

    public void F(p pVar) {
    }

    @Deprecated
    public void G() {
    }

    public boolean H() {
        Intent h2 = h();
        if (h2 == null) {
            return false;
        }
        if (K(h2)) {
            p i2 = p.i(this);
            D(i2);
            F(i2);
            i2.n();
            try {
                a.m(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            J(h2);
            return true;
        }
    }

    public void J(Intent intent) {
        h.e(this, intent);
    }

    public boolean K(Intent intent) {
        return h.f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B().c(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        B().d(context);
    }

    public void closeOptionsMenu() {
        a C = C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a C = C();
        if (keyCode != 82 || C == null || !C.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void f(b bVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return B().g(i2);
    }

    public void g(b bVar) {
    }

    public MenuInflater getMenuInflater() {
        return B().j();
    }

    public Resources getResources() {
        if (this.y == null && b1.b()) {
            this.y = new b1(this, super.getResources());
        }
        Resources resources = this.y;
        return resources == null ? super.getResources() : resources;
    }

    public Intent h() {
        return h.a(this);
    }

    public void invalidateOptionsMenu() {
        B().m();
    }

    public b j(b.a aVar) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.y != null) {
            this.y.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        B().p(configuration);
    }

    public void onContentChanged() {
        G();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        e B = B();
        B.l();
        B.q(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        B().r();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (I(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a C = C();
        if (menuItem.getItemId() != 16908332 || C == null || (C.j() & 4) == 0) {
            return false;
        }
        return H();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        B().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        B().t();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        B().u(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        B().v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        B().w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        B().D(charSequence);
    }

    public void openOptionsMenu() {
        a C = C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i2) {
        B().z(i2);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        B().C(i2);
    }

    public void setContentView(View view) {
        B().A(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B().B(view, layoutParams);
    }
}

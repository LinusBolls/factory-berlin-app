package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import e.a.n.b;
import e.h.k.f;

/* compiled from: AppCompatDialog */
public class g extends Dialog implements d {

    /* renamed from: g  reason: collision with root package name */
    private e f149g;

    /* renamed from: h  reason: collision with root package name */
    private final f.a f150h = new a();

    /* compiled from: AppCompatDialog */
    class a implements f.a {
        a() {
        }

        public boolean e(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i2) {
        super(context, b(context, i2));
        e a2 = a();
        a2.C(b(context, i2));
        a2.q((Bundle) null);
    }

    private static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f149g == null) {
            this.f149g = e.f(this, this);
        }
        return this.f149g;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i2) {
        return a().y(i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f150h, getWindow().getDecorView(), this, keyEvent);
    }

    public void f(b bVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return a().g(i2);
    }

    public void g(b bVar) {
    }

    public void invalidateOptionsMenu() {
        a().m();
    }

    public b j(b.a aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().w();
    }

    public void setContentView(int i2) {
        a().z(i2);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }

    public void setContentView(View view) {
        a().A(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        a().D(getContext().getString(i2));
    }
}

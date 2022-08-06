package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog */
public class b extends g implements DialogInterface {

    /* renamed from: i  reason: collision with root package name */
    final AlertController f122i = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(Context context) {
            this(context, b.h(context, 0));
        }

        public b a() {
            b bVar = new b(this.a.a, this.b);
            this.a.a(bVar.f122i);
            bVar.setCancelable(this.a.r);
            if (this.a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.a.s);
            bVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(View view) {
            this.a.f98g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.f95d = drawable;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public a h(int i2) {
            AlertController.f fVar = this.a;
            fVar.f99h = fVar.a.getText(i2);
            return this;
        }

        public a i(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f103l = fVar.a.getText(i2);
            this.a.f105n = onClickListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f103l = charSequence;
            fVar.f105n = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a l(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a m(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f100i = fVar.a.getText(i2);
            this.a.f102k = onClickListener;
            return this;
        }

        public a n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f100i = charSequence;
            fVar.f102k = onClickListener;
            return this;
        }

        public a o(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a p(int i2) {
            AlertController.f fVar = this.a;
            fVar.f97f = fVar.a.getText(i2);
            return this;
        }

        public a q(CharSequence charSequence) {
            this.a.f97f = charSequence;
            return this;
        }

        public b r() {
            b a2 = a();
            a2.show();
            return a2;
        }

        public a(Context context, int i2) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, b.h(context, i2)));
            this.b = i2;
        }
    }

    protected b(Context context, int i2) {
        super(context, h(context, i2));
    }

    static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f122i.d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f122i.e();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f122i.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f122i.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f122i.q(charSequence);
    }
}

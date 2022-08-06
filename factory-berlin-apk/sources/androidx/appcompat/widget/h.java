package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import e.a.k.a.a;

/* compiled from: AppCompatCheckedTextView */
public class h extends CheckedTextView {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f422h = {16843016};

    /* renamed from: g  reason: collision with root package name */
    private final y f423g;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f423g;
        if (yVar != null) {
            yVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.d(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.p(this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f423g;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        y yVar = new y(this);
        this.f423g = yVar;
        yVar.m(attributeSet, i2);
        this.f423g.b();
        w0 u = w0.u(getContext(), attributeSet, f422h, i2, 0);
        setCheckMarkDrawable(u.g(0));
        u.v();
    }
}

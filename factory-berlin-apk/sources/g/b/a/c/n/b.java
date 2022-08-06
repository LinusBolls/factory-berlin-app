package g.b.a.c.n;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.e;
import g.b.a.c.n.a;

/* compiled from: BadgeUtils */
public class b {
    public static final boolean a = (Build.VERSION.SDK_INT < 18);

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        e(aVar, view, frameLayout);
        if (a) {
            frameLayout.setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static SparseArray<a> b(Context context, e eVar) {
        SparseArray<a> sparseArray = new SparseArray<>(eVar.size());
        int i2 = 0;
        while (i2 < eVar.size()) {
            int keyAt = eVar.keyAt(i2);
            a.C0634a aVar = (a.C0634a) eVar.valueAt(i2);
            if (aVar != null) {
                sparseArray.put(keyAt, a.c(context, aVar));
                i2++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    public static e c(SparseArray<a> sparseArray) {
        e eVar = new e();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i2);
            a valueAt = sparseArray.valueAt(i2);
            if (valueAt != null) {
                eVar.put(keyAt, valueAt.i());
                i2++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return eVar;
    }

    public static void d(a aVar, View view, FrameLayout frameLayout) {
        if (aVar != null) {
            if (a) {
                frameLayout.setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    public static void e(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (a ? frameLayout : view).getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.s(view, frameLayout);
    }

    public static void f(Rect rect, float f2, float f3, float f4, float f5) {
        rect.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
    }
}

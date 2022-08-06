package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter */
public abstract class a {
    public a() {
        new DataSetObservable();
    }

    public abstract void a(ViewGroup viewGroup, int i2, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public abstract CharSequence e(int i2);

    public float f(int i2) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i2);

    public abstract boolean h(View view, Object obj);

    public abstract void i(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable j();

    public abstract void k(ViewGroup viewGroup, int i2, Object obj);

    /* access modifiers changed from: package-private */
    public void l(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    public abstract void m(ViewGroup viewGroup);
}

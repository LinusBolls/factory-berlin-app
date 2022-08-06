package e.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.i.a.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: g  reason: collision with root package name */
    protected boolean f8714g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f8715h;

    /* renamed from: i  reason: collision with root package name */
    protected Cursor f8716i;

    /* renamed from: j  reason: collision with root package name */
    protected Context f8717j;

    /* renamed from: k  reason: collision with root package name */
    protected int f8718k;

    /* renamed from: l  reason: collision with root package name */
    protected C0566a f8719l;

    /* renamed from: m  reason: collision with root package name */
    protected DataSetObserver f8720m;

    /* renamed from: n  reason: collision with root package name */
    protected b f8721n;

    /* renamed from: e.i.a.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    private class C0566a extends ContentObserver {
        C0566a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.i();
        }
    }

    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f8714g = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f8714g = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j2 = j(cursor);
        if (j2 != null) {
            j2.close();
        }
    }

    public Cursor b() {
        return this.f8716i;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i2) {
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f8715h = true;
        } else {
            this.f8715h = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f8716i = cursor;
        this.f8714g = z;
        this.f8717j = context;
        this.f8718k = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f8719l = new C0566a();
            this.f8720m = new b();
        } else {
            this.f8719l = null;
            this.f8720m = null;
        }
        if (z) {
            C0566a aVar = this.f8719l;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f8720m;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f8714g || (cursor = this.f8716i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f8714g) {
            return null;
        }
        this.f8716i.moveToPosition(i2);
        if (view == null) {
            view = g(this.f8717j, this.f8716i, viewGroup);
        }
        e(view, this.f8717j, this.f8716i);
        return view;
    }

    public Filter getFilter() {
        if (this.f8721n == null) {
            this.f8721n = new b(this);
        }
        return this.f8721n;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f8714g || (cursor = this.f8716i) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f8716i;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f8714g || (cursor = this.f8716i) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f8716i.getLong(this.f8718k);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f8714g) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f8716i.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f8717j, this.f8716i, viewGroup);
            }
            e(view, this.f8717j, this.f8716i);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f8715h && (cursor = this.f8716i) != null && !cursor.isClosed()) {
            this.f8714g = this.f8716i.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f8716i;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0566a aVar = this.f8719l;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f8720m;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8716i = cursor;
        if (cursor != null) {
            C0566a aVar2 = this.f8719l;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f8720m;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f8718k = cursor.getColumnIndexOrThrow("_id");
            this.f8714g = true;
            notifyDataSetChanged();
        } else {
            this.f8718k = -1;
            this.f8714g = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}

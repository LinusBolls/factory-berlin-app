package e.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {
    private int o;
    private int p;
    private LayoutInflater q;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.p = i2;
        this.o = i2;
        this.q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.q.inflate(this.p, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.q.inflate(this.o, viewGroup, false);
    }
}

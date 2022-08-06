package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback */
public final class b implements r {
    private final RecyclerView.g a;

    public b(RecyclerView.g gVar) {
        this.a = gVar;
    }

    public void a(int i2, int i3) {
        this.a.v(i2, i3);
    }

    public void b(int i2, int i3) {
        this.a.s(i2, i3);
    }

    public void c(int i2, int i3) {
        this.a.u(i2, i3);
    }

    public void d(int i2, int i3, Object obj) {
        this.a.t(i2, i3, obj);
    }
}

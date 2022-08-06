package g.e.b.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import g.e.b.e;

/* compiled from: FragRoomSelectionBinding */
public final class f {
    private final ConstraintLayout a;
    public final RecyclerView b;
    public final Spinner c;

    /* renamed from: d  reason: collision with root package name */
    public final Toolbar f9731d;

    private f(ConstraintLayout constraintLayout, RecyclerView recyclerView, Spinner spinner, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = spinner;
        this.f9731d = toolbar;
    }

    public static f a(View view) {
        int i2 = e.recyclerview;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i2);
        if (recyclerView != null) {
            i2 = e.spinner;
            Spinner spinner = (Spinner) view.findViewById(i2);
            if (spinner != null) {
                i2 = e.toolbar;
                Toolbar toolbar = (Toolbar) view.findViewById(i2);
                if (toolbar != null) {
                    return new f((ConstraintLayout) view, recyclerView, spinner, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(g.e.b.f.frag_room_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}

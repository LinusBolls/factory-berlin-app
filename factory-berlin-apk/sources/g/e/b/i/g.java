package g.e.b.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import g.e.b.e;
import g.e.b.f;

/* compiled from: MyBookingsBinding */
public final class g {
    private final ConstraintLayout a;
    public final TextView b;
    public final FloatingActionButton c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f9732d;

    /* renamed from: e  reason: collision with root package name */
    public final SwipeRefreshLayout f9733e;

    private g(ConstraintLayout constraintLayout, TextView textView, FloatingActionButton floatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = floatingActionButton;
        this.f9732d = recyclerView;
        this.f9733e = swipeRefreshLayout;
    }

    public static g a(View view) {
        int i2 = e.emptyText;
        TextView textView = (TextView) view.findViewById(i2);
        if (textView != null) {
            i2 = e.new_booking;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(i2);
            if (floatingActionButton != null) {
                i2 = e.recycler;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(i2);
                if (recyclerView != null) {
                    i2 = e.swiperefresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(i2);
                    if (swipeRefreshLayout != null) {
                        return new g((ConstraintLayout) view, textView, floatingActionButton, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(f.my_bookings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}

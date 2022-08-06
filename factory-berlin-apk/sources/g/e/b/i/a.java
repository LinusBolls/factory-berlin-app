package g.e.b.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import g.e.b.e;
import g.e.b.f;

/* compiled from: FragRoomScheduleBinding */
public final class a {
    private final CoordinatorLayout a;
    public final ImageView b;
    public final ConstraintLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f9727d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f9728e;

    /* renamed from: f  reason: collision with root package name */
    public final Toolbar f9729f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f9730g;

    private a(CoordinatorLayout coordinatorLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = constraintLayout;
        this.f9727d = frameLayout;
        this.f9728e = recyclerView;
        this.f9729f = toolbar;
        this.f9730g = textView;
    }

    public static a a(View view) {
        int i2 = e.badge_status;
        ImageView imageView = (ImageView) view.findViewById(i2);
        if (imageView != null) {
            i2 = e.gateway;
            ImageView imageView2 = (ImageView) view.findViewById(i2);
            if (imageView2 != null) {
                i2 = e.header_frame;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i2);
                if (constraintLayout != null) {
                    i2 = e.progress;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i2);
                    if (frameLayout != null) {
                        i2 = e.recycler;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(i2);
                        if (recyclerView != null) {
                            i2 = e.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(i2);
                            if (toolbar != null) {
                                i2 = e.unit_name;
                                TextView textView = (TextView) view.findViewById(i2);
                                if (textView != null) {
                                    return new a((CoordinatorLayout) view, imageView, imageView2, constraintLayout, frameLayout, recyclerView, toolbar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(f.frag_room_schedule, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}

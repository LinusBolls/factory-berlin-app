package com.sensorberg.smartworkspace.app.screens.spaces.overview.i;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.overview.b;
import com.sensorberg.smartworkspace.app.screens.spaces.overview.g;
import g.e.d.c;
import kotlin.jvm.internal.k;

/* compiled from: SpaceItemViewHolder.kt */
public final class a extends c {
    private TextView u;
    private b v;
    private final int w;
    private final int x;
    private final int y;
    /* access modifiers changed from: private */
    public final g z;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.overview.i.a$a  reason: collision with other inner class name */
    /* compiled from: SpaceItemViewHolder.kt */
    static final class C0535a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7992g;

        C0535a(a aVar) {
            this.f7992g = aVar;
        }

        public final void onClick(View view) {
            this.f7992g.z.h(a.M(this.f7992g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup, g gVar) {
        super(R.layout.viewholder_spaces_overview, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(gVar, "spacesOverviewItemClickListener");
        this.z = gVar;
        View findViewById = this.a.findViewById(R.id.viewholder_spaces_overview_name);
        k.d(findViewById, "itemView.findViewById(R.…der_spaces_overview_name)");
        this.u = (TextView) findViewById;
        View view = this.a;
        k.d(view, "itemView");
        int c = androidx.core.content.a.c(view.getContext(), R.color.spacesOverViewOverlay);
        this.w = Color.red(c);
        this.x = Color.green(c);
        this.y = Color.blue(c);
        View view2 = this.a;
        k.d(view2, "itemView");
        view2.setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        this.a.setOnClickListener(new C0535a(this));
    }

    public static final /* synthetic */ b M(a aVar) {
        b bVar = aVar.v;
        if (bVar != null) {
            return bVar;
        }
        k.q("space");
        throw null;
    }

    public final void O(b bVar, int i2) {
        k.e(bVar, "space");
        this.v = bVar;
        this.u.setText(bVar.b());
        View view = this.a;
        k.d(view, "itemView");
        view.setBackgroundTintList(ColorStateList.valueOf(Color.argb(i2, this.w, this.x, this.y)));
    }
}

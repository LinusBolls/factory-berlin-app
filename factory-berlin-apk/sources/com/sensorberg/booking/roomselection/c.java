package com.sensorberg.booking.roomselection;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sensorberg.booking.roomselection.g;
import g.e.b.e;
import g.e.b.f;
import kotlin.jvm.internal.k;

/* compiled from: BookableUnitViewHolder.kt */
public final class c extends g.e.d.c {
    private final TextView u;
    private final TextView v;
    private final ImageView w;
    private final ImageView x;
    /* access modifiers changed from: private */
    public final h y;

    /* compiled from: BookableUnitViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f5017g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.a f5018h;

        a(c cVar, g.a aVar) {
            this.f5017g = cVar;
            this.f5018h = aVar;
        }

        public final void onClick(View view) {
            this.f5017g.y.j(this.f5018h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, h hVar) {
        super(f.viewholder_bookable_unit, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(hVar, "roomSelectionListener");
        this.y = hVar;
        View findViewById = this.a.findViewById(e.roomName);
        k.d(findViewById, "itemView.findViewById(R.id.roomName)");
        this.u = (TextView) findViewById;
        View findViewById2 = this.a.findViewById(e.scheduleHint);
        k.d(findViewById2, "itemView.findViewById(R.id.scheduleHint)");
        this.v = (TextView) findViewById2;
        View findViewById3 = this.a.findViewById(e.icon);
        k.d(findViewById3, "itemView.findViewById(R.id.icon)");
        this.w = (ImageView) findViewById3;
        View findViewById4 = this.a.findViewById(e.badge);
        k.d(findViewById4, "itemView.findViewById(R.id.badge)");
        this.x = (ImageView) findViewById4;
    }

    public final void N(g.a aVar) {
        k.e(aVar, "item");
        this.u.setText(aVar.c());
        this.v.setText(aVar.d());
        View view = this.a;
        k.d(view, "itemView");
        this.w.setImageDrawable(view.getResources().getDrawable(aVar.b(), (Resources.Theme) null));
        View view2 = this.a;
        k.d(view2, "itemView");
        this.x.setImageDrawable(view2.getResources().getDrawable(aVar.a(), (Resources.Theme) null));
        this.a.setOnClickListener(new a(this, aVar));
    }
}

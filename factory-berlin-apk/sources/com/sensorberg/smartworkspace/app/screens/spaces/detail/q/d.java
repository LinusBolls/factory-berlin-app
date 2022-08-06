package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.widgets.f;
import kotlin.jvm.internal.k;

/* compiled from: IconRowButtonViewHolder.kt */
public final class d extends g.e.d.c {
    private final TextView u;
    private final ImageView v;
    private final TextView w;
    private final TextView x;
    private p.e.b y;
    private final f z;

    /* compiled from: IconRowButtonViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7889g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7890h;

        a(d dVar, p.e.c cVar) {
            this.f7889g = dVar;
            this.f7890h = cVar;
        }

        public final void onClick(View view) {
            this.f7890h.b(d.M(this.f7889g));
        }
    }

    /* compiled from: IconRowButtonViewHolder.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7891g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7892h;

        b(d dVar, p.e.c cVar) {
            this.f7891g = dVar;
            this.f7892h = cVar;
        }

        public final void onClick(View view) {
            this.f7892h.b(d.M(this.f7891g));
        }
    }

    /* compiled from: IconRowButtonViewHolder.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7893g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7894h;

        c(d dVar, p.e.c cVar) {
            this.f7893g = dVar;
            this.f7894h = cVar;
        }

        public final void onClick(View view) {
            this.f7894h.b(d.M(this.f7893g));
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.detail.q.d$d  reason: collision with other inner class name */
    /* compiled from: IconRowButtonViewHolder.kt */
    static final class C0528d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7895g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.b.a f7896h;

        C0528d(d dVar, p.e.b.a aVar) {
            this.f7895g = dVar;
            this.f7896h = aVar;
        }

        public final void onClick(View view) {
            this.f7896h.p(d.M(this.f7895g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, ValueAnimator valueAnimator, p.e.b.a aVar, p.e.c cVar) {
        super(R.layout.viewholder_icon_row_with_button, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(valueAnimator, "animator");
        k.e(aVar, "buttonClickListener");
        k.e(cVar, "iconRowClickListener");
        View findViewById = this.a.findViewById(R.id.viewholder_icon_row_with_button_name_textview);
        k.d(findViewById, "itemView.findViewById(R.…ith_button_name_textview)");
        this.u = (TextView) findViewById;
        View findViewById2 = this.a.findViewById(R.id.viewholder_icon_row_with_button_imageview);
        k.d(findViewById2, "itemView.findViewById(R.…ow_with_button_imageview)");
        this.v = (ImageView) findViewById2;
        View findViewById3 = this.a.findViewById(R.id.viewholder_icon_row_with_button_status_textview);
        k.d(findViewById3, "itemView.findViewById(R.…h_button_status_textview)");
        this.w = (TextView) findViewById3;
        View findViewById4 = this.a.findViewById(R.id.viewholder_icon_row_with_button_button_textview);
        k.d(findViewById4, "itemView.findViewById(R.…h_button_button_textview)");
        this.x = (TextView) findViewById4;
        this.z = new f(m.b(this.x), valueAnimator);
        View view = this.a;
        k.d(view, "itemView");
        com.sensorberg.smartworkspace.app.screens.spaces.a aVar2 = com.sensorberg.smartworkspace.app.screens.spaces.a.a;
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        view.setBackground(aVar2.b(context, R.color.surface));
        this.v.setOnClickListener(new a(this, cVar));
        this.u.setOnClickListener(new b(this, cVar));
        this.w.setOnClickListener(new c(this, cVar));
        this.x.setOnClickListener(new C0528d(this, aVar));
    }

    public static final /* synthetic */ p.e.b M(d dVar) {
        p.e.b bVar = dVar.y;
        if (bVar != null) {
            return bVar;
        }
        k.q("iconRowButton");
        throw null;
    }

    public final void N(p.e.b bVar) {
        k.e(bVar, "iconRowButton");
        this.y = bVar;
        this.u.setText(bVar.d());
        String i2 = bVar.i();
        this.w.setText(i2);
        TextView textView = this.w;
        int i3 = 0;
        if (i2 == null || p.s(i2)) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        this.v.setImageResource(bVar.f());
        this.x.setText(bVar.e());
        this.z.c(bVar.j());
    }
}

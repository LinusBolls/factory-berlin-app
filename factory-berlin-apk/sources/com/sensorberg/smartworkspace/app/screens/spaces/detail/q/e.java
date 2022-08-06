package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.widgets.f;
import kotlin.jvm.internal.k;

/* compiled from: IconRowSwitchViewHolder.kt */
public final class e extends g.e.d.c {
    private final TextView u;
    private final ImageView v;
    private final TextView w;
    private final Switch x;
    private p.e.d y;
    private final f z;

    /* compiled from: IconRowSwitchViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7897g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7898h;

        a(e eVar, p.e.c cVar) {
            this.f7897g = eVar;
            this.f7898h = cVar;
        }

        public final void onClick(View view) {
            this.f7898h.b(e.M(this.f7897g));
        }
    }

    /* compiled from: IconRowSwitchViewHolder.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7899g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7900h;

        b(e eVar, p.e.c cVar) {
            this.f7899g = eVar;
            this.f7900h = cVar;
        }

        public final void onClick(View view) {
            this.f7900h.b(e.M(this.f7899g));
        }
    }

    /* compiled from: IconRowSwitchViewHolder.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7901g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.e.c f7902h;

        c(e eVar, p.e.c cVar) {
            this.f7901g = eVar;
            this.f7902h = cVar;
        }

        public final void onClick(View view) {
            this.f7902h.b(e.M(this.f7901g));
        }
    }

    /* compiled from: IconRowSwitchViewHolder.kt */
    static final class d implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ e a;
        final /* synthetic */ p.e.d.a b;

        d(e eVar, p.e.d.a aVar) {
            this.a = eVar;
            this.b = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.b.e(e.M(this.a), z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ViewGroup viewGroup, ValueAnimator valueAnimator, p.e.d.a aVar, p.e.c cVar) {
        super(R.layout.viewholder_icon_row_with_switch, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(valueAnimator, "animator");
        k.e(aVar, "switchCheckedChangeListener");
        k.e(cVar, "iconRowClickListener");
        View findViewById = this.a.findViewById(R.id.icon_row_switch_viewholder_name_textview);
        k.d(findViewById, "itemView.findViewById(R.…viewholder_name_textview)");
        this.u = (TextView) findViewById;
        View findViewById2 = this.a.findViewById(R.id.icon_row_switch_viewholder_imageview);
        k.d(findViewById2, "itemView.findViewById(R.…tch_viewholder_imageview)");
        this.v = (ImageView) findViewById2;
        View findViewById3 = this.a.findViewById(R.id.icon_row_switch_viewholder_status_textview);
        k.d(findViewById3, "itemView.findViewById(R.…ewholder_status_textview)");
        this.w = (TextView) findViewById3;
        View findViewById4 = this.a.findViewById(R.id.icon_row_switch_viewholder_quickaction_switch);
        k.d(findViewById4, "itemView.findViewById(R.…older_quickaction_switch)");
        this.x = (Switch) findViewById4;
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
        this.x.setOnCheckedChangeListener(new d(this, aVar));
    }

    public static final /* synthetic */ p.e.d M(e eVar) {
        p.e.d dVar = eVar.y;
        if (dVar != null) {
            return dVar;
        }
        k.q("iconRowSwitch");
        throw null;
    }

    public final void N(p.e.d dVar) {
        k.e(dVar, "iconRowSwitch");
        this.y = dVar;
        this.u.setText(dVar.d());
        String j2 = dVar.j();
        this.w.setText(j2);
        TextView textView = this.w;
        int i2 = 0;
        if (j2 == null || p.s(j2)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.v.setImageResource(dVar.g());
        this.x.setChecked(dVar.i().getValue());
        this.z.c(dVar.k());
    }
}

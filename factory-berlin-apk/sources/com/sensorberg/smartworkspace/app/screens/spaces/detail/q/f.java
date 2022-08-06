package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import kotlin.jvm.internal.k;

/* compiled from: IconRowViewHolder.kt */
public final class f extends g.e.d.c {
    private final TextView u;
    private final ImageView v;
    private final TextView w;
    private p.e.a x;
    /* access modifiers changed from: private */
    public final p.e.c y;

    /* compiled from: IconRowViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f7903g;

        a(f fVar) {
            this.f7903g = fVar;
        }

        public final void onClick(View view) {
            this.f7903g.y.b(f.M(this.f7903g));
        }
    }

    /* compiled from: IconRowViewHolder.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f7904g;

        b(f fVar) {
            this.f7904g = fVar;
        }

        public final void onClick(View view) {
            this.f7904g.y.b(f.M(this.f7904g));
        }
    }

    /* compiled from: IconRowViewHolder.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f7905g;

        c(f fVar) {
            this.f7905g = fVar;
        }

        public final void onClick(View view) {
            this.f7905g.y.b(f.M(this.f7905g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ViewGroup viewGroup, p.e.c cVar) {
        super(R.layout.viewholder_icon_row, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(cVar, "iconRowClickListener");
        this.y = cVar;
        View findViewById = this.a.findViewById(R.id.viewholder_icon_row_name_textview);
        k.d(findViewById, "itemView.findViewById(R.…r_icon_row_name_textview)");
        this.u = (TextView) findViewById;
        View findViewById2 = this.a.findViewById(R.id.viewholder_icon_row_imageview);
        k.d(findViewById2, "itemView.findViewById(R.…older_icon_row_imageview)");
        this.v = (ImageView) findViewById2;
        View findViewById3 = this.a.findViewById(R.id.viewholder_icon_row_status_textview);
        k.d(findViewById3, "itemView.findViewById(R.…icon_row_status_textview)");
        this.w = (TextView) findViewById3;
        View view = this.a;
        k.d(view, "itemView");
        com.sensorberg.smartworkspace.app.screens.spaces.a aVar = com.sensorberg.smartworkspace.app.screens.spaces.a.a;
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        view.setBackground(aVar.b(context, R.color.surface));
        this.v.setOnClickListener(new a(this));
        this.u.setOnClickListener(new b(this));
        this.w.setOnClickListener(new c(this));
    }

    public static final /* synthetic */ p.e.a M(f fVar) {
        p.e.a aVar = fVar.x;
        if (aVar != null) {
            return aVar;
        }
        k.q("iconRow");
        throw null;
    }

    public final void O(p.e.a aVar) {
        k.e(aVar, "iotFull");
        this.x = aVar;
        this.u.setText(aVar.d());
        String f2 = aVar.f();
        this.w.setText(f2);
        TextView textView = this.w;
        int i2 = 0;
        if (f2 == null || p.s(f2)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.v.setImageResource(aVar.e());
    }
}

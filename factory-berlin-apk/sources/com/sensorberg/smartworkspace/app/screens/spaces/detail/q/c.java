package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.widgets.f;
import kotlin.jvm.internal.k;

/* compiled from: HeaderViewHolder.kt */
public final class c extends g.e.d.c {
    private final TextView u;
    private final f v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        super(R.layout.viewholder_header, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(valueAnimator, "animator");
        View findViewById = this.a.findViewById(R.id.viewholder_header_title_textview);
        k.d(findViewById, "itemView.findViewById(R.…er_header_title_textview)");
        this.u = (TextView) findViewById;
        this.v = new f(m.b(this.u), valueAnimator);
    }

    public final void M(p.c cVar) {
        k.e(cVar, "header");
        this.u.setText(cVar.b());
        this.v.c(cVar.c());
    }
}

package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import g.e.d.c;
import kotlin.jvm.internal.k;

/* compiled from: MoreViewHolder.kt */
public final class h extends c {
    private final TextView u;

    /* compiled from: MoreViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p.d.b.a f7908g;

        a(p.d.b.a aVar) {
            this.f7908g = aVar;
        }

        public final void onClick(View view) {
            this.f7908g.m();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ViewGroup viewGroup, p.d.b.a aVar) {
        super(R.layout.viewholder_more, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(aVar, "moreClickListener");
        View findViewById = this.a.findViewById(R.id.viewholder_more_textview);
        k.d(findViewById, "itemView.findViewById(R.…viewholder_more_textview)");
        this.u = (TextView) findViewById;
        this.a.setOnClickListener(new a(aVar));
    }

    public final void M(p.d.b bVar) {
        k.e(bVar, "more");
        this.u.setText(bVar.b());
    }
}

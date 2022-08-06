package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import g.e.d.c;
import kotlin.jvm.internal.k;

/* compiled from: MiniIconViewHolder.kt */
public final class g extends c {
    private TextView u;
    private p.d.a v;

    /* compiled from: MiniIconViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f7906g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p.d.a.C0526a f7907h;

        a(g gVar, p.d.a.C0526a aVar) {
            this.f7906g = gVar;
            this.f7907h = aVar;
        }

        public final void onClick(View view) {
            this.f7907h.f(g.M(this.f7906g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ViewGroup viewGroup, p.d.a.C0526a aVar) {
        super(R.layout.viewholder_mini_icon, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(aVar, "miniIconClickListener");
        View findViewById = this.a.findViewById(R.id.viewholder_mini_icon_textview);
        k.d(findViewById, "itemView.findViewById(R.…older_mini_icon_textview)");
        this.u = (TextView) findViewById;
        this.a.setOnClickListener(new a(this, aVar));
    }

    public static final /* synthetic */ p.d.a M(g gVar) {
        p.d.a aVar = gVar.v;
        if (aVar != null) {
            return aVar;
        }
        k.q("miniIcon");
        throw null;
    }

    public final void N(p.d.a aVar) {
        k.e(aVar, "miniIcon");
        this.v = aVar;
        this.u.setText(aVar.d());
        this.u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, aVar.b(), (Drawable) null, (Drawable) null);
    }
}

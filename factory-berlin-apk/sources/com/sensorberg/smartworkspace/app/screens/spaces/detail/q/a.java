package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import g.e.d.c;
import kotlin.jvm.internal.k;

/* compiled from: DetailsViewHolder.kt */
public final class a extends c {
    private p.a u;
    /* access modifiers changed from: private */
    public final p.a.b v;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.detail.q.a$a  reason: collision with other inner class name */
    /* compiled from: DetailsViewHolder.kt */
    static final class C0527a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7888g;

        C0527a(a aVar) {
            this.f7888g = aVar;
        }

        public final void onClick(View view) {
            this.f7888g.v.g(a.N(this.f7888g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup, p.a.b bVar) {
        super(R.layout.viewholder_details, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(bVar, "clickListener");
        this.v = bVar;
        View view = this.a;
        k.d(view, "itemView");
        com.sensorberg.smartworkspace.app.screens.spaces.a aVar = com.sensorberg.smartworkspace.app.screens.spaces.a.a;
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        view.setBackground(aVar.b(context, R.color.surface));
        ((TextView) this.a.findViewById(R.id.viewholder_details_textview)).setOnClickListener(new C0527a(this));
    }

    public static final /* synthetic */ p.a N(a aVar) {
        p.a aVar2 = aVar.u;
        if (aVar2 != null) {
            return aVar2;
        }
        k.q("item");
        throw null;
    }

    public final void O(p.a aVar) {
        k.e(aVar, "item");
        this.u = aVar;
    }
}

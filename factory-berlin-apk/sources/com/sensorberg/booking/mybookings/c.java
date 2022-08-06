package com.sensorberg.booking.mybookings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import g.e.b.e;
import g.e.b.f;
import kotlin.jvm.internal.k;

/* compiled from: BookingViewHolder.kt */
public final class c extends g.e.d.c {
    private final TextView u;
    private final TextView v;
    /* access modifiers changed from: private */
    public final b w;

    /* compiled from: BookingViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f4855g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f4856h;

        a(c cVar, d dVar) {
            this.f4855g = cVar;
            this.f4856h = dVar;
        }

        public final void onClick(View view) {
            this.f4855g.w.l(this.f4856h.f(), this.f4856h.d());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, b bVar) {
        super(f.viewholder_paged_booking, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(bVar, "bookingItemClickListener");
        this.w = bVar;
        View findViewById = this.a.findViewById(e.roomName);
        k.d(findViewById, "itemView.findViewById(R.id.roomName)");
        this.u = (TextView) findViewById;
        View findViewById2 = this.a.findViewById(e.meetingTime);
        k.d(findViewById2, "itemView.findViewById(R.id.meetingTime)");
        this.v = (TextView) findViewById2;
    }

    public final void N(d dVar) {
        k.e(dVar, "item");
        this.u.setText(dVar.d());
        this.v.setText(dVar.a());
        this.a.setOnClickListener(new a(this, dVar));
    }
}

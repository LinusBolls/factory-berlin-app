package com.sensorberg.booking.roomschedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import g.e.d.f;
import g.e.d.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import org.threeten.bp.LocalDate;

/* compiled from: RoomScheduleAdapter.kt */
public final class a extends RecyclerView.g<b> implements f0<g.e.d.e> {

    /* renamed from: i  reason: collision with root package name */
    private g.e.d.e f4939i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final List<org.threeten.bp.temporal.e> f4940j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final c f4941k;

    /* renamed from: com.sensorberg.booking.roomschedule.a$a  reason: collision with other inner class name */
    /* compiled from: RoomScheduleAdapter.kt */
    public static final class C0148a extends b {
        private final g.e.b.i.b u;

        /* renamed from: com.sensorberg.booking.roomschedule.a$a$a  reason: collision with other inner class name */
        /* compiled from: RoomScheduleAdapter.kt */
        public static final class C0149a {
            private C0149a() {
            }

            public /* synthetic */ C0149a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0149a((DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0148a(g.e.b.i.b r3) {
            /*
                r2 = this;
                java.lang.String r0 = "bind"
                kotlin.jvm.internal.k.e(r3, r0)
                android.view.View r0 = r3.s()
                java.lang.String r1 = "bind.root"
                kotlin.jvm.internal.k.d(r0, r1)
                r2.<init>(r0)
                r2.u = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomschedule.a.C0148a.<init>(g.e.b.i.b):void");
        }

        public final void O(LocalDate localDate) {
            k.e(localDate, "date");
            N(localDate);
            TextView textView = this.u.v;
            k.d(textView, "bind.day");
            m.a aVar = m.f9758l;
            View s = this.u.s();
            k.d(s, "bind.root");
            Context context = s.getContext();
            k.d(context, "bind.root.context");
            textView.setText(aVar.b(context, localDate));
        }
    }

    /* compiled from: RoomScheduleAdapter.kt */
    public static class b extends RecyclerView.d0 {
        public org.threeten.bp.temporal.e t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            k.e(view, "itemView");
        }

        public final org.threeten.bp.temporal.e M() {
            org.threeten.bp.temporal.e eVar = this.t;
            if (eVar != null) {
                return eVar;
            }
            k.q("date");
            throw null;
        }

        public final void N(org.threeten.bp.temporal.e eVar) {
            k.e(eVar, "<set-?>");
            this.t = eVar;
        }
    }

    /* compiled from: RoomScheduleAdapter.kt */
    public interface c {
        void f(long j2);
    }

    /* compiled from: RoomScheduleAdapter.kt */
    public static final class d extends b {
        /* access modifiers changed from: private */
        public final c u;
        private final g.e.b.i.d v;

        /* renamed from: com.sensorberg.booking.roomschedule.a$d$a  reason: collision with other inner class name */
        /* compiled from: RoomScheduleAdapter.kt */
        static final class C0150a implements View.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f4942g;

            C0150a(d dVar) {
                this.f4942g = dVar;
            }

            public final void onClick(View view) {
                this.f4942g.u.f(this.f4942g.k());
                View s = this.f4942g.P().s();
                k.d(s, "bind.root");
                ViewParent parent = s.getParent();
                if (parent != null) {
                    ((View) parent).invalidate();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }

        /* compiled from: RoomScheduleAdapter.kt */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new b((DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(com.sensorberg.booking.roomschedule.a.c r3, g.e.b.i.d r4) {
            /*
                r2 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.k.e(r3, r0)
                java.lang.String r0 = "bind"
                kotlin.jvm.internal.k.e(r4, r0)
                android.view.View r0 = r4.s()
                java.lang.String r1 = "bind.root"
                kotlin.jvm.internal.k.d(r0, r1)
                r2.<init>(r0)
                r2.u = r3
                r2.v = r4
                android.view.View r3 = r4.s()
                com.sensorberg.booking.roomschedule.a$d$a r4 = new com.sensorberg.booking.roomschedule.a$d$a
                r4.<init>(r2)
                r3.setOnClickListener(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomschedule.a.d.<init>(com.sensorberg.booking.roomschedule.a$c, g.e.b.i.d):void");
        }

        public final g.e.b.i.d P() {
            return this.v;
        }

        public final void Q(org.threeten.bp.e eVar) {
            k.e(eVar, "dateTime");
            N(eVar);
            TextView textView = this.v.w;
            k.d(textView, "bind.text");
            textView.setText(g.e.d.d.f9748d.b().b(eVar));
        }
    }

    /* compiled from: RoomScheduleAdapter.kt */
    static final class e extends l implements kotlin.e0.c.l<org.threeten.bp.e, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f4943h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.f4943h = aVar;
        }

        public final void a(org.threeten.bp.e eVar) {
            k.e(eVar, "dateTime");
            if (eVar.d0() == 0 && eVar.e0() == 0 && eVar.g0() == 0) {
                List I = this.f4943h.f4940j;
                LocalDate E0 = eVar.U();
                k.d(E0, "dateTime.toLocalDate()");
                I.add(E0);
            }
            if (this.f4943h.f4940j.size() == 0) {
                List I2 = this.f4943h.f4940j;
                LocalDate E02 = eVar.U();
                k.d(E02, "dateTime.toLocalDate()");
                I2.add(E02);
            }
            this.f4943h.f4940j.add(eVar);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((org.threeten.bp.e) obj);
            return x.a;
        }
    }

    public a(c cVar) {
        k.e(cVar, "listener");
        this.f4941k = cVar;
        G(true);
    }

    /* renamed from: J */
    public void x(b bVar, int i2) {
        k.e(bVar, "holder");
        org.threeten.bp.temporal.e eVar = this.f4940j.get(i2);
        if (bVar instanceof C0148a) {
            C0148a aVar = (C0148a) bVar;
            if (eVar != null) {
                aVar.O((LocalDate) eVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.threeten.bp.LocalDate");
        } else if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (eVar != null) {
                dVar.Q((org.threeten.bp.e) eVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.threeten.bp.LocalDateTime");
        } else {
            new IllegalStateException("WTF recyclerView ??");
        }
    }

    /* renamed from: K */
    public void k(g.e.d.e eVar) {
        g.e.d.e eVar2 = null;
        if (eVar != null) {
            org.threeten.bp.e m0 = org.threeten.bp.e.m0();
            k.d(m0, "LocalDateTime.now()");
            org.threeten.bp.e a = f.a(m0);
            if (a.M(eVar.e())) {
                eVar = g.e.d.e.b(eVar, a, (org.threeten.bp.e) null, 2, (Object) null);
            }
            eVar2 = eVar;
        }
        this.f4939i = eVar2;
        this.f4940j.clear();
        g.e.d.e eVar3 = this.f4939i;
        if (eVar3 != null) {
            org.threeten.bp.c l2 = org.threeten.bp.c.l(1);
            k.d(l2, "Duration.ofHours(1)");
            eVar3.c(l2, new e(this));
        }
        r();
    }

    /* renamed from: L */
    public b z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 1) {
            c cVar = this.f4941k;
            ViewDataBinding g2 = androidx.databinding.f.g(LayoutInflater.from(viewGroup.getContext()), g.e.b.f.frag_room_schedule_item, viewGroup, false);
            if (g2 != null) {
                return new d(cVar, (g.e.b.i.d) g2);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.databinding.FragRoomScheduleItemBinding");
        } else if (i2 == 2) {
            ViewDataBinding g3 = androidx.databinding.f.g(LayoutInflater.from(viewGroup.getContext()), g.e.b.f.frag_room_schedule_day_division, viewGroup, false);
            if (g3 != null) {
                return new C0148a((g.e.b.i.b) g3);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.databinding.FragRoomScheduleDayDivisionBinding");
        } else {
            throw new IllegalArgumentException("Unknown viewType " + i2);
        }
    }

    public int d() {
        return this.f4940j.size();
    }

    public int getItemViewType(int i2) {
        return this.f4940j.get(i2) instanceof LocalDate ? 2 : 1;
    }

    public long i(int i2) {
        org.threeten.bp.temporal.e eVar = this.f4940j.get(i2);
        if (eVar instanceof LocalDate) {
            return g.e.n.c.i.b.d((LocalDate) eVar) - 1;
        }
        if (eVar instanceof org.threeten.bp.e) {
            return g.e.n.c.i.b.e((org.threeten.bp.e) eVar);
        }
        throw new IllegalArgumentException("Unknown type " + eVar);
    }
}

package com.sensorberg.booking.roomschedule;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.booking.roomschedule.a;
import g.e.b.c;
import g.e.b.d;
import g.e.d.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import org.threeten.bp.LocalDate;
import org.threeten.bp.e;

/* compiled from: RoomScheduleAddDecorator.kt */
public final class b extends RecyclerView.n implements f0<List<? extends g.e.n.c.h.a>>, RecyclerView.s, a.c {
    private static final int[] F = {16842919};
    private static final int[] G = new int[0];
    public static final a H = new a((DefaultConstructorMarker) null);
    private boolean A;
    private boolean B;
    private boolean C;
    private final Drawable D;
    private final p<e, e, x> E;

    /* renamed from: g  reason: collision with root package name */
    private long f4944g = TimeUnit.MINUTES.toMillis(240);

    /* renamed from: h  reason: collision with root package name */
    private List<g.e.n.c.h.a> f4945h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4946i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4947j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4948k;

    /* renamed from: l  reason: collision with root package name */
    private Long f4949l;

    /* renamed from: m  reason: collision with root package name */
    private e f4950m;

    /* renamed from: n  reason: collision with root package name */
    private e f4951n;
    private final Rect o = new Rect();
    private final float p;
    private final int q;
    private final int r;
    private final Drawable s;
    private final Drawable t;
    private final Drawable u;
    private final Drawable v;
    private final Drawable w;
    private final Drawable x;
    private final Drawable y;
    private int z;

    /* compiled from: RoomScheduleAddDecorator.kt */
    public static final class a {
        private a() {
        }

        public final float a(a.d dVar, e eVar) {
            k.e(dVar, "holder");
            k.e(eVar, "date");
            View view = dVar.a;
            k.d(view, "holder.itemView");
            int top = view.getTop();
            View view2 = dVar.P().v;
            k.d(view2, "holder.bind.lineHour");
            View view3 = dVar.a;
            k.d(view3, "holder.itemView");
            return ((float) (top + view2.getTop())) + (((float) eVar.e0()) * (((float) view3.getHeight()) / 60.0f));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.booking.roomschedule.b$b  reason: collision with other inner class name */
    /* compiled from: RoomScheduleAddDecorator.kt */
    static final class C0151b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f4952g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RecyclerView f4953h;

        C0151b(b bVar, RecyclerView recyclerView) {
            this.f4952g = bVar;
            this.f4953h = recyclerView;
        }

        public final void run() {
            this.f4952g.x(false);
            this.f4953h.invalidate();
        }
    }

    public b(Context context, Drawable drawable, p<? super e, ? super e, x> pVar) {
        k.e(context, "context");
        k.e(drawable, "loadingDrawable");
        k.e(pVar, "onClick");
        this.D = drawable;
        this.E = pVar;
        this.p = context.getResources().getDimension(c.schedule_selection_radius);
        this.q = context.getResources().getDimensionPixelSize(c.schedule_drawable_diameter) / 2;
        this.r = context.getResources().getDimensionPixelSize(c.schedule_drawable_solid_width) / 2;
        Drawable f2 = androidx.core.content.a.f(context, d.room_schedule_add_button);
        k.c(f2);
        this.s = f2;
        Drawable f3 = androidx.core.content.a.f(context, d.room_schedule_add_top);
        k.c(f3);
        this.t = f3;
        Drawable f4 = androidx.core.content.a.f(context, d.room_schedule_add_bottom);
        k.c(f4);
        this.u = f4;
        Drawable f5 = androidx.core.content.a.f(context, d.room_schedule_add_dash_line);
        k.c(f5);
        this.v = f5;
        Drawable f6 = androidx.core.content.a.f(context, d.room_schedule_add_top_error);
        k.c(f6);
        this.w = f6;
        Drawable f7 = androidx.core.content.a.f(context, d.room_schedule_add_bottom_error);
        k.c(f7);
        this.x = f7;
        Drawable f8 = androidx.core.content.a.f(context, d.room_schedule_add_dash_line_error);
        k.c(f8);
        this.y = f8;
        this.o.setEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p() {
        /*
            r11 = this;
            org.threeten.bp.e r0 = r11.f4950m
            kotlin.jvm.internal.k.c(r0)
            long r0 = g.e.n.c.i.b.e(r0)
            org.threeten.bp.e r2 = r11.f4951n
            kotlin.jvm.internal.k.c(r2)
            long r2 = g.e.n.c.i.b.e(r2)
            java.util.List<g.e.n.c.h.a> r4 = r11.f4945h
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x005c
            boolean r7 = r4 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0024
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0059
        L_0x0024:
            java.util.Iterator r4 = r4.iterator()
        L_0x0028:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0022
            java.lang.Object r7 = r4.next()
            g.e.n.c.h.a r7 = (g.e.n.c.h.a) r7
            java.lang.Long r8 = r7.a()
            if (r8 != 0) goto L_0x0044
            long r7 = r7.b()
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0055
        L_0x0042:
            r7 = 1
            goto L_0x0056
        L_0x0044:
            long r8 = r8.longValue()
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0055
            long r7 = r7.b()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0055
            goto L_0x0042
        L_0x0055:
            r7 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x0028
            r0 = 1
        L_0x0059:
            if (r0 != r6) goto L_0x005c
            r5 = 1
        L_0x005c:
            r11.f4948k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomschedule.b.p():void");
    }

    private final e q(RecyclerView recyclerView, float f2, boolean z2) {
        e t2 = t(recyclerView, f2);
        return (z2 && t2 != null && t2.d0() == 0 && t2.e0() == 0 && t2.g0() == 0) ? t2.k0(1) : t2;
    }

    private final float r(RecyclerView recyclerView, e eVar) {
        e a2 = f.a(eVar);
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
            if (childViewHolder != null) {
                a.b bVar = (a.b) childViewHolder;
                if ((bVar instanceof a.d) && k.a(bVar.M(), a2)) {
                    return H.a((a.d) bVar, eVar);
                }
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.roomschedule.RoomScheduleAdapter.Holder");
            }
        }
        return -((float) recyclerView.getHeight());
    }

    private final void s(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            n.a.a.a("MotionEvent.ACTION_DOWN", new Object[0]);
            if (this.s.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                n.a.a.a("On button down", new Object[0]);
                this.C = true;
                recyclerView.invalidate();
            } else if (Math.abs(motionEvent.getY() - ((float) this.o.top)) < this.p && motionEvent.getX() < ((float) (recyclerView.getWidth() / 2))) {
                n.a.a.a("Selecting top", new Object[0]);
                this.A = true;
            } else if (Math.abs(motionEvent.getY() - ((float) this.o.bottom)) < this.p && motionEvent.getX() > ((float) (recyclerView.getWidth() / 2))) {
                n.a.a.a("Selecting bottom", new Object[0]);
                this.B = true;
            }
        }
        if (this.A) {
            e q2 = q(recyclerView, motionEvent.getY(), false);
            if (q2 != null && (!k.a(q2, this.f4950m)) && q2.O(this.f4951n) && v(q2, this.f4951n)) {
                this.f4950m = q2;
                p();
                recyclerView.invalidate();
            }
        } else if (this.B) {
            e q3 = q(recyclerView, motionEvent.getY(), true);
            if (q3 != null && (!k.a(q3, this.f4951n)) && q3.M(this.f4950m) && v(this.f4950m, q3)) {
                this.f4951n = q3;
                p();
                recyclerView.invalidate();
            }
        } else if (this.C) {
            boolean contains = this.s.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.C = contains;
            if (!contains) {
                recyclerView.invalidate();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            n.a.a.a("MotionEvent.ACTION_UP", new Object[0]);
            this.A = false;
            this.B = false;
            if (this.C) {
                this.C = false;
                this.f4946i = false;
                x(true);
                recyclerView.postDelayed(new C0151b(this, recyclerView), 3333);
                recyclerView.invalidate();
                g.e.c.c.b.b("startAddBookingSelection", 1000);
                p<e, e, x> pVar = this.E;
                e eVar = this.f4950m;
                k.c(eVar);
                e eVar2 = this.f4951n;
                k.c(eVar2);
                pVar.l(eVar, eVar2);
            }
        }
    }

    private final e t(RecyclerView recyclerView, float f2) {
        float f3 = f2 - ((float) this.z);
        View findChildViewUnder = recyclerView.findChildViewUnder((float) (recyclerView.getWidth() / 2), f3);
        if (findChildViewUnder == null) {
            return null;
        }
        RecyclerView.d0 findContainingViewHolder = recyclerView.findContainingViewHolder(findChildViewUnder);
        if (findContainingViewHolder != null) {
            org.threeten.bp.temporal.e M = ((a.b) findContainingViewHolder).M();
            if (M instanceof LocalDate) {
                return ((LocalDate) M).W();
            }
            int top = (int) ((((float) 60) * (f3 - ((float) findChildViewUnder.getTop()))) / ((float) findChildViewUnder.getHeight()));
            int i2 = ((top / 15) + (top % 15 > 7 ? 1 : 0)) * 15;
            if (M != null) {
                return ((e) M).y0((long) i2);
            }
            throw new NullPointerException("null cannot be cast to non-null type org.threeten.bp.LocalDateTime");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.roomschedule.RoomScheduleAdapter.Holder");
    }

    private final boolean v(e eVar, e eVar2) {
        long j2 = 0;
        long e2 = eVar != null ? g.e.n.c.i.b.e(eVar) : 0;
        if (eVar2 != null) {
            j2 = g.e.n.c.i.b.e(eVar2);
        }
        return j2 - e2 <= this.f4944g;
    }

    /* access modifiers changed from: private */
    public final void x(boolean z2) {
        if (z2 != this.f4947j) {
            this.f4947j = z2;
            Drawable drawable = this.D;
            if (!(drawable instanceof Animatable)) {
                return;
            }
            if (z2) {
                ((Animatable) drawable).start();
            } else {
                ((Animatable) drawable).stop();
            }
        }
    }

    private final void z(Canvas canvas, Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setBounds(i2, i3, i4, i5);
        drawable.draw(canvas);
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        k.e(recyclerView, "recyclerView");
        k.e(motionEvent, "motionEvent");
        if (!this.f4946i) {
            return false;
        }
        s(recyclerView, motionEvent);
        if (this.A || this.B) {
            return true;
        }
        return false;
    }

    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        k.e(recyclerView, "recyclerView");
        k.e(motionEvent, "motionEvent");
        if (this.f4946i) {
            s(recyclerView, motionEvent);
        }
    }

    public void e(boolean z2) {
    }

    public void f(long j2) {
        if (!g.e.c.c.b.a("startAddBookingSelection")) {
            this.f4949l = Long.valueOf(j2);
            this.f4946i = true;
        }
    }

    public void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        k.e(canvas, "canvas");
        k.e(recyclerView, "parent");
        k.e(a0Var, "state");
        if (this.f4946i || this.f4947j) {
            Long l2 = this.f4949l;
            if (l2 != null) {
                k.c(l2);
                RecyclerView.d0 findViewHolderForItemId = recyclerView.findViewHolderForItemId(l2.longValue());
                if (findViewHolderForItemId != null) {
                    a.d dVar = (a.d) findViewHolderForItemId;
                    this.f4949l = null;
                    View view = dVar.P().v;
                    k.d(view, "holder.bind.lineHour");
                    this.z = view.getTop();
                    Rect rect = this.o;
                    View view2 = dVar.P().v;
                    k.d(view2, "holder.bind.lineHour");
                    rect.left = view2.getLeft();
                    Rect rect2 = this.o;
                    View view3 = dVar.P().v;
                    k.d(view3, "holder.bind.lineHour");
                    rect2.right = view3.getRight();
                    org.threeten.bp.temporal.e M = dVar.M();
                    if (M != null) {
                        e eVar = (e) M;
                        this.f4950m = eVar;
                        k.c(eVar);
                        this.f4951n = eVar.x0(1);
                        p();
                        if (this.f4948k) {
                            this.f4946i = false;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.threeten.bp.LocalDateTime");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.roomschedule.RoomScheduleAdapter.SlotHolder");
                }
            }
            Rect rect3 = this.o;
            e eVar2 = this.f4950m;
            k.c(eVar2);
            rect3.top = (int) r(recyclerView, eVar2);
            Rect rect4 = this.o;
            e eVar3 = this.f4951n;
            k.c(eVar3);
            rect4.bottom = (int) r(recyclerView, eVar3);
            n.a.a.j("Drawing in: " + this.o + "  -> empty: " + this.o.isEmpty(), new Object[0]);
            Rect rect5 = this.o;
            if (rect5.top >= 0 || rect5.bottom >= 0) {
                Rect rect6 = this.o;
                if (rect6.bottom < 0) {
                    rect6.bottom = recyclerView.getHeight() * 2;
                }
                if (this.f4946i) {
                    Drawable drawable = this.f4948k ? this.y : this.v;
                    Rect rect7 = this.o;
                    int i2 = rect7.left;
                    int i3 = rect7.top;
                    int i4 = this.r;
                    z(canvas, drawable, i2, i3 - i4, rect7.right, rect7.bottom + i4);
                    Drawable drawable2 = this.f4948k ? this.w : this.t;
                    Rect rect8 = this.o;
                    int i5 = rect8.left;
                    int i6 = this.q;
                    int i7 = this.r;
                    int i8 = (i5 - i6) - i7;
                    int i9 = rect8.top;
                    z(canvas, drawable2, i8, i9 - i6, rect8.right + i7, (i9 - i6) + this.t.getIntrinsicHeight());
                    Drawable drawable3 = this.f4948k ? this.x : this.u;
                    Rect rect9 = this.o;
                    int i10 = rect9.left - this.r;
                    int intrinsicHeight = rect9.bottom - this.u.getIntrinsicHeight();
                    int i11 = this.q;
                    int i12 = intrinsicHeight + i11;
                    Rect rect10 = this.o;
                    z(canvas, drawable3, i10, i12, rect10.right + i11 + this.r, rect10.bottom + i11);
                    if (!this.f4948k) {
                        this.s.setState(this.C ? F : G);
                        z(canvas, this.s, this.o.centerX() - (this.s.getIntrinsicWidth() / 2), this.o.centerY() - (this.s.getIntrinsicHeight() / 2), this.o.centerX() + (this.s.getIntrinsicWidth() / 2), this.o.centerY() + (this.s.getIntrinsicHeight() / 2));
                    }
                }
                if (this.f4947j) {
                    z(canvas, this.D, this.o.centerX() - (this.s.getIntrinsicWidth() / 2), this.o.centerY() - (this.s.getIntrinsicHeight() / 2), this.o.centerX() + (this.s.getIntrinsicWidth() / 2), this.o.centerY() + (this.s.getIntrinsicHeight() / 2));
                    Drawable drawable4 = this.v;
                    Rect rect11 = this.o;
                    int i13 = rect11.left;
                    int i14 = rect11.top;
                    int i15 = this.r;
                    z(canvas, drawable4, i13, i14 - i15, rect11.right, rect11.bottom + i15);
                }
            }
        }
    }

    public final void o(RecyclerView recyclerView) {
        k.e(recyclerView, "recyclerView");
        if (this.f4946i && !g.e.c.c.b.a("cancelAddBookingSelection")) {
            this.f4946i = false;
            recyclerView.invalidate();
        }
    }

    public final boolean u() {
        return this.f4946i;
    }

    /* renamed from: w */
    public void k(List<g.e.n.c.h.a> list) {
        this.f4945h = list;
    }

    public final void y(long j2) {
        this.f4944g = j2;
    }
}

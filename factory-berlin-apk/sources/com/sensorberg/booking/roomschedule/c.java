package com.sensorberg.booking.roomschedule;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.booking.roomschedule.a;
import g.e.b.h;
import g.e.d.d;
import g.e.d.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.j;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;
import org.threeten.bp.e;

/* compiled from: RoomScheduleBookingsDecorator.kt */
public final class c extends RecyclerView.n implements f0<List<? extends g.e.n.c.h.a>> {
    public static final a p = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f4954g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f4955h;

    /* renamed from: i  reason: collision with root package name */
    private List<b> f4956i = n.g();

    /* renamed from: j  reason: collision with root package name */
    private final float f4957j = this.o.getResources().getDimension(g.e.b.c.schedule_my_bookings_text_pad);

    /* renamed from: k  reason: collision with root package name */
    private final String f4958k;

    /* renamed from: l  reason: collision with root package name */
    private int f4959l;

    /* renamed from: m  reason: collision with root package name */
    private int f4960m;

    /* renamed from: n  reason: collision with root package name */
    private StaticLayout f4961n;
    private final Context o;

    /* compiled from: RoomScheduleBookingsDecorator.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String c(Context context, g.e.n.c.h.a aVar) {
            if (System.currentTimeMillis() >= aVar.b()) {
                String string = context.getString(h.label_now);
                k.d(string, "context.getString(R.string.label_now)");
                return string;
            }
            e f2 = f.f(aVar.b());
            StringBuilder sb = new StringBuilder();
            sb.append(d.f9748d.b().b(f2));
            Long a = aVar.a();
            if (a != null) {
                long longValue = a.longValue();
                sb.append(" - ");
                sb.append(d.f9748d.b().b(f.f(longValue)));
            }
            String sb2 = sb.toString();
            k.d(sb2, "sb.toString()");
            return sb2;
        }

        /* access modifiers changed from: private */
        public final StaticLayout d(Context context, String str, Paint.Align align) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(context.getResources().getDimension(g.e.b.c.schedule_my_bookings_text_size));
            textPaint.setTextAlign(align);
            textPaint.setColor(androidx.core.content.a.c(context, g.e.b.b.primary));
            Resources resources = context.getResources();
            k.d(resources, "context.resources");
            return new StaticLayout(str, textPaint, resources.getDisplayMetrics().widthPixels / 2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RoomScheduleBookingsDecorator.kt */
    private static final class b {
        private final g.e.n.c.h.a a;
        private final e b;
        private final e c;

        /* renamed from: d  reason: collision with root package name */
        private final e f4962d;

        /* renamed from: e  reason: collision with root package name */
        private final e f4963e;

        /* renamed from: f  reason: collision with root package name */
        private final long f4964f;

        /* renamed from: g  reason: collision with root package name */
        private final String f4965g;

        /* renamed from: h  reason: collision with root package name */
        private final StaticLayout f4966h;

        public b(g.e.n.c.h.a aVar, Context context) {
            k.e(aVar, "timePeriod");
            k.e(context, "context");
            this.a = aVar;
            this.b = f.f(aVar.b());
            Long a2 = this.a.a();
            e eVar = null;
            this.c = a2 != null ? f.f(a2.longValue()) : null;
            this.f4962d = f.a(this.b);
            e eVar2 = this.c;
            eVar = eVar2 != null ? f.a(eVar2) : eVar;
            this.f4963e = eVar;
            this.f4964f = (eVar != null ? g.e.n.c.i.b.e(eVar) : 0) - (g.e.n.c.i.b.e(this.f4962d) / ((long) 3600000));
            String a3 = c.p.c(context, aVar);
            this.f4965g = a3;
            this.f4966h = c.p.d(context, a3, Paint.Align.RIGHT);
        }

        public final e a() {
            return this.c;
        }

        public final e b() {
            return this.f4963e;
        }

        public final StaticLayout c() {
            return this.f4966h;
        }

        public final long d() {
            return this.f4964f;
        }

        public final g.e.n.c.h.a e() {
            return this.a;
        }

        public final e f() {
            return this.b;
        }

        public final e g() {
            return this.f4962d;
        }
    }

    public c(Context context) {
        k.e(context, "context");
        this.o = context;
        Drawable f2 = androidx.core.content.a.f(context, g.e.b.d.room_schedule_booking);
        k.c(f2);
        this.f4954g = f2;
        Drawable f3 = androidx.core.content.a.f(this.o, g.e.b.d.booked_pattern);
        k.c(f3);
        k.d(f3, "ContextCompat.getDrawabl…rawable.booked_pattern)!!");
        this.f4955h = new h(f3, Shader.TileMode.REPEAT);
        String string = this.o.getResources().getString(h.label_my_bookings);
        k.d(string, "context.resources.getStr…string.label_my_bookings)");
        this.f4958k = string;
        this.f4959l = -1;
        this.f4960m = -1;
    }

    /* JADX INFO: finally extract failed */
    private final void n(Canvas canvas, b bVar, int i2, int i3, int i4, int i5) {
        g.e.n.c.h.a e2 = bVar.e();
        this.f4954g.setBounds(i2, i3, i4, i5);
        this.f4954g.draw(canvas);
        if (e2.c()) {
            float f2 = this.f4957j;
            float f3 = ((float) i2) + f2;
            float f4 = ((float) i3) + f2;
            int save = canvas.save();
            canvas.translate(f3, f4);
            try {
                r(this.f4958k).draw(canvas);
                canvas.restoreToCount(save);
                float f5 = this.f4957j;
                float f6 = ((float) i4) - f5;
                float height = (((float) i5) - f5) - ((float) bVar.c().getHeight());
                int save2 = canvas.save();
                canvas.translate(f6, height);
                try {
                    bVar.c().draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        } else {
            this.f4955h.setBounds(i2, i3, i4, i5);
            this.f4955h.draw(canvas);
        }
    }

    private final e o(RecyclerView recyclerView, int i2) {
        RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
        if (childViewHolder != null) {
            org.threeten.bp.temporal.e M = ((a.b) childViewHolder).M();
            e eVar = (e) (!(M instanceof e) ? null : M);
            if (eVar != null) {
                return eVar;
            }
            if (M != null) {
                e W = ((LocalDate) M).W();
                k.d(W, "(date as LocalDate).atStartOfDay()");
                return W;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.threeten.bp.LocalDate");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.roomschedule.RoomScheduleAdapter.Holder");
    }

    private final j<Integer, Integer> p(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                a.d q = q(recyclerView, i2);
                if (q == null) {
                    if (i2 == childCount) {
                        break;
                    }
                    i2++;
                } else {
                    View view = q.P().v;
                    k.d(view, "h.bind.lineHour");
                    Integer valueOf = Integer.valueOf(view.getLeft());
                    View view2 = q.P().v;
                    k.d(view2, "h.bind.lineHour");
                    return new j<>(valueOf, Integer.valueOf(view2.getRight()));
                }
            }
        }
        throw new IllegalStateException("Can't find left/right borders without child views");
    }

    private final a.d q(RecyclerView recyclerView, int i2) {
        RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
        if (childViewHolder != null) {
            a.b bVar = (a.b) childViewHolder;
            if (!(bVar instanceof a.d)) {
                bVar = null;
            }
            return (a.d) bVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.booking.roomschedule.RoomScheduleAdapter.Holder");
    }

    private final StaticLayout r(String str) {
        if (this.f4961n == null) {
            this.f4961n = p.d(this.o, str, Paint.Align.LEFT);
        }
        StaticLayout staticLayout = this.f4961n;
        if (staticLayout != null) {
            return staticLayout;
        }
        k.q("myBookings");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0191 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x004c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.graphics.Canvas r13, androidx.recyclerview.widget.RecyclerView r14, androidx.recyclerview.widget.RecyclerView.a0 r15) {
        /*
            r12 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.k.e(r13, r0)
            java.lang.String r0 = "rv"
            kotlin.jvm.internal.k.e(r14, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.k.e(r15, r0)
            int r15 = r14.getChildCount()
            java.util.List<com.sensorberg.booking.roomschedule.c$b> r0 = r12.f4956i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0191
            if (r15 != 0) goto L_0x001f
            goto L_0x0191
        L_0x001f:
            int r0 = r12.f4959l
            r1 = -1
            if (r0 == r1) goto L_0x0028
            int r0 = r12.f4960m
            if (r0 != r1) goto L_0x0044
        L_0x0028:
            kotlin.j r0 = r12.p(r14)
            java.lang.Object r1 = r0.a()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.f4959l = r1
            r12.f4960m = r0
        L_0x0044:
            java.util.List<com.sensorberg.booking.roomschedule.c$b> r0 = r12.f4956i
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x004c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0191
            java.lang.Object r3 = r0.next()
            r6 = r3
            com.sensorberg.booking.roomschedule.c$b r6 = (com.sensorberg.booking.roomschedule.c.b) r6
            g.e.n.c.h.a r3 = r6.e()
            java.lang.Long r3 = r3.a()
            if (r3 == 0) goto L_0x0070
            long r3 = r3.longValue()
            long r7 = java.lang.System.currentTimeMillis()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0070
            goto L_0x004c
        L_0x0070:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0074:
            java.lang.String r5 = "null cannot be cast to non-null type org.threeten.bp.LocalDateTime"
            if (r4 != r3) goto L_0x00bd
            if (r2 >= r15) goto L_0x00bd
            com.sensorberg.booking.roomschedule.a$d r7 = r12.q(r14, r2)
            if (r7 != 0) goto L_0x0083
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0083:
            org.threeten.bp.temporal.e r8 = r7.M()
            if (r8 == 0) goto L_0x00b7
            org.threeten.bp.e r8 = (org.threeten.bp.e) r8
            org.threeten.bp.e r9 = r6.g()
            boolean r9 = r9.M(r8)
            if (r9 == 0) goto L_0x0096
            goto L_0x0080
        L_0x0096:
            org.threeten.bp.e r9 = r6.g()
            boolean r9 = kotlin.jvm.internal.k.a(r9, r8)
            if (r9 == 0) goto L_0x00ac
            com.sensorberg.booking.roomschedule.b$a r4 = com.sensorberg.booking.roomschedule.b.H
            org.threeten.bp.e r5 = r6.f()
            float r4 = r4.a(r7, r5)
            int r4 = (int) r4
            goto L_0x0074
        L_0x00ac:
            org.threeten.bp.e r7 = r6.g()
            boolean r7 = r8.M(r7)
            if (r7 == 0) goto L_0x0074
            goto L_0x00bd
        L_0x00b7:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r5)
            throw r13
        L_0x00bd:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00bf:
            if (r7 != r3) goto L_0x0113
            if (r2 >= r15) goto L_0x0113
            com.sensorberg.booking.roomschedule.a$d r8 = r12.q(r14, r2)
            if (r8 != 0) goto L_0x00cc
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00bf
        L_0x00cc:
            org.threeten.bp.temporal.e r9 = r8.M()
            if (r9 == 0) goto L_0x010d
            org.threeten.bp.e r9 = (org.threeten.bp.e) r9
            org.threeten.bp.e r10 = r6.b()
            if (r10 == 0) goto L_0x0113
            org.threeten.bp.e r10 = r6.a()
            if (r10 != 0) goto L_0x00e1
            goto L_0x0113
        L_0x00e1:
            org.threeten.bp.e r10 = r6.b()
            boolean r10 = r10.M(r9)
            if (r10 == 0) goto L_0x00ec
            goto L_0x00c9
        L_0x00ec:
            org.threeten.bp.e r10 = r6.b()
            boolean r10 = kotlin.jvm.internal.k.a(r10, r9)
            if (r10 == 0) goto L_0x0102
            com.sensorberg.booking.roomschedule.b$a r7 = com.sensorberg.booking.roomschedule.b.H
            org.threeten.bp.e r9 = r6.a()
            float r7 = r7.a(r8, r9)
            int r7 = (int) r7
            goto L_0x00bf
        L_0x0102:
            org.threeten.bp.e r8 = r6.b()
            boolean r8 = r9.M(r8)
            if (r8 == 0) goto L_0x00bf
            goto L_0x0113
        L_0x010d:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r5)
            throw r13
        L_0x0113:
            long r8 = r6.d()
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0126
            long r8 = r6.d()
            long r10 = (long) r15
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x015d
        L_0x0126:
            org.threeten.bp.e r5 = r12.o(r14, r1)
            int r8 = r15 + -1
            org.threeten.bp.e r8 = r12.o(r14, r8)
            org.threeten.bp.e r9 = r6.g()
            boolean r5 = r9.O(r5)
            if (r5 == 0) goto L_0x015d
            org.threeten.bp.e r5 = r6.b()
            if (r5 == 0) goto L_0x014a
            org.threeten.bp.e r5 = r6.b()
            boolean r5 = r5.M(r8)
            if (r5 == 0) goto L_0x015d
        L_0x014a:
            int r15 = r12.f4959l
            int r8 = -r15
            int r14 = r14.getHeight()
            int r7 = r12.f4959l
            int r10 = r14 + r7
            int r9 = r12.f4960m
            r4 = r12
            r5 = r13
            r4.n(r5, r6, r7, r8, r9, r10)
            goto L_0x0191
        L_0x015d:
            if (r4 != r3) goto L_0x0163
            if (r7 != r3) goto L_0x0163
            goto L_0x004c
        L_0x0163:
            if (r4 != r3) goto L_0x0178
            java.lang.String r3 = r12.f4958k
            android.text.StaticLayout r3 = r12.r(r3)
            int r3 = r3.getHeight()
            int r3 = -r3
            float r4 = r12.f4957j
            int r4 = (int) r4
            int r3 = r3 - r4
            int r3 = r3 + -1
            r8 = r3
            goto L_0x0185
        L_0x0178:
            if (r7 != r3) goto L_0x0184
            int r3 = r14.getHeight()
            int r5 = r12.f4959l
            int r3 = r3 + r5
            r10 = r3
            r8 = r4
            goto L_0x0186
        L_0x0184:
            r8 = r4
        L_0x0185:
            r10 = r7
        L_0x0186:
            int r7 = r12.f4959l
            int r9 = r12.f4960m
            r4 = r12
            r5 = r13
            r4.n(r5, r6, r7, r8, r9, r10)
            if (r2 < r15) goto L_0x004c
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomschedule.c.m(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: s */
    public void k(List<g.e.n.c.h.a> list) {
        k.e(list, "timePeriodList");
        ArrayList arrayList = new ArrayList(o.p(list, 10));
        for (g.e.n.c.h.a bVar : list) {
            arrayList.add(new b(bVar, this.o));
        }
        this.f4956i = arrayList;
    }
}

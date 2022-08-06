package com.sensorberg.smartworkspace.app.screens.alarm.q;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.i;
import com.sensorberg.smartworkspace.app.screens.alarm.f;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: AlarmItemViewHolder.kt */
public final class b extends g.e.d.c {
    private final Resources u;
    /* access modifiers changed from: private */
    public final i v;
    private final Runnable w = new e(this);
    /* access modifiers changed from: private */
    public final f x;
    /* access modifiers changed from: private */
    public final Handler y;

    /* compiled from: AlarmItemViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7344g;

        a(b bVar) {
            this.f7344g = bVar;
        }

        public final void onClick(View view) {
            b bVar = this.f7344g;
            Group group = bVar.v.z;
            k.d(group, "binding.alarmItemLowerGroup");
            bVar.S(group.getVisibility() != 0);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.alarm.q.b$b  reason: collision with other inner class name */
    /* compiled from: AlarmItemViewHolder.kt */
    static final class C0482b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7345g;

        C0482b(b bVar) {
            this.f7345g = bVar;
        }

        public final void onClick(View view) {
            f M = this.f7345g.x;
            m.b M2 = this.f7345g.v.M();
            k.c(M2);
            k.d(M2, "binding.widget!!");
            M.h(M2);
        }
    }

    /* compiled from: AlarmItemViewHolder.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7346g;

        c(b bVar) {
            this.f7346g = bVar;
        }

        public final void onClick(View view) {
            f M = this.f7346g.x;
            m.b M2 = this.f7346g.v.M();
            k.c(M2);
            k.d(M2, "binding.widget!!");
            M.c(M2);
        }
    }

    /* compiled from: AlarmItemViewHolder.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AlarmItemViewHolder.kt */
    public static final class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7347g;

        e(b bVar) {
            this.f7347g = bVar;
        }

        public void run() {
            m.b M = this.f7347g.v.M();
            if (M != null) {
                k.d(M, "binding.widget ?: return");
                long c = M.c() - g.e.h.b.c.b.c();
                this.f7347g.V(c);
                if (c > 0) {
                    this.f7347g.y.postDelayed(this, 1000);
                }
            }
        }
    }

    static {
        new d((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup, f fVar, Handler handler) {
        super(R.layout.alarm_item_viewholder, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(fVar, "alarmListener");
        k.e(handler, "handler");
        this.x = fVar;
        this.y = handler;
        View view = this.a;
        k.d(view, "itemView");
        Resources resources = view.getResources();
        k.d(resources, "itemView.resources");
        this.u = resources;
        ViewDataBinding a2 = androidx.databinding.f.a(this.a);
        k.c(a2);
        this.v = (i) a2;
        View view2 = this.a;
        k.d(view2, "itemView");
        com.sensorberg.smartworkspace.app.screens.spaces.a aVar = com.sensorberg.smartworkspace.app.screens.spaces.a.a;
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        view2.setBackground(aVar.b(context, R.color.surface));
        this.v.C.setOnClickListener(new a(this));
        this.v.w.setOnClickListener(new C0482b(this));
        this.v.x.setOnClickListener(new c(this));
    }

    /* access modifiers changed from: private */
    public final void S(boolean z) {
        Group group = this.v.z;
        k.d(group, "binding.alarmItemLowerGroup");
        group.setVisibility(z ? 0 : 8);
        if (group.getVisibility() == 0) {
            T();
        } else {
            U();
        }
    }

    private final void T() {
        this.y.removeCallbacks(this.w);
        this.y.post(this.w);
    }

    private final void U() {
        this.y.removeCallbacks(this.w);
    }

    /* access modifiers changed from: private */
    public final void V(long j2) {
        if (j2 < 1000) {
            TextView textView = this.v.v;
            k.d(textView, "binding.alarmDetailCountdownTextview");
            textView.setText("00:00:00");
            return;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j2);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
        TextView textView2 = this.v.v;
        k.d(textView2, "binding.alarmDetailCountdownTextview");
        x xVar = x.a;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(minutes))}, 3));
        k.d(format, "java.lang.String.format(format, *args)");
        textView2.setText(format);
    }

    public final void R(m.b bVar) {
        k.e(bVar, "widget");
        this.v.N(bVar);
        this.v.n();
        String valueOf = String.valueOf(TimeUnit.SECONDS.toHours((long) bVar.e()));
        Button button = this.v.w;
        k.d(button, "binding.alarmDetailPostponeButton");
        button.setText(this.u.getString(R.string.label_alarm_postpone, new Object[]{valueOf}));
        boolean b = bVar.b();
        this.v.A.setText(b ? R.string.label_enabled : R.string.label_disabled);
        S(!b);
    }
}

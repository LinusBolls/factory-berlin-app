package com.sensorberg.smartworkspace.app.screens.alarm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import g.e.d.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: AlarmAdapter.kt */
public final class a extends q<m, c> {

    /* renamed from: m  reason: collision with root package name */
    private static final h.d<m> f7313m = new C0480a();

    /* renamed from: k  reason: collision with root package name */
    private final f f7314k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f7315l;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.alarm.a$a  reason: collision with other inner class name */
    /* compiled from: AlarmAdapter.kt */
    public static final class C0480a extends h.d<m> {
        C0480a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(m mVar, m mVar2) {
            k.e(mVar, "oldItem");
            k.e(mVar2, "newItem");
            return k.a(mVar, mVar2);
        }

        /* renamed from: e */
        public boolean b(m mVar, m mVar2) {
            k.e(mVar, "oldItem");
            k.e(mVar2, "newItem");
            if (!(mVar instanceof m.b) || !(mVar2 instanceof m.b)) {
                return k.a(mVar.a(), mVar2.a());
            }
            return k.a(((m.b) mVar).d(), ((m.b) mVar2).d());
        }
    }

    /* compiled from: AlarmAdapter.kt */
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(f fVar, Handler handler) {
        super(f7313m);
        k.e(fVar, "alarmListener");
        k.e(handler, "handler");
        this.f7314k = fVar;
        this.f7315l = handler;
    }

    /* renamed from: L */
    public void x(c cVar, int i2) {
        k.e(cVar, "holder");
        if (cVar instanceof com.sensorberg.smartworkspace.app.screens.alarm.q.c) {
            com.sensorberg.smartworkspace.app.screens.alarm.q.c cVar2 = (com.sensorberg.smartworkspace.app.screens.alarm.q.c) cVar;
            Object I = I(i2);
            if (I != null) {
                cVar2.M((m.c) I);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.alarm.AlarmWidget.Title");
        } else if (cVar instanceof com.sensorberg.smartworkspace.app.screens.alarm.q.a) {
            com.sensorberg.smartworkspace.app.screens.alarm.q.a aVar = (com.sensorberg.smartworkspace.app.screens.alarm.q.a) cVar;
            Object I2 = I(i2);
            if (I2 != null) {
                aVar.M((m.a) I2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.alarm.AlarmWidget.Info");
        } else if (cVar instanceof com.sensorberg.smartworkspace.app.screens.alarm.q.b) {
            com.sensorberg.smartworkspace.app.screens.alarm.q.b bVar = (com.sensorberg.smartworkspace.app.screens.alarm.q.b) cVar;
            Object I3 = I(i2);
            if (I3 != null) {
                bVar.R((m.b) I3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.alarm.AlarmWidget.Item");
        }
    }

    /* renamed from: M */
    public c z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 0) {
            return new com.sensorberg.smartworkspace.app.screens.alarm.q.c(viewGroup);
        }
        if (i2 == 1) {
            return new com.sensorberg.smartworkspace.app.screens.alarm.q.a(viewGroup);
        }
        if (i2 == 2) {
            return new com.sensorberg.smartworkspace.app.screens.alarm.q.b(viewGroup, this.f7314k, this.f7315l);
        }
        throw new IllegalStateException("Unknown viewType: " + i2);
    }

    public int getItemViewType(int i2) {
        m mVar = (m) I(i2);
        if (mVar instanceof m.c) {
            return 0;
        }
        if (mVar instanceof m.a) {
            return 1;
        }
        if (mVar instanceof m.b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

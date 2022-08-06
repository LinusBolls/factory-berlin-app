package com.sensorberg.smartworkspace.app.screens.locker.e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.w;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.b.a.d.a.b;

/* compiled from: LockerBookedFragment.kt */
public final class a extends com.sensorberg.smartworkspace.app.a {
    private HashMap e0;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.e.a$a  reason: collision with other inner class name */
    /* compiled from: LockerBookedFragment.kt */
    static final class C0506a<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7590g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.e.a$a$a  reason: collision with other inner class name */
        /* compiled from: LockerBookedFragment.kt */
        static final class C0507a extends l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0506a f7591h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0507a(C0506a aVar) {
                super(1);
                this.f7591h = aVar;
            }

            public final void a(p pVar) {
                k.e(pVar, "it");
                androidx.navigation.fragment.a.a(this.f7591h.f7590g).s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        C0506a(a aVar) {
            this.f7590g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new C0507a(this));
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        w wVar = (w) R1(R.layout.frag_locker_booked, viewGroup);
        b bVar = (b) b.b(this, v.b(b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        wVar.M(bVar);
        bVar.u().o(a0(), new C0506a(this));
        return wVar.y;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

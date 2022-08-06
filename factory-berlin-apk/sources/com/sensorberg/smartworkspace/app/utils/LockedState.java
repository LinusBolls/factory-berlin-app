package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import g.e.h.b.b;
import g.e.h.b.c;
import kotlin.i;
import kotlin.jvm.internal.k;
import n.a.a;

@i(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000:\u0001\u0017B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00060\rR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/sensorberg/smartworkspace/app/utils/LockedState;", "Landroidx/lifecycle/LiveData;", "", "isUnlocked", "()Landroidx/lifecycle/LiveData;", "", "any", "", "unlock", "(Ljava/lang/Object;)V", "Lcom/sensorberg/libs/time/ElapsedTime;", "backgroundTime", "Lcom/sensorberg/libs/time/ElapsedTime;", "Lcom/sensorberg/smartworkspace/app/utils/LockedState$LockedData;", "data", "Lcom/sensorberg/smartworkspace/app/utils/LockedState$LockedData;", "", "timeout", "J", "Landroidx/lifecycle/LifecycleOwner;", "owner", "<init>", "(JLandroidx/lifecycle/LifecycleOwner;)V", "LockedData", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockedState.kt */
public final class LockedState {
    /* access modifiers changed from: private */
    public b a = c.b.a();
    /* access modifiers changed from: private */
    public final LockedData b;
    /* access modifiers changed from: private */
    public final long c;

    @i(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/sensorberg/smartworkspace/app/utils/LockedState$LockedData;", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LiveData;", "", "onStart$app_appCenterRelease", "()V", "onStart", "onStop$app_appCenterRelease", "onStop", "", "value", "setValue", "(Ljava/lang/Boolean;)V", "", "any", "unlock", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "<init>", "(Lcom/sensorberg/smartworkspace/app/utils/LockedState;Landroidx/lifecycle/LifecycleOwner;)V", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: LockedState.kt */
    public final class LockedData extends LiveData<Boolean> implements u {
        final /* synthetic */ LockedState q;

        public LockedData(LockedState lockedState, v vVar) {
            k.e(vVar, "owner");
            this.q = lockedState;
            u(Boolean.FALSE);
            vVar.a().a(this);
        }

        @g0(p.a.ON_START)
        public final void onStart$app_appCenterRelease() {
            if (k.a(l(), Boolean.TRUE) && this.q.a.a() > this.q.c) {
                a.a("Lock timeout exceeded -> locking the app", new Object[0]);
                u(Boolean.FALSE);
            }
        }

        @g0(p.a.ON_STOP)
        public final void onStop$app_appCenterRelease() {
            this.q.a = c.b.a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void u(Boolean bool) {
            super.u(bool);
            if (k.a(bool, Boolean.TRUE)) {
                a.f("App changed to unlocked", new Object[0]);
            } else {
                a.f("App changed to locked", new Object[0]);
            }
        }

        public final void w(Object obj) {
            k.e(obj, "any");
            if (obj instanceof com.sensorberg.smartworkspace.app.activities.pin.c) {
                this.q.b.u(Boolean.TRUE);
                return;
            }
            throw new IllegalArgumentException("Only PinViewModel can unlock the app");
        }
    }

    public LockedState(long j2, v vVar) {
        k.e(vVar, "owner");
        this.c = j2;
        this.b = new LockedData(this, vVar);
    }

    public final LiveData<Boolean> e() {
        return this.b;
    }

    public final void f(Object obj) {
        k.e(obj, "any");
        this.b.w(obj);
    }
}

package com.sensorberg.notifications.sdk.internal.storage;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.b;
import com.sensorberg.notifications.sdk.internal.model.d;
import com.sensorberg.notifications.sdk.internal.model.e;
import com.sensorberg.notifications.sdk.internal.model.k;
import com.sensorberg.notifications.sdk.internal.model.l;
import com.sensorberg.notifications.sdk.internal.model.m;
import java.util.Collection;
import java.util.List;

/* compiled from: ActionDao.kt */
public abstract class a {
    public abstract void a(List<com.sensorberg.notifications.sdk.internal.model.a> list);

    public abstract void b(List<b> list);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract List<com.sensorberg.notifications.sdk.internal.model.a> f();

    public abstract List<b> g();

    public abstract List<e> h(String str, long j2, Trigger.b... bVarArr);

    public abstract k i(String str);

    public abstract long j(String str, long j2);

    public abstract void k(com.sensorberg.notifications.sdk.internal.model.a... aVarArr);

    public abstract void l(b... bVarArr);

    public abstract void m(Collection<d> collection);

    public abstract void n(Collection<m> collection);

    public abstract void o(k... kVarArr);

    public abstract void p(Collection<l> collection);
}

package com.sensorberg.notifications.sdk.internal.m;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.b;
import com.sensorberg.notifications.sdk.internal.model.d;
import com.sensorberg.notifications.sdk.internal.model.l;
import com.sensorberg.notifications.sdk.internal.model.m;
import java.util.List;
import java.util.Map;
import kotlin.x;

/* compiled from: Backend.kt */
public interface a {

    /* renamed from: com.sensorberg.notifications.sdk.internal.m.a$a  reason: collision with other inner class name */
    /* compiled from: Backend.kt */
    public interface C0169a {
        void a();

        void b(List<? extends Trigger> list, List<l> list2, List<d> list3, List<m> list4);
    }

    void a(List<b> list, List<com.sensorberg.notifications.sdk.internal.model.a> list2, kotlin.e0.c.l<? super Boolean, x> lVar);

    void b(Map<String, String> map);

    void c(C0169a aVar);

    void d(String str);
}

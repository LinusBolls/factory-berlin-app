package com.sensorberg.notifications.sdk.internal.storage;

import android.app.Application;
import androidx.room.l;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.d;
import com.sensorberg.notifications.sdk.internal.model.g;
import com.sensorberg.notifications.sdk.internal.model.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;", "Landroidx/room/l;", "Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;", "actionDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;", "Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;", "beaconDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;", "Lcom/sensorberg/notifications/sdk/internal/storage/BeaconRegistrationDao;", "beaconRegistrationDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/BeaconRegistrationDao;", "Lcom/sensorberg/notifications/sdk/internal/storage/DelayedActionDao;", "delayedActionDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/DelayedActionDao;", "Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "geofenceDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "", "Lcom/sensorberg/notifications/sdk/internal/model/TimePeriod;", "timePeriods", "Lcom/sensorberg/notifications/sdk/internal/model/ActionModel;", "actions", "Lcom/sensorberg/notifications/sdk/internal/model/TriggerActionMap;", "mappings", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger;", "triggers", "", "insertData", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "<init>", "()V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SdkDatabase.kt */
public abstract class SdkDatabase extends l {

    /* renamed from: l  reason: collision with root package name */
    public static final a f5369l = new a((DefaultConstructorMarker) null);

    /* compiled from: SdkDatabase.kt */
    public static final class a {
        private a() {
        }

        public final SdkDatabase a(Application application) {
            k.f(application, "app");
            l.a<SdkDatabase> a = androidx.room.k.a(application, SdkDatabase.class, "notifications-sdk");
            androidx.room.v.a[] b = i.f5396d.b();
            a.b((androidx.room.v.a[]) Arrays.copyOf(b, b.length));
            SdkDatabase d2 = a.d();
            k.b(d2, "Room\n\t\t\t\t.databaseBuilde….migrations)\n\t\t\t\t.build()");
            return d2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SdkDatabase.kt */
    static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SdkDatabase f5370g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f5371h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f5372i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f5373j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ List f5374k;

        b(SdkDatabase sdkDatabase, List list, List list2, List list3, List list4) {
            this.f5370g = sdkDatabase;
            this.f5371h = list;
            this.f5372i = list2;
            this.f5373j = list3;
            this.f5374k = list4;
        }

        public final void run() {
            a y = this.f5370g.y();
            y.c();
            y.d();
            y.e();
            y.m(this.f5371h);
            y.n(this.f5372i);
            y.p(this.f5373j);
            l C = this.f5370g.C();
            C.c();
            List list = this.f5374k;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                com.sensorberg.notifications.sdk.internal.model.i iVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Trigger trigger = (Trigger) it.next();
                if (trigger instanceof Trigger.a) {
                    iVar = o.a.a((Trigger.a) trigger);
                }
                if (iVar != null) {
                    arrayList.add(iVar);
                }
            }
            C.h(arrayList);
            e A = this.f5370g.A();
            A.a();
            List<Trigger> list2 = this.f5374k;
            ArrayList arrayList2 = new ArrayList();
            for (Trigger trigger2 : list2) {
                g a = trigger2 instanceof Trigger.Beacon ? g.f5283f.a((Trigger.Beacon) trigger2) : null;
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            A.c(arrayList2);
        }
    }

    public abstract e A();

    public abstract j B();

    public abstract l C();

    public final void D(List<com.sensorberg.notifications.sdk.internal.model.l> list, List<d> list2, List<m> list3, List<? extends Trigger> list4) {
        k.f(list, "timePeriods");
        k.f(list2, "actions");
        k.f(list3, "mappings");
        k.f(list4, "triggers");
        w(new b(this, list2, list3, list, list4));
    }

    public abstract a y();

    public abstract c z();
}

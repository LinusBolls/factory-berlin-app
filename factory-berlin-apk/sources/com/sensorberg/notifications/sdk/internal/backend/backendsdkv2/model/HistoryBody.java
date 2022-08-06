package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.sensorberg.notifications.sdk.internal.model.b;
import com.squareup.moshi.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import org.threeten.bp.d;
import org.threeten.bp.format.c;
import org.threeten.bp.o;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u0000 \u001f:\u0001\u001fB7\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ@\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tR!\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0004R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\t¨\u0006 "}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/HistoryBody;", "", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;", "component1", "()Ljava/util/List;", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;", "component2", "", "component3", "()Ljava/lang/String;", "actions", "conversions", "deviceTimestamp", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/HistoryBody;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getActions", "getConversions", "Ljava/lang/String;", "getDeviceTimestamp", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: HistoryBody.kt */
public final class HistoryBody {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final c f5157d = c.f11507k;

    /* renamed from: e  reason: collision with root package name */
    public static final a f5158e = new a((DefaultConstructorMarker) null);
    private final List<BeaconAction> a;
    private final List<ActionConversion> b;
    private final String c;

    /* compiled from: HistoryBody.kt */
    public static final class a {
        private a() {
        }

        private final BeaconAction b(b bVar) {
            BeaconAction beaconAction = new BeaconAction((String) null, 0, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            beaconAction.f(bVar.b());
            beaconAction.i(bVar.h());
            beaconAction.j(c.a(bVar.i()));
            beaconAction.h(bVar.j());
            beaconAction.g(bVar.c());
            return beaconAction;
        }

        private final ActionConversion c(com.sensorberg.notifications.sdk.internal.model.a aVar) {
            return new ActionConversion(aVar.a(), Long.valueOf(aVar.f()), Integer.valueOf(ActionConversion.f5153d.a(aVar.g())));
        }

        public final HistoryBody a(List<b> list, List<com.sensorberg.notifications.sdk.internal.model.a> list2) {
            ArrayList arrayList;
            String b = HistoryBody.f5157d.b(d.S(System.currentTimeMillis()).C(o.C()));
            ArrayList arrayList2 = null;
            if (list != null) {
                arrayList = new ArrayList(o.p(list, 10));
                for (b b2 : list) {
                    arrayList.add(HistoryBody.f5158e.b(b2));
                }
            } else {
                arrayList = null;
            }
            if (list2 != null) {
                arrayList2 = new ArrayList(o.p(list2, 10));
                for (com.sensorberg.notifications.sdk.internal.model.a c : list2) {
                    arrayList2.add(HistoryBody.f5158e.c(c));
                }
            }
            return new HistoryBody(arrayList, arrayList2, b);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HistoryBody() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public HistoryBody(List<BeaconAction> list, List<ActionConversion> list2, String str) {
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final List<BeaconAction> b() {
        return this.a;
    }

    public final List<ActionConversion> c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryBody)) {
            return false;
        }
        HistoryBody historyBody = (HistoryBody) obj;
        return k.a(this.a, historyBody.a) && k.a(this.b, historyBody.b) && k.a(this.c, historyBody.c);
    }

    public int hashCode() {
        List<BeaconAction> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ActionConversion> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "HistoryBody(actions=" + this.a + ", conversions=" + this.b + ", deviceTimestamp=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryBody(List list, List list2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : str);
    }
}

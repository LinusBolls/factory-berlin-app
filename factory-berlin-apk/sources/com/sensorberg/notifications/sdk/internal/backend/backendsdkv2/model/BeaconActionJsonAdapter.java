package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconActionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BeaconActionJsonAdapter.kt */
public final class BeaconActionJsonAdapter extends JsonAdapter<BeaconAction> {
    private volatile Constructor<BeaconAction> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final g.b options;

    public BeaconActionJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("eid", "dt", "trigger", "pid", "uuid");
        k.b(a, "JsonReader.Options.of(\"e…er\", \"pid\",\n      \"uuid\")");
        this.options = a;
        JsonAdapter<String> f2 = nVar.f(String.class, i0.b(), "actionId");
        k.b(f2, "moshi.adapter(String::cl…  emptySet(), \"actionId\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<Long> f3 = nVar.f(Long.TYPE, i0.b(), "timeOfPresentation");
        k.b(f3, "moshi.adapter(Long::clas…    \"timeOfPresentation\")");
        this.longAdapter = f3;
        JsonAdapter<Integer> f4 = nVar.f(Integer.TYPE, i0.b(), "trigger");
        k.b(f4, "moshi.adapter(Int::class…a, emptySet(), \"trigger\")");
        this.intAdapter = f4;
    }

    /* renamed from: i */
    public BeaconAction b(g gVar) {
        long j2;
        g gVar2 = gVar;
        Class<String> cls = String.class;
        k.f(gVar2, "reader");
        long j3 = 0L;
        int i2 = 0;
        gVar.b();
        int i3 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (gVar.hasNext()) {
            int K = gVar2.K(this.options);
            if (K != -1) {
                if (K == 0) {
                    str = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967294L;
                } else if (K == 1) {
                    Long b = this.longAdapter.b(gVar2);
                    if (b != null) {
                        j3 = Long.valueOf(b.longValue());
                        j2 = 4294967293L;
                    } else {
                        JsonDataException u = a.u("timeOfPresentation", "dt", gVar2);
                        k.b(u, "Util.unexpectedNull(\"tim…sentation\", \"dt\", reader)");
                        throw u;
                    }
                } else if (K == 2) {
                    Integer b2 = this.intAdapter.b(gVar2);
                    if (b2 != null) {
                        i2 = Integer.valueOf(b2.intValue());
                        j2 = 4294967291L;
                    } else {
                        JsonDataException u2 = a.u("trigger", "trigger", gVar2);
                        k.b(u2, "Util.unexpectedNull(\"tri…r\",\n              reader)");
                        throw u2;
                    }
                } else if (K == 3) {
                    str2 = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967287L;
                } else if (K == 4) {
                    str3 = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967279L;
                }
                i3 &= (int) j2;
            } else {
                gVar.Z();
                gVar.skipValue();
            }
        }
        gVar.i();
        Constructor<BeaconAction> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls2 = Integer.TYPE;
            constructor = BeaconAction.class.getDeclaredConstructor(new Class[]{cls, Long.TYPE, cls2, cls, cls, cls2, a.c});
            this.constructorRef = constructor;
            k.b(constructor, "BeaconAction::class.java…his.constructorRef = it }");
        }
        BeaconAction newInstance = constructor.newInstance(new Object[]{str, j3, i2, str2, str3, Integer.valueOf(i3), null});
        k.b(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    /* renamed from: j */
    public void h(l lVar, BeaconAction beaconAction) {
        k.f(lVar, "writer");
        if (beaconAction != null) {
            lVar.b();
            lVar.n("eid");
            this.nullableStringAdapter.h(lVar, beaconAction.a());
            lVar.n("dt");
            this.longAdapter.h(lVar, Long.valueOf(beaconAction.d()));
            lVar.n("trigger");
            this.intAdapter.h(lVar, Integer.valueOf(beaconAction.e()));
            lVar.n("pid");
            this.nullableStringAdapter.h(lVar, beaconAction.c());
            lVar.n("uuid");
            this.nullableStringAdapter.h(lVar, beaconAction.b());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BeaconAction");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}

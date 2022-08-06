package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ActionConversionJsonAdapter.kt */
public final class ActionConversionJsonAdapter extends JsonAdapter<ActionConversion> {
    private volatile Constructor<ActionConversion> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final g.b options;

    public ActionConversionJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("action", "dt", "type");
        k.b(a, "JsonReader.Options.of(\"action\", \"dt\", \"type\")");
        this.options = a;
        JsonAdapter<String> f2 = nVar.f(String.class, i0.b(), "actionInstanceUuid");
        k.b(f2, "moshi.adapter(String::cl…(), \"actionInstanceUuid\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<Long> f3 = nVar.f(Long.class, i0.b(), "date");
        k.b(f3, "moshi.adapter(Long::clas…      emptySet(), \"date\")");
        this.nullableLongAdapter = f3;
        JsonAdapter<Integer> f4 = nVar.f(Integer.class, i0.b(), "type");
        k.b(f4, "moshi.adapter(Int::class…      emptySet(), \"type\")");
        this.nullableIntAdapter = f4;
    }

    /* renamed from: i */
    public ActionConversion b(g gVar) {
        long j2;
        k.f(gVar, "reader");
        gVar.b();
        String str = null;
        Long l2 = null;
        Integer num = null;
        int i2 = -1;
        while (gVar.hasNext()) {
            int K = gVar.K(this.options);
            if (K != -1) {
                if (K == 0) {
                    str = this.nullableStringAdapter.b(gVar);
                    j2 = 4294967294L;
                } else if (K == 1) {
                    l2 = this.nullableLongAdapter.b(gVar);
                    j2 = 4294967293L;
                } else if (K == 2) {
                    num = this.nullableIntAdapter.b(gVar);
                    j2 = 4294967291L;
                }
                i2 &= (int) j2;
            } else {
                gVar.Z();
                gVar.skipValue();
            }
        }
        gVar.i();
        Constructor<ActionConversion> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ActionConversion.class.getDeclaredConstructor(new Class[]{String.class, Long.class, Integer.class, Integer.TYPE, a.c});
            this.constructorRef = constructor;
            k.b(constructor, "ActionConversion::class.…his.constructorRef = it }");
        }
        ActionConversion newInstance = constructor.newInstance(new Object[]{str, l2, num, Integer.valueOf(i2), null});
        k.b(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    /* renamed from: j */
    public void h(l lVar, ActionConversion actionConversion) {
        k.f(lVar, "writer");
        if (actionConversion != null) {
            lVar.b();
            lVar.n("action");
            this.nullableStringAdapter.h(lVar, actionConversion.a());
            lVar.n("dt");
            this.nullableLongAdapter.h(lVar, actionConversion.b());
            lVar.n("type");
            this.nullableIntAdapter.h(lVar, actionConversion.c());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ActionConversion");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}

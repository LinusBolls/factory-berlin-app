package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/TimeframeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: TimeframeJsonAdapter.kt */
public final class TimeframeJsonAdapter extends JsonAdapter<Timeframe> {
    private volatile Constructor<Timeframe> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final g.b options;

    public TimeframeJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("start", "end");
        k.b(a, "JsonReader.Options.of(\"start\", \"end\")");
        this.options = a;
        JsonAdapter<String> f2 = nVar.f(String.class, i0.b(), "start");
        k.b(f2, "moshi.adapter(String::cl…     emptySet(), \"start\")");
        this.nullableStringAdapter = f2;
    }

    /* renamed from: i */
    public Timeframe b(g gVar) {
        long j2;
        Class<String> cls = String.class;
        k.f(gVar, "reader");
        gVar.b();
        String str = null;
        String str2 = null;
        int i2 = -1;
        while (gVar.hasNext()) {
            int K = gVar.K(this.options);
            if (K != -1) {
                if (K == 0) {
                    str = this.nullableStringAdapter.b(gVar);
                    j2 = 4294967294L;
                } else if (K == 1) {
                    str2 = this.nullableStringAdapter.b(gVar);
                    j2 = 4294967293L;
                }
                i2 &= (int) j2;
            } else {
                gVar.Z();
                gVar.skipValue();
            }
        }
        gVar.i();
        Constructor<Timeframe> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Timeframe.class.getDeclaredConstructor(new Class[]{cls, cls, Integer.TYPE, a.c});
            this.constructorRef = constructor;
            k.b(constructor, "Timeframe::class.java.ge…tructorRef =\n        it }");
        }
        Timeframe newInstance = constructor.newInstance(new Object[]{str, str2, Integer.valueOf(i2), null});
        k.b(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    /* renamed from: j */
    public void h(l lVar, Timeframe timeframe) {
        k.f(lVar, "writer");
        if (timeframe != null) {
            lVar.b();
            lVar.n("start");
            this.nullableStringAdapter.h(lVar, timeframe.b());
            lVar.n("end");
            this.nullableStringAdapter.h(lVar, timeframe.a());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Timeframe");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}

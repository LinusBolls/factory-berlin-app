package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponse;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponse;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "nullableListOfResolveActionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveResponseJsonAdapter.kt */
public final class ResolveResponseJsonAdapter extends JsonAdapter<ResolveResponse> {
    private volatile Constructor<ResolveResponse> constructorRef;
    private final JsonAdapter<List<ResolveAction>> nullableListOfResolveActionAdapter;
    private final g.b options;

    public ResolveResponseJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("actions");
        k.b(a, "JsonReader.Options.of(\"actions\")");
        this.options = a;
        JsonAdapter<List<ResolveAction>> f2 = nVar.f(p.j(List.class, ResolveAction.class), i0.b(), "actions");
        k.b(f2, "moshi.adapter(Types.newP…   emptySet(), \"actions\")");
        this.nullableListOfResolveActionAdapter = f2;
    }

    /* renamed from: i */
    public ResolveResponse b(g gVar) {
        k.f(gVar, "reader");
        gVar.b();
        List list = null;
        int i2 = -1;
        while (gVar.hasNext()) {
            int K = gVar.K(this.options);
            if (K == -1) {
                gVar.Z();
                gVar.skipValue();
            } else if (K == 0) {
                list = this.nullableListOfResolveActionAdapter.b(gVar);
                i2 &= (int) 4294967294L;
            }
        }
        gVar.i();
        Constructor<ResolveResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ResolveResponse.class.getDeclaredConstructor(new Class[]{List.class, Integer.TYPE, a.c});
            this.constructorRef = constructor;
            k.b(constructor, "ResolveResponse::class.j…tructorRef =\n        it }");
        }
        ResolveResponse newInstance = constructor.newInstance(new Object[]{list, Integer.valueOf(i2), null});
        k.b(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    /* renamed from: j */
    public void h(l lVar, ResolveResponse resolveResponse) {
        k.f(lVar, "writer");
        if (resolveResponse != null) {
            lVar.b();
            lVar.n("actions");
            this.nullableListOfResolveActionAdapter.h(lVar, resolveResponse.a());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResolveResponse");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}

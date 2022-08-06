package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import kotlin.i;
import kotlin.jvm.internal.k;
import org.json.JSONObject;

@i(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lorg/json/JSONObject;", "nullableJSONObjectAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ContentJsonAdapter.kt */
public final class ContentJsonAdapter extends JsonAdapter<Content> {
    private volatile Constructor<Content> constructorRef;
    private final JsonAdapter<JSONObject> nullableJSONObjectAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final g.b options;

    public ContentJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("subject", "body", "payload", "url");
        k.b(a, "JsonReader.Options.of(\"s…, \"payload\",\n      \"url\")");
        this.options = a;
        JsonAdapter<String> f2 = nVar.f(String.class, i0.b(), "subject");
        k.b(f2, "moshi.adapter(String::cl…   emptySet(), \"subject\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<JSONObject> f3 = nVar.f(JSONObject.class, i0.b(), "payload");
        k.b(f3, "moshi.adapter(JSONObject…a, emptySet(), \"payload\")");
        this.nullableJSONObjectAdapter = f3;
    }

    /* renamed from: i */
    public Content b(g gVar) {
        long j2;
        g gVar2 = gVar;
        Class<String> cls = String.class;
        k.f(gVar2, "reader");
        gVar.b();
        int i2 = -1;
        String str = null;
        String str2 = null;
        JSONObject jSONObject = null;
        String str3 = null;
        while (gVar.hasNext()) {
            int K = gVar2.K(this.options);
            if (K != -1) {
                if (K == 0) {
                    str = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967294L;
                } else if (K == 1) {
                    str2 = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967293L;
                } else if (K == 2) {
                    jSONObject = this.nullableJSONObjectAdapter.b(gVar2);
                    j2 = 4294967291L;
                } else if (K == 3) {
                    str3 = this.nullableStringAdapter.b(gVar2);
                    j2 = 4294967287L;
                }
                i2 &= (int) j2;
            } else {
                gVar.Z();
                gVar.skipValue();
            }
        }
        gVar.i();
        Constructor<Content> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Content.class.getDeclaredConstructor(new Class[]{cls, cls, JSONObject.class, cls, Integer.TYPE, a.c});
            this.constructorRef = constructor;
            k.b(constructor, "Content::class.java.getD…his.constructorRef = it }");
        }
        Content newInstance = constructor.newInstance(new Object[]{str, str2, jSONObject, str3, Integer.valueOf(i2), null});
        k.b(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    /* renamed from: j */
    public void h(l lVar, Content content) {
        k.f(lVar, "writer");
        if (content != null) {
            lVar.b();
            lVar.n("subject");
            this.nullableStringAdapter.h(lVar, content.c());
            lVar.n("body");
            this.nullableStringAdapter.h(lVar, content.a());
            lVar.n("payload");
            this.nullableJSONObjectAdapter.h(lVar, content.b());
            lVar.n("url");
            this.nullableStringAdapter.h(lVar, content.d());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Content");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}

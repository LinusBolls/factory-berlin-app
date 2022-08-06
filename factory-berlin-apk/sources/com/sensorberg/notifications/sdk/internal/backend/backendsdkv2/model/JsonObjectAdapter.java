package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.c;
import com.squareup.moshi.g;
import com.squareup.moshi.o;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;

@i(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/JsonObjectAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lorg/json/JSONObject;", "fromJsonString", "(Lcom/squareup/moshi/JsonReader;)Lorg/json/JSONObject;", "", "", "list", "Lorg/json/JSONArray;", "jsonList", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "", "map", "jsonObject", "(Ljava/util/Map;)Lorg/json/JSONObject;", "value", "toJsonString", "(Lorg/json/JSONObject;)Ljava/lang/String;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveAction.kt */
public final class JsonObjectAdapter {
    public static final JsonObjectAdapter a = new JsonObjectAdapter();

    private JsonObjectAdapter() {
    }

    public final JSONArray a(List<? extends Object> list) {
        k.f(list, "list");
        JSONArray jSONArray = new JSONArray();
        for (T next : list) {
            if (next instanceof Map) {
                JsonObjectAdapter jsonObjectAdapter = a;
                if (next != null) {
                    jSONArray.put(jsonObjectAdapter.b((Map) next));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else if (next instanceof List) {
                JsonObjectAdapter jsonObjectAdapter2 = a;
                if (next != null) {
                    jSONArray.put(jsonObjectAdapter2.a((List) next));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
            } else {
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    public final JSONObject b(Map<String, ? extends Object> map) {
        k.f(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                String str = (String) entry.getKey();
                JsonObjectAdapter jsonObjectAdapter = a;
                Object value2 = entry.getValue();
                if (value2 != null) {
                    jSONObject.put(str, jsonObjectAdapter.b((Map) value2));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else if (value instanceof List) {
                String str2 = (String) entry.getKey();
                JsonObjectAdapter jsonObjectAdapter2 = a;
                Object value3 = entry.getValue();
                if (value3 != null) {
                    jSONObject.put(str2, jsonObjectAdapter2.a((List) value3));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
            } else {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    @c
    public final JSONObject fromJsonString(g gVar) {
        k.f(gVar, "reader");
        Object F = gVar.F();
        if (F != null) {
            return b((Map) F);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
    }

    @o
    public final String toJsonString(JSONObject jSONObject) {
        k.f(jSONObject, "value");
        String jSONObject2 = jSONObject.toString();
        k.b(jSONObject2, "value.toString()");
        return jSONObject2;
    }
}

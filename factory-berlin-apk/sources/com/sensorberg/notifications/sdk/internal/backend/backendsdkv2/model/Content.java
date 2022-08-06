package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import org.json.JSONObject;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u0000B7\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0003R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001c\u0010\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0003¨\u0006 "}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "", "component1", "()Ljava/lang/String;", "component2", "Lorg/json/JSONObject;", "component3", "()Lorg/json/JSONObject;", "component4", "subject", "body", "payload", "url", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBody", "Lorg/json/JSONObject;", "getPayload", "getSubject", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveAction.kt */
public final class Content {
    private final String a;
    private final String b;
    private final JSONObject c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5156d;

    public Content() {
        this((String) null, (String) null, (JSONObject) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public Content(String str, String str2, JSONObject jSONObject, String str3) {
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
        this.f5156d = str3;
    }

    public final String a() {
        return this.b;
    }

    public final JSONObject b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.f5156d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return k.a(this.a, content.a) && k.a(this.b, content.b) && k.a(this.c, content.c) && k.a(this.f5156d, content.f5156d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.c;
        int hashCode3 = (hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str3 = this.f5156d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "Content(subject=" + this.a + ", body=" + this.b + ", payload=" + this.c + ", url=" + this.f5156d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Content(String str, String str2, JSONObject jSONObject, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : jSONObject, (i2 & 8) != 0 ? null : str3);
    }
}

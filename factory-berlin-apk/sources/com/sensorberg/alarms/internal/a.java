package com.sensorberg.alarms.internal;

import kotlin.jvm.internal.k;
import org.json.JSONObject;

/* compiled from: AlarmData.kt */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0139a f4810e = new C0139a((DefaultConstructorMarker) null);
    private final int a;
    private final String b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4811d;

    /* renamed from: com.sensorberg.alarms.internal.a$a  reason: collision with other inner class name */
    /* compiled from: AlarmData.kt */
    public static final class C0139a {
        private C0139a() {
        }

        public final a a(String str) {
            k.e(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("index");
            String string = jSONObject.getString("id");
            k.d(string, "json.getString(KEY_ID)");
            long j2 = jSONObject.getLong("when");
            String string2 = jSONObject.getString("data");
            k.d(string2, "json.getString(KEY_DATA)");
            return new a(i2, string, j2, string2);
        }

        public /* synthetic */ C0139a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int i2, String str, long j2, String str2) {
        k.e(str, "id");
        k.e(str2, "data");
        this.a = i2;
        this.b = str;
        this.c = j2;
        this.f4811d = str2;
    }

    public final String a() {
        return this.f4811d;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", this.a);
        jSONObject.put("id", this.b);
        jSONObject.put("when", this.c);
        jSONObject.put("data", this.f4811d);
        String jSONObject2 = jSONObject.toString();
        k.d(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && k.a(this.b, aVar.b) && this.c == aVar.c && k.a(this.f4811d, aVar.f4811d);
    }

    public int hashCode() {
        int i2 = this.a * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + c.a(this.c)) * 31;
        String str2 = this.f4811d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        return "AlarmData(index=" + this.a + ", id=" + this.b + ", whenInEpochMillis=" + this.c + ", data=" + this.f4811d + ")";
    }
}
